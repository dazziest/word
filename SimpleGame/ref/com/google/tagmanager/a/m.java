package com.google.tagmanager.a;

import java.io.OutputStream;

public final class m
{
  private final byte[] a;
  private final int b;
  private int c;
  private int d = 0;
  private final OutputStream e;
  
  private m(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    this.e = paramOutputStream;
    this.a = paramArrayOfByte;
    this.c = 0;
    this.b = paramArrayOfByte.length;
  }
  
  public static m a(OutputStream paramOutputStream)
  {
    return a(paramOutputStream, 4096);
  }
  
  public static m a(OutputStream paramOutputStream, int paramInt)
  {
    return new m(paramOutputStream, new byte[paramInt]);
  }
  
  private void b()
  {
    if (this.e == null) {
      throw new n();
    }
    this.e.write(this.a, 0, this.c);
    this.c = 0;
  }
  
  public void a()
  {
    if (this.e != null) {
      b();
    }
  }
  
  public void a(byte paramByte)
  {
    if (this.c == this.b) {
      b();
    }
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = paramByte;
    this.d = (1 + this.d);
  }
  
  public void a(int paramInt)
  {
    e(paramInt);
  }
  
  public void a(long paramLong)
  {
    c(paramLong);
  }
  
  public void a(h paramh)
  {
    d(paramh.a());
    b(paramh);
  }
  
  public void a(h paramh, int paramInt1, int paramInt2)
  {
    if (this.b - this.c >= paramInt2)
    {
      paramh.b(this.a, paramInt1, this.c, paramInt2);
      this.c = (paramInt2 + this.c);
      this.d = (paramInt2 + this.d);
      return;
    }
    int i = this.b - this.c;
    paramh.b(this.a, paramInt1, this.c, i);
    int j = paramInt1 + i;
    int k = paramInt2 - i;
    this.c = this.b;
    this.d = (i + this.d);
    b();
    if (k <= this.b)
    {
      paramh.b(this.a, j, 0, k);
      this.c = k;
    }
    for (;;)
    {
      this.d = (k + this.d);
      return;
      paramh.a(this.e, j, k);
    }
  }
  
  public void b(int paramInt)
  {
    d(paramInt);
  }
  
  public void b(long paramLong)
  {
    d(paramLong);
  }
  
  public void b(h paramh)
  {
    a(paramh, 0, paramh.a());
  }
  
  public void c(int paramInt)
  {
    a((byte)paramInt);
  }
  
  public void c(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        c((int)paramLong);
        return;
      }
      c(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
  
  public void d(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        c(paramInt);
        return;
      }
      c(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
  
  public void d(long paramLong)
  {
    c(0xFF & (int)paramLong);
    c(0xFF & (int)(paramLong >> 8));
    c(0xFF & (int)(paramLong >> 16));
    c(0xFF & (int)(paramLong >> 24));
    c(0xFF & (int)(paramLong >> 32));
    c(0xFF & (int)(paramLong >> 40));
    c(0xFF & (int)(paramLong >> 48));
    c(0xFF & (int)(paramLong >> 56));
  }
  
  public void e(int paramInt)
  {
    c(paramInt & 0xFF);
    c(0xFF & paramInt >> 8);
    c(0xFF & paramInt >> 16);
    c(0xFF & paramInt >> 24);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.m
 * JD-Core Version:    0.7.0.1
 */