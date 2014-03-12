package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator
{
  static void a(LocationRequest paramLocationRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1, paramLocationRequest.a);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1000, paramLocationRequest.a());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramLocationRequest.b);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, paramLocationRequest.c);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, paramLocationRequest.d);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 5, paramLocationRequest.e);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 6, paramLocationRequest.f);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 7, paramLocationRequest.g);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, i);
  }
  
  public LocationRequest a(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.b(paramParcel);
    int j = 102;
    long l1 = 3600000L;
    long l2 = 600000L;
    long l3 = 9223372036854775807L;
    int k = 2147483647;
    float f = 0.0F;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        j = a.f(paramParcel, n);
        break;
      case 1000: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        l1 = a.g(paramParcel, n);
        break;
      case 3: 
        l2 = a.g(paramParcel, n);
        break;
      case 4: 
        bool = a.c(paramParcel, n);
        break;
      case 5: 
        l3 = a.g(paramParcel, n);
        break;
      case 6: 
        k = a.f(paramParcel, n);
        break;
      case 7: 
        f = a.i(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new LocationRequest(m, j, l1, l2, bool, l3, k, f);
  }
  
  public LocationRequest[] a(int paramInt)
  {
    return new LocationRequest[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.c
 * JD-Core Version:    0.7.0.1
 */