package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final h CREATOR = new h();
  private final int a;
  private LatLng b;
  private String c;
  private String d;
  private a e;
  private float f = 0.5F;
  private float g = 1.0F;
  private boolean h;
  private boolean i = true;
  private boolean j = false;
  private float k = 0.0F;
  private float l = 0.5F;
  private float m = 0.0F;
  
  public MarkerOptions()
  {
    this.a = 1;
  }
  
  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    this.a = paramInt;
    this.b = paramLatLng;
    this.c = paramString1;
    this.d = paramString2;
    if (paramIBinder == null) {}
    for (a locala = null;; locala = new a(f.a(paramIBinder)))
    {
      this.e = locala;
      this.f = paramFloat1;
      this.g = paramFloat2;
      this.h = paramBoolean1;
      this.i = paramBoolean2;
      this.j = paramBoolean3;
      this.k = paramFloat3;
      this.l = paramFloat4;
      this.m = paramFloat5;
      return;
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  IBinder b()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.a().asBinder();
  }
  
  public LatLng c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public float f()
  {
    return this.f;
  }
  
  public float g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  public boolean j()
  {
    return this.j;
  }
  
  public float k()
  {
    return this.k;
  }
  
  public float l()
  {
    return this.l;
  }
  
  public float m()
  {
    return this.m;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (bk.a())
    {
      v.a(this, paramParcel, paramInt);
      return;
    }
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * JD-Core Version:    0.7.0.1
 */