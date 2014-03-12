package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;
import com.google.android.gms.maps.model.a.v;
import com.google.android.gms.maps.model.a.w;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final n CREATOR = new n();
  private final int a;
  private v b;
  private o c;
  private boolean d = true;
  private float e;
  
  public TileOverlayOptions()
  {
    this.a = 1;
  }
  
  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean, float paramFloat)
  {
    this.a = paramInt;
    this.b = w.a(paramIBinder);
    if (this.b == null) {}
    for (m localm = null;; localm = new m(this))
    {
      this.c = localm;
      this.d = paramBoolean;
      this.e = paramFloat;
      return;
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  IBinder b()
  {
    return this.b.asBinder();
  }
  
  public float c()
  {
    return this.e;
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (bk.a())
    {
      z.a(this, paramParcel, paramInt);
      return;
    }
    n.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * JD-Core Version:    0.7.0.1
 */