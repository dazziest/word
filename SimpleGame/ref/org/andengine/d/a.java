package org.andengine.d;

import android.app.Activity;
import android.view.Window;

public class a
{
  public static void a(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    localWindow.addFlags(1024);
    localWindow.clearFlags(2048);
    localWindow.requestFeature(1);
  }
  
  public static void b(Activity paramActivity)
  {
    paramActivity.getWindow().addFlags(128);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.a
 * JD-Core Version:    0.7.0.1
 */