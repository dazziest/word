package android.support.v4.view;

import android.database.DataSetObserver;

class ai
  extends DataSetObserver
  implements cb, cc
{
  private int b;
  
  private ai(PagerTitleStrip paramPagerTitleStrip) {}
  
  public void a(int paramInt)
  {
    if (this.b == 0)
    {
      this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
      boolean bool = PagerTitleStrip.a(this.a) < 0.0F;
      float f = 0.0F;
      if (!bool) {
        f = PagerTitleStrip.a(this.a);
      }
      this.a.a(this.a.a.getCurrentItem(), f, true);
    }
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (paramFloat > 0.5F) {
      paramInt1++;
    }
    this.a.a(paramInt1, paramFloat, false);
  }
  
  public void a(ae paramae1, ae paramae2)
  {
    this.a.a(paramae1, paramae2);
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void onChanged()
  {
    this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
    boolean bool = PagerTitleStrip.a(this.a) < 0.0F;
    float f = 0.0F;
    if (!bool) {
      f = PagerTitleStrip.a(this.a);
    }
    this.a.a(this.a.a.getCurrentItem(), f, true);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ai
 * JD-Core Version:    0.7.0.1
 */