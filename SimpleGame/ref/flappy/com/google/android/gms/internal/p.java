package com.google.android.gms.internal;

import android.os.Build.VERSION;

public final class p
{
  public static boolean a()
  {
    return a(11);
  }
  
  private static boolean a(int paramInt)
  {
    return Build.VERSION.SDK_INT >= paramInt;
  }
  
  public static boolean b()
  {
    return a(12);
  }
  
  public static boolean c()
  {
    return a(13);
  }
  
  public static boolean d()
  {
    return a(16);
  }
  
  public static boolean e()
  {
    return a(17);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.p
 * JD-Core Version:    0.7.0.1
 */