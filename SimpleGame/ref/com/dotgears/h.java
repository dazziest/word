package com.dotgears;

import android.util.Log;

public class h
{
  public static String l = "0123456789";
  public i[] a = new i[256];
  protected int[] b = new int[256];
  protected int c;
  protected int d;
  protected int e;
  protected int f;
  protected int g;
  protected float h;
  public char[] i = new char[256];
  public char[] j = new char[256];
  public int k = 0;
  
  public h(String paramString, int paramInt)
  {
    i[] arrayOfi = g.D.a(paramString);
    if (m >= arrayOfi.length)
    {
      this.b[32] = this.b[48];
      this.d = paramInt;
      return;
    }
    int n = Integer.parseInt(arrayOfi[m].a.split("_")[1]);
    this.a[n] = arrayOfi[m];
    this.b[n] = arrayOfi[m].b;
    if (this.c > arrayOfi[m].c) {}
    for (int i1 = this.c;; i1 = arrayOfi[m].c)
    {
      this.c = i1;
      Log.i("FlappyBird", "Number: " + arrayOfi[m].a + " " + n);
      m++;
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.k = 0;
    int m = paramInt1;
    if (paramInt2 <= 0) {}
    for (int i1 = 0;; i1++)
    {
      if (i1 >= this.k)
      {
        if (this.k == 0)
        {
          this.i[0] = '0';
          this.k = 1;
        }
        return;
        if (m <= 0) {}
        for (;;)
        {
          paramInt2--;
          break;
          int n = m % 10;
          m /= 10;
          this.j[this.k] = l.charAt(n);
          this.k = (1 + this.k);
        }
      }
      this.i[i1] = this.j[(-1 + (this.k - i1))];
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.e = paramInt3;
    this.h = paramFloat;
  }
  
  public void a(g paramg)
  {
    int m = 0;
    int n = this.k;
    int i1 = 0;
    int i2 = 0;
    int i3;
    int i4;
    label53:
    label75:
    int i5;
    int i6;
    if (i1 >= n)
    {
      i3 = i2 + 2;
      i4 = this.c;
      if ((0x2 & this.e) == 0) {
        break label121;
      }
      this.f -= i3 / 2;
      if ((0x4 & this.e) == 0) {
        break label144;
      }
      this.g -= i4 / 2;
      i5 = this.f;
      i6 = this.g;
    }
    for (;;)
    {
      if (m >= n)
      {
        return;
        i2 = i2 + this.b[this.i[i1]] - this.d;
        i1++;
        break;
        label121:
        if ((0x1 & this.e) == 0) {
          break label53;
        }
        this.f -= i3;
        break label53;
        label144:
        if ((0x8 & this.e) == 0) {
          break label75;
        }
        this.g -= i4;
        break label75;
      }
      if (this.a[this.i[m]] != null) {
        paramg.a(this.a[this.i[m]], i5, i6, this.h);
      }
      i5 = i5 + this.b[this.i[m]] - this.d;
      m++;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.h
 * JD-Core Version:    0.7.0.1
 */