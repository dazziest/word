package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.a.bk;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  public final LatLng a;
  public final LatLng b;
  private final int c;
  
  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    do.a(paramLatLng1, "null southwest");
    do.a(paramLatLng2, "null northeast");
    if (paramLatLng2.a >= paramLatLng1.a) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLatLng1.a);
      arrayOfObject[1] = Double.valueOf(paramLatLng2.a);
      do.a(bool, "southern latitude exceeds northern latitude (%s > %s)", arrayOfObject);
      this.c = paramInt;
      this.a = paramLatLng1;
      this.b = paramLatLng2;
      return;
    }
  }
  
  int a()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LatLngBounds localLatLngBounds;
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds)) {
        return false;
      }
      localLatLngBounds = (LatLngBounds)paramObject;
    } while ((this.a.equals(localLatLngBounds.a)) && (this.b.equals(localLatLngBounds.b)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = this.b;
    return dl.a(arrayOfObject);
  }
  
  public String toString()
  {
    return dl.a(this).a("southwest", this.a).a("northeast", this.b).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (bk.a())
    {
      t.a(this, paramParcel, paramInt);
      return;
    }
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds
 * JD-Core Version:    0.7.0.1
 */