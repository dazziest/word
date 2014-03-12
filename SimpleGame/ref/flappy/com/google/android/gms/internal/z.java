package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class z
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  private final int a;
  private final ab b;
  
  z(int paramInt, ab paramab)
  {
    this.a = paramInt;
    this.b = paramab;
  }
  
  private z(ab paramab)
  {
    this.a = 1;
    this.b = paramab;
  }
  
  public static z a(d paramd)
  {
    if ((paramd instanceof ab)) {
      return new z((ab)paramd);
    }
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  int a()
  {
    return this.a;
  }
  
  ab b()
  {
    return this.b;
  }
  
  public d c()
  {
    if (this.b != null) {
      return this.b;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.z
 * JD-Core Version:    0.7.0.1
 */