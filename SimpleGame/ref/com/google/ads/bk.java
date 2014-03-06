package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.a.ac;
import com.google.ads.b.b;
import com.google.ads.util.ad;
import com.google.ads.util.e;
import java.util.HashMap;

public class bk
{
  final ac a;
  private final bh b;
  private boolean c;
  private boolean d;
  private bj e;
  private final bd f;
  private b g;
  private boolean h;
  private boolean i;
  private View j;
  private final String k;
  private final d l;
  private final HashMap m;
  
  public bk(bd parambd, ac paramac, bh parambh, String paramString, d paramd, HashMap paramHashMap)
  {
    e.a(TextUtils.isEmpty(paramString));
    this.f = parambd;
    this.a = paramac;
    this.b = parambh;
    this.k = paramString;
    this.l = paramd;
    this.m = paramHashMap;
    this.c = false;
    this.d = false;
    this.e = null;
    this.g = null;
    this.h = false;
    this.i = false;
    this.j = null;
  }
  
  public void a()
  {
    try
    {
      e.a(this.h, "destroy() called but startLoadAdTask has not been called.");
      ((Handler)br.a().c.a()).post(new bl(this));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(Activity paramActivity)
  {
    try
    {
      e.b(this.h, "startLoadAdTask has already been called.");
      this.h = true;
      ((Handler)br.a().c.a()).post(new bm(this, paramActivity, this.k, this.l, this.m));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  void a(b paramb)
  {
    try
    {
      this.g = paramb;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  void a(boolean paramBoolean, bj parambj)
  {
    try
    {
      this.d = paramBoolean;
      this.c = true;
      this.e = parambj;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = this.c;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean c()
  {
    try
    {
      e.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public bj d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	com/google/ads/bk:e	Lcom/google/ads/bj;
    //   6: ifnonnull +11 -> 17
    //   9: getstatic 122	com/google/ads/bj:d	Lcom/google/ads/bj;
    //   12: astore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_2
    //   16: areturn
    //   17: aload_0
    //   18: getfield 61	com/google/ads/bk:e	Lcom/google/ads/bj;
    //   21: astore_2
    //   22: goto -9 -> 13
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	bk
    //   25	4	1	localObject	Object
    //   12	10	2	localbj	bj
    // Exception table:
    //   from	to	target	type
    //   2	13	25	finally
    //   17	22	25	finally
  }
  
  public View e()
  {
    try
    {
      e.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
      View localView = this.j;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public String f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 63	com/google/ads/bk:g	Lcom/google/ads/b/b;
    //   6: ifnull +20 -> 26
    //   9: aload_0
    //   10: getfield 63	com/google/ads/bk:g	Lcom/google/ads/b/b;
    //   13: invokevirtual 130	java/lang/Object:getClass	()Ljava/lang/Class;
    //   16: invokevirtual 135	java/lang/Class:getName	()Ljava/lang/String;
    //   19: astore_3
    //   20: aload_3
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: areturn
    //   26: ldc 137
    //   28: astore_2
    //   29: goto -7 -> 22
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	bk
    //   32	4	1	localObject	Object
    //   21	8	2	str1	String
    //   19	2	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   2	20	32	finally
  }
  
  void g()
  {
    try
    {
      this.i = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  boolean h()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bk
 * JD-Core Version:    0.7.0.1
 */