package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class r
{
  static void a(CircleOptions paramCircleOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramCircleOptions.a());
    c.a(paramParcel, 2, paramCircleOptions.b(), paramInt, false);
    c.a(paramParcel, 3, paramCircleOptions.c());
    c.a(paramParcel, 4, paramCircleOptions.d());
    c.a(paramParcel, 5, paramCircleOptions.e());
    c.a(paramParcel, 6, paramCircleOptions.f());
    c.a(paramParcel, 7, paramCircleOptions.g());
    c.a(paramParcel, 8, paramCircleOptions.h());
    c.a(paramParcel, i);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.r
 * JD-Core Version:    0.7.0.1
 */