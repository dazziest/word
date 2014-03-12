package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.do;

public abstract class b
{
  protected final d a;
  protected final int b;
  private final int c;
  
  public b(d paramd, int paramInt)
  {
    this.a = ((d)do.a(paramd));
    if ((paramInt >= 0) && (paramInt < paramd.g())) {}
    for (boolean bool = true;; bool = false)
    {
      do.a(bool);
      this.b = paramInt;
      this.c = paramd.a(this.b);
      return;
    }
  }
  
  protected long a(String paramString)
  {
    return this.a.a(paramString, this.b, this.c);
  }
  
  protected int b(String paramString)
  {
    return this.a.b(paramString, this.b, this.c);
  }
  
  protected boolean c(String paramString)
  {
    return this.a.d(paramString, this.b, this.c);
  }
  
  protected String d(String paramString)
  {
    return this.a.c(paramString, this.b, this.c);
  }
  
  protected Uri e(String paramString)
  {
    return this.a.e(paramString, this.b, this.c);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    if (bool1)
    {
      b localb = (b)paramObject;
      boolean bool3 = dl.a(Integer.valueOf(localb.b), Integer.valueOf(this.b));
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = dl.a(Integer.valueOf(localb.c), Integer.valueOf(this.c));
        bool2 = false;
        if (bool4)
        {
          d locald1 = localb.a;
          d locald2 = this.a;
          bool2 = false;
          if (locald1 == locald2) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  protected boolean f(String paramString)
  {
    return this.a.f(paramString, this.b, this.c);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = this.a;
    return dl.a(arrayOfObject);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.b
 * JD-Core Version:    0.7.0.1
 */