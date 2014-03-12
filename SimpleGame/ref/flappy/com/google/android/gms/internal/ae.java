package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ae
{
  private void a(StringBuilder paramStringBuilder, ae.a parama, Object paramObject)
  {
    if (parama.b() == 11)
    {
      paramStringBuilder.append(((ae)parama.h().cast(paramObject)).toString());
      return;
    }
    if (parama.b() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(n.a((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private void a(StringBuilder paramStringBuilder, ae.a parama, ArrayList paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0) {
        paramStringBuilder.append(",");
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        a(paramStringBuilder, parama, localObject);
      }
      i++;
    }
    paramStringBuilder.append("]");
  }
  
  protected Object a(ae.a parama, Object paramObject)
  {
    if (ae.a.a(parama) != null) {
      paramObject = parama.a(paramObject);
    }
    return paramObject;
  }
  
  protected abstract Object a(String paramString);
  
  protected boolean a(ae.a parama)
  {
    if (parama.d() == 11)
    {
      if (parama.e()) {
        return d(parama.f());
      }
      return c(parama.f());
    }
    return b(parama.f());
  }
  
  protected Object b(ae.a parama)
  {
    boolean bool = true;
    String str1 = parama.f();
    if (parama.h() != null)
    {
      if (a(parama.f()) == null)
      {
        do.a(bool, "Concrete field shouldn't be value object: " + parama.f());
        if (!parama.e()) {
          break label83;
        }
      }
      label83:
      for (HashMap localHashMap = d();; localHashMap = c())
      {
        if (localHashMap == null) {
          break label92;
        }
        return localHashMap.get(str1);
        bool = false;
        break;
      }
      try
      {
        label92:
        String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
        Object localObject = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
        return localObject;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    return a(parama.f());
  }
  
  public abstract HashMap b();
  
  protected abstract boolean b(String paramString);
  
  public HashMap c()
  {
    return null;
  }
  
  protected boolean c(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }
  
  public HashMap d()
  {
    return null;
  }
  
  protected boolean d(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }
  
  public String toString()
  {
    HashMap localHashMap = b();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ae.a locala = (ae.a)localHashMap.get(str);
      if (a(locala))
      {
        Object localObject = a(locala, b(locala));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        }
        for (;;)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null) {
            break label135;
          }
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label135:
        switch (locala.d())
        {
        default: 
          if (locala.c()) {
            a(localStringBuilder, locala, (ArrayList)localObject);
          }
          break;
        case 8: 
          localStringBuilder.append("\"").append(l.a((byte[])localObject)).append("\"");
          break;
        case 9: 
          localStringBuilder.append("\"").append(l.b((byte[])localObject)).append("\"");
          break;
        case 10: 
          o.a(localStringBuilder, (HashMap)localObject);
          continue;
          a(localStringBuilder, locala, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ae
 * JD-Core Version:    0.7.0.1
 */