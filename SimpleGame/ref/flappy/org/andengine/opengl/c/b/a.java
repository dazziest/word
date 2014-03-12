package org.andengine.opengl.c.b;

import android.graphics.Bitmap.Config;
import org.andengine.opengl.c.c;

public enum a
{
  private final Bitmap.Config e;
  private final c f;
  
  static
  {
    a[] arrayOfa = new a[4];
    arrayOfa[0] = a;
    arrayOfa[1] = b;
    arrayOfa[2] = c;
    arrayOfa[3] = d;
    g = arrayOfa;
  }
  
  private a(Bitmap.Config paramConfig, c paramc)
  {
    this.e = paramConfig;
    this.f = paramc;
  }
  
  public Bitmap.Config a()
  {
    return this.e;
  }
  
  public c b()
  {
    return this.f;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.b.a
 * JD-Core Version:    0.7.0.1
 */