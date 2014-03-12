package org.andengine.b.a;

import org.andengine.b.b.d;
import org.andengine.opengl.util.e;

public class a
  implements org.andengine.b.b.c
{
  static final float[] a = new float[2];
  protected float b;
  protected float c;
  protected float d;
  protected float e;
  protected float f = 0.0F;
  protected float g = 0.0F;
  protected int h;
  protected int i;
  protected int j;
  protected int k;
  protected boolean l;
  protected d m;
  private float n = -1.0F;
  private float o = 1.0F;
  private org.andengine.b.a.a.a p;
  private org.andengine.c.c q;
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(paramFloat1, paramFloat2, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4);
  }
  
  private void a(org.andengine.input.a.a parama, float paramFloat1, float paramFloat2)
  {
    float f1 = a();
    float f2 = b();
    float f3 = c();
    float f4 = d();
    parama.a(f1 + paramFloat1 * (f2 - f1), f3 + paramFloat2 * (f4 - f3));
  }
  
  private static void a(e parame, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    parame.b(paramFloat1, paramFloat2, 0.0F);
    parame.b(paramFloat3, 0.0F, 0.0F, 1.0F);
    parame.b(-paramFloat1, -paramFloat2, 0.0F);
  }
  
  private void e(org.andengine.input.a.a parama)
  {
    float f1 = this.f;
    if (f1 != 0.0F)
    {
      a[0] = parama.b();
      a[1] = parama.c();
      org.andengine.d.g.a.a(a, -f1, g(), h());
      parama.a(a[0], a[1]);
    }
  }
  
  private void f(org.andengine.input.a.a parama)
  {
    float f1 = this.f;
    if (f1 != 0.0F)
    {
      a[0] = parama.b();
      a[1] = parama.c();
      org.andengine.d.g.a.b(a, f1, g(), h());
      parama.a(a[0], a[1]);
    }
  }
  
  private void g(org.andengine.input.a.a parama)
  {
    float f1 = -this.g;
    if (f1 != 0.0F)
    {
      a[0] = parama.b();
      a[1] = parama.c();
      org.andengine.d.g.a.a(a, f1, 0.5F * (this.c - this.b), 0.5F * (this.e - this.d));
      parama.a(a[0], a[1]);
    }
  }
  
  private void h(org.andengine.input.a.a parama)
  {
    float f1 = -this.g;
    if (f1 != 0.0F)
    {
      a[0] = parama.b();
      a[1] = parama.c();
      org.andengine.d.g.a.b(a, f1, 0.5F * (this.c - this.b), 0.5F * (this.e - this.d));
      parama.a(a[0], a[1]);
    }
  }
  
  public float a()
  {
    return this.b;
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    float f1 = paramFloat1 - g();
    float f2 = paramFloat2 - h();
    this.b = (f1 + this.b);
    this.c = (f1 + this.c);
    this.d = (f2 + this.d);
    this.e = (f2 + this.e);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.b = paramFloat1;
    this.c = paramFloat3;
    this.d = paramFloat2;
    this.e = paramFloat4;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.k == 0) && (this.j == 0)) {
      b(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    while ((this.j == paramInt3) && (this.k == paramInt4)) {
      return;
    }
    a(this.h, this.i, this.j, this.k, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (this.l)
    {
      float f1 = paramInt7 / paramInt3;
      float f2 = paramInt8 / paramInt4;
      float f3 = g();
      float f4 = h();
      float f5 = f1 * e();
      float f6 = f2 * f();
      float f7 = f5 * 0.5F;
      float f8 = f6 * 0.5F;
      a(f3 - f7, f4 - f8, f7 + f3, f8 + f4);
    }
    this.h = paramInt5;
    this.i = paramInt6;
    this.j = paramInt7;
    this.k = paramInt8;
  }
  
  public void a(org.andengine.input.a.a parama)
  {
    f(parama);
    c(parama);
    g(parama);
  }
  
  public void a(org.andengine.input.a.a parama, int paramInt1, int paramInt2)
  {
    float f1 = parama.b();
    float f2 = parama.c();
    float f3 = this.f;
    float f4;
    float f5;
    if (f3 == 0.0F)
    {
      f4 = f1 / paramInt1;
      f5 = f2 / paramInt2;
    }
    for (;;)
    {
      a(parama, f4, f5);
      return;
      if (f3 == 180.0F)
      {
        f4 = 1.0F - f1 / paramInt1;
        f5 = 1.0F - f2 / paramInt2;
      }
      else
      {
        a[0] = f1;
        a[1] = f2;
        org.andengine.d.g.a.a(a, f3, paramInt1 >> 1, paramInt2 >> 1);
        f4 = a[0] / paramInt1;
        f5 = a[1] / paramInt2;
      }
    }
  }
  
  public void a(e parame)
  {
    if (this.p != null) {
      this.p.a(parame, this);
    }
  }
  
  public void a_(float paramFloat)
  {
    if (this.m != null) {
      this.m.a_(paramFloat);
    }
    if (this.p != null) {
      this.p.a_(paramFloat);
    }
    l();
  }
  
  public float b()
  {
    return this.c;
  }
  
  protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = paramInt4;
  }
  
  public void b(org.andengine.input.a.a parama)
  {
    h(parama);
    d(parama);
    e(parama);
  }
  
  public void b(e parame)
  {
    parame.a(a(), b(), d(), c(), this.n, this.o);
    float f1 = this.f;
    if (f1 != 0.0F) {
      a(parame, g(), h(), f1);
    }
  }
  
  public float c()
  {
    return this.d;
  }
  
  protected void c(org.andengine.input.a.a parama)
  {
    parama.b(-this.b, -this.d);
  }
  
  public void c(e parame)
  {
    float f1 = e();
    float f2 = f();
    parame.a(0.0F, f1, f2, 0.0F, this.n, this.o);
    float f3 = this.f;
    if (f3 != 0.0F) {
      a(parame, f1 * 0.5F, f2 * 0.5F, f3);
    }
  }
  
  public float d()
  {
    return this.e;
  }
  
  protected void d(org.andengine.input.a.a parama)
  {
    parama.b(this.b, this.d);
  }
  
  public void d(e parame)
  {
    float f1 = e();
    float f2 = f();
    parame.a(0.0F, f1, f2, 0.0F, this.n, this.o);
    float f3 = this.g;
    if (f3 != 0.0F) {
      a(parame, f1 * 0.5F, f2 * 0.5F, f3);
    }
  }
  
  public float e()
  {
    return this.c - this.b;
  }
  
  public float f()
  {
    return this.e - this.d;
  }
  
  public float g()
  {
    return 0.5F * (this.b + this.c);
  }
  
  public float h()
  {
    return 0.5F * (this.d + this.e);
  }
  
  public org.andengine.b.a.a.a i()
  {
    return this.p;
  }
  
  public boolean j()
  {
    return this.p != null;
  }
  
  public float k()
  {
    return this.f;
  }
  
  public void l()
  {
    if (this.q != null)
    {
      float[] arrayOfFloat = this.q.h();
      a(arrayOfFloat[0], arrayOfFloat[1]);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.a.a
 * JD-Core Version:    0.7.0.1
 */