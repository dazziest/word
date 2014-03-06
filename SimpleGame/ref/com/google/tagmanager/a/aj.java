package com.google.tagmanager.a;

import java.io.OutputStream;

class aj
  extends h
{
  protected final byte[] c;
  private int d = 0;
  
  aj(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  public byte a(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public int a()
  {
    return this.c.length;
  }
  
  protected int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 + b();
    return bj.a(paramInt1, this.c, i, i + paramInt3);
  }
  
  public String a(String paramString)
  {
    return new String(this.c, b(), a(), paramString);
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.c, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  boolean a(aj paramaj, int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramaj.a()) {
      throw new IllegalArgumentException("Length too large: " + paramInt2 + a());
    }
    if (paramInt1 + paramInt2 > paramaj.a()) {
      throw new IllegalArgumentException("Ran off end of other: " + paramInt1 + ", " + paramInt2 + ", " + paramaj.a());
    }
    byte[] arrayOfByte1 = this.c;
    byte[] arrayOfByte2 = paramaj.c;
    int i = paramInt2 + b();
    int j = b();
    for (int k = paramInt1 + paramaj.b(); j < i; k++)
    {
      if (arrayOfByte1[j] != arrayOfByte2[k]) {
        return false;
      }
      j++;
    }
    return true;
  }
  
  protected int b()
  {
    return 0;
  }
  
  protected int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, this.c, paramInt2 + b(), paramInt3);
  }
  
  void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    paramOutputStream.write(this.c, paramInt1 + b(), paramInt2);
  }
  
  public i c()
  {
    return new al(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    if (a() != ((h)paramObject).a()) {
      return false;
    }
    if (a() == 0) {
      return true;
    }
    if ((paramObject instanceof aj)) {
      return a((aj)paramObject, 0, a());
    }
    if ((paramObject instanceof ar)) {
      return paramObject.equals(this);
    }
    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + paramObject.getClass());
  }
  
  public boolean g()
  {
    int i = b();
    return bj.a(this.c, i, i + a());
  }
  
  public k h()
  {
    return k.a(this);
  }
  
  public int hashCode()
  {
    int i = this.d;
    if (i == 0)
    {
      int j = a();
      i = b(j, 0, j);
      if (i == 0) {
        i = 1;
      }
      this.d = i;
    }
    return i;
  }
  
  protected int j()
  {
    return 0;
  }
  
  protected boolean k()
  {
    return true;
  }
  
  protected int l()
  {
    return this.d;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.aj
 * JD-Core Version:    0.7.0.1
 */