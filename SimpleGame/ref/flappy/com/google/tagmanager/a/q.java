package com.google.tagmanager.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class q
{
  private static final q d = new q(true);
  private final ax a;
  private boolean b;
  private boolean c = false;
  
  private q()
  {
    this.a = ax.a(16);
  }
  
  private q(boolean paramBoolean)
  {
    this.a = ax.a(0);
    c();
  }
  
  static int a(bm parambm, boolean paramBoolean)
  {
    if (paramBoolean) {
      return 2;
    }
    return parambm.b();
  }
  
  public static q a()
  {
    return new q();
  }
  
  public static Object a(k paramk, bm parambm, boolean paramBoolean)
  {
    switch (r.b[parambm.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 1: 
      return Double.valueOf(paramk.b());
    case 2: 
      return Float.valueOf(paramk.c());
    case 3: 
      return Long.valueOf(paramk.e());
    case 4: 
      return Long.valueOf(paramk.d());
    case 5: 
      return Integer.valueOf(paramk.f());
    case 6: 
      return Long.valueOf(paramk.g());
    case 7: 
      return Integer.valueOf(paramk.h());
    case 8: 
      return Boolean.valueOf(paramk.i());
    case 9: 
      if (paramBoolean) {
        return paramk.k();
      }
      return paramk.j();
    case 10: 
      return paramk.l();
    case 11: 
      return Integer.valueOf(paramk.m());
    case 12: 
      return Integer.valueOf(paramk.o());
    case 13: 
      return Long.valueOf(paramk.p());
    case 14: 
      return Integer.valueOf(paramk.q());
    case 15: 
      return Long.valueOf(paramk.r());
    case 16: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
    case 17: 
      throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
    }
    throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
  }
  
  private static void a(bm parambm, Object paramObject)
  {
    if (paramObject == null) {
      throw new NullPointerException();
    }
    int i = r.a[parambm.a().ordinal()];
    boolean bool1 = false;
    switch (i)
    {
    }
    while (!bool1)
    {
      throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      bool1 = paramObject instanceof Integer;
      continue;
      bool1 = paramObject instanceof Long;
      continue;
      bool1 = paramObject instanceof Float;
      continue;
      bool1 = paramObject instanceof Double;
      continue;
      bool1 = paramObject instanceof Boolean;
      continue;
      bool1 = paramObject instanceof String;
      continue;
      if (!(paramObject instanceof h))
      {
        boolean bool4 = paramObject instanceof byte[];
        bool1 = false;
        if (!bool4) {}
      }
      else
      {
        bool1 = true;
        continue;
        if (!(paramObject instanceof Integer))
        {
          boolean bool3 = paramObject instanceof ad;
          bool1 = false;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
          continue;
          if (!(paramObject instanceof am))
          {
            boolean bool2 = paramObject instanceof ag;
            bool1 = false;
            if (!bool2) {}
          }
          else
          {
            bool1 = true;
          }
        }
      }
    }
  }
  
  private boolean a(Map.Entry paramEntry)
  {
    s locals = (s)paramEntry.getKey();
    if (locals.b() == br.i)
    {
      if (locals.c())
      {
        Iterator localIterator = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (((am)localIterator.next()).j());
        return false;
      }
      Object localObject = paramEntry.getValue();
      if ((localObject instanceof am))
      {
        if (!((am)localObject).j()) {
          return false;
        }
      }
      else
      {
        if ((localObject instanceof ag)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  public static q b()
  {
    return d;
  }
  
  private void b(Map.Entry paramEntry)
  {
    s locals = (s)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    if ((localObject1 instanceof ag)) {
      localObject1 = ((ag)localObject1).a();
    }
    if (locals.c())
    {
      Object localObject4 = a(locals);
      if (localObject4 == null)
      {
        this.a.a(locals, new ArrayList((List)localObject1));
        return;
      }
      ((List)localObject4).addAll((List)localObject1);
      return;
    }
    if (locals.b() == br.i)
    {
      Object localObject2 = a(locals);
      if (localObject2 == null)
      {
        this.a.a(locals, localObject1);
        return;
      }
      if ((localObject2 instanceof ap)) {}
      for (Object localObject3 = locals.a((ap)localObject2, (ap)localObject1);; localObject3 = locals.a(((am)localObject2).n(), (am)localObject1).h())
      {
        this.a.a(locals, localObject3);
        return;
      }
    }
    this.a.a(locals, localObject1);
  }
  
  public Object a(s params)
  {
    Object localObject = this.a.get(params);
    if ((localObject instanceof ag)) {
      localObject = ((ag)localObject).a();
    }
    return localObject;
  }
  
  public void a(q paramq)
  {
    for (int i = 0; i < paramq.a.c(); i++) {
      b(paramq.a.b(i));
    }
    Iterator localIterator = paramq.a.d().iterator();
    while (localIterator.hasNext()) {
      b((Map.Entry)localIterator.next());
    }
  }
  
  public void a(s params, Object paramObject)
  {
    if (params.c())
    {
      if (!(paramObject instanceof List)) {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll((List)paramObject);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        a(params.a(), localObject);
      }
      paramObject = localArrayList;
    }
    for (;;)
    {
      if ((paramObject instanceof ag)) {
        this.c = true;
      }
      this.a.a(params, paramObject);
      return;
      a(params.a(), paramObject);
    }
  }
  
  public void b(s params, Object paramObject)
  {
    if (!params.c()) {
      throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
    a(params.a(), paramObject);
    Object localObject1 = a(params);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = new ArrayList();
      this.a.a(params, localObject2);
    }
    for (;;)
    {
      ((List)localObject2).add(paramObject);
      return;
      localObject2 = (List)localObject1;
    }
  }
  
  public void c()
  {
    if (this.b) {
      return;
    }
    this.a.a();
    this.b = true;
  }
  
  public q d()
  {
    q localq = a();
    for (int i = 0; i < this.a.c(); i++)
    {
      Map.Entry localEntry2 = this.a.b(i);
      localq.a((s)localEntry2.getKey(), localEntry2.getValue());
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator.next();
      localq.a((s)localEntry1.getKey(), localEntry1.getValue());
    }
    localq.c = this.c;
    return localq;
  }
  
  public boolean e()
  {
    for (int i = 0; i < this.a.c(); i++) {
      if (!a(this.a.b(i))) {
        return false;
      }
    }
    Iterator localIterator = this.a.d().iterator();
    while (localIterator.hasNext()) {
      if (!a((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.q
 * JD-Core Version:    0.7.0.1
 */