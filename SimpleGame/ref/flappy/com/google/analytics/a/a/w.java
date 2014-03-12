package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class w
  extends v
  implements x
{
  private int a;
  private List b = Collections.emptyList();
  private List c = Collections.emptyList();
  private List d = Collections.emptyList();
  private List e = Collections.emptyList();
  private List f = Collections.emptyList();
  private List g = Collections.emptyList();
  private List h = Collections.emptyList();
  private List i = Collections.emptyList();
  private List j = Collections.emptyList();
  private List k = Collections.emptyList();
  
  private w()
  {
    k();
  }
  
  private void k() {}
  
  private static w l()
  {
    return new w();
  }
  
  private void m()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }
  
  private void n()
  {
    if ((0x2 & this.a) != 2)
    {
      this.c = new ArrayList(this.c);
      this.a = (0x2 | this.a);
    }
  }
  
  private void o()
  {
    if ((0x4 & this.a) != 4)
    {
      this.d = new ArrayList(this.d);
      this.a = (0x4 | this.a);
    }
  }
  
  private void q()
  {
    if ((0x8 & this.a) != 8)
    {
      this.e = new ArrayList(this.e);
      this.a = (0x8 | this.a);
    }
  }
  
  private void s()
  {
    if ((0x10 & this.a) != 16)
    {
      this.f = new ArrayList(this.f);
      this.a = (0x10 | this.a);
    }
  }
  
  private void t()
  {
    if ((0x20 & this.a) != 32)
    {
      this.g = new ArrayList(this.g);
      this.a = (0x20 | this.a);
    }
  }
  
  private void u()
  {
    if ((0x40 & this.a) != 64)
    {
      this.h = new ArrayList(this.h);
      this.a = (0x40 | this.a);
    }
  }
  
  private void v()
  {
    if ((0x80 & this.a) != 128)
    {
      this.i = new ArrayList(this.i);
      this.a = (0x80 | this.a);
    }
  }
  
  private void w()
  {
    if ((0x100 & this.a) != 256)
    {
      this.j = new ArrayList(this.j);
      this.a = (0x100 | this.a);
    }
  }
  
  private void x()
  {
    if ((0x200 & this.a) != 512)
    {
      this.k = new ArrayList(this.k);
      this.a = (0x200 | this.a);
    }
  }
  
  public w a()
  {
    return l().a(d());
  }
  
  public w a(u paramu)
  {
    if (paramu == u.a()) {
      return this;
    }
    if (!u.b(paramu).isEmpty())
    {
      if (this.b.isEmpty())
      {
        this.b = u.b(paramu);
        this.a = (0xFFFFFFFE & this.a);
      }
    }
    else
    {
      if (!u.c(paramu).isEmpty())
      {
        if (!this.c.isEmpty()) {
          break label481;
        }
        this.c = u.c(paramu);
        this.a = (0xFFFFFFFD & this.a);
      }
      label95:
      if (!u.d(paramu).isEmpty())
      {
        if (!this.d.isEmpty()) {
          break label502;
        }
        this.d = u.d(paramu);
        this.a = (0xFFFFFFFB & this.a);
      }
      label138:
      if (!u.e(paramu).isEmpty())
      {
        if (!this.e.isEmpty()) {
          break label523;
        }
        this.e = u.e(paramu);
        this.a = (0xFFFFFFF7 & this.a);
      }
      label181:
      if (!u.f(paramu).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label544;
        }
        this.f = u.f(paramu);
        this.a = (0xFFFFFFEF & this.a);
      }
      label224:
      if (!u.g(paramu).isEmpty())
      {
        if (!this.g.isEmpty()) {
          break label565;
        }
        this.g = u.g(paramu);
        this.a = (0xFFFFFFDF & this.a);
      }
      label267:
      if (!u.h(paramu).isEmpty())
      {
        if (!this.h.isEmpty()) {
          break label586;
        }
        this.h = u.h(paramu);
        this.a = (0xFFFFFFBF & this.a);
      }
      label310:
      if (!u.i(paramu).isEmpty())
      {
        if (!this.i.isEmpty()) {
          break label607;
        }
        this.i = u.i(paramu);
        this.a = (0xFFFFFF7F & this.a);
      }
      label354:
      if (!u.j(paramu).isEmpty())
      {
        if (!this.j.isEmpty()) {
          break label628;
        }
        this.j = u.j(paramu);
        this.a = (0xFFFFFEFF & this.a);
      }
      label398:
      if (!u.k(paramu).isEmpty())
      {
        if (!this.k.isEmpty()) {
          break label649;
        }
        this.k = u.k(paramu);
        this.a = (0xFFFFFDFF & this.a);
      }
    }
    for (;;)
    {
      a(r().a(u.l(paramu)));
      return this;
      m();
      this.b.addAll(u.b(paramu));
      break;
      label481:
      n();
      this.c.addAll(u.c(paramu));
      break label95;
      label502:
      o();
      this.d.addAll(u.d(paramu));
      break label138;
      label523:
      q();
      this.e.addAll(u.e(paramu));
      break label181;
      label544:
      s();
      this.f.addAll(u.f(paramu));
      break label224;
      label565:
      t();
      this.g.addAll(u.g(paramu));
      break label267;
      label586:
      u();
      this.h.addAll(u.h(paramu));
      break label310;
      label607:
      v();
      this.i.addAll(u.i(paramu));
      break label354;
      label628:
      w();
      this.j.addAll(u.j(paramu));
      break label398;
      label649:
      x();
      this.k.addAll(u.k(paramu));
    }
  }
  
  public w a(k paramk, o paramo)
  {
    try
    {
      u localu3 = (u)u.a.b(paramk, paramo);
      if (localu3 != null) {
        a(localu3);
      }
      return this;
    }
    catch (af localaf)
    {
      u localu2 = (u)localaf.a();
      Object localObject1;
      try
      {
        throw localaf;
      }
      finally
      {
        localu1 = localu2;
      }
      if (localu1 != null) {
        a(localu1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        u localu1 = null;
      }
    }
  }
  
  public u b()
  {
    return u.a();
  }
  
  public u c()
  {
    u localu = d();
    if (!localu.j()) {
      throw a(localu);
    }
    return localu;
  }
  
  public u d()
  {
    u localu = new u(this, null);
    if ((0x1 & this.a) == 1)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    u.a(localu, this.b);
    if ((0x2 & this.a) == 2)
    {
      this.c = Collections.unmodifiableList(this.c);
      this.a = (0xFFFFFFFD & this.a);
    }
    u.b(localu, this.c);
    if ((0x4 & this.a) == 4)
    {
      this.d = Collections.unmodifiableList(this.d);
      this.a = (0xFFFFFFFB & this.a);
    }
    u.c(localu, this.d);
    if ((0x8 & this.a) == 8)
    {
      this.e = Collections.unmodifiableList(this.e);
      this.a = (0xFFFFFFF7 & this.a);
    }
    u.d(localu, this.e);
    if ((0x10 & this.a) == 16)
    {
      this.f = Collections.unmodifiableList(this.f);
      this.a = (0xFFFFFFEF & this.a);
    }
    u.e(localu, this.f);
    if ((0x20 & this.a) == 32)
    {
      this.g = Collections.unmodifiableList(this.g);
      this.a = (0xFFFFFFDF & this.a);
    }
    u.f(localu, this.g);
    if ((0x40 & this.a) == 64)
    {
      this.h = Collections.unmodifiableList(this.h);
      this.a = (0xFFFFFFBF & this.a);
    }
    u.g(localu, this.h);
    if ((0x80 & this.a) == 128)
    {
      this.i = Collections.unmodifiableList(this.i);
      this.a = (0xFFFFFF7F & this.a);
    }
    u.h(localu, this.i);
    if ((0x100 & this.a) == 256)
    {
      this.j = Collections.unmodifiableList(this.j);
      this.a = (0xFFFFFEFF & this.a);
    }
    u.i(localu, this.j);
    if ((0x200 & this.a) == 512)
    {
      this.k = Collections.unmodifiableList(this.k);
      this.a = (0xFFFFFDFF & this.a);
    }
    u.j(localu, this.k);
    return localu;
  }
  
  public final boolean j()
  {
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.w
 * JD-Core Version:    0.7.0.1
 */