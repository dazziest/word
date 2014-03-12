package org.andengine.opengl.b;

import java.util.ArrayList;

public class h
{
  private final ArrayList a = new ArrayList();
  
  public void a()
  {
    try
    {
      a(b.a());
      a(d.a());
      a(f.a());
      a(a.a());
      a(e.a());
      a(c.a());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(g paramg)
  {
    if (paramg == null) {
      try
      {
        throw new IllegalArgumentException("pShaderProgram must not be null!");
      }
      finally {}
    }
    if (paramg.b())
    {
      org.andengine.d.e.a.c("Loading an already compiled " + g.class.getSimpleName() + ": '" + paramg.getClass().getSimpleName() + "'. '" + paramg.getClass().getSimpleName() + "' will be recompiled.");
      paramg.a(false);
    }
    if (this.a.contains(paramg)) {
      org.andengine.d.e.a.c("Loading an already loaded " + g.class.getSimpleName() + ": '" + paramg.getClass().getSimpleName() + "'.");
    }
    for (;;)
    {
      return;
      this.a.add(paramg);
    }
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	org/andengine/opengl/b/h:a	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: iconst_m1
    //   8: aload_2
    //   9: invokevirtual 112	java/util/ArrayList:size	()I
    //   12: iadd
    //   13: istore_3
    //   14: iload_3
    //   15: ifge +13 -> 28
    //   18: aload_0
    //   19: getfield 15	org/andengine/opengl/b/h:a	Ljava/util/ArrayList;
    //   22: invokevirtual 115	java/util/ArrayList:clear	()V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_2
    //   29: iload_3
    //   30: invokevirtual 119	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   33: checkcast 57	org/andengine/opengl/b/g
    //   36: iconst_0
    //   37: invokevirtual 97	org/andengine/opengl/b/g:a	(Z)V
    //   40: iinc 3 255
    //   43: goto -29 -> 14
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	h
    //   46	4	1	localObject	Object
    //   6	23	2	localArrayList	ArrayList
    //   13	28	3	i	int
    // Exception table:
    //   from	to	target	type
    //   2	14	46	finally
    //   18	25	46	finally
    //   28	40	46	finally
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	org/andengine/opengl/b/h:a	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual 112	java/util/ArrayList:size	()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_1
    //   14: isub
    //   15: istore 4
    //   17: iload 4
    //   19: ifge +6 -> 25
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_2
    //   26: iload 4
    //   28: invokevirtual 119	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   31: checkcast 57	org/andengine/opengl/b/g
    //   34: iconst_0
    //   35: invokevirtual 97	org/andengine/opengl/b/g:a	(Z)V
    //   38: iinc 4 255
    //   41: goto -24 -> 17
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	h
    //   44	4	1	localObject	Object
    //   6	20	2	localArrayList	ArrayList
    //   11	4	3	i	int
    //   15	24	4	j	int
    // Exception table:
    //   from	to	target	type
    //   2	12	44	finally
    //   25	38	44	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.b.h
 * JD-Core Version:    0.7.0.1
 */