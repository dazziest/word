package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.v;

public final class o
  extends v
  implements p
{
  private int a;
  private int b;
  private int c;
  
  private o()
  {
    m();
  }
  
  private void m() {}
  
  private static o n()
  {
    return new o();
  }
  
  public o a()
  {
    return n().a(d());
  }
  
  public o a(int paramInt)
  {
    this.a = (0x1 | this.a);
    this.b = paramInt;
    return this;
  }
  
  public o a(m paramm)
  {
    if (paramm == m.a()) {
      return this;
    }
    if (paramm.d()) {
      a(paramm.e());
    }
    if (paramm.f()) {
      b(paramm.g());
    }
    a(r().a(m.b(paramm)));
    return this;
  }
  
  public o a(k paramk, com.google.tagmanager.a.o paramo)
  {
    try
    {
      m localm3 = (m)m.a.b(paramk, paramo);
      if (localm3 != null) {
        a(localm3);
      }
      return this;
    }
    catch (af localaf)
    {
      m localm2 = (m)localaf.a();
      Object localObject1;
      try
      {
        throw localaf;
      }
      finally
      {
        localm1 = localm2;
      }
      if (localm1 != null) {
        a(localm1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        m localm1 = null;
      }
    }
  }
  
  public m b()
  {
    return m.a();
  }
  
  public o b(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
  
  public m c()
  {
    m localm = d();
    if (!localm.j()) {
      throw a(localm);
    }
    return localm;
  }
  
  public m d()
  {
    int i = 1;
    m localm = new m(this, null);
    int j = this.a;
    if ((j & 0x1) == i) {}
    for (;;)
    {
      m.a(localm, this.b);
      if ((j & 0x2) == 2) {
        i |= 0x2;
      }
      m.b(localm, this.c);
      m.c(localm, i);
      return localm;
      i = 0;
    }
  }
  
  public boolean i()
  {
    return (0x1 & this.a) == 1;
  }
  
  public final boolean j()
  {
    if (!i()) {}
    while (!k()) {
      return false;
    }
    return true;
  }
  
  public boolean k()
  {
    return (0x2 & this.a) == 2;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.o
 * JD-Core Version:    0.7.0.1
 */