package com.google.tagmanager.a;

import java.util.NoSuchElementException;

class g
  implements i
{
  private int b;
  private final int c;
  
  private g(e parame)
  {
    this.b = parame.b();
    this.c = (this.b + parame.a());
  }
  
  public Byte a()
  {
    return Byte.valueOf(b());
  }
  
  public byte b()
  {
    if (this.b >= this.c) {
      throw new NoSuchElementException();
    }
    byte[] arrayOfByte = this.a.c;
    int i = this.b;
    this.b = (i + 1);
    return arrayOfByte[i];
  }
  
  public boolean hasNext()
  {
    return this.b < this.c;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.g
 * JD-Core Version:    0.7.0.1
 */