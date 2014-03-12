package com.google.android.gms.b;

import java.util.Iterator;
import java.util.LinkedList;

class c
  implements i
{
  c(b paramb) {}
  
  public void a(a parama)
  {
    b.a(this.a, parama);
    Iterator localIterator = b.a(this.a).iterator();
    while (localIterator.hasNext()) {
      ((d)localIterator.next()).a(b.b(this.a));
    }
    b.a(this.a).clear();
    b.a(this.a, null);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.b.c
 * JD-Core Version:    0.7.0.1
 */