package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.bg;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s
  extends v
  implements t
{
  private int a;
  private ai b = ah.a;
  private List c = Collections.emptyList();
  private List d = Collections.emptyList();
  private List e = Collections.emptyList();
  private List f = Collections.emptyList();
  private List g = Collections.emptyList();
  private List h = Collections.emptyList();
  private Object i = "";
  private Object j = "";
  private Object k = "0";
  private Object l = "";
  private c m = c.a();
  private float n;
  private boolean o;
  private ai p = ah.a;
  private int q;
  
  private s()
  {
    q();
  }
  
  private void A()
  {
    if ((0x4000 & this.a) != 16384)
    {
      this.p = new ah(this.p);
      this.a = (0x4000 | this.a);
    }
  }
  
  private void q() {}
  
  private static s s()
  {
    return new s();
  }
  
  private void t()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ah(this.b);
      this.a = (0x1 | this.a);
    }
  }
  
  private void u()
  {
    if ((0x2 & this.a) != 2)
    {
      this.c = new ArrayList(this.c);
      this.a = (0x2 | this.a);
    }
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
    if ((0x20 & this.a) != 32)
    {
      this.g = new ArrayList(this.g);
      this.a = (0x20 | this.a);
    }
  }
  
  private void z()
  {
    if ((0x40 & this.a) != 64)
    {
      this.h = new ArrayList(this.h);
      this.a = (0x40 | this.a);
    }
  }
  
  public s a()
  {
    return s().a(d());
  }
  
  public s a(float paramFloat)
  {
    this.a = (0x1000 | this.a);
    this.n = paramFloat;
    return this;
  }
  
  public s a(c paramc)
  {
    if (((0x800 & this.a) == 2048) && (this.m != c.a())) {}
    for (this.m = c.a(this.m).a(paramc).d();; this.m = paramc)
    {
      this.a = (0x800 | this.a);
      return this;
    }
  }
  
  public s a(q paramq)
  {
    if (paramq == q.a()) {
      return this;
    }
    if (!q.b(paramq).isEmpty())
    {
      if (this.b.isEmpty())
      {
        this.b = q.b(paramq);
        this.a = (0xFFFFFFFE & this.a);
      }
    }
    else
    {
      if (!q.c(paramq).isEmpty())
      {
        if (!this.c.isEmpty()) {
          break label565;
        }
        this.c = q.c(paramq);
        this.a = (0xFFFFFFFD & this.a);
      }
      label95:
      if (!q.d(paramq).isEmpty())
      {
        if (!this.d.isEmpty()) {
          break label586;
        }
        this.d = q.d(paramq);
        this.a = (0xFFFFFFFB & this.a);
      }
      label138:
      if (!q.e(paramq).isEmpty())
      {
        if (!this.e.isEmpty()) {
          break label607;
        }
        this.e = q.e(paramq);
        this.a = (0xFFFFFFF7 & this.a);
      }
      label181:
      if (!q.f(paramq).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label628;
        }
        this.f = q.f(paramq);
        this.a = (0xFFFFFFEF & this.a);
      }
      label224:
      if (!q.g(paramq).isEmpty())
      {
        if (!this.g.isEmpty()) {
          break label649;
        }
        this.g = q.g(paramq);
        this.a = (0xFFFFFFDF & this.a);
      }
      label267:
      if (!q.h(paramq).isEmpty())
      {
        if (!this.h.isEmpty()) {
          break label670;
        }
        this.h = q.h(paramq);
        this.a = (0xFFFFFFBF & this.a);
      }
      label310:
      if (paramq.v())
      {
        this.a = (0x80 | this.a);
        this.i = q.i(paramq);
      }
      if (paramq.x())
      {
        this.a = (0x100 | this.a);
        this.j = q.j(paramq);
      }
      if (paramq.z())
      {
        this.a = (0x200 | this.a);
        this.k = q.k(paramq);
      }
      if (paramq.B())
      {
        this.a = (0x400 | this.a);
        this.l = q.l(paramq);
      }
      if (paramq.D()) {
        a(paramq.E());
      }
      if (paramq.F()) {
        a(paramq.G());
      }
      if (paramq.H()) {
        a(paramq.I());
      }
      if (!q.m(paramq).isEmpty())
      {
        if (!this.p.isEmpty()) {
          break label691;
        }
        this.p = q.m(paramq);
        this.a = (0xFFFFBFFF & this.a);
      }
    }
    for (;;)
    {
      if (paramq.L()) {
        f(paramq.M());
      }
      a(r().a(q.n(paramq)));
      return this;
      t();
      this.b.addAll(q.b(paramq));
      break;
      label565:
      u();
      this.c.addAll(q.c(paramq));
      break label95;
      label586:
      v();
      this.d.addAll(q.d(paramq));
      break label138;
      label607:
      w();
      this.e.addAll(q.e(paramq));
      break label181;
      label628:
      x();
      this.f.addAll(q.f(paramq));
      break label224;
      label649:
      y();
      this.g.addAll(q.g(paramq));
      break label267;
      label670:
      z();
      this.h.addAll(q.h(paramq));
      break label310;
      label691:
      A();
      this.p.addAll(q.m(paramq));
    }
  }
  
  public s a(k paramk, o paramo)
  {
    try
    {
      q localq3 = (q)q.a.b(paramk, paramo);
      if (localq3 != null) {
        a(localq3);
      }
      return this;
    }
    catch (af localaf)
    {
      q localq2 = (q)localaf.a();
      Object localObject1;
      try
      {
        throw localaf;
      }
      finally
      {
        localq1 = localq2;
      }
      if (localq1 != null) {
        a(localq1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        q localq1 = null;
      }
    }
  }
  
  public s a(boolean paramBoolean)
  {
    this.a = (0x2000 | this.a);
    this.o = paramBoolean;
    return this;
  }
  
  public com.google.analytics.b.a.a.c a(int paramInt)
  {
    return (com.google.analytics.b.a.a.c)this.c.get(paramInt);
  }
  
  public m b(int paramInt)
  {
    return (m)this.d.get(paramInt);
  }
  
  public q b()
  {
    return q.a();
  }
  
  public i c(int paramInt)
  {
    return (i)this.e.get(paramInt);
  }
  
  public q c()
  {
    q localq = d();
    if (!localq.j()) {
      throw a(localq);
    }
    return localq;
  }
  
  public i d(int paramInt)
  {
    return (i)this.f.get(paramInt);
  }
  
  public q d()
  {
    int i1 = 1;
    q localq = new q(this, null);
    int i2 = this.a;
    if ((0x1 & this.a) == i1)
    {
      this.b = new bg(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    q.a(localq, this.b);
    if ((0x2 & this.a) == 2)
    {
      this.c = Collections.unmodifiableList(this.c);
      this.a = (0xFFFFFFFD & this.a);
    }
    q.a(localq, this.c);
    if ((0x4 & this.a) == 4)
    {
      this.d = Collections.unmodifiableList(this.d);
      this.a = (0xFFFFFFFB & this.a);
    }
    q.b(localq, this.d);
    if ((0x8 & this.a) == 8)
    {
      this.e = Collections.unmodifiableList(this.e);
      this.a = (0xFFFFFFF7 & this.a);
    }
    q.c(localq, this.e);
    if ((0x10 & this.a) == 16)
    {
      this.f = Collections.unmodifiableList(this.f);
      this.a = (0xFFFFFFEF & this.a);
    }
    q.d(localq, this.f);
    if ((0x20 & this.a) == 32)
    {
      this.g = Collections.unmodifiableList(this.g);
      this.a = (0xFFFFFFDF & this.a);
    }
    q.e(localq, this.g);
    if ((0x40 & this.a) == 64)
    {
      this.h = Collections.unmodifiableList(this.h);
      this.a = (0xFFFFFFBF & this.a);
    }
    q.f(localq, this.h);
    if ((i2 & 0x80) == 128) {}
    for (;;)
    {
      q.a(localq, this.i);
      if ((i2 & 0x100) == 256) {
        i1 |= 0x2;
      }
      q.b(localq, this.j);
      if ((i2 & 0x200) == 512) {
        i1 |= 0x4;
      }
      q.c(localq, this.k);
      if ((i2 & 0x400) == 1024) {
        i1 |= 0x8;
      }
      q.d(localq, this.l);
      if ((i2 & 0x800) == 2048) {
        i1 |= 0x10;
      }
      q.a(localq, this.m);
      if ((i2 & 0x1000) == 4096) {
        i1 |= 0x20;
      }
      q.a(localq, this.n);
      if ((i2 & 0x2000) == 8192) {
        i1 |= 0x40;
      }
      q.a(localq, this.o);
      if ((0x4000 & this.a) == 16384)
      {
        this.p = new bg(this.p);
        this.a = (0xFFFFBFFF & this.a);
      }
      q.b(localq, this.p);
      if ((i2 & 0x8000) == 32768) {
        i1 |= 0x80;
      }
      q.a(localq, this.q);
      q.b(localq, i1);
      return localq;
      i1 = 0;
    }
  }
  
  public i e(int paramInt)
  {
    return (i)this.g.get(paramInt);
  }
  
  public s f(int paramInt)
  {
    this.a = (0x8000 | this.a);
    this.q = paramInt;
    return this;
  }
  
  public int i()
  {
    return this.c.size();
  }
  
  public final boolean j()
  {
    for (int i1 = 0; i1 < i(); i1++) {
      if (!a(i1).j()) {
        return false;
      }
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 >= k()) {
        break label56;
      }
      if (!b(i2).j()) {
        break;
      }
    }
    label56:
    for (int i3 = 0;; i3++)
    {
      if (i3 >= l()) {
        break label83;
      }
      if (!c(i3).j()) {
        break;
      }
    }
    label83:
    for (int i4 = 0;; i4++)
    {
      if (i4 >= m()) {
        break label113;
      }
      if (!d(i4).j()) {
        break;
      }
    }
    label113:
    for (int i5 = 0;; i5++)
    {
      if (i5 >= n()) {
        break label143;
      }
      if (!e(i5).j()) {
        break;
      }
    }
    label143:
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
    return this.g.size();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.s
 * JD-Core Version:    0.7.0.1
 */