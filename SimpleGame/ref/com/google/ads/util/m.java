package com.google.ads.util;

import android.os.Build;

class m
{
  static final m d = new m();
  static final m e = new m("unknown", "generic", "generic");
  static final m f = new m("unknown", "generic_x86", "Android");
  public final String a;
  public final String b;
  public final String c;
  
  m()
  {
    this.a = Build.BOARD;
    this.b = Build.DEVICE;
    this.c = Build.BRAND;
  }
  
  m(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      return paramString1.equals(paramString2);
    }
    return paramString1 == paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof m)) {}
    m localm;
    do
    {
      return false;
      localm = (m)paramObject;
    } while ((!a(this.a, localm.a)) || (!a(this.b, localm.b)) || (!a(this.c, localm.c)));
    return true;
  }
  
  public int hashCode()
  {
    String str = this.a;
    int i = 0;
    if (str != null) {
      i = 0 + this.a.hashCode();
    }
    if (this.b != null) {
      i += this.b.hashCode();
    }
    if (this.c != null) {
      i += this.c.hashCode();
    }
    return i;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.m
 * JD-Core Version:    0.7.0.1
 */