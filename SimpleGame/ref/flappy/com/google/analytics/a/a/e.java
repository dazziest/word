package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;

public final class e
  extends v
  implements h
{
  private int a;
  private f b = f.a;
  private int c;
  private int d;
  
  private e()
  {
    k();
  }
  
  private void k() {}
  
  private static e l()
  {
    return new e();
  }
  
  public e a()
  {
    return l().a(d());
  }
  
  public e a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
  
  public e a(c paramc)
  {
    if (paramc == c.a()) {
      return this;
    }
    if (paramc.d()) {
      a(paramc.e());
    }
    if (paramc.f()) {
      a(paramc.g());
    }
    if (paramc.h()) {
      b(paramc.i());
    }
    a(r().a(c.b(paramc)));
    return this;
  }
  
  public e a(f paramf)
  {
    if (paramf == null) {
      throw new NullPointerException();
    }
    this.a = (0x1 | this.a);
    this.b = paramf;
    return this;
  }
  
  public e a(k paramk, o paramo)
  {
    try
    {
      c localc3 = (c)c.a.b(paramk, paramo);
      if (localc3 != null) {
        a(localc3);
      }
      return this;
    }
    catch (af localaf)
    {
      c localc2 = (c)localaf.a();
      Object localObject1;
      try
      {
        throw localaf;
      }
      finally
      {
        localc1 = localc2;
      }
      if (localc1 != null) {
        a(localc1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        c localc1 = null;
      }
    }
  }
  
  public c b()
  {
    return c.a();
  }
  
  public e b(int paramInt)
  {
    this.a = (0x4 | this.a);
    this.d = paramInt;
    return this;
  }
  
  public c c()
  {
    c localc = d();
    if (!localc.j()) {
      throw a(localc);
    }
    return localc;
  }
  
  public c d()
  {
    int i = 1;
    c localc = new c(this, null);
    int j = this.a;
    if ((j & 0x1) == i) {}
    for (;;)
    {
      c.a(localc, this.b);
      if ((j & 0x2) == 2) {
        i |= 0x2;
      }
      c.a(localc, this.c);
      if ((j & 0x4) == 4) {
        i |= 0x4;
      }
      c.b(localc, this.d);
      c.c(localc, i);
      return localc;
      i = 0;
    }
  }
  
  public final boolean j()
  {
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.e
 * JD-Core Version:    0.7.0.1
 */