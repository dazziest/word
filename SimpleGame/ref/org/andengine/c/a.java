package org.andengine.c;

import org.andengine.opengl.util.e;

public class a
  implements c
{
  private static final float[] a = new float[2];
  private static final float[] b = new float[2];
  private static final org.andengine.d.c.a c = new b();
  protected float A = 1.0F;
  protected float B = 1.0F;
  protected float C = 0.0F;
  protected float D = 0.0F;
  protected float E = 0.0F;
  protected float F = 0.0F;
  protected float G = 0.0F;
  protected float H = 0.0F;
  private org.andengine.d.a.d.a I;
  private org.andengine.d.a.d.a J;
  private c d;
  private org.andengine.c.a.a e;
  private org.andengine.b.b.d f;
  private boolean g = true;
  private boolean h = true;
  private org.andengine.d.a.d.a i;
  private org.andengine.d.a.d.a j;
  protected boolean k;
  protected boolean l = true;
  protected boolean m;
  protected boolean n;
  protected boolean o = true;
  protected boolean p;
  protected boolean q;
  protected int r = -2147483648;
  protected int s = 0;
  protected org.andengine.d.a.a.b t;
  protected org.andengine.d.d.a u = new org.andengine.d.d.a(1.0F, 1.0F, 1.0F, 1.0F);
  protected float v;
  protected float w;
  protected float x = 0.0F;
  protected float y = 0.0F;
  protected float z = 0.0F;
  
  public a()
  {
    this(0.0F, 0.0F);
  }
  
  public a(float paramFloat1, float paramFloat2)
  {
    this.v = paramFloat1;
    this.w = paramFloat2;
  }
  
  private void a()
  {
    this.t = new org.andengine.d.a.a.b(4);
  }
  
  private void c(c paramc)
  {
    if (paramc.d())
    {
      String str1 = paramc.getClass().getSimpleName();
      String str2 = paramc.e().getClass().getSimpleName();
      String str3 = getClass().getSimpleName();
      throw new IllegalStateException("pEntity '" + str1 + "' already has a parent: '" + str2 + "'. New parent: '" + str3 + "'!");
    }
  }
  
  protected void a(float paramFloat)
  {
    if (this.e != null) {
      this.e.a_(paramFloat);
    }
    if (this.f != null) {
      this.f.a_(paramFloat);
    }
    org.andengine.d.a.a.b localb;
    int i1;
    if ((this.t != null) && (!this.p))
    {
      localb = this.t;
      i1 = localb.size();
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 >= i1) {
        return;
      }
      ((c)localb.get(i2)).a_(paramFloat);
    }
  }
  
  public void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(getClass().getSimpleName());
    org.andengine.d.a.a.b localb;
    if ((this.t != null) && (this.t.size() > 0))
    {
      paramStringBuilder.append(" [");
      localb = this.t;
    }
    for (int i1 = 0;; i1++)
    {
      if (i1 >= localb.size())
      {
        paramStringBuilder.append("]");
        return;
      }
      ((c)localb.get(i1)).a(paramStringBuilder);
      if (i1 < -1 + localb.size()) {
        paramStringBuilder.append(", ");
      }
    }
  }
  
  public void a(c paramc)
  {
    this.d = paramc;
  }
  
  protected void a(e parame)
  {
    b(parame);
    c(parame);
    d(parame);
    e(parame);
  }
  
  public final void a(e parame, org.andengine.b.a.a parama)
  {
    if ((this.l) && ((!this.m) || (!a(parama)))) {
      e(parame, parama);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public boolean a(org.andengine.b.a.a parama)
  {
    return false;
  }
  
  public float[] a(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat)
  {
    org.andengine.d.a.d.a locala = k();
    paramArrayOfFloat[0] = paramFloat1;
    paramArrayOfFloat[1] = paramFloat2;
    locala.a(paramArrayOfFloat);
    return paramArrayOfFloat;
  }
  
  public final void a_(float paramFloat)
  {
    if (!this.n) {
      a(paramFloat);
    }
  }
  
  public float[] a_(float paramFloat1, float paramFloat2)
  {
    return a(paramFloat1, paramFloat2, b);
  }
  
  protected void b() {}
  
  public void b(float paramFloat)
  {
    if (this.u.a(paramFloat)) {
      b();
    }
  }
  
  public void b(c paramc)
  {
    c(paramc);
    if (this.t == null) {
      a();
    }
    this.t.add(paramc);
    paramc.a(this);
    paramc.m();
  }
  
  protected void b(e parame)
  {
    parame.a(this.v, this.w, 0.0F);
  }
  
  protected void b(e parame, org.andengine.b.a.a parama) {}
  
  public float[] b(float paramFloat1, float paramFloat2)
  {
    return b(paramFloat1, paramFloat2, a);
  }
  
  public float[] b(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] = paramFloat1;
    paramArrayOfFloat[1] = paramFloat2;
    l().a(paramArrayOfFloat);
    return paramArrayOfFloat;
  }
  
  protected void c(e parame)
  {
    float f1 = this.x;
    if (f1 != 0.0F)
    {
      float f2 = this.y;
      float f3 = this.z;
      parame.a(f2, f3, 0.0F);
      parame.a(f1, 0.0F, 0.0F, 1.0F);
      parame.a(-f2, -f3, 0.0F);
    }
  }
  
  protected void c(e parame, org.andengine.b.a.a parama) {}
  
  public boolean c()
  {
    return this.k;
  }
  
  protected void d(e parame)
  {
    float f1 = this.E;
    float f2 = this.F;
    if ((f1 != 0.0F) || (f2 != 0.0F))
    {
      float f3 = this.G;
      float f4 = this.H;
      parame.a(f3, f4, 0.0F);
      parame.a(f1, f2);
      parame.a(-f3, -f4, 0.0F);
    }
  }
  
  protected void d(e parame, org.andengine.b.a.a parama) {}
  
  public boolean d()
  {
    return this.d != null;
  }
  
  public c e()
  {
    return this.d;
  }
  
  protected void e(e parame)
  {
    float f1 = this.A;
    float f2 = this.B;
    if ((f1 != 1.0F) || (f2 != 1.0F))
    {
      float f3 = this.C;
      float f4 = this.D;
      parame.a(f3, f4, 0.0F);
      parame.a(f1, f2, 1);
      parame.a(-f3, -f4, 0.0F);
    }
  }
  
  protected void e(e parame, org.andengine.b.a.a parama)
  {
    int i1 = 0;
    parame.j();
    a(parame);
    org.andengine.d.a.a.b localb = this.t;
    if ((localb == null) || (!this.o))
    {
      b(parame, parama);
      c(parame, parama);
      d(parame, parama);
      parame.k();
      return;
    }
    if (this.q)
    {
      d.a().a(this.t);
      this.q = false;
    }
    int i2 = localb.size();
    for (;;)
    {
      if (i1 >= i2) {}
      c localc;
      do
      {
        b(parame, parama);
        c(parame, parama);
        d(parame, parama);
        while (i1 < i2)
        {
          ((c)localb.get(i1)).a(parame, parama);
          i1++;
        }
        break;
        localc = (c)localb.get(i1);
      } while (localc.f() >= 0);
      localc.a(parame, parama);
      i1++;
    }
  }
  
  public int f()
  {
    return this.s;
  }
  
  protected void finalize()
  {
    super.finalize();
    if (!this.k) {
      n();
    }
  }
  
  public org.andengine.d.d.a g()
  {
    return this.u;
  }
  
  public float[] h()
  {
    return a_(0.0F, 0.0F);
  }
  
  public org.andengine.d.a.d.a i()
  {
    if (this.i == null) {
      this.i = new org.andengine.d.a.d.a();
    }
    org.andengine.d.a.d.a locala = this.i;
    if (this.g)
    {
      locala.a();
      float f1 = this.A;
      float f2 = this.B;
      if ((f1 != 1.0F) || (f2 != 1.0F))
      {
        float f3 = this.C;
        float f4 = this.D;
        locala.a(-f3, -f4);
        locala.b(f1, f2);
        locala.a(f3, f4);
      }
      float f5 = this.E;
      float f6 = this.F;
      if ((f5 != 0.0F) || (f6 != 0.0F))
      {
        float f7 = this.G;
        float f8 = this.H;
        locala.a(-f7, -f8);
        locala.c(f5, f6);
        locala.a(f7, f8);
      }
      float f9 = this.x;
      if (f9 != 0.0F)
      {
        float f10 = this.y;
        float f11 = this.z;
        locala.a(-f10, -f11);
        locala.a(f9);
        locala.a(f10, f11);
      }
      locala.a(this.v, this.w);
      this.g = false;
    }
    return locala;
  }
  
  public org.andengine.d.a.d.a j()
  {
    if (this.j == null) {
      this.j = new org.andengine.d.a.d.a();
    }
    org.andengine.d.a.d.a locala = this.j;
    if (this.h)
    {
      locala.a();
      locala.a(-this.v, -this.w);
      float f1 = this.x;
      if (f1 != 0.0F)
      {
        float f10 = this.y;
        float f11 = this.z;
        locala.a(-f10, -f11);
        locala.a(-f1);
        locala.a(f10, f11);
      }
      float f2 = this.E;
      float f3 = this.F;
      if ((f2 != 0.0F) || (f3 != 0.0F))
      {
        float f4 = this.G;
        float f5 = this.H;
        locala.a(-f4, -f5);
        locala.c(-f2, -f3);
        locala.a(f4, f5);
      }
      float f6 = this.A;
      float f7 = this.B;
      if ((f6 != 1.0F) || (f7 != 1.0F))
      {
        float f8 = this.C;
        float f9 = this.D;
        locala.a(-f8, -f9);
        locala.b(1.0F / f6, 1.0F / f7);
        locala.a(f8, f9);
      }
      this.h = false;
    }
    return locala;
  }
  
  public org.andengine.d.a.d.a k()
  {
    if (this.I == null) {
      this.I = new org.andengine.d.a.d.a();
    }
    org.andengine.d.a.d.a locala = this.I;
    locala.a(i());
    c localc = this.d;
    if (localc != null) {
      locala.b(localc.k());
    }
    return locala;
  }
  
  public org.andengine.d.a.d.a l()
  {
    if (this.J == null) {
      this.J = new org.andengine.d.a.d.a();
    }
    org.andengine.d.a.d.a locala = this.J;
    locala.a(j());
    c localc = this.d;
    if (localc != null) {
      locala.c(localc.l());
    }
    return locala;
  }
  
  public void m() {}
  
  public void n()
  {
    if (!this.k)
    {
      this.k = true;
      return;
    }
    throw new org.andengine.d.c();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder);
    return localStringBuilder.toString();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.a
 * JD-Core Version:    0.7.0.1
 */