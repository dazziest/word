package com.google.analytics.tracking.android;

public class b
{
  private static a a;
  
  private static c a()
  {
    if (a == null) {
      a = a.a();
    }
    if (a != null) {
      return a.b();
    }
    return null;
  }
  
  public static void a(String paramString)
  {
    c localc = a();
    if (localc != null) {
      localc.a(paramString);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.b
 * JD-Core Version:    0.7.0.1
 */