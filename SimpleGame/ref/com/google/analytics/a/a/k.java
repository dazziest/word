package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k
  extends v
  implements l
{
  private int a;
  private List b = Collections.emptyList();
  private int c;
  private int d;
  private boolean e;
  private boolean f;
  
  private k()
  {
    l();
  }
  
  private void l() {}
  
  private static k m()
  {
    return new k();
  }
  
  private void n()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }
  
  public k a()
  {
    return m().a(d());
  }
  
  public k a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
  
  public k a(i parami)
  {
    if (parami == i.a()) {
      return this;
    }
    if (!i.b(parami).isEmpty())
    {
      if (!this.b.isEmpty()) {
        break label134;
      }
      this.b = i.b(parami);
      this.a = (0xFFFFFFFE & this.a);
    }
    for (;;)
    {
      if (parami.f()) {
        a(parami.g());
      }
      if (parami.h()) {
        b(parami.i());
      }
      if (parami.k()) {
        a(parami.l());
      }
      if (parami.m()) {
        b(parami.q());
      }
      a(r().a(i.c(parami)));
      return this;
      label134:
      n();
      this.b.addAll(i.b(parami));
    }
  }
  
  public k a(com.google.tagmanager.a.k paramk, o paramo)
  {
    try
    {
      i locali3 = (i)i.a.b(paramk, paramo);
      if (locali3 != null) {
        a(locali3);
      }
      return this;
    }
    catch (af localaf)
    {
      i locali2 = (i)localaf.a();
      Object localObject1;
      try
      {
        throw localaf;
      }
      finally
      {
        locali1 = locali2;
      }
      if (locali1 != null) {
        a(locali1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        i locali1 = null;
      }
    }
  }
  
  public k a(boolean paramBoolean)
  {
    this.a = (0x8 | this.a);
    this.e = paramBoolean;
    return this;
  }
  
  public i b()
  {
    return i.a();
  }
  
  public k b(int paramInt)
  {
    this.a = (0x4 | this.a);
    this.d = paramInt;
    return this;
  }
  
  public k b(boolean paramBoolean)
  {
    this.a = (0x10 | this.a);
    this.f = paramBoolean;
    return this;
  }
  
  public i c()
  {
    i locali = d();
    if (!locali.j()) {
      throw a(locali);
    }
    return locali;
  }
  
  public i d()
  {
    int i = 1;
    i locali = new i(this, null);
    int j = this.a;
    if ((0x1 & this.a) == i)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    i.a(locali, this.b);
    if ((j & 0x2) == 2) {}
    for (;;)
    {
      i.a(locali, this.c);
      if ((j & 0x4) == 4) {
        i |= 0x2;
      }
      i.b(locali, this.d);
      if ((j & 0x8) == 8) {
        i |= 0x4;
      }
      i.a(locali, this.e);
      if ((j & 0x10) == 16) {
        i |= 0x8;
      }
      i.b(locali, this.f);
      i.c(locali, i);
      return locali;
      i = 0;
    }
  }
  
  public boolean i()
  {
    return (0x2 & this.a) == 2;
  }
  
  public final boolean j()
  {
    return i();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.k
 * JD-Core Version:    0.7.0.1
 */