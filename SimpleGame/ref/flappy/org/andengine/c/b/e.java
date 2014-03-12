package org.andengine.c.b;

import android.util.SparseArray;

public class e
  extends org.andengine.c.a
{
  protected e I;
  protected org.andengine.d.a.a.b J = new org.andengine.d.a.a.b(4);
  private boolean K = false;
  private boolean L = false;
  private final SparseArray M = new SparseArray();
  private boolean N = false;
  private final SparseArray O = new SparseArray();
  private float a;
  private boolean b;
  private boolean c;
  private boolean d;
  private final org.andengine.b.b.a.a e = new org.andengine.b.b.a.a();
  private c f;
  private b g;
  private org.andengine.c.b.a.b h = new org.andengine.c.b.a.a(org.andengine.d.d.a.b);
  private boolean i = true;
  private boolean j = true;
  
  private Boolean a(org.andengine.input.a.a parama, float paramFloat1, float paramFloat2, d paramd)
  {
    float[] arrayOfFloat = paramd.b(paramFloat1, paramFloat2);
    float f1 = arrayOfFloat[0];
    float f2 = arrayOfFloat[1];
    if (paramd.a(parama, f1, f2)) {
      return Boolean.TRUE;
    }
    if (this.g != null) {
      return Boolean.valueOf(this.g.a(parama, paramd, f1, f2));
    }
    return null;
  }
  
  protected void a(float paramFloat)
  {
    this.a = (paramFloat + this.a);
    this.e.a_(paramFloat);
    e locale = this.I;
    if ((locale == null) || (!this.c))
    {
      this.h.a_(paramFloat);
      super.a(paramFloat);
    }
    if (locale != null) {
      locale.a_(paramFloat);
    }
  }
  
  public void a(c paramc)
  {
    this.f = paramc;
  }
  
  public void a(org.andengine.c.c paramc) {}
  
  public boolean a(org.andengine.input.a.a parama)
  {
    int k = parama.e();
    boolean bool1 = parama.f();
    boolean bool2 = parama.h();
    if (!bool1)
    {
      if ((this.N) && ((c)this.O.get(parama.d()) != null))
      {
        switch (k)
        {
        }
        for (;;)
        {
          Boolean localBoolean5 = Boolean.valueOf(this.f.a(this, parama));
          if ((localBoolean5 == null) || (!localBoolean5.booleanValue())) {
            break;
          }
          return true;
          this.O.remove(parama.d());
        }
      }
      if (this.K)
      {
        SparseArray localSparseArray = this.M;
        d locald3 = (d)localSparseArray.get(parama.d());
        if (locald3 != null)
        {
          float f3 = parama.b();
          float f4 = parama.c();
          switch (k)
          {
          }
          for (;;)
          {
            Boolean localBoolean4 = a(parama, f3, f4, locald3);
            if ((localBoolean4 == null) || (!localBoolean4.booleanValue())) {
              break;
            }
            return true;
            localSparseArray.remove(parama.d());
          }
        }
      }
    }
    if (this.I != null)
    {
      if (b(parama)) {
        return true;
      }
      if (this.d) {
        return false;
      }
    }
    float f1 = parama.b();
    float f2 = parama.c();
    org.andengine.d.a.a.b localb = this.J;
    int m;
    int i1;
    if (localb != null)
    {
      m = localb.size();
      if (m > 0)
      {
        if (!this.j) {
          break label466;
        }
        i1 = 0;
        if (i1 < m) {
          break label370;
        }
      }
    }
    for (;;)
    {
      if (this.f != null)
      {
        Boolean localBoolean1 = Boolean.valueOf(this.f.a(this, parama));
        if ((localBoolean1 != null) && (localBoolean1.booleanValue()))
        {
          if ((this.N) && (bool1)) {
            this.O.put(parama.d(), this.f);
          }
          return true;
          label370:
          d locald2 = (d)localb.get(i1);
          if (locald2.a(f1, f2))
          {
            Boolean localBoolean3 = a(parama, f1, f2, locald2);
            if ((localBoolean3 != null) && (localBoolean3.booleanValue()))
            {
              if (((this.K) && (bool1)) || ((this.L) && (bool2))) {
                this.M.put(parama.d(), locald2);
              }
              return true;
            }
          }
          i1++;
          break;
          label466:
          for (int n = m - 1; n >= 0; n--)
          {
            d locald1 = (d)localb.get(n);
            if (locald1.a(f1, f2))
            {
              Boolean localBoolean2 = a(parama, f1, f2, locald1);
              if ((localBoolean2 != null) && (localBoolean2.booleanValue()))
              {
                if (((this.K) && (bool1)) || ((this.L) && (bool2))) {
                  this.M.put(parama.d(), locald1);
                }
                return true;
              }
            }
          }
          continue;
        }
        return false;
      }
    }
    return false;
  }
  
  protected boolean b(org.andengine.input.a.a parama)
  {
    return this.I.a(parama);
  }
  
  protected void e(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    e locale = this.I;
    if ((locale == null) || (!this.b))
    {
      if (this.i)
      {
        parame.m();
        parama.c(parame);
        parame.l();
        this.h.a(parame, parama);
        parame.n();
      }
      parame.m();
      f(parame, parama);
      parame.l();
      super.e(parame, parama);
      parame.n();
    }
    if (locale != null) {
      locale.a(parame, parama);
    }
  }
  
  protected void f(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    parama.b(parame);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.b.e
 * JD-Core Version:    0.7.0.1
 */