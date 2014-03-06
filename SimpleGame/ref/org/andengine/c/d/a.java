package org.andengine.c.d;

import org.andengine.opengl.b.g;
import org.andengine.opengl.d.a.d;

public class a
  extends org.andengine.c.c.c
{
  public static final org.andengine.opengl.d.a.c g = new d(3).a(0, "a_position", 2, 5126, false).a(1, "a_color", 4, 5121, true).a(3, "a_textureCoordinates", 2, 5126, false).a();
  protected boolean I;
  public org.andengine.opengl.c.c.b h;
  protected final org.andengine.c.d.a.b i;
  protected boolean j;
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, org.andengine.opengl.c.c.b paramb, org.andengine.c.d.a.b paramb1, g paramg)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramg);
    this.h = paramb;
    this.i = paramb1;
    b(true);
    a(paramb);
    x();
    b();
    y();
  }
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, org.andengine.opengl.c.c.b paramb, org.andengine.opengl.d.e parame, org.andengine.opengl.d.a parama)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramb, parame, parama, org.andengine.opengl.b.b.a());
  }
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, org.andengine.opengl.c.c.b paramb, org.andengine.opengl.d.e parame, org.andengine.opengl.d.a parama, g paramg)
  {
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramb, new org.andengine.c.d.a.a(parame, 20, parama, true, g), paramg);
  }
  
  public a(float paramFloat1, float paramFloat2, org.andengine.opengl.c.c.b paramb, org.andengine.opengl.d.e parame)
  {
    this(paramFloat1, paramFloat2, paramb.b(), paramb.c(), paramb, parame, org.andengine.opengl.d.a.a);
  }
  
  protected void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    this.i.a(this, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    this.v = paramFloat1;
    this.w = paramFloat2;
    this.a = (paramFloat3 - paramFloat1);
    this.b = (paramFloat4 - paramFloat2);
    a(paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16);
    this.h.a(paramFloat5, paramFloat6, paramFloat7, paramFloat8);
    y();
  }
  
  protected void b()
  {
    this.i.a(this);
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    this.v = paramFloat1;
    this.w = paramFloat2;
    this.a = (paramFloat3 - paramFloat1);
    this.b = (paramFloat4 - paramFloat2);
    x();
    this.h.a(paramFloat5, paramFloat6, paramFloat7, paramFloat8);
    y();
  }
  
  protected void b(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    super.b(parame, parama);
    t().a().d(parame);
    this.i.a(parame, this.f);
  }
  
  protected void c(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    this.i.a(5, 4);
  }
  
  protected void d(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    this.i.b(parame, this.f);
    super.d(parame, parama);
  }
  
  public org.andengine.opengl.c.c.b t()
  {
    return this.h;
  }
  
  public boolean u()
  {
    return this.I;
  }
  
  public boolean v()
  {
    return this.j;
  }
  
  public org.andengine.c.d.a.b w()
  {
    return this.i;
  }
  
  protected void x()
  {
    this.i.b(this);
  }
  
  protected void y()
  {
    this.i.c(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.d.a
 * JD-Core Version:    0.7.0.1
 */