package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cl
  extends Drawable.ConstantState
{
  int a;
  int b;
  
  cl(cl paramcl)
  {
    if (paramcl != null)
    {
      this.a = paramcl.a;
      this.b = paramcl.b;
    }
  }
  
  public int getChangingConfigurations()
  {
    return this.a;
  }
  
  public Drawable newDrawable()
  {
    return new ch(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cl
 * JD-Core Version:    0.7.0.1
 */