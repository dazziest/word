package org.andengine.d.a.b;

import java.util.ArrayList;

public abstract class a
{
  private final ArrayList a;
  private final int b;
  private final int c;
  private int d;
  
  public a()
  {
    this(0);
  }
  
  public a(int paramInt)
  {
    this(paramInt, 1);
  }
  
  public a(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, 2147483647);
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("pGrowth must be greater than 0!");
    }
    if (paramInt3 < 0) {
      throw new IllegalArgumentException("pAvailableItemsMaximum must be at least 0!");
    }
    this.b = paramInt2;
    this.c = paramInt3;
    this.a = new ArrayList(paramInt1);
    if (paramInt1 > 0) {
      a(paramInt1);
    }
  }
  
  public void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        ArrayList localArrayList = this.a;
        int i = this.c;
        int j = localArrayList.size();
        int k = i - j;
        if (paramInt < k)
        {
          int m = paramInt - 1;
          if (m < 0) {
            return;
          }
          localArrayList.add(c());
          m--;
          continue;
        }
        paramInt = k;
      }
      finally {}
    }
  }
  
  protected void a(Object paramObject) {}
  
  protected abstract Object b();
  
  protected void b(Object paramObject) {}
  
  protected Object c()
  {
    return b();
  }
  
  public void c(Object paramObject)
  {
    if (paramObject == null) {
      try
      {
        throw new IllegalArgumentException("Cannot recycle null item!");
      }
      finally {}
    }
    a(paramObject);
    if (this.a.size() < this.c) {
      this.a.add(paramObject);
    }
    this.d = (-1 + this.d);
    if (this.d < 0) {
      org.andengine.d.e.a.d("More items recycled than obtained!");
    }
  }
  
  public Object d()
  {
    for (;;)
    {
      try
      {
        if (this.a.size() > 0)
        {
          localObject2 = this.a.remove(-1 + this.a.size());
          b(localObject2);
          this.d = (1 + this.d);
          return localObject2;
        }
        if ((this.b == 1) || (this.c == 0))
        {
          localObject2 = c();
          org.andengine.d.e.a.a(getClass().getName() + "<" + localObject2.getClass().getSimpleName() + "> was exhausted, with " + this.d + " item not yet recycled. Allocated " + this.b + " more.");
          continue;
        }
        a(this.b);
      }
      finally {}
      Object localObject3 = this.a.remove(-1 + this.a.size());
      Object localObject2 = localObject3;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.a.b.a
 * JD-Core Version:    0.7.0.1
 */