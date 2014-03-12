package org.andengine.a.c;

import android.media.SoundPool;
import org.andengine.a.c.a.b;

public class a
  extends org.andengine.a.a
{
  private int c;
  private int d;
  private boolean e;
  private int f;
  private float g = 1.0F;
  
  a(c paramc, int paramInt)
  {
    super(paramc);
    this.c = paramInt;
  }
  
  private SoundPool j()
  {
    return i().c();
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  protected void c()
  {
    throw new b();
  }
  
  public void d()
  {
    super.d();
    float f1 = b();
    float f2 = f1 * this.a;
    float f3 = f1 * this.b;
    this.d = j().play(this.c, f2, f3, 1, this.f, this.g);
  }
  
  public void e()
  {
    super.e();
    if (this.d != 0) {
      j().stop(this.d);
    }
  }
  
  public void f()
  {
    g();
    j().unload(this.c);
    this.c = 0;
    this.e = false;
    i().b(this);
    super.f();
  }
  
  public int h()
  {
    return this.c;
  }
  
  protected c i()
  {
    return (c)super.a();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.a.c.a
 * JD-Core Version:    0.7.0.1
 */