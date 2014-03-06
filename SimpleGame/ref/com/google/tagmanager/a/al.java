package com.google.tagmanager.a;

import java.util.NoSuchElementException;

class al
  implements i
{
  private int b = 0;
  private final int c;
  
  private al(aj paramaj)
  {
    this.c = paramaj.a();
  }
  
  public Byte a()
  {
    return Byte.valueOf(b());
  }
  
  public byte b()
  {
    try
    {
      byte[] arrayOfByte = this.a.c;
      int i = this.b;
      this.b = (i + 1);
      byte b1 = arrayOfByte[i];
      return b1;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
    }
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
 * Qualified Name:     com.google.tagmanager.a.al
 * JD-Core Version:    0.7.0.1
 */