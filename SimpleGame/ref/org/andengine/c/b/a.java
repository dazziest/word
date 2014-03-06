package org.andengine.c.b;

public class a
  extends e
{
  protected org.andengine.b.a.a a;
  
  public a()
  {
    this(null);
  }
  
  public a(org.andengine.b.a.a parama)
  {
    this.a = parama;
  }
  
  public boolean a(org.andengine.input.a.a parama)
  {
    if (this.a == null) {
      return false;
    }
    this.a.a(parama);
    if (super.a(parama)) {
      return true;
    }
    this.a.b(parama);
    return false;
  }
  
  protected boolean b(org.andengine.input.a.a parama)
  {
    if ((this.I instanceof a))
    {
      this.a.b(parama);
      boolean bool = super.b(parama);
      this.a.a(parama);
      return bool;
    }
    return super.b(parama);
  }
  
  protected void f(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    this.a.d(parame);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.b.a
 * JD-Core Version:    0.7.0.1
 */