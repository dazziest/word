package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

public enum h
  implements ad
{
  private static ae i = new i();
  private final int j;
  
  static
  {
    h[] arrayOfh = new h[8];
    arrayOfh[0] = a;
    arrayOfh[1] = b;
    arrayOfh[2] = c;
    arrayOfh[3] = d;
    arrayOfh[4] = e;
    arrayOfh[5] = f;
    arrayOfh[6] = g;
    arrayOfh[7] = h;
    k = arrayOfh;
  }
  
  private h(int paramInt1, int paramInt2)
  {
    this.j = paramInt2;
  }
  
  public static h a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return a;
    case 2: 
      return b;
    case 3: 
      return c;
    case 4: 
      return d;
    case 5: 
      return e;
    case 6: 
      return f;
    case 7: 
      return g;
    }
    return h;
  }
  
  public final int a()
  {
    return this.j;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.b.a.a.h
 * JD-Core Version:    0.7.0.1
 */