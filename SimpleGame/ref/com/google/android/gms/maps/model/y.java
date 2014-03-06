package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class y
{
  static void a(Tile paramTile, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramTile.a());
    c.a(paramParcel, 2, paramTile.a);
    c.a(paramParcel, 3, paramTile.b);
    c.a(paramParcel, 4, paramTile.c, false);
    c.a(paramParcel, i);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.y
 * JD-Core Version:    0.7.0.1
 */