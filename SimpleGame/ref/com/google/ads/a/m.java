package com.google.ads.a;

import com.google.ads.util.g;

public final class m
  extends Exception
{
  public final boolean a;
  
  public m(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
  }
  
  public m(String paramString, boolean paramBoolean, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramBoolean;
  }
  
  public void a(String paramString)
  {
    g.b(c(paramString));
    g.a(null, this);
  }
  
  public void b(String paramString)
  {
    String str = c(paramString);
    if (this.a) {}
    for (;;)
    {
      throw new RuntimeException(str, this);
      this = null;
    }
  }
  
  public String c(String paramString)
  {
    if (this.a) {
      paramString = paramString + ": " + getMessage();
    }
    return paramString;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.m
 * JD-Core Version:    0.7.0.1
 */