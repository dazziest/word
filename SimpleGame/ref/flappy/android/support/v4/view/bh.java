package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bh
{
  public static void a(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public static void a(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public static int b(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public static ViewParent c(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bh
 * JD-Core Version:    0.7.0.1
 */