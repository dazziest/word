package com.dotgears;

public class f
  extends m
{
  public i a;
  public int b;
  public int c;
  public int d;
  public int e;
  public boolean f;
  public boolean g;
  public boolean h;
  public boolean i;
  
  public void a(float paramFloat)
  {
    int j = g.D.u;
    int[] arrayOfInt1 = g.D.s;
    int[] arrayOfInt2 = g.D.t;
    this.i = false;
    for (int k = 0;; k++)
    {
      if (k >= j) {}
      for (;;)
      {
        this.g = false;
        this.h = false;
        if (this.i != this.f)
        {
          if (!this.f) {
            break label145;
          }
          this.h = true;
          this.f = false;
        }
        return;
        if ((arrayOfInt1[k] <= this.b) || (arrayOfInt1[k] >= this.b + this.d) || (arrayOfInt2[k] <= this.c) || (arrayOfInt2[k] >= this.c + this.e)) {
          break;
        }
        this.i = true;
      }
    }
    label145:
    this.g = true;
    this.f = true;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.F = true;
    this.G = true;
    this.i = false;
    this.g = false;
    this.h = false;
    this.f = false;
  }
  
  public void a(g paramg)
  {
    if (this.f)
    {
      paramg.a(this.a.i, this.b, 2 + this.c, 1.0F, 1.0F, 1.0F);
      return;
    }
    paramg.a(this.a.i, this.b, this.c, 1.0F, 1.0F, 1.0F);
  }
  
  public void a(String paramString)
  {
    this.a = g.D.b(paramString);
    this.d = this.a.b;
    this.e = this.a.c;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.f
 * JD-Core Version:    0.7.0.1
 */