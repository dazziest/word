package android.support.v4.widget;

import android.support.v4.view.at;
import android.view.View;
import java.util.ArrayList;

class u
  implements Runnable
{
  final View a;
  
  u(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }
  
  public void run()
  {
    if (this.a.getParent() == this.b)
    {
      at.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.f(this.b).remove(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.u
 * JD-Core Version:    0.7.0.1
 */