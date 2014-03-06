package com.google.tagmanager.a;

class av
  implements i
{
  int a;
  private final au c;
  private i d;
  
  private av(ar paramar)
  {
    this.c = new au(paramar, null);
    this.d = this.c.a().c();
    this.a = paramar.a();
  }
  
  public Byte a()
  {
    return Byte.valueOf(b());
  }
  
  public byte b()
  {
    if (!this.d.hasNext()) {
      this.d = this.c.a().c();
    }
    this.a = (-1 + this.a);
    return this.d.b();
  }
  
  public boolean hasNext()
  {
    return this.a > 0;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.av
 * JD-Core Version:    0.7.0.1
 */