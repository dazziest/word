package com.dotgears;

public class l
{
  public int a;
  public int b;
  private i[] c;
  
  public l(String paramString)
  {
    this.c = g.D.a(paramString);
    this.a = this.c[0].b;
    this.b = this.c[0].c;
  }
  
  public void a(g paramg, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    int i = paramInt2 - this.a;
    boolean bool = true;
    int j = paramInt1;
    if (paramInt4 <= 0) {
      return;
    }
    int n;
    if ((j > 0) || (bool))
    {
      int k = j % 10;
      paramg.a(this.c[k].i, i, paramInt3, 1.0F, 1.0F, 1.0F);
      int m = j / 10;
      i -= this.a;
      n = m;
      bool = paramBoolean;
    }
    for (;;)
    {
      paramInt4--;
      j = n;
      break;
      n = j;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.l
 * JD-Core Version:    0.7.0.1
 */