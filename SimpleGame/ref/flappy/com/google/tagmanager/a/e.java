package com.google.tagmanager.a;

class e
  extends aj
{
  private final int d;
  private final int e;
  
  e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Offset too small: " + paramInt1);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("Length too small: " + paramInt1);
    }
    if (paramInt1 + paramInt2 > paramArrayOfByte.length) {
      throw new IllegalArgumentException("Offset+Length too large: " + paramInt1 + "+" + paramInt2);
    }
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public byte a(int paramInt)
  {
    if (paramInt < 0) {
      throw new ArrayIndexOutOfBoundsException("Index too small: " + paramInt);
    }
    if (paramInt >= a()) {
      throw new ArrayIndexOutOfBoundsException("Index too large: " + paramInt + ", " + a());
    }
    return this.c[(paramInt + this.d)];
  }
  
  public int a()
  {
    return this.e;
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.c, paramInt1 + b(), paramArrayOfByte, paramInt2, paramInt3);
  }
  
  protected int b()
  {
    return this.d;
  }
  
  public i c()
  {
    return new g(this, null);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.e
 * JD-Core Version:    0.7.0.1
 */