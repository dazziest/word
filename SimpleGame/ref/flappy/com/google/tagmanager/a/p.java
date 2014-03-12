package com.google.tagmanager.a;

final class p
{
  private final Object a;
  private final int b;
  
  p(Object paramObject, int paramInt)
  {
    this.a = paramObject;
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof p)) {}
    p localp;
    do
    {
      return false;
      localp = (p)paramObject;
    } while ((this.a != localp.a) || (this.b != localp.b));
    return true;
  }
  
  public int hashCode()
  {
    return 65535 * System.identityHashCode(this.a) + this.b;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.p
 * JD-Core Version:    0.7.0.1
 */