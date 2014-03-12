package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cj
  extends Drawable
{
  private static final cj a = new cj();
  private static final ck b = new ck(null);
  
  public void draw(Canvas paramCanvas) {}
  
  public Drawable.ConstantState getConstantState()
  {
    return b;
  }
  
  public int getOpacity()
  {
    return -2;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cj
 * JD-Core Version:    0.7.0.1
 */