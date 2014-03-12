package org.andengine.c.c;

import org.andengine.opengl.b.g;

public abstract class c
  extends d
  implements a
{
  protected float a;
  protected float b;
  
  public c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, g paramg)
  {
    super(paramFloat1, paramFloat2, paramg);
    this.a = paramFloat3;
    this.b = paramFloat4;
    q();
    r();
    s();
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return org.andengine.d.b.a.c.a(this, paramFloat1, paramFloat2);
  }
  
  public boolean a(org.andengine.b.a.a parama)
  {
    return !org.andengine.d.b.a.c.a(parama, this);
  }
  
  public float[] h()
  {
    return a_(0.5F * this.a, 0.5F * this.b);
  }
  
  public float o()
  {
    return this.a;
  }
  
  public float p()
  {
    return this.b;
  }
  
  public void q()
  {
    this.y = (0.5F * this.a);
    this.z = (0.5F * this.b);
  }
  
  public void r()
  {
    this.C = (0.5F * this.a);
    this.D = (0.5F * this.b);
  }
  
  public void s()
  {
    this.G = (0.5F * this.a);
    this.H = (0.5F * this.b);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.c.c
 * JD-Core Version:    0.7.0.1
 */