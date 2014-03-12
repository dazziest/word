package com.google.tagmanager;

import com.google.analytics.a.a.q;

public class c
{
  private final r a;
  private d b;
  private o c;
  private b d;
  private volatile String e;
  private volatile q f;
  private volatile long g;
  private volatile int h;
  
  private boolean b(long paramLong)
  {
    if (this.g == 0L)
    {
      this.h = (-1 + this.h);
      return true;
    }
    long l = paramLong - this.g;
    if (l < 5000L) {
      return false;
    }
    if (this.h < 30) {
      this.h = Math.min(30, (int)Math.floor(l / 900000L) + this.h);
    }
    if (this.h > 0)
    {
      this.h = (-1 + this.h);
      return true;
    }
    return false;
  }
  
  private o c()
  {
    try
    {
      o localo = this.c;
      return localo;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private boolean d()
  {
    return this.a.a() == w.b;
  }
  
  public void a()
  {
    for (;;)
    {
      try
      {
        if (c() == null)
        {
          i.b("refresh called for closed container");
          return;
        }
        try
        {
          if (!d()) {
            break label66;
          }
          i.b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
        }
        catch (Exception localException)
        {
          i.a("Calling refresh() throws an exception: " + localException.getMessage());
        }
        continue;
        l = this.d.a();
      }
      finally {}
      label66:
      long l;
      if (b(l))
      {
        i.d("Container refresh requested");
        a(0L);
        this.g = l;
      }
      else
      {
        i.d("Container refresh was called too often. Ignored.");
      }
    }
  }
  
  /* Error */
  void a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 111	com/google/tagmanager/c:b	Lcom/google/tagmanager/d;
    //   6: ifnull +32 -> 38
    //   9: aload_0
    //   10: invokespecial 69	com/google/tagmanager/c:d	()Z
    //   13: ifne +25 -> 38
    //   16: aload_0
    //   17: getfield 113	com/google/tagmanager/c:f	Lcom/google/analytics/a/a/q;
    //   20: ifnonnull +21 -> 41
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_0
    //   27: getfield 111	com/google/tagmanager/c:b	Lcom/google/tagmanager/d;
    //   30: lload_1
    //   31: aload 4
    //   33: invokeinterface 118 4 0
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: aload_0
    //   42: getfield 113	com/google/tagmanager/c:f	Lcom/google/analytics/a/a/q;
    //   45: invokevirtual 123	com/google/analytics/a/a/q:C	()Ljava/lang/String;
    //   48: astore 5
    //   50: aload 5
    //   52: astore 4
    //   54: goto -28 -> 26
    //   57: astore_3
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_3
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	c
    //   0	62	1	paramLong	long
    //   57	4	3	localObject1	Object
    //   24	29	4	localObject2	Object
    //   48	3	5	str	String
    // Exception table:
    //   from	to	target	type
    //   2	23	57	finally
    //   26	38	57	finally
    //   41	50	57	finally
  }
  
  void a(String paramString)
  {
    try
    {
      this.e = paramString;
      if (this.b != null) {
        this.b.a(paramString);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  String b()
  {
    return this.e;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.c
 * JD-Core Version:    0.7.0.1
 */