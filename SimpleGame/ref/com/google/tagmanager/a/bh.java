package com.google.tagmanager.a;

import java.util.ListIterator;

class bh
  implements ListIterator
{
  ListIterator a = bg.a(this.c).listIterator(this.b);
  
  bh(bg parambg, int paramInt) {}
  
  public String a()
  {
    return (String)this.a.next();
  }
  
  public void a(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public String b()
  {
    return (String)this.a.previous();
  }
  
  public void b(String paramString)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public boolean hasPrevious()
  {
    return this.a.hasPrevious();
  }
  
  public int nextIndex()
  {
    return this.a.nextIndex();
  }
  
  public int previousIndex()
  {
    return this.a.previousIndex();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.bh
 * JD-Core Version:    0.7.0.1
 */