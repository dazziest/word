package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class bd
  implements Iterator
{
  private int b = -1;
  private boolean c;
  private Iterator d;
  
  private bd(ax paramax) {}
  
  private Iterator b()
  {
    if (this.d == null) {
      this.d = ax.c(this.a).entrySet().iterator();
    }
    return this.d;
  }
  
  public Map.Entry a()
  {
    this.c = true;
    int i = 1 + this.b;
    this.b = i;
    if (i < ax.b(this.a).size()) {
      return (Map.Entry)ax.b(this.a).get(this.b);
    }
    return (Map.Entry)b().next();
  }
  
  public boolean hasNext()
  {
    return (1 + this.b < ax.b(this.a).size()) || (b().hasNext());
  }
  
  public void remove()
  {
    if (!this.c) {
      throw new IllegalStateException("remove() was called before next()");
    }
    this.c = false;
    ax.a(this.a);
    if (this.b < ax.b(this.a).size())
    {
      ax localax = this.a;
      int i = this.b;
      this.b = (i - 1);
      ax.a(localax, i);
      return;
    }
    b().remove();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.bd
 * JD-Core Version:    0.7.0.1
 */