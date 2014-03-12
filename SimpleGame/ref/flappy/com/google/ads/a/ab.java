package com.google.ads.a;

import android.os.SystemClock;
import com.google.ads.bj;
import com.google.ads.util.g;
import java.util.Iterator;
import java.util.LinkedList;

public class ab
{
  private static long f = 0L;
  private static long g = 0L;
  private static long h = 0L;
  private static long i = 0L;
  private static long j = -1L;
  private final LinkedList a = new LinkedList();
  private long b;
  private long c;
  private long d;
  private final LinkedList e = new LinkedList();
  private boolean k = false;
  private boolean l = false;
  private String m;
  private long n;
  private final LinkedList o = new LinkedList();
  private final LinkedList p = new LinkedList();
  
  public ab()
  {
    a();
  }
  
  public static long E()
  {
    if (j == -1L)
    {
      j = SystemClock.elapsedRealtime();
      return 0L;
    }
    return SystemClock.elapsedRealtime() - j;
  }
  
  protected boolean A()
  {
    return this.l;
  }
  
  protected void B()
  {
    g.d("Interstitial no fill.");
    this.l = true;
  }
  
  public void C()
  {
    g.d("Landing page dismissed.");
    this.e.add(Long.valueOf(SystemClock.elapsedRealtime()));
  }
  
  protected String D()
  {
    return this.m;
  }
  
  protected void a()
  {
    try
    {
      this.a.clear();
      this.b = 0L;
      this.c = 0L;
      this.d = 0L;
      this.e.clear();
      this.n = -1L;
      this.o.clear();
      this.p.clear();
      this.k = false;
      this.l = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(bj parambj)
  {
    try
    {
      this.o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.n));
      this.p.add(parambj);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(String paramString)
  {
    g.d("Prior impression ticket = " + paramString);
    this.m = paramString;
  }
  
  public void b()
  {
    try
    {
      this.o.clear();
      this.p.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void c()
  {
    try
    {
      this.n = SystemClock.elapsedRealtime();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String d()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.o.iterator();
      while (localIterator.hasNext())
      {
        long l1 = ((Long)localIterator.next()).longValue();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(l1);
      }
      str = localStringBuilder.toString();
    }
    finally {}
    String str;
    return str;
  }
  
  public String e()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.p.iterator();
      while (localIterator.hasNext())
      {
        bj localbj = (bj)localIterator.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(localbj.ordinal());
      }
      str = localStringBuilder.toString();
    }
    finally {}
    String str;
    return str;
  }
  
  protected void f()
  {
    g.d("Ad clicked.");
    this.a.add(Long.valueOf(SystemClock.elapsedRealtime()));
  }
  
  protected void g()
  {
    g.d("Ad request loaded.");
    this.b = SystemClock.elapsedRealtime();
  }
  
  protected void h()
  {
    try
    {
      g.d("Ad request before rendering.");
      this.c = SystemClock.elapsedRealtime();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void i()
  {
    g.d("Ad request started.");
    this.d = SystemClock.elapsedRealtime();
    f = 1L + f;
  }
  
  protected long j()
  {
    if (this.a.size() != this.e.size()) {
      return -1L;
    }
    return this.a.size();
  }
  
  protected String k()
  {
    if ((this.a.isEmpty()) || (this.a.size() != this.e.size())) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i1 = 0; i1 < this.a.size(); i1++)
    {
      if (i1 != 0) {
        localStringBuilder.append(",");
      }
      localStringBuilder.append(Long.toString(((Long)this.e.get(i1)).longValue() - ((Long)this.a.get(i1)).longValue()));
    }
    return localStringBuilder.toString();
  }
  
  protected String l()
  {
    if (this.a.isEmpty()) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i1 = 0; i1 < this.a.size(); i1++)
    {
      if (i1 != 0) {
        localStringBuilder.append(",");
      }
      localStringBuilder.append(Long.toString(((Long)this.a.get(i1)).longValue() - this.b));
    }
    return localStringBuilder.toString();
  }
  
  protected long m()
  {
    return this.b - this.d;
  }
  
  protected long n()
  {
    try
    {
      long l1 = this.c;
      long l2 = this.d;
      long l3 = l1 - l2;
      return l3;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected long o()
  {
    return f;
  }
  
  protected long p()
  {
    try
    {
      long l1 = g;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void q()
  {
    try
    {
      g.d("Ad request network error");
      g = 1L + g;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void r()
  {
    try
    {
      g = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected long s()
  {
    try
    {
      long l1 = h;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void t()
  {
    try
    {
      h = 1L + h;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void u()
  {
    try
    {
      h = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected long v()
  {
    try
    {
      long l1 = i;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void w()
  {
    try
    {
      i = 1L + i;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void x()
  {
    try
    {
      i = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected boolean y()
  {
    return this.k;
  }
  
  protected void z()
  {
    g.d("Interstitial network error.");
    this.k = true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.ab
 * JD-Core Version:    0.7.0.1
 */