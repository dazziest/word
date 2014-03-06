package com.google.tagmanager;

class x
  extends Number
  implements Comparable
{
  private double a;
  private long b;
  private boolean c;
  
  private x(long paramLong)
  {
    this.b = paramLong;
    this.c = true;
  }
  
  public static x a(long paramLong)
  {
    return new x(paramLong);
  }
  
  public int a(x paramx)
  {
    if ((b()) && (paramx.b())) {
      return new Long(this.b).compareTo(Long.valueOf(paramx.b));
    }
    return Double.compare(doubleValue(), paramx.doubleValue());
  }
  
  public boolean a()
  {
    return !b();
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public long c()
  {
    if (b()) {
      return this.b;
    }
    return this.a;
  }
  
  public int d()
  {
    return (int)longValue();
  }
  
  public double doubleValue()
  {
    if (b()) {
      return this.b;
    }
    return this.a;
  }
  
  public short e()
  {
    return (short)(int)longValue();
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof x)) && (a((x)paramObject) == 0);
  }
  
  public float floatValue()
  {
    return (float)doubleValue();
  }
  
  public int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public int intValue()
  {
    return d();
  }
  
  public long longValue()
  {
    return c();
  }
  
  public short shortValue()
  {
    return e();
  }
  
  public String toString()
  {
    if (b()) {
      return Long.toString(this.b);
    }
    return Double.toString(this.a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.x
 * JD-Core Version:    0.7.0.1
 */