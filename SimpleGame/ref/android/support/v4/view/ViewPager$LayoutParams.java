package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class ViewPager$LayoutParams
  extends ViewGroup.LayoutParams
{
  public boolean a;
  public int b;
  float c = 0.0F;
  boolean d;
  int e;
  int f;
  
  public ViewPager$LayoutParams()
  {
    super(-1, -1);
  }
  
  public ViewPager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.f());
    this.b = localTypedArray.getInteger(0, 48);
    localTypedArray.recycle();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager.LayoutParams
 * JD-Core Version:    0.7.0.1
 */