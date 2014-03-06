package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.andengine.opengl.b.g;
import org.andengine.opengl.util.BufferUtils;

public abstract class d
  implements c
{
  protected final int c;
  protected final boolean d;
  protected final int e;
  protected final ByteBuffer f;
  protected int g = -1;
  protected boolean h = true;
  protected boolean i;
  protected final e j;
  protected final org.andengine.opengl.d.a.c k;
  
  public d(e parame, int paramInt, a parama, boolean paramBoolean, org.andengine.opengl.d.a.c paramc)
  {
    this.j = parame;
    this.c = paramInt;
    this.e = parama.a();
    this.d = paramBoolean;
    this.k = paramc;
    this.f = BufferUtils.a(paramInt * 4);
    this.f.order(ByteOrder.nativeOrder());
  }
  
  private void c(org.andengine.opengl.util.e parame)
  {
    this.g = parame.h();
    this.h = true;
  }
  
  protected abstract void a();
  
  public void a(int paramInt1, int paramInt2)
  {
    GLES20.glDrawArrays(paramInt1, 0, paramInt2);
  }
  
  public void a(org.andengine.opengl.util.e parame)
  {
    parame.b(this.g);
    this.g = -1;
  }
  
  public void a(org.andengine.opengl.util.e parame, g paramg)
  {
    b(parame);
    paramg.a(parame, this.k);
  }
  
  public void b(org.andengine.opengl.util.e parame)
  {
    if (this.g == -1)
    {
      c(parame);
      if (this.j != null) {
        this.j.a(this);
      }
    }
    parame.a(this.g);
    if (this.h)
    {
      a();
      this.h = false;
    }
  }
  
  public void b(org.andengine.opengl.util.e parame, g paramg)
  {
    paramg.b(parame);
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public boolean c()
  {
    return this.i;
  }
  
  public boolean d()
  {
    return this.g != -1;
  }
  
  public void e()
  {
    this.g = -1;
    this.h = true;
  }
  
  public void f()
  {
    this.h = true;
  }
  
  protected void finalize()
  {
    super.finalize();
    if (!this.i) {
      n();
    }
  }
  
  public void n()
  {
    if (!this.i)
    {
      this.i = true;
      if (this.j != null) {
        this.j.b(this);
      }
      BufferUtils.a(this.f);
      return;
    }
    throw new org.andengine.d.c();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.d
 * JD-Core Version:    0.7.0.1
 */