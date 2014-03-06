package org.andengine.opengl.c;

public abstract class d
  implements a
{
  protected final e a;
  protected final c b;
  protected final f c;
  protected int d = -1;
  protected boolean e = false;
  protected b f;
  
  public d(e parame, c paramc, f paramf, b paramb)
  {
    this.a = parame;
    this.b = paramc;
    this.c = paramf;
    this.f = paramb;
  }
  
  public void a(org.andengine.opengl.util.e parame)
  {
    this.d = parame.i();
    parame.d(this.d);
    e(parame);
    this.c.a();
    this.e = false;
    if (this.f != null) {
      this.f.a(this);
    }
  }
  
  public void b(org.andengine.opengl.util.e parame)
  {
    parame.e(this.d);
    this.d = -1;
    if (this.f != null) {
      this.f.b(this);
    }
  }
  
  public void c(org.andengine.opengl.util.e parame)
  {
    b(parame);
    a(parame);
  }
  
  public boolean c()
  {
    return this.d != -1;
  }
  
  public void d()
  {
    this.d = -1;
  }
  
  public void d(org.andengine.opengl.util.e parame)
  {
    parame.d(this.d);
  }
  
  protected abstract void e(org.andengine.opengl.util.e parame);
  
  public boolean e()
  {
    return this.e;
  }
  
  public c f()
  {
    return this.b;
  }
  
  public f g()
  {
    return this.c;
  }
  
  public b h()
  {
    return this.f;
  }
  
  public void i()
  {
    this.a.a(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.d
 * JD-Core Version:    0.7.0.1
 */