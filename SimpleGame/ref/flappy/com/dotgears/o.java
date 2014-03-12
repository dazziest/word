package com.dotgears;

public class o
  extends m
{
  public int a = 12;
  public int b = 14;
  public boolean c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l;
  private i[] m = g.D.a("number_context");
  
  public void a(float paramFloat)
  {
    if (!this.F) {}
    do
    {
      do
      {
        return;
      } while (this.d <= 0);
      this.d = (-1 + this.d);
      if (this.g < 2)
      {
        this.k += this.g;
        this.i = (1 + this.i);
        if (this.i == 4)
        {
          this.i = 0;
          this.g += this.h;
        }
      }
    } while (this.d > 0);
    this.F = false;
    this.G = false;
  }
  
  public void a(g paramg)
  {
    if (!this.G) {
      return;
    }
    if (this.c) {
      paramg.a(this.m[10].i, this.j, this.k, 1.0F, 1.0F, 1.0F);
    }
    a(paramg, this.e, this.j + this.l, this.k, false, this.f);
  }
  
  public void a(g paramg, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    int n = paramInt2 - this.a;
    boolean bool = true;
    int i1 = paramInt1;
    if (paramInt4 <= 0) {
      return;
    }
    int i3;
    int i4;
    if ((i1 > 0) || (bool))
    {
      int i2 = i1 % 10;
      paramg.a(this.m[i2].i, n, paramInt3, 1.0F, 1.0F, 1.0F);
      i3 = i1 / 10;
      if (i2 != 1)
      {
        i4 = n - (-2 + this.a);
        label83:
        n = i4;
        bool = paramBoolean;
      }
    }
    for (;;)
    {
      paramInt4--;
      i1 = i3;
      break;
      i4 = n - 4;
      break label83;
      i3 = i1;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.o
 * JD-Core Version:    0.7.0.1
 */