package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class z
{
  static void a(TileOverlayOptions paramTileOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramTileOverlayOptions.a());
    c.a(paramParcel, 2, paramTileOverlayOptions.b(), false);
    c.a(paramParcel, 3, paramTileOverlayOptions.d());
    c.a(paramParcel, 4, paramTileOverlayOptions.c());
    c.a(paramParcel, i);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.z
 * JD-Core Version:    0.7.0.1
 */