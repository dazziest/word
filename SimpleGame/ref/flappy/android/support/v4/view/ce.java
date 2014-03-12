package android.support.v4.view;

import android.database.DataSetObserver;

class ce
  extends DataSetObserver
{
  private ce(ViewPager paramViewPager) {}
  
  public void onChanged()
  {
    this.a.b();
  }
  
  public void onInvalidated()
  {
    this.a.b();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ce
 * JD-Core Version:    0.7.0.1
 */