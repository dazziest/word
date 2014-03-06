package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

class ag
  implements View.OnClickListener
{
  ag(PagerTabStrip paramPagerTabStrip) {}
  
  public void onClick(View paramView)
  {
    this.a.a.setCurrentItem(1 + this.a.a.getCurrentItem());
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ag
 * JD-Core Version:    0.7.0.1
 */