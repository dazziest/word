package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class at
{
  private final Deque a = new ArrayDeque(ar.b().length);
  
  private int a(int paramInt)
  {
    int i = Arrays.binarySearch(ar.b(), paramInt);
    if (i < 0) {
      i = -1 + -(i + 1);
    }
    return i;
  }
  
  private h a(h paramh1, h paramh2)
  {
    a(paramh1);
    a(paramh2);
    for (Object localObject = (h)this.a.pop(); !this.a.isEmpty(); localObject = new ar((h)this.a.pop(), (h)localObject, null)) {}
    return localObject;
  }
  
  private void a(h paramh)
  {
    if (paramh.k())
    {
      b(paramh);
      return;
    }
    if ((paramh instanceof ar))
    {
      ar localar = (ar)paramh;
      a(ar.a(localar));
      a(ar.b(localar));
      return;
    }
    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + paramh.getClass());
  }
  
  private void b(h paramh)
  {
    int i = a(paramh.a());
    int j = ar.b()[(i + 1)];
    if ((this.a.isEmpty()) || (((h)this.a.peek()).a() >= j))
    {
      this.a.push(paramh);
      return;
    }
    int k = ar.b()[i];
    for (Object localObject = (h)this.a.pop(); (!this.a.isEmpty()) && (((h)this.a.peek()).a() < k); localObject = new ar((h)this.a.pop(), (h)localObject, null)) {}
    for (ar localar = new ar((h)localObject, paramh, null); !this.a.isEmpty(); localar = new ar((h)this.a.pop(), localar, null))
    {
      int m = a(localar.a());
      int n = ar.b()[(m + 1)];
      if (((h)this.a.peek()).a() >= n) {
        break;
      }
    }
    this.a.push(localar);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.at
 * JD-Core Version:    0.7.0.1
 */