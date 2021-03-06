package com.google.ads.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import com.google.ads.util.g;
import java.util.ArrayList;
import java.util.Iterator;

public class ah
  implements GestureOverlayView.OnGesturePerformedListener
{
  private final GestureStore a;
  private Activity b;
  private w c;
  
  public ah(Activity paramActivity, w paramw, GestureStore paramGestureStore)
  {
    this.b = paramActivity;
    this.c = paramw;
    this.a = paramGestureStore;
  }
  
  public void onGesturePerformed(GestureOverlayView paramGestureOverlayView, Gesture paramGesture)
  {
    ArrayList localArrayList = this.a.recognize(paramGesture);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      Prediction localPrediction = (Prediction)localIterator.next();
      g.a("Gesture: '" + localPrediction.name + "' = " + localPrediction.score);
    }
    if (localArrayList.size() == 0) {
      g.a("Gesture: No remotely reasonable predictions");
    }
    while ((((Prediction)localArrayList.get(0)).score <= 2.0D) || (!"debug".equals(((Prediction)localArrayList.get(0)).name)) || (this.c == null)) {
      return;
    }
    if (this.c.b() == null) {}
    for (String str = "[No diagnostics available]";; str = this.c.b())
    {
      new AlertDialog.Builder(this.b).setMessage(str).setTitle("Ad Information").setPositiveButton("Share", new ak(this, str)).setNeutralButton("Report", new aj(this)).setNegativeButton("Close", new ai(this)).create().show();
      return;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.ah
 * JD-Core Version:    0.7.0.1
 */