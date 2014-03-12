package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class x
  implements SafeParcelable
{
  public static final ds CREATOR = new ds();
  private final int a;
  private final int b;
  private final int c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  
  public x(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof x)) {}
    x localx;
    do
    {
      return false;
      localx = (x)paramObject;
    } while ((this.a != localx.a) || (this.b != localx.b) || (this.c != localx.c) || (!dl.a(this.d, localx.d)) || (!dl.a(this.e, localx.e)));
    return true;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return (this.b == 1) && (this.c == -1);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.c);
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    return dl.a(arrayOfObject);
  }
  
  public boolean i()
  {
    return this.b == 2;
  }
  
  public String toString()
  {
    if (i())
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = e();
      arrayOfObject3[1] = f();
      return String.format("Person [%s] %s", arrayOfObject3);
    }
    if (h())
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = d();
      arrayOfObject2[1] = f();
      return String.format("Circle [%s] %s", arrayOfObject2);
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = d();
    arrayOfObject1[1] = f();
    return String.format("Group [%s] %s", arrayOfObject1);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ds.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.x
 * JD-Core Version:    0.7.0.1
 */