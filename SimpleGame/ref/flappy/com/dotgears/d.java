package com.dotgears;

public class d
{
  public boolean a;
  public String b;
  public int c;
  public int[] d;
  public float e;
  public boolean f;
  public int g;
  public int h;
  public int i;
  public int j;
  
  public d(int paramInt1, String paramString, int[] paramArrayOfInt, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.b = paramString;
    this.c = paramInt2;
    this.d = new int[this.c];
    System.arraycopy(paramArrayOfInt, 0, this.d, 0, this.c);
    this.e = (1000 / paramInt3);
    this.f = paramBoolean;
    this.g = paramInt1;
  }
  
  public void a()
  {
    this.h = 0;
    this.i = 0;
    this.j = this.d[0];
  }
  
  public void a(float paramFloat)
  {
    if (this.a) {}
    do
    {
      return;
      this.h = (15 + this.h);
    } while (this.h < this.e);
    this.h = 0;
    this.i = (1 + this.i);
    if (this.i >= this.c)
    {
      if (!this.f) {
        break label89;
      }
      this.i = 0;
    }
    for (;;)
    {
      this.i = 0;
      this.j = this.d[this.i];
      return;
      label89:
      this.a = true;
    }
  }
  
  void b()
  {
    if ((!this.f) && (this.a)) {
      a();
    }
    this.a = false;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.d
 * JD-Core Version:    0.7.0.1
 */