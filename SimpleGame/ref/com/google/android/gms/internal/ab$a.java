package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ab$a
  implements SafeParcelable
{
  public static final c CREATOR = new c();
  final int a;
  final String b;
  final int c;
  
  ab$a(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  ab$a(String paramString, int paramInt)
  {
    this.a = 1;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ab.a
 * JD-Core Version:    0.7.0.1
 */