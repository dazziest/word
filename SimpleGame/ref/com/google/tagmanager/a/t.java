package com.google.tagmanager.a;

import java.io.Serializable;

public abstract class t
  extends a
  implements Serializable
{
  protected t() {}
  
  protected t(v paramv) {}
  
  private static boolean b(q paramq, am paramam, k paramk, m paramm, o paramo, int paramInt)
  {
    int i = bk.a(paramInt);
    aa localaa = paramo.a(paramam, bk.b(paramInt));
    int j;
    int k;
    if (localaa == null)
    {
      j = 0;
      k = 1;
    }
    while (k != 0)
    {
      return paramk.a(paramInt, paramm);
      if (i == q.a(localaa.b.a(), false))
      {
        j = 0;
        k = 0;
      }
      else if ((localaa.b.d) && (localaa.b.c.c()) && (i == q.a(localaa.b.a(), true)))
      {
        j = 1;
        k = 0;
      }
      else
      {
        k = 1;
        j = 0;
      }
    }
    if (j != 0)
    {
      int n = paramk.c(paramk.s());
      if (localaa.b.a() == bm.n) {
        while (paramk.w() > 0)
        {
          int i1 = paramk.n();
          ad localad = localaa.b.e().b(i1);
          if (localad == null) {
            return true;
          }
          paramq.b(localaa.b, localaa.a(localad));
        }
      }
      while (paramk.w() > 0)
      {
        Object localObject2 = q.a(paramk, localaa.b.a(), false);
        paramq.b(localaa.b, localObject2);
      }
      paramk.d(n);
    }
    Object localObject1;
    for (;;)
    {
      return true;
      switch (u.a[localaa.b.b().ordinal()])
      {
      default: 
        localObject1 = q.a(paramk, localaa.b.a(), false);
        label311:
        if (!localaa.b.c()) {
          break label489;
        }
        paramq.b(localaa.b, localaa.a(localObject1));
      }
    }
    am localam;
    if (!localaa.b.c())
    {
      localam = (am)paramq.a(localaa.b);
      if (localam == null) {}
    }
    for (an localan = localam.n();; localan = null)
    {
      if (localan == null) {
        localan = localaa.b().o();
      }
      if (localaa.b.a() == bm.j) {
        paramk.a(localaa.a(), localan, paramo);
      }
      for (;;)
      {
        localObject1 = localan.h();
        break;
        paramk.a(localan, paramo);
      }
      int m = paramk.n();
      localObject1 = localaa.b.e().b(m);
      if (localObject1 != null) {
        break label311;
      }
      paramm.d(paramInt);
      paramm.b(m);
      return true;
      label489:
      paramq.a(localaa.b, localaa.a(localObject1));
      break;
    }
  }
  
  protected void R() {}
  
  protected boolean a(k paramk, m paramm, o paramo, int paramInt)
  {
    return paramk.a(paramInt, paramm);
  }
  
  public aq c()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.t
 * JD-Core Version:    0.7.0.1
 */