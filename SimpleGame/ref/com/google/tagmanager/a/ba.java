package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class ba
  implements Iterator
{
  public boolean hasNext()
  {
    return false;
  }
  
  public Object next()
  {
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.ba
 * JD-Core Version:    0.7.0.1
 */