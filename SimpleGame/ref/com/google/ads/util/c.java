package com.google.ads.util;

import com.google.ads.a.a;
import com.google.ads.a.e;
import com.google.ads.bt;
import com.google.ads.g;

public class c
  extends e
{
  public c(bt parambt, g paramg)
  {
    super(parambt, paramg);
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.a.e.a() != null) {
      return !((a)this.a.e.a()).b();
    }
    return super.canScrollHorizontally(paramInt);
  }
  
  public boolean canScrollVertically(int paramInt)
  {
    if (this.a.e.a() != null) {
      return !((a)this.a.e.a()).b();
    }
    return super.canScrollVertically(paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.c
 * JD-Core Version:    0.7.0.1
 */