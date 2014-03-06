package com.google.android.gms.internal;

import android.util.Log;

public final class db
{
  private final String a;
  
  public db(String paramString)
  {
    this.a = ((String)do.a(paramString));
  }
  
  public void a(String paramString1, String paramString2)
  {
    if (a(5)) {
      Log.w(paramString1, paramString2);
    }
  }
  
  public void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a(6)) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public boolean a(int paramInt)
  {
    return Log.isLoggable(this.a, paramInt);
  }
  
  public void b(String paramString1, String paramString2)
  {
    if (a(6)) {
      Log.e(paramString1, paramString2);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.db
 * JD-Core Version:    0.7.0.1
 */