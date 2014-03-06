package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class q
{
  static void a(CameraPosition paramCameraPosition, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramCameraPosition.a());
    c.a(paramParcel, 2, paramCameraPosition.a, paramInt, false);
    c.a(paramParcel, 3, paramCameraPosition.b);
    c.a(paramParcel, 4, paramCameraPosition.c);
    c.a(paramParcel, 5, paramCameraPosition.d);
    c.a(paramParcel, i);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.q
 * JD-Core Version:    0.7.0.1
 */