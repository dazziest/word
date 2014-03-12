package com.google.tagmanager.a;

import java.util.Iterator;

class bi
  implements Iterator
{
  Iterator a = bg.a(this.b).iterator();
  
  bi(bg parambg) {}
  
  public String a()
  {
    return (String)this.a.next();
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.bi
 * JD-Core Version:    0.7.0.1
 */