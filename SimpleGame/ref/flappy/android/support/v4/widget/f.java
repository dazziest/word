package android.support.v4.widget;

import android.view.View;

class f
  extends af
{
  private final int b;
  private ac c;
  private final Runnable d = new g(this);
  
  public f(DrawerLayout paramDrawerLayout, int paramInt)
  {
    this.b = paramInt;
  }
  
  private void b()
  {
    int i = 3;
    if (this.b == i) {
      i = 5;
    }
    View localView = this.a.a(i);
    if (localView != null) {
      this.a.i(localView);
    }
  }
  
  private void c()
  {
    int i = this.c.b();
    int j;
    int i1;
    Object localObject;
    if (this.b == 3)
    {
      j = 1;
      if (j == 0) {
        break label164;
      }
      View localView2 = this.a.a(3);
      int n = 0;
      if (localView2 != null) {
        n = -localView2.getWidth();
      }
      i1 = n + i;
      localObject = localView2;
    }
    label164:
    int k;
    for (int m = i1;; m = k)
    {
      if ((localObject != null) && (((j != 0) && (((View)localObject).getLeft() < m)) || ((j == 0) && (((View)localObject).getLeft() > m) && (this.a.a((View)localObject) == 0))))
      {
        DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)((View)localObject).getLayoutParams();
        this.c.a((View)localObject, m, ((View)localObject).getTop());
        localLayoutParams.c = true;
        this.a.invalidate();
        b();
        this.a.c();
      }
      return;
      j = 0;
      break;
      View localView1 = this.a.a(5);
      k = this.a.getWidth() - i;
      localObject = localView1;
    }
  }
  
  public int a(View paramView)
  {
    return paramView.getWidth();
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    if (this.a.a(paramView, 3)) {
      return Math.max(-paramView.getWidth(), Math.min(paramInt1, 0));
    }
    int i = this.a.getWidth();
    return Math.max(i - paramView.getWidth(), Math.min(paramInt1, i));
  }
  
  public void a()
  {
    this.a.removeCallbacks(this.d);
  }
  
  public void a(int paramInt)
  {
    this.a.a(this.b, paramInt, this.c.c());
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.postDelayed(this.d, 160L);
  }
  
  public void a(ac paramac)
  {
    this.c = paramac;
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    float f = this.a.d(paramView);
    int i = paramView.getWidth();
    int j;
    if (this.a.a(paramView, 3)) {
      if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (f > 0.5F))) {
        j = 0;
      }
    }
    for (;;)
    {
      this.c.a(j, paramView.getTop());
      this.a.invalidate();
      return;
      j = -i;
      continue;
      j = this.a.getWidth();
      if ((paramFloat1 < 0.0F) || ((paramFloat1 == 0.0F) && (f > 0.5F))) {
        j -= i;
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramView.getWidth();
    float f;
    if (this.a.a(paramView, 3))
    {
      f = (i + paramInt1) / i;
      this.a.b(paramView, f);
      if (f != 0.0F) {
        break label82;
      }
    }
    label82:
    for (int j = 4;; j = 0)
    {
      paramView.setVisibility(j);
      this.a.invalidate();
      return;
      f = (this.a.getWidth() - paramInt1) / i;
      break;
    }
  }
  
  public boolean a(View paramView, int paramInt)
  {
    return (this.a.g(paramView)) && (this.a.a(paramView, this.b)) && (this.a.a(paramView) == 0);
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0x1) == 1) {}
    for (View localView = this.a.a(3);; localView = this.a.a(5))
    {
      if ((localView != null) && (this.a.a(localView) == 0)) {
        this.c.a(localView, paramInt2);
      }
      return;
    }
  }
  
  public void b(View paramView, int paramInt)
  {
    ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).c = false;
    b();
  }
  
  public boolean b(int paramInt)
  {
    return false;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.f
 * JD-Core Version:    0.7.0.1
 */