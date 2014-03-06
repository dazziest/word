package org.andengine.opengl.c.c;

import org.andengine.opengl.c.a.a;
import org.andengine.opengl.c.a.b.b;

public class d
{
  public static c a(a parama, b paramb, int paramInt1, int paramInt2)
  {
    return a(parama, paramb, paramInt1, paramInt2, false);
  }
  
  public static c a(a parama, b paramb, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    c localc = new c(parama, paramInt1, paramInt2, paramb.c(), paramb.d(), paramBoolean);
    parama.a(paramb, paramInt1, paramInt2);
    return localc;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.c.d
 * JD-Core Version:    0.7.0.1
 */