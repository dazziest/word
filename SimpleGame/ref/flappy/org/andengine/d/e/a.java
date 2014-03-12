package org.andengine.d.e;

import android.util.Log;

public class a
{
  private static String a = "AndEngine";
  private static String b = "";
  private static b c = b.f;
  
  public static void a(String paramString)
  {
    a(a, paramString, null);
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (c.a(b.f))
    {
      if (paramThrowable == null) {
        Log.v(paramString1, paramString2);
      }
    }
    else {
      return;
    }
    Log.v(paramString1, paramString2, paramThrowable);
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    b(a, paramString, paramThrowable);
  }
  
  public static void a(Throwable paramThrowable)
  {
    b(a, paramThrowable);
  }
  
  public static void b(String paramString)
  {
    b(a, paramString, null);
  }
  
  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (c.a(b.e))
    {
      if (paramThrowable == null) {
        Log.d(paramString1, paramString2);
      }
    }
    else {
      return;
    }
    Log.d(paramString1, paramString2, paramThrowable);
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    d(a, paramString, paramThrowable);
  }
  
  public static void c(String paramString)
  {
    c(a, paramString, null);
  }
  
  public static void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (c.a(b.c))
    {
      if (paramThrowable == null) {
        Log.w(paramString1, paramString2);
      }
    }
    else {
      return;
    }
    Log.w(paramString1, paramString2, paramThrowable);
  }
  
  public static void d(String paramString)
  {
    d(a, paramString, null);
  }
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (c.a(b.b))
    {
      if (paramThrowable == null) {
        Log.e(paramString1, paramString2);
      }
    }
    else {
      return;
    }
    Log.e(paramString1, paramString2, paramThrowable);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.e.a
 * JD-Core Version:    0.7.0.1
 */