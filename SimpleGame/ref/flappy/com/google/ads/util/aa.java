package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class aa
{
  private static final Object a = new Object();
  private static int b = 0;
  private static HashMap c = new HashMap();
  private final ArrayList d = new ArrayList();
  public final int u;
  
  public aa()
  {
    synchronized (a)
    {
      int i = b;
      b = i + 1;
      this.u = i;
      Integer localInteger = (Integer)c.get(getClass());
      if (localInteger == null)
      {
        c.put(getClass(), Integer.valueOf(1));
        g.d("State created: " + toString());
        return;
      }
      c.put(getClass(), Integer.valueOf(1 + localInteger.intValue()));
    }
  }
  
  private void a(ac paramac)
  {
    this.d.add(paramac);
  }
  
  protected void finalize()
  {
    synchronized (a)
    {
      c.put(getClass(), Integer.valueOf(-1 + ((Integer)c.get(getClass())).intValue()));
      super.finalize();
      return;
    }
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "[" + this.u + "]";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.aa
 * JD-Core Version:    0.7.0.1
 */