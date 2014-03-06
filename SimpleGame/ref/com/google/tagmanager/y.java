package com.google.tagmanager;

import com.google.analytics.b.a.a.c;
import com.google.analytics.b.a.a.e;
import com.google.analytics.b.a.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class y
{
  private static final Object a = null;
  private static Long b = new Long(0L);
  private static Double c = new Double(0.0D);
  private static x d = x.a(0L);
  private static String e = new String("");
  private static Boolean f = new Boolean(false);
  private static List g = new ArrayList(0);
  private static Map h = new HashMap();
  private static c i = a(e);
  
  public static c a()
  {
    return i;
  }
  
  public static c a(Object paramObject)
  {
    int j = 0;
    e locale = c.F();
    if ((paramObject instanceof c)) {
      return (c)paramObject;
    }
    if ((paramObject instanceof String)) {
      locale.a(h.a).a((String)paramObject);
    }
    for (;;)
    {
      if (j != 0) {
        locale.b(true);
      }
      return locale.c();
      if ((paramObject instanceof List))
      {
        locale.a(h.b);
        Iterator localIterator2 = ((List)paramObject).iterator();
        int n = 0;
        if (localIterator2.hasNext())
        {
          c localc3 = a(localIterator2.next());
          if (localc3 == i) {
            return i;
          }
          if ((n != 0) || (localc3.E())) {}
          for (n = 1;; n = 0)
          {
            locale.b(localc3);
            break;
          }
        }
        j = n;
      }
      else if ((paramObject instanceof Map))
      {
        locale.a(h.c);
        Iterator localIterator1 = ((Map)paramObject).entrySet().iterator();
        int k = 0;
        if (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          c localc1 = a(localEntry.getKey());
          c localc2 = a(localEntry.getValue());
          if ((localc1 == i) || (localc2 == i)) {
            return i;
          }
          if ((k != 0) || (localc1.E()) || (localc2.E())) {}
          for (int m = 1;; m = 0)
          {
            locale.c(localc1);
            locale.d(localc2);
            k = m;
            break;
          }
        }
        j = k;
      }
      else if (b(paramObject))
      {
        locale.a(h.a).a(paramObject.toString());
        j = 0;
      }
      else if (c(paramObject))
      {
        locale.a(h.f).a(d(paramObject));
        j = 0;
      }
      else
      {
        if (!(paramObject instanceof Boolean)) {
          break;
        }
        locale.a(h.h).a(((Boolean)paramObject).booleanValue());
        j = 0;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder().append("Converting to Value from unknown object type: ");
    if (paramObject == null) {}
    for (String str = "null";; str = paramObject.getClass().toString())
    {
      i.a(str);
      return i;
    }
  }
  
  private static boolean b(Object paramObject)
  {
    return ((paramObject instanceof Double)) || ((paramObject instanceof Float)) || (((paramObject instanceof x)) && (((x)paramObject).a()));
  }
  
  private static boolean c(Object paramObject)
  {
    return ((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof x)) && (((x)paramObject).b()));
  }
  
  private static long d(Object paramObject)
  {
    if ((paramObject instanceof Number)) {
      return ((Number)paramObject).longValue();
    }
    i.a("getInt64 received non-Number");
    return 0L;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.y
 * JD-Core Version:    0.7.0.1
 */