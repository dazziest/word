package org.andengine.d.h;

import org.andengine.d.a.a.b;

public class c
  extends b
  implements org.andengine.b.b.c
{
  private final Object a;
  
  public boolean a(a parama)
  {
    if (parama == null) {
      throw new IllegalArgumentException("Supplied " + a.class.getSimpleName() + " must not be null.");
    }
    return super.add(parama);
  }
  
  public void a_(float paramFloat)
  {
    int i = size();
    if (i > 0) {}
    for (int j = i - 1;; j--)
    {
      if (j < 0) {
        return;
      }
      a locala = (a)get(j);
      locala.a(paramFloat, this.a);
      if ((locala.a()) && (locala.b())) {
        remove(j);
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.h.c
 * JD-Core Version:    0.7.0.1
 */