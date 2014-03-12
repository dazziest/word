package org.andengine.c.b.a;

import android.opengl.GLES20;
import org.andengine.d.h.c;
import org.andengine.opengl.util.e;

public class a
  implements b
{
  private c a = null;
  private final org.andengine.d.d.a b = new org.andengine.d.d.a(0.0F, 0.0F, 0.0F, 1.0F);
  private boolean c = true;
  
  protected a() {}
  
  public a(org.andengine.d.d.a parama)
  {
    this.b.a(parama);
  }
  
  public void a(e parame, org.andengine.b.a.a parama)
  {
    if (this.c)
    {
      GLES20.glClearColor(this.b.a(), this.b.b(), this.b.c(), this.b.d());
      GLES20.glClear(16384);
    }
  }
  
  public void a_(float paramFloat)
  {
    if (this.a != null) {
      this.a.a_(paramFloat);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.b.a.a
 * JD-Core Version:    0.7.0.1
 */