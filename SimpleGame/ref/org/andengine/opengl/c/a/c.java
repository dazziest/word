package org.andengine.opengl.c.a;

import java.util.ArrayList;
import org.andengine.opengl.c.d;
import org.andengine.opengl.c.e;
import org.andengine.opengl.c.f;

public abstract class c
  extends d
  implements a
{
  protected final int g;
  protected final int h;
  protected final ArrayList i = new ArrayList();
  
  public c(e parame, int paramInt1, int paramInt2, org.andengine.opengl.c.c paramc, f paramf, b paramb)
  {
    super(parame, paramc, paramf, paramb);
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  private void b(org.andengine.opengl.c.a.b.b paramb, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Illegal negative pTextureX supplied: '" + paramInt1 + "'");
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("Illegal negative pTextureY supplied: '" + paramInt2 + "'");
    }
    if ((paramInt1 + paramb.c() > a()) || (paramInt2 + paramb.d() > b())) {
      throw new IllegalArgumentException("Supplied pTextureAtlasSource must not exceed bounds of Texture.");
    }
  }
  
  public int a()
  {
    return this.g;
  }
  
  public void a(org.andengine.opengl.c.a.b.b paramb, int paramInt1, int paramInt2)
  {
    b(paramb, paramInt1, paramInt2);
    paramb.a(paramInt1);
    paramb.b(paramInt2);
    this.i.add(paramb);
    this.e = true;
  }
  
  public int b()
  {
    return this.h;
  }
  
  @Deprecated
  public b j()
  {
    return k();
  }
  
  public b k()
  {
    return (b)super.h();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.a.c
 * JD-Core Version:    0.7.0.1
 */