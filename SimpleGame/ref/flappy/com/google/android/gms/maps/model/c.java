package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator
{
  static void a(CameraPosition paramCameraPosition, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.c.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 1, paramCameraPosition.a());
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 2, paramCameraPosition.a, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 3, paramCameraPosition.b);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 4, paramCameraPosition.c);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, 5, paramCameraPosition.d);
    com.google.android.gms.common.internal.safeparcel.c.a(paramParcel, i);
  }
  
  public CameraPosition a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    int i = a.b(paramParcel);
    int j = 0;
    LatLng localLatLng = null;
    float f2 = 0.0F;
    float f3 = 0.0F;
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
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        f3 = a.i(paramParcel, k);
        break;
      case 4: 
        f2 = a.i(paramParcel, k);
        break;
      case 5: 
        f1 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new CameraPosition(j, localLatLng, f3, f2, f1);
  }
  
  public CameraPosition[] a(int paramInt)
  {
    return new CameraPosition[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.c
 * JD-Core Version:    0.7.0.1
 */