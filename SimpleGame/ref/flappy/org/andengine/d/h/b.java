package org.andengine.d.h;

import java.util.Comparator;

class b
  implements Comparator
{
  public int a(a parama1, a parama2)
  {
    float f1 = parama1.c();
    float f2 = parama2.c();
    if (f1 < f2) {
      return 1;
    }
    if (f1 > f2) {
      return -1;
    }
    return 0;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.h.b
 * JD-Core Version:    0.7.0.1
 */