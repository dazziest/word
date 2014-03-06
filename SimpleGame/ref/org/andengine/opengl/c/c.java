package org.andengine.opengl.c;

public enum c
{
  private final int i;
  private final int j;
  private final int k;
  private final int l;
  
  static
  {
    c[] arrayOfc = new c[8];
    arrayOfc[0] = a;
    arrayOfc[1] = b;
    arrayOfc[2] = c;
    arrayOfc[3] = d;
    arrayOfc[4] = e;
    arrayOfc[5] = f;
    arrayOfc[6] = g;
    arrayOfc[7] = h;
    m = arrayOfc;
  }
  
  private c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
  }
  
  public int a()
  {
    return this.i;
  }
  
  public int b()
  {
    return this.j;
  }
  
  public int c()
  {
    return this.k;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.c
 * JD-Core Version:    0.7.0.1
 */