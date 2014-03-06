package org.andengine.d.a.b;

public abstract class d
  implements org.andengine.b.b.c
{
  private final b a = new e(this);
  private final org.andengine.d.a.c.a b = new org.andengine.d.a.c.a.a(new org.andengine.d.a.a.a());
  
  protected abstract void a(c paramc);
  
  public void a_(float paramFloat)
  {
    org.andengine.d.a.c.a locala = this.b;
    b localb = this.a;
    for (;;)
    {
      c localc = (c)locala.a();
      if (localc == null) {
        return;
      }
      a(localc);
      localb.c(localc);
    }
  }
  
  public void b(c paramc)
  {
    if (paramc == null) {
      throw new IllegalArgumentException("PoolItem already recycled!");
    }
    if (!this.a.d(paramc)) {
      throw new IllegalArgumentException("PoolItem from another pool!");
    }
    this.b.a(paramc);
  }
  
  protected abstract c c();
  
  public c d()
  {
    return (c)this.a.d();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.a.b.d
 * JD-Core Version:    0.7.0.1
 */