package com.google.tagmanager.a;

import java.io.IOException;

class ag
{
  private final am a;
  private final o b;
  private h c;
  private volatile am d;
  
  private void b()
  {
    if (this.d != null) {
      return;
    }
    try
    {
      if (this.d != null) {
        return;
      }
    }
    finally {}
    try
    {
      if (this.c != null) {
        this.d = ((am)this.a.c().c(this.c, this.b));
      }
      label61:
      return;
    }
    catch (IOException localIOException)
    {
      break label61;
    }
  }
  
  public am a()
  {
    b();
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    b();
    return this.d.equals(paramObject);
  }
  
  public int hashCode()
  {
    b();
    return this.d.hashCode();
  }
  
  public String toString()
  {
    b();
    return this.d.toString();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.ag
 * JD-Core Version:    0.7.0.1
 */