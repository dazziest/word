package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class e
  implements Parcelable.Creator
{
  static void a(GroundOverlayOptions paramGroundOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGroundOverlayOptions.b());
    c.a(paramParcel, 2, paramGroundOverlayOptions.a(), false);
    c.a(paramParcel, 3, paramGroundOverlayOptions.c(), paramInt, false);
    c.a(paramParcel, 4, paramGroundOverlayOptions.d());
    c.a(paramParcel, 5, paramGroundOverlayOptions.e());
    c.a(paramParcel, 6, paramGroundOverlayOptions.f(), paramInt, false);
    c.a(paramParcel, 7, paramGroundOverlayOptions.g());
    c.a(paramParcel, 8, paramGroundOverlayOptions.h());
    c.a(paramParcel, 9, paramGroundOverlayOptions.l());
    c.a(paramParcel, 10, paramGroundOverlayOptions.i());
    c.a(paramParcel, 11, paramGroundOverlayOptions.j());
    c.a(paramParcel, 12, paramGroundOverlayOptions.k());
    c.a(paramParcel, i);
  }
  
  public GroundOverlayOptions a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    IBinder localIBinder = null;
    LatLng localLatLng = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    LatLngBounds localLatLngBounds = null;
    float f3 = 0.0F;
    float f4 = 0.0F;
    boolean bool = false;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
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
        localIBinder = a.m(paramParcel, k);
        break;
      case 3: 
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 4: 
        f1 = a.i(paramParcel, k);
        break;
      case 5: 
        f2 = a.i(paramParcel, k);
        break;
      case 6: 
        localLatLngBounds = (LatLngBounds)a.a(paramParcel, k, LatLngBounds.CREATOR);
        break;
      case 7: 
        f3 = a.i(paramParcel, k);
        break;
      case 8: 
        f4 = a.i(paramParcel, k);
        break;
      case 9: 
        bool = a.c(paramParcel, k);
        break;
      case 10: 
        f5 = a.i(paramParcel, k);
        break;
      case 11: 
        f6 = a.i(paramParcel, k);
        break;
      case 12: 
        f7 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new GroundOverlayOptions(j, localIBinder, localLatLng, f1, f2, localLatLngBounds, f3, f4, bool, f5, f6, f7);
  }
  
  public GroundOverlayOptions[] a(int paramInt)
  {
    return new GroundOverlayOptions[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.e
 * JD-Core Version:    0.7.0.1
 */