package org.andengine.opengl.d;

import java.util.ArrayList;

public class e
{
  private final ArrayList a = new ArrayList();
  private final ArrayList b = new ArrayList();
  
  public void a() {}
  
  public void a(c paramc)
  {
    try
    {
      this.a.add(paramc);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void a(org.andengine.opengl.util.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	org/andengine/opengl/d/e:a	Ljava/util/ArrayList;
    //   6: astore_3
    //   7: aload_0
    //   8: getfield 18	org/andengine/opengl/d/e:b	Ljava/util/ArrayList;
    //   11: astore 4
    //   13: aload 4
    //   15: invokevirtual 28	java/util/ArrayList:size	()I
    //   18: istore 5
    //   20: iload 5
    //   22: iconst_1
    //   23: isub
    //   24: istore 6
    //   26: iload 6
    //   28: ifge +6 -> 34
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload 4
    //   36: iload 6
    //   38: invokevirtual 32	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   41: checkcast 34	org/andengine/opengl/d/c
    //   44: astore 7
    //   46: aload 7
    //   48: invokeinterface 38 1 0
    //   53: ifeq +11 -> 64
    //   56: aload 7
    //   58: aload_1
    //   59: invokeinterface 40 2 0
    //   64: aload_3
    //   65: aload 7
    //   67: invokevirtual 42	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   70: pop
    //   71: iinc 6 255
    //   74: goto -48 -> 26
    //   77: astore_2
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	e
    //   0	82	1	parame	org.andengine.opengl.util.e
    //   77	4	2	localObject	Object
    //   6	59	3	localArrayList1	ArrayList
    //   11	24	4	localArrayList2	ArrayList
    //   18	6	5	i	int
    //   24	48	6	j	int
    //   44	22	7	localc	c
    // Exception table:
    //   from	to	target	type
    //   2	20	77	finally
    //   34	64	77	finally
    //   64	71	77	finally
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	org/andengine/opengl/d/e:a	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: iconst_m1
    //   8: aload_2
    //   9: invokevirtual 28	java/util/ArrayList:size	()I
    //   12: iadd
    //   13: istore_3
    //   14: iload_3
    //   15: ifge +10 -> 25
    //   18: aload_2
    //   19: invokevirtual 45	java/util/ArrayList:clear	()V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_2
    //   26: iload_3
    //   27: invokevirtual 48	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   30: checkcast 34	org/andengine/opengl/d/c
    //   33: invokeinterface 51 1 0
    //   38: iinc 3 255
    //   41: goto -27 -> 14
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	e
    //   44	4	1	localObject	Object
    //   6	20	2	localArrayList	ArrayList
    //   13	26	3	i	int
    // Exception table:
    //   from	to	target	type
    //   2	14	44	finally
    //   18	22	44	finally
    //   25	38	44	finally
  }
  
  public void b(c paramc)
  {
    try
    {
      if (this.a.remove(paramc)) {
        this.b.add(paramc);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	org/andengine/opengl/d/e:a	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: iconst_m1
    //   8: aload_2
    //   9: invokevirtual 28	java/util/ArrayList:size	()I
    //   12: iadd
    //   13: istore_3
    //   14: iload_3
    //   15: ifge +10 -> 25
    //   18: aload_2
    //   19: invokevirtual 45	java/util/ArrayList:clear	()V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_2
    //   26: iload_3
    //   27: invokevirtual 48	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   30: checkcast 34	org/andengine/opengl/d/c
    //   33: invokeinterface 51 1 0
    //   38: iinc 3 255
    //   41: goto -27 -> 14
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	e
    //   44	4	1	localObject	Object
    //   6	20	2	localArrayList	ArrayList
    //   13	26	3	i	int
    // Exception table:
    //   from	to	target	type
    //   2	14	44	finally
    //   18	22	44	finally
    //   25	38	44	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.e
 * JD-Core Version:    0.7.0.1
 */