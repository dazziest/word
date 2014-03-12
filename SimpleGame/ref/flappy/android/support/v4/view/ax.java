package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ax
  extends aw
{
  long a()
  {
    return bf.a();
  }
  
  public void a(View paramView, int paramInt, Paint paramPaint)
  {
    bf.a(paramView, paramInt, paramPaint);
  }
  
  public void a(View paramView, Paint paramPaint)
  {
    a(paramView, d(paramView), paramPaint);
    paramView.invalidate();
  }
  
  public int d(View paramView)
  {
    return bf.a(paramView);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ax
 * JD-Core Version:    0.7.0.1
 */