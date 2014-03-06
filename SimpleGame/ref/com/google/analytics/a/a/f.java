package com.google.analytics.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

public enum f
  implements ad
{
  private static ae d = new g();
  private final int e;
  
  static
  {
    f[] arrayOff = new f[3];
    arrayOff[0] = a;
    arrayOff[1] = b;
    arrayOff[2] = c;
    f = arrayOff;
  }
  
  private f(int paramInt1, int paramInt2)
  {
    this.e = paramInt2;
  }
  
  public static f a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return a;
    case 2: 
      return b;
    }
    return c;
  }
  
  public final int a()
  {
    return this.e;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.f
 * JD-Core Version:    0.7.0.1
 */