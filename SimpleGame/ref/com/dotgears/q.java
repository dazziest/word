package com.dotgears;

public class q
  extends m
{
  d[] a = new d[10];
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public float i = 1.0F;
  public d j = null;
  public boolean k;
  public boolean l;
  public boolean m = false;
  public boolean n = false;
  public int o;
  public i[] p;
  
  public void a(float paramFloat)
  {
    if (!this.m) {}
    while (this.j == null) {
      return;
    }
    this.j.a(paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = 0;
    this.m = true;
    this.n = true;
    this.k = false;
    this.l = false;
    this.i = 1.0F;
  }
  
  public void a(int paramInt1, String paramString, int[] paramArrayOfInt, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    d locald = new d(paramInt1, paramString, paramArrayOfInt, paramInt2, paramInt3, paramBoolean);
    this.a[paramInt1] = locald;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a[paramInt].a();
    }
    this.a[paramInt].b();
    this.j = this.a[paramInt];
  }
  
  public void a(g paramg)
  {
    if (!this.n) {
      return;
    }
    i locali = this.p[0];
    if (this.j != null) {
      locali = this.p[this.j.j];
    }
    paramg.a(locali.i, this.b - this.g, this.c - this.h, 1.0F, 1.0F, this.i);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = g.D.a(paramString);
    this.o = this.p.length;
    if ((paramInt1 != 0) && (paramInt2 != 0)) {
      this.e = paramInt1;
    }
    for (this.f = paramInt2; (paramInt3 != 0) && (paramInt4 != 0); this.f = this.p[0].c)
    {
      this.g = paramInt3;
      this.h = paramInt4;
      return;
      this.e = this.p[0].b;
    }
    this.g = (this.p[0].b - this.e >> 1);
    this.h = (this.p[0].c - this.f >> 1);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.q
 * JD-Core Version:    0.7.0.1
 */