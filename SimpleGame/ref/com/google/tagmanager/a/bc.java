package com.google.tagmanager.a;

import java.util.Map.Entry;

class bc
  implements Comparable, Map.Entry
{
  private final Comparable b;
  private Object c;
  
  bc(ax paramax, Comparable paramComparable, Object paramObject)
  {
    this.b = paramComparable;
    this.c = paramObject;
  }
  
  bc(ax paramax, Map.Entry paramEntry)
  {
    this(paramax, (Comparable)paramEntry.getKey(), paramEntry.getValue());
  }
  
  private boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public int a(bc parambc)
  {
    return a().compareTo(parambc.a());
  }
  
  public Comparable a()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    Map.Entry localEntry;
    do
    {
      return true;
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      localEntry = (Map.Entry)paramObject;
    } while ((a(this.b, localEntry.getKey())) && (a(this.c, localEntry.getValue())));
    return false;
  }
  
  public Object getValue()
  {
    return this.c;
  }
  
  public int hashCode()
  {
    int i;
    int j;
    if (this.b == null)
    {
      i = 0;
      Object localObject = this.c;
      j = 0;
      if (localObject != null) {
        break label35;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.b.hashCode();
      break;
      label35:
      j = this.c.hashCode();
    }
  }
  
  public Object setValue(Object paramObject)
  {
    ax.a(this.a);
    Object localObject = this.c;
    this.c = paramObject;
    return localObject;
  }
  
  public String toString()
  {
    return this.b + "=" + this.c;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.bc
 * JD-Core Version:    0.7.0.1
 */