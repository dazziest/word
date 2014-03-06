package org.andengine.a;

public abstract class a
  implements c
{
  protected float a = 1.0F;
  protected float b = 1.0F;
  private final d c;
  private boolean d;
  
  public a(d paramd)
  {
    this.c = paramd;
  }
  
  protected d a()
  {
    g();
    return this.c;
  }
  
  protected float b()
  {
    g();
    return this.c.a();
  }
  
  protected abstract void c();
  
  public void d()
  {
    g();
  }
  
  public void e()
  {
    g();
  }
  
  public void f()
  {
    g();
    this.d = true;
  }
  
  protected void g()
  {
    if (this.d) {
      c();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.a.a
 * JD-Core Version:    0.7.0.1
 */