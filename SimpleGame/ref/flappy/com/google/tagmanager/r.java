package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class r
{
  private static r f;
  private final v a;
  private final Context b;
  private final e c;
  private volatile w d;
  private final ConcurrentMap e;
  
  r(Context paramContext, v paramv, e parame)
  {
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    this.b = paramContext.getApplicationContext();
    this.a = paramv;
    this.d = w.a;
    this.e = new ConcurrentHashMap();
    this.c = parame;
    this.c.a(new s(this));
    this.c.a(new a(this.b));
  }
  
  public static r a(Context paramContext)
  {
    try
    {
      if (f == null) {
        f = new r(paramContext, new t(), new e());
      }
      r localr = f;
      return localr;
    }
    finally {}
  }
  
  public w a()
  {
    return this.d;
  }
  
  boolean a(Uri paramUri)
  {
    for (;;)
    {
      m localm;
      String str;
      boolean bool;
      try
      {
        localm = m.a();
        if (!localm.a(paramUri)) {
          break label215;
        }
        str = localm.d();
        int i = u.a[localm.b().ordinal()];
        switch (i)
        {
        default: 
          bool = true;
          return bool;
        }
      }
      finally {}
      c localc2 = (c)this.e.get(str);
      if (localc2 != null)
      {
        localc2.a(null);
        localc2.a();
        continue;
        Iterator localIterator = this.e.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          c localc1 = (c)localEntry.getValue();
          if (((String)localEntry.getKey()).equals(str))
          {
            localc1.a(localm.c());
            localc1.a();
          }
          else if (localc1.b() != null)
          {
            localc1.a(null);
            localc1.a();
          }
        }
        continue;
        label215:
        bool = false;
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.r
 * JD-Core Version:    0.7.0.1
 */