package com.google.analytics.b.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class e
  extends w
  implements j
{
  private int a;
  private h b = h.a;
  private Object c = "";
  private List d = Collections.emptyList();
  private List e = Collections.emptyList();
  private List f = Collections.emptyList();
  private Object g = "";
  private Object h = "";
  private long i;
  private boolean j;
  private List k = Collections.emptyList();
  private List l = Collections.emptyList();
  private boolean m;
  
  private e()
  {
    t();
  }
  
  private void t() {}
  
  private static e u()
  {
    return new e();
  }
  
  private void v()
  {
    if ((0x4 & this.a) != 4)
    {
      this.d = new ArrayList(this.d);
      this.a = (0x4 | this.a);
    }
  }
  
  private void w()
  {
    if ((0x8 & this.a) != 8)
    {
      this.e = new ArrayList(this.e);
      this.a = (0x8 | this.a);
    }
  }
  
  private void x()
  {
    if ((0x10 & this.a) != 16)
    {
      this.f = new ArrayList(this.f);
      this.a = (0x10 | this.a);
    }
  }
  
  private void y()
  {
    if ((0x200 & this.a) != 512)
    {
      this.k = new ArrayList(this.k);
      this.a = (0x200 | this.a);
    }
  }
  
  private void z()
  {
    if ((0x400 & this.a) != 1024)
    {
      this.l = new ArrayList(this.l);
      this.a = (0x400 | this.a);
    }
  }
  
  public c a(int paramInt)
  {
    return (c)this.d.get(paramInt);
  }
  
  public e a()
  {
    return u().a(d());
  }
  
  public e a(long paramLong)
  {
    this.a = (0x80 | this.a);
    this.i = paramLong;
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
    if (paramc.f())
    {
      this.a = (0x2 | this.a);
      this.c = c.b(paramc);
    }
    if (!c.c(paramc).isEmpty())
    {
      if (this.d.isEmpty())
      {
        this.d = c.c(paramc);
        this.a = (0xFFFFFFFB & this.a);
      }
    }
    else
    {
      if (!c.d(paramc).isEmpty())
      {
        if (!this.e.isEmpty()) {
          break label411;
        }
        this.e = c.d(paramc);
        this.a = (0xFFFFFFF7 & this.a);
      }
      label136:
      if (!c.e(paramc).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label432;
        }
        this.f = c.e(paramc);
        this.a = (0xFFFFFFEF & this.a);
      }
      label179:
      if (paramc.r())
      {
        this.a = (0x20 | this.a);
        this.g = c.f(paramc);
      }
      if (paramc.t())
      {
        this.a = (0x40 | this.a);
        this.h = c.g(paramc);
      }
      if (paramc.v()) {
        a(paramc.w());
      }
      if (paramc.x()) {
        a(paramc.y());
      }
      if (!c.h(paramc).isEmpty())
      {
        if (!this.k.isEmpty()) {
          break label453;
        }
        this.k = c.h(paramc);
        this.a = (0xFFFFFDFF & this.a);
      }
      label307:
      if (!c.i(paramc).isEmpty())
      {
        if (!this.l.isEmpty()) {
          break label474;
        }
        this.l = c.i(paramc);
        this.a = (0xFFFFFBFF & this.a);
      }
    }
    for (;;)
    {
      if (paramc.D()) {
        b(paramc.E());
      }
      a(paramc);
      a(r().a(c.j(paramc)));
      return this;
      v();
      this.d.addAll(c.c(paramc));
      break;
      label411:
      w();
      this.e.addAll(c.d(paramc));
      break label136;
      label432:
      x();
      this.f.addAll(c.e(paramc));
      break label179;
      label453:
      y();
      this.k.addAll(c.h(paramc));
      break label307;
      label474:
      z();
      this.l.addAll(c.i(paramc));
    }
  }
  
  public e a(h paramh)
  {
    if (paramh == null) {
      throw new NullPointerException();
    }
    this.a = (0x1 | this.a);
    this.b = paramh;
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
  
  public e a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.a = (0x2 | this.a);
    this.c = paramString;
    return this;
  }
  
  public e a(boolean paramBoolean)
  {
    this.a = (0x100 | this.a);
    this.j = paramBoolean;
    return this;
  }
  
  public c b()
  {
    return c.a();
  }
  
  public c b(int paramInt)
  {
    return (c)this.e.get(paramInt);
  }
  
  public e b(c paramc)
  {
    if (paramc == null) {
      throw new NullPointerException();
    }
    v();
    this.d.add(paramc);
    return this;
  }
  
  public e b(boolean paramBoolean)
  {
    this.a = (0x800 | this.a);
    this.m = paramBoolean;
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
  
  public c c(int paramInt)
  {
    return (c)this.f.get(paramInt);
  }
  
  public e c(c paramc)
  {
    if (paramc == null) {
      throw new NullPointerException();
    }
    w();
    this.e.add(paramc);
    return this;
  }
  
  public c d()
  {
    int n = 1;
    c localc = new c(this, null);
    int i1 = this.a;
    if ((i1 & 0x1) == n) {}
    for (;;)
    {
      c.a(localc, this.b);
      if ((i1 & 0x2) == 2) {
        n |= 0x2;
      }
      c.a(localc, this.c);
      if ((0x4 & this.a) == 4)
      {
        this.d = Collections.unmodifiableList(this.d);
        this.a = (0xFFFFFFFB & this.a);
      }
      c.a(localc, this.d);
      if ((0x8 & this.a) == 8)
      {
        this.e = Collections.unmodifiableList(this.e);
        this.a = (0xFFFFFFF7 & this.a);
      }
      c.b(localc, this.e);
      if ((0x10 & this.a) == 16)
      {
        this.f = Collections.unmodifiableList(this.f);
        this.a = (0xFFFFFFEF & this.a);
      }
      c.c(localc, this.f);
      if ((i1 & 0x20) == 32) {
        n |= 0x4;
      }
      c.b(localc, this.g);
      if ((i1 & 0x40) == 64) {
        n |= 0x8;
      }
      c.c(localc, this.h);
      if ((i1 & 0x80) == 128) {
        n |= 0x10;
      }
      c.a(localc, this.i);
      if ((i1 & 0x100) == 256) {
        n |= 0x20;
      }
      c.a(localc, this.j);
      if ((0x200 & this.a) == 512)
      {
        this.k = Collections.unmodifiableList(this.k);
        this.a = (0xFFFFFDFF & this.a);
      }
      c.d(localc, this.k);
      if ((0x400 & this.a) == 1024)
      {
        this.l = Collections.unmodifiableList(this.l);
        this.a = (0xFFFFFBFF & this.a);
      }
      c.e(localc, this.l);
      if ((i1 & 0x800) == 2048) {
        n |= 0x40;
      }
      c.b(localc, this.m);
      c.a(localc, n);
      return localc;
      n = 0;
    }
  }
  
  public c d(int paramInt)
  {
    return (c)this.k.get(paramInt);
  }
  
  public e d(c paramc)
  {
    if (paramc == null) {
      throw new NullPointerException();
    }
    x();
    this.f.add(paramc);
    return this;
  }
  
  public boolean i()
  {
    return (0x1 & this.a) == 1;
  }
  
  public final boolean j()
  {
    if (!i()) {}
    label36:
    label63:
    label90:
    label120:
    do
    {
      return false;
      for (int n = 0;; n++)
      {
        if (n >= k()) {
          break label36;
        }
        if (!a(n).j()) {
          break;
        }
      }
      for (int i1 = 0;; i1++)
      {
        if (i1 >= l()) {
          break label63;
        }
        if (!b(i1).j()) {
          break;
        }
      }
      for (int i2 = 0;; i2++)
      {
        if (i2 >= m()) {
          break label90;
        }
        if (!c(i2).j()) {
          break;
        }
      }
      for (int i3 = 0;; i3++)
      {
        if (i3 >= n()) {
          break label120;
        }
        if (!d(i3).j()) {
          break;
        }
      }
    } while (!s());
    return true;
  }
  
  public int k()
  {
    return this.d.size();
  }
  
  public int l()
  {
    return this.e.size();
  }
  
  public int m()
  {
    return this.f.size();
  }
  
  public int n()
  {
    return this.k.size();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.b.a.a.e
 * JD-Core Version:    0.7.0.1
 */