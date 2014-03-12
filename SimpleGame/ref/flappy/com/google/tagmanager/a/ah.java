package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class ah
  extends AbstractList
  implements ai, RandomAccess
{
  public static final ai a = new bg(new ah());
  private final List b;
  
  public ah()
  {
    this.b = new ArrayList();
  }
  
  public ah(ai paramai)
  {
    this.b = new ArrayList(paramai.size());
    addAll(paramai);
  }
  
  private static String a(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof h)) {
      return ((h)paramObject).f();
    }
    return ac.b((byte[])paramObject);
  }
  
  public String a(int paramInt)
  {
    Object localObject = this.b.get(paramInt);
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    if ((localObject instanceof h))
    {
      h localh = (h)localObject;
      String str2 = localh.f();
      if (localh.g()) {
        this.b.set(paramInt, str2);
      }
      return str2;
    }
    byte[] arrayOfByte = (byte[])localObject;
    String str1 = ac.b(arrayOfByte);
    if (ac.a(arrayOfByte)) {
      this.b.set(paramInt, str1);
    }
    return str1;
  }
  
  public String a(int paramInt, String paramString)
  {
    return a(this.b.set(paramInt, paramString));
  }
  
  public List a()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public void a(h paramh)
  {
    this.b.add(paramh);
    this.modCount = (1 + this.modCount);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    if ((paramCollection instanceof ai)) {
      paramCollection = ((ai)paramCollection).a();
    }
    boolean bool = this.b.addAll(paramInt, paramCollection);
    this.modCount = (1 + this.modCount);
    return bool;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public String b(int paramInt)
  {
    Object localObject = this.b.remove(paramInt);
    this.modCount = (1 + this.modCount);
    return a(localObject);
  }
  
  public void b(int paramInt, String paramString)
  {
    this.b.add(paramInt, paramString);
    this.modCount = (1 + this.modCount);
  }
  
  public void clear()
  {
    this.b.clear();
    this.modCount = (1 + this.modCount);
  }
  
  public int size()
  {
    return this.b.size();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.ah
 * JD-Core Version:    0.7.0.1
 */