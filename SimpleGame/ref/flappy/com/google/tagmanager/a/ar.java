package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ar
  extends h
{
  private static final int[] c;
  private final int d;
  private final h e;
  private final h f;
  private final int g;
  private final int h;
  private int i = 0;
  
  static
  {
    int j = 1;
    ArrayList localArrayList = new ArrayList();
    int k = j;
    while (j > 0)
    {
      localArrayList.add(Integer.valueOf(j));
      int n = k + j;
      k = j;
      j = n;
    }
    localArrayList.add(Integer.valueOf(2147483647));
    c = new int[localArrayList.size()];
    for (int m = 0; m < c.length; m++) {
      c[m] = ((Integer)localArrayList.get(m)).intValue();
    }
  }
  
  private ar(h paramh1, h paramh2)
  {
    this.e = paramh1;
    this.f = paramh2;
    this.g = paramh1.a();
    this.d = (this.g + paramh2.a());
    this.h = (1 + Math.max(paramh1.j(), paramh2.j()));
  }
  
  static h a(h paramh1, h paramh2)
  {
    if ((paramh1 instanceof ar)) {}
    for (ar localar1 = (ar)paramh1; paramh2.a() == 0; localar1 = null) {
      return paramh1;
    }
    if (paramh1.a() == 0) {
      return paramh2;
    }
    int j = paramh1.a() + paramh2.a();
    if (j < 128) {
      return b(paramh1, paramh2);
    }
    if ((localar1 != null) && (localar1.f.a() + paramh2.a() < 128))
    {
      aj localaj = b(localar1.f, paramh2);
      return new ar(localar1.e, localaj);
    }
    if ((localar1 != null) && (localar1.e.j() > localar1.f.j()) && (localar1.j() > paramh2.j()))
    {
      ar localar2 = new ar(localar1.f, paramh2);
      return new ar(localar1.e, localar2);
    }
    int k = 1 + Math.max(paramh1.j(), paramh2.j());
    if (j >= c[k]) {
      return new ar(paramh1, paramh2);
    }
    return at.a(new at(null), paramh1, paramh2);
  }
  
  private static aj b(h paramh1, h paramh2)
  {
    int j = paramh1.a();
    int k = paramh2.a();
    byte[] arrayOfByte = new byte[j + k];
    paramh1.b(arrayOfByte, 0, 0, j);
    paramh2.b(arrayOfByte, 0, j, k);
    return new aj(arrayOfByte);
  }
  
  private boolean b(h paramh)
  {
    au localau1 = new au(this, null);
    aj localaj1 = (aj)localau1.next();
    au localau2 = new au(paramh, null);
    Object localObject1 = (aj)localau2.next();
    int j = 0;
    aj localaj2 = localaj1;
    int k = 0;
    int m = 0;
    int n = localaj2.a() - k;
    int i1 = ((aj)localObject1).a() - j;
    int i2 = Math.min(n, i1);
    if (k == 0) {}
    for (boolean bool = localaj2.a((aj)localObject1, j, i2); !bool; bool = ((aj)localObject1).a(localaj2, k, i2)) {
      return false;
    }
    int i3 = m + i2;
    if (i3 >= this.d)
    {
      if (i3 == this.d) {
        return true;
      }
      throw new IllegalStateException();
    }
    label181:
    Object localObject3;
    int i5;
    if (i2 == n)
    {
      localaj2 = (aj)localau1.next();
      k = 0;
      if (i2 != i1) {
        break label228;
      }
      localObject3 = (aj)localau2.next();
      i5 = 0;
    }
    for (;;)
    {
      j = i5;
      localObject1 = localObject3;
      m = i3;
      break;
      k += i2;
      break label181;
      label228:
      int i4 = j + i2;
      Object localObject2 = localObject1;
      i5 = i4;
      localObject3 = localObject2;
    }
  }
  
  public int a()
  {
    return this.d;
  }
  
  protected int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= this.g) {
      return this.e.a(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= this.g) {
      return this.f.a(paramInt1, paramInt2 - this.g, paramInt3);
    }
    int j = this.g - paramInt2;
    int k = this.e.a(paramInt1, paramInt2, j);
    return this.f.a(k, 0, paramInt3 - j);
  }
  
  public String a(String paramString)
  {
    return new String(e(), paramString);
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt3 <= this.g)
    {
      this.e.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
      return;
    }
    if (paramInt1 >= this.g)
    {
      this.f.a(paramArrayOfByte, paramInt1 - this.g, paramInt2, paramInt3);
      return;
    }
    int j = this.g - paramInt1;
    this.e.a(paramArrayOfByte, paramInt1, paramInt2, j);
    this.f.a(paramArrayOfByte, 0, paramInt2 + j, paramInt3 - j);
  }
  
  protected int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= this.g) {
      return this.e.b(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= this.g) {
      return this.f.b(paramInt1, paramInt2 - this.g, paramInt3);
    }
    int j = this.g - paramInt2;
    int k = this.e.b(paramInt1, paramInt2, j);
    return this.f.b(k, 0, paramInt3 - j);
  }
  
  void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    if (paramInt1 + paramInt2 <= this.g)
    {
      this.e.b(paramOutputStream, paramInt1, paramInt2);
      return;
    }
    if (paramInt1 >= this.g)
    {
      this.f.b(paramOutputStream, paramInt1 - this.g, paramInt2);
      return;
    }
    int j = this.g - paramInt1;
    this.e.b(paramOutputStream, paramInt1, j);
    this.f.b(paramOutputStream, 0, paramInt2 - j);
  }
  
  public i c()
  {
    return new av(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    h localh;
    do
    {
      return true;
      if (!(paramObject instanceof h)) {
        return false;
      }
      localh = (h)paramObject;
      if (this.d != localh.a()) {
        return false;
      }
    } while (this.d == 0);
    if (this.i != 0)
    {
      int j = localh.l();
      if ((j != 0) && (this.i != j)) {
        return false;
      }
    }
    return b(localh);
  }
  
  public boolean g()
  {
    int j = this.e.a(0, 0, this.g);
    int k = this.f.a(j, 0, this.f.a());
    boolean bool = false;
    if (k == 0) {
      bool = true;
    }
    return bool;
  }
  
  public k h()
  {
    return k.a(new aw(this));
  }
  
  public int hashCode()
  {
    int j = this.i;
    if (j == 0)
    {
      j = b(this.d, 0, this.d);
      if (j == 0) {
        j = 1;
      }
      this.i = j;
    }
    return j;
  }
  
  protected int j()
  {
    return this.h;
  }
  
  protected boolean k()
  {
    return this.d >= c[this.h];
  }
  
  protected int l()
  {
    return this.i;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.ar
 * JD-Core Version:    0.7.0.1
 */