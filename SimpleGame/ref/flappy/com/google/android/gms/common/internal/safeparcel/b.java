package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class b
  extends RuntimeException
{
  public b(String paramString, Parcel paramParcel)
  {
    super(paramString + " Parcel: pos=" + paramParcel.dataPosition() + " size=" + paramParcel.dataSize());
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.b
 * JD-Core Version:    0.7.0.1
 */