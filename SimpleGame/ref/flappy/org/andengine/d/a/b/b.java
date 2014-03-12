package org.andengine.d.a.b;

public abstract class b
  extends a
{
  protected c a()
  {
    c localc = (c)super.c();
    localc.b = this;
    return localc;
  }
  
  protected void a(c paramc)
  {
    paramc.c = false;
    paramc.c();
  }
  
  protected void b(c paramc)
  {
    paramc.a();
    paramc.c = true;
  }
  
  public void c(c paramc)
  {
    try
    {
      if (paramc.b == null) {
        throw new IllegalArgumentException("PoolItem not assigned to a pool!");
      }
    }
    finally {}
    if (!paramc.a(this)) {
      throw new IllegalArgumentException("PoolItem from another pool!");
    }
    if (paramc.b()) {
      throw new IllegalArgumentException("PoolItem already recycled!");
    }
    super.c(paramc);
  }
  
  /* Error */
  public boolean d(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield 20	org/andengine/d/a/b/c:b	Lorg/andengine/d/a/b/b;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_0
    //   9: if_acmpne +11 -> 20
    //   12: iconst_1
    //   13: istore 4
    //   15: aload_0
    //   16: monitorexit
    //   17: iload 4
    //   19: ireturn
    //   20: iconst_0
    //   21: istore 4
    //   23: goto -8 -> 15
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	b
    //   0	31	1	paramc	c
    //   26	4	2	localObject	Object
    //   6	2	3	localb	b
    //   13	9	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	26	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.a.b.b
 * JD-Core Version:    0.7.0.1
 */