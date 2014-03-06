package org.andengine.d.a.a;

import java.util.Arrays;

public class a
  implements org.andengine.d.a.c.a
{
  protected Object[] a;
  protected int b;
  protected int c;
  
  public a()
  {
    this(1);
  }
  
  public a(int paramInt)
  {
    this.a = new Object[paramInt];
  }
  
  private void c()
  {
    int i = this.a.length;
    if (this.c == i)
    {
      if (this.c - this.b != i) {
        b();
      }
    }
    else {
      return;
    }
    Object[] arrayOfObject = new Object[1 + (i * 3 >> 1)];
    System.arraycopy(this.a, 0, arrayOfObject, 0, i);
    this.a = arrayOfObject;
  }
  
  public Object a()
  {
    if (this.b == this.c) {
      return null;
    }
    Object localObject = this.a[this.b];
    this.a[this.b] = null;
    this.b = (1 + this.b);
    if (this.b == this.c)
    {
      this.b = 0;
      this.c = 0;
    }
    return localObject;
  }
  
  public void a(Object paramObject)
  {
    c();
    this.a[this.c] = paramObject;
    this.c = (1 + this.c);
  }
  
  public void b()
  {
    int i = this.c - this.b;
    if (i == 0)
    {
      this.b = 0;
      this.c = 0;
      return;
    }
    System.arraycopy(this.a, this.b, this.a, 0, i);
    int j = Math.max(i, this.b);
    int k = Math.max(j, this.c);
    if (j < k) {
      Arrays.fill(this.a, j, k, null);
    }
    this.b = 0;
    this.c = i;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.a.a.a
 * JD-Core Version:    0.7.0.1
 */