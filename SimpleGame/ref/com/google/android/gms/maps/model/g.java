package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class g
  implements Parcelable.Creator
{
  static void a(LatLng paramLatLng, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramLatLng.a());
    c.a(paramParcel, 2, paramLatLng.a);
    c.a(paramParcel, 3, paramLatLng.b);
    c.a(paramParcel, i);
  }
  
  public LatLng a(Parcel paramParcel)
  {
    double d1 = 0.0D;
    int i = a.b(paramParcel);
    int j = 0;
    double d2 = d1;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        d2 = a.j(paramParcel, k);
        break;
      case 3: 
        d1 = a.j(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new LatLng(j, d2, d1);
  }
  
  public LatLng[] a(int paramInt)
  {
    return new LatLng[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.g
 * JD-Core Version:    0.7.0.1
 */