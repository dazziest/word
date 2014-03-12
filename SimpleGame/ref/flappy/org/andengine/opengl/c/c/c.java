package org.andengine.opengl.c.c;

public class c
  extends a
{
  protected float b;
  protected float c;
  protected float d;
  protected float e;
  protected float f;
  protected float g;
  protected float h;
  protected float i;
  protected final float j;
  protected final boolean k;
  
  public c(org.andengine.opengl.c.a parama, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
    super(parama);
    this.b = paramFloat1;
    this.c = paramFloat2;
    if (paramBoolean)
    {
      this.k = true;
      this.d = paramFloat4;
    }
    for (this.e = paramFloat3;; this.e = paramFloat4)
    {
      this.j = paramFloat5;
      l();
      return;
      this.k = false;
      this.d = paramFloat3;
    }
  }
  
  public c(org.andengine.opengl.c.a parama, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    this(parama, paramFloat1, paramFloat2, paramFloat3, paramFloat4, 1.0F, paramBoolean);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.f = paramFloat1;
    this.h = paramFloat2;
    this.g = paramFloat3;
    this.i = paramFloat4;
  }
  
  public float b()
  {
    if (this.k) {
      return this.e * this.j;
    }
    return this.d * this.j;
  }
  
  public float c()
  {
    if (this.k) {
      return this.d * this.j;
    }
    return this.e * this.j;
  }
  
  public float d()
  {
    return this.f;
  }
  
  public float e()
  {
    return this.g;
  }
  
  public float f()
  {
    return this.h;
  }
  
  public float g()
  {
    return this.i;
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public c i()
  {
    if (this.k) {
      return new c(this.a, this.b, this.c, this.e, this.d, this.j, this.k);
    }
    return new c(this.a, this.b, this.c, this.d, this.e, this.j, this.k);
  }
  
  public float j()
  {
    return this.b;
  }
  
  public float k()
  {
    return this.c;
  }
  
  public void l()
  {
    org.andengine.opengl.c.a locala = this.a;
    float f1 = locala.a();
    float f2 = locala.b();
    float f3 = j();
    float f4 = k();
    this.f = (f3 / f1);
    this.g = ((f3 + this.d) / f1);
    this.h = (f4 / f2);
    this.i = ((f4 + this.e) / f2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.c.c
 * JD-Core Version:    0.7.0.1
 */