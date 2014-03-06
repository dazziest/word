package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class aa
{
  static void a(VisibleRegion paramVisibleRegion, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramVisibleRegion.a());
    c.a(paramParcel, 2, paramVisibleRegion.a, paramInt, false);
    c.a(paramParcel, 3, paramVisibleRegion.b, paramInt, false);
    c.a(paramParcel, 4, paramVisibleRegion.c, paramInt, false);
    c.a(paramParcel, 5, paramVisibleRegion.d, paramInt, false);
    c.a(paramParcel, 6, paramVisibleRegion.e, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.aa
 * JD-Core Version:    0.7.0.1
 */