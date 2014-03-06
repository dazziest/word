package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity
  implements SafeParcelable
{
  public static final b CREATOR = new b();
  int a;
  int b;
  private final int c;
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.c = paramInt1;
    this.a = paramInt2;
    this.b = paramInt3;
  }
  
  private int a(int paramInt)
  {
    if (paramInt > 5) {
      paramInt = 4;
    }
    return paramInt;
  }
  
  public int a()
  {
    return a(this.a);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "DetectedActivity [type=" + a() + ", confidence=" + this.b + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * JD-Core Version:    0.7.0.1
 */