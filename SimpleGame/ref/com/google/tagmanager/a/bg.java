package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class bg
  extends AbstractList
  implements ai, RandomAccess
{
  private final ai a;
  
  public bg(ai paramai)
  {
    this.a = paramai;
  }
  
  public String a(int paramInt)
  {
    return (String)this.a.get(paramInt);
  }
  
  public List a()
  {
    return this.a.a();
  }
  
  public void a(h paramh)
  {
    throw new UnsupportedOperationException();
  }
  
  public Iterator iterator()
  {
    return new bi(this);
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return new bh(this, paramInt);
  }
  
  public int size()
  {
    return this.a.size();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.bg
 * JD-Core Version:    0.7.0.1
 */