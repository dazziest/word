package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class dn
{
  private final List a;
  private final Object b;
  
  private dn(Object paramObject)
  {
    this.b = do.a(paramObject);
    this.a = new ArrayList();
  }
  
  public dn a(String paramString, Object paramObject)
  {
    this.a.add((String)do.a(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j < i - 1) {
        localStringBuilder.append(", ");
      }
    }
    return '}';
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dn
 * JD-Core Version:    0.7.0.1
 */