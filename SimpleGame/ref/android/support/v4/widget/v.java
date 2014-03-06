package android.support.v4.widget;

import android.view.View;

class v
  extends af
{
  private v(SlidingPaneLayout paramSlidingPaneLayout) {}
  
  public int a(View paramView)
  {
    return SlidingPaneLayout.e(this.a);
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(this.a).getLayoutParams();
    int i = this.a.getPaddingLeft() + localLayoutParams.leftMargin;
    int j = i + SlidingPaneLayout.e(this.a);
    return Math.min(Math.max(paramInt1, i), j);
  }
  
  public void a(int paramInt)
  {
    if (SlidingPaneLayout.b(this.a).a() == 0)
    {
      if (SlidingPaneLayout.c(this.a) == 0.0F)
      {
        this.a.d(SlidingPaneLayout.d(this.a));
        this.a.c(SlidingPaneLayout.d(this.a));
        SlidingPaneLayout.a(this.a, false);
      }
    }
    else {
      return;
    }
    this.a.b(SlidingPaneLayout.d(this.a));
    SlidingPaneLayout.a(this.a, true);
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i = this.a.getPaddingLeft() + localLayoutParams.leftMargin;
    if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (SlidingPaneLayout.c(this.a) > 0.5F))) {
      i += SlidingPaneLayout.e(this.a);
    }
    SlidingPaneLayout.b(this.a).a(i, paramView.getTop());
    this.a.invalidate();
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SlidingPaneLayout.a(this.a, paramInt1);
    this.a.invalidate();
  }
  
  public boolean a(View paramView, int paramInt)
  {
    if (SlidingPaneLayout.a(this.a)) {
      return false;
    }
    return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).b;
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    SlidingPaneLayout.b(this.a).a(SlidingPaneLayout.d(this.a), paramInt2);
  }
  
  public void b(View paramView, int paramInt)
  {
    this.a.a();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.v
 * JD-Core Version:    0.7.0.1
 */