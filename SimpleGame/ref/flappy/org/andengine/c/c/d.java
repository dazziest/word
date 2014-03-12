package org.andengine.c.c;

import org.andengine.opengl.b.g;
import org.andengine.opengl.c.f;
import org.andengine.opengl.d.c;
import org.andengine.opengl.util.e;

public abstract class d
  extends org.andengine.c.a
  implements b
{
  protected int c = 770;
  protected int d = 771;
  protected boolean e = false;
  protected g f;
  
  public d(float paramFloat1, float paramFloat2, g paramg)
  {
    super(paramFloat1, paramFloat2);
    this.f = paramg;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  protected void a(org.andengine.opengl.c.a parama)
  {
    a(parama.g());
  }
  
  protected void a(org.andengine.opengl.c.c.b paramb)
  {
    a(paramb.a());
  }
  
  protected void a(f paramf)
  {
    if (paramf.n) {
      a(1, 771);
    }
  }
  
  public boolean a(org.andengine.input.a.a parama, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  protected void b(e parame, org.andengine.b.a.a parama)
  {
    if (this.e)
    {
      parame.a();
      parame.a(this.c, this.d);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  protected void d(e parame, org.andengine.b.a.a parama)
  {
    if (this.e) {
      parame.b();
    }
  }
  
  public void n()
  {
    super.n();
    c localc = a();
    if ((localc != null) && (localc.b()) && (!localc.c())) {
      localc.n();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.c.d
 * JD-Core Version:    0.7.0.1
 */