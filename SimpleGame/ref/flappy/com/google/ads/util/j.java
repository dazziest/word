package com.google.ads.util;

public class j
{
  static
  {
    if (!j.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static byte[] a(String paramString)
  {
    return a(paramString.getBytes(), 0);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    l locall = new l(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!locall.a(paramArrayOfByte, paramInt1, paramInt2, true)) {
      throw new IllegalArgumentException("bad base-64");
    }
    if (locall.b == locall.a.length) {
      return locall.a;
    }
    byte[] arrayOfByte = new byte[locall.b];
    System.arraycopy(locall.a, 0, arrayOfByte, 0, locall.b);
    return arrayOfByte;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.j
 * JD-Core Version:    0.7.0.1
 */