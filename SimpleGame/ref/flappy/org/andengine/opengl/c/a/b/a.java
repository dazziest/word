package org.andengine.opengl.c.a.b;

public abstract class a
  implements b
{
  protected int a;
  protected int b;
  protected int c;
  protected int d;
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "( " + c() + "x" + d() + " @ " + this.a + "/" + this.b + " )";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.a.b.a
 * JD-Core Version:    0.7.0.1
 */