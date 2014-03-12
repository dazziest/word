package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

class au
  implements Iterator
{
  private final Deque a = new ArrayDeque(ar.b().length);
  private aj b = a(paramh);
  
  private au(h paramh) {}
  
  private aj a(h paramh)
  {
    ar localar;
    for (h localh = paramh; (localh instanceof ar); localh = ar.a(localar))
    {
      localar = (ar)localh;
      this.a.push(localar);
    }
    return (aj)localh;
  }
  
  private aj b()
  {
    aj localaj;
    do
    {
      if (this.a.isEmpty()) {
        return null;
      }
      localaj = a(ar.b((ar)this.a.pop()));
    } while (localaj.d());
    return localaj;
  }
  
  public aj a()
  {
    if (this.b == null) {
      throw new NoSuchElementException();
    }
    aj localaj = this.b;
    this.b = b();
    return localaj;
  }
  
  public boolean hasNext()
  {
    return this.b != null;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.au
 * JD-Core Version:    0.7.0.1
 */