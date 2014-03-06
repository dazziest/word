package com.dotgears;

public class p
  extends m
{
  public int a;
  public int b;
  public int c = this.r.b;
  public int d = this.r.c;
  public int e = 0;
  public int f = 0;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l = 0;
  public boolean m;
  public int n = 512 - this.d >> 1;
  public k o = new k();
  public r p = new r();
  public i q = g.D.b("new");
  public i r = g.D.b("score_panel");
  public l s = g.D.B;
  
  public void a(float paramFloat)
  {
    if (!this.F) {}
    do
    {
      do
      {
        return;
        if (!this.p.g) {
          this.p.a(paramFloat);
        }
        switch (this.k)
        {
        default: 
          return;
        case 0: 
          this.b = ((int)this.p.a);
        }
      } while (!this.p.g);
      if (this.l > 0)
      {
        this.k = 1;
        this.p.a(0.0F, this.l, 0, 0.5F);
        return;
      }
      this.k = 2;
      return;
      this.e = ((int)this.p.a);
    } while (!this.p.g);
    this.k = 2;
    g.D.a(this.e);
    if (this.e > this.f)
    {
      this.f = this.e;
      this.m = true;
    }
    if (this.e >= this.j) {
      this.o.a(0);
    }
    for (;;)
    {
      this.o.a = (32 + this.a);
      this.o.b = (44 + this.b);
      return;
      if (this.e >= this.i) {
        this.o.a(1);
      } else if (this.e >= this.h) {
        this.o.a(2);
      } else if (this.e >= this.g) {
        this.o.a(3);
      }
    }
    this.o.a(paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.l = paramInt1;
    this.f = paramInt2;
    this.e = 0;
    this.g = paramInt3;
    this.h = paramInt4;
    this.i = paramInt5;
    this.j = paramInt6;
    this.F = true;
    this.G = true;
    this.m = false;
    this.a = (288 - this.c >> 1);
    this.b = 504;
    this.p.a(this.b, this.n, 11, 0.5F);
    this.k = 0;
    this.o.F = false;
    this.o.G = false;
  }
  
  public void a(g paramg)
  {
    if (!this.G) {
      return;
    }
    paramg.a(this.r.i, this.a, this.b, 1.0F, 1.0F, 1.0F);
    this.s.a(paramg, this.e, 210 + this.a, 36 + this.b, false, 10);
    this.s.a(paramg, this.f, 210 + this.a, 78 + this.b, false, 10);
    if (this.m) {
      paramg.a(this.q.i, 142 + this.a, 60 + this.b, 1.0F, 1.0F, 1.0F);
    }
    this.o.a(paramg);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.p
 * JD-Core Version:    0.7.0.1
 */