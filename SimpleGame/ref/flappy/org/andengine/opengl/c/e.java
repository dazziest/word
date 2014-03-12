package org.andengine.opengl.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class e
{
  private final HashSet a = new HashSet();
  private final HashMap b = new HashMap();
  private final ArrayList c = new ArrayList();
  private final ArrayList d = new ArrayList();
  private final ArrayList e = new ArrayList();
  private g f;
  
  public void a()
  {
    try
    {
      this.f = new g();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(org.andengine.opengl.util.e parame)
  {
    for (;;)
    {
      HashSet localHashSet;
      ArrayList localArrayList1;
      ArrayList localArrayList3;
      int j;
      int n;
      int k;
      int m;
      try
      {
        localHashSet = this.a;
        localArrayList1 = this.c;
        ArrayList localArrayList2 = this.d;
        localArrayList3 = this.e;
        int i = -1 + localArrayList1.size();
        if (i < 0)
        {
          j = localArrayList2.size();
          if (j > 0)
          {
            n = j - 1;
            break label261;
          }
          k = localArrayList3.size();
          if (k <= 0) {
            break label274;
          }
          m = k - 1;
          break label269;
          System.gc();
          return;
        }
        a locala3 = (a)localArrayList1.get(i);
        boolean bool2 = locala3.e();
        if (bool2) {}
        try
        {
          locala3.c(parame);
          i--;
        }
        catch (IOException localIOException2)
        {
          org.andengine.d.e.a.a(localIOException2);
          continue;
        }
        locala2 = (a)localArrayList2.remove(n);
      }
      finally {}
      label142:
      a locala2;
      boolean bool1 = locala2.c();
      if (!bool1) {}
      try
      {
        locala2.a(parame);
        this.f.a(parame, locala2);
        localArrayList1.add(locala2);
        n--;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          org.andengine.d.e.a.a(localIOException1);
        }
      }
      label261:
      label269:
      do
      {
        a locala1 = (a)localArrayList3.remove(m);
        if (locala1.c()) {
          locala1.b(parame);
        }
        localArrayList1.remove(locala1);
        localHashSet.remove(locala1);
        m--;
        continue;
        if (n >= 0) {
          break label142;
        }
        break;
      } while (m >= 0);
      label274:
      if (j <= 0) {
        if (k <= 0) {}
      }
    }
  }
  
  public boolean a(a parama)
  {
    if (parama == null) {
      try
      {
        throw new IllegalArgumentException("pTexture must not be null!");
      }
      finally {}
    }
    if (this.a.contains(parama)) {
      this.e.remove(parama);
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      this.a.add(parama);
      this.d.add(parama);
    }
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	org/andengine/opengl/c/e:a	Ljava/util/HashSet;
    //   6: astore_2
    //   7: aload_2
    //   8: invokevirtual 104	java/util/HashSet:isEmpty	()Z
    //   11: ifne +19 -> 30
    //   14: aload_2
    //   15: invokevirtual 108	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   18: astore 5
    //   20: aload 5
    //   22: invokeinterface 113 1 0
    //   27: ifne +71 -> 98
    //   30: aload_0
    //   31: getfield 33	org/andengine/opengl/c/e:c	Ljava/util/ArrayList;
    //   34: invokevirtual 114	java/util/ArrayList:isEmpty	()Z
    //   37: ifne +22 -> 59
    //   40: aload_0
    //   41: getfield 35	org/andengine/opengl/c/e:d	Ljava/util/ArrayList;
    //   44: aload_0
    //   45: getfield 33	org/andengine/opengl/c/e:c	Ljava/util/ArrayList;
    //   48: invokevirtual 118	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   51: pop
    //   52: aload_0
    //   53: getfield 33	org/andengine/opengl/c/e:c	Ljava/util/ArrayList;
    //   56: invokevirtual 121	java/util/ArrayList:clear	()V
    //   59: aload_0
    //   60: getfield 37	org/andengine/opengl/c/e:e	Ljava/util/ArrayList;
    //   63: invokevirtual 114	java/util/ArrayList:isEmpty	()Z
    //   66: ifne +22 -> 88
    //   69: aload_0
    //   70: getfield 23	org/andengine/opengl/c/e:a	Ljava/util/HashSet;
    //   73: aload_0
    //   74: getfield 37	org/andengine/opengl/c/e:e	Ljava/util/ArrayList;
    //   77: invokevirtual 124	java/util/HashSet:removeAll	(Ljava/util/Collection;)Z
    //   80: pop
    //   81: aload_0
    //   82: getfield 37	org/andengine/opengl/c/e:e	Ljava/util/ArrayList;
    //   85: invokevirtual 121	java/util/ArrayList:clear	()V
    //   88: aload_0
    //   89: getfield 42	org/andengine/opengl/c/e:f	Lorg/andengine/opengl/c/g;
    //   92: invokevirtual 126	org/andengine/opengl/c/g:e	()V
    //   95: aload_0
    //   96: monitorexit
    //   97: return
    //   98: aload 5
    //   100: invokeinterface 130 1 0
    //   105: checkcast 60	org/andengine/opengl/c/a
    //   108: invokeinterface 132 1 0
    //   113: goto -93 -> 20
    //   116: astore_1
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_1
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	e
    //   116	4	1	localObject	Object
    //   6	9	2	localHashSet	HashSet
    //   18	81	5	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	20	116	finally
    //   20	30	116	finally
    //   30	59	116	finally
    //   59	88	116	finally
    //   88	95	116	finally
    //   98	113	116	finally
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	org/andengine/opengl/c/e:a	Ljava/util/HashSet;
    //   6: invokevirtual 108	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   9: astore_2
    //   10: aload_2
    //   11: invokeinterface 113 1 0
    //   16: ifne +46 -> 62
    //   19: aload_0
    //   20: getfield 35	org/andengine/opengl/c/e:d	Ljava/util/ArrayList;
    //   23: invokevirtual 121	java/util/ArrayList:clear	()V
    //   26: aload_0
    //   27: getfield 33	org/andengine/opengl/c/e:c	Ljava/util/ArrayList;
    //   30: invokevirtual 121	java/util/ArrayList:clear	()V
    //   33: aload_0
    //   34: getfield 23	org/andengine/opengl/c/e:a	Ljava/util/HashSet;
    //   37: invokevirtual 133	java/util/HashSet:clear	()V
    //   40: aload_0
    //   41: getfield 28	org/andengine/opengl/c/e:b	Ljava/util/HashMap;
    //   44: invokevirtual 134	java/util/HashMap:clear	()V
    //   47: aload_0
    //   48: getfield 42	org/andengine/opengl/c/e:f	Lorg/andengine/opengl/c/g;
    //   51: invokevirtual 137	org/andengine/opengl/c/g:n	()V
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 42	org/andengine/opengl/c/e:f	Lorg/andengine/opengl/c/g;
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_2
    //   63: invokeinterface 130 1 0
    //   68: checkcast 60	org/andengine/opengl/c/a
    //   71: invokeinterface 132 1 0
    //   76: goto -66 -> 10
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	e
    //   79	4	1	localObject	Object
    //   9	54	2	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	10	79	finally
    //   10	59	79	finally
    //   62	76	79	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.e
 * JD-Core Version:    0.7.0.1
 */