package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final b CREATOR = new b();
  private final int a;
  private Boolean b;
  private Boolean c;
  private int d = -1;
  private CameraPosition e;
  private Boolean f;
  private Boolean g;
  private Boolean h;
  private Boolean i;
  private Boolean j;
  private Boolean k;
  
  public GoogleMapOptions()
  {
    this.a = 1;
  }
  
  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    this.a = paramInt1;
    this.b = v.a(paramByte1);
    this.c = v.a(paramByte2);
    this.d = paramInt2;
    this.e = paramCameraPosition;
    this.f = v.a(paramByte3);
    this.g = v.a(paramByte4);
    this.h = v.a(paramByte5);
    this.i = v.a(paramByte6);
    this.j = v.a(paramByte7);
    this.k = v.a(paramByte8);
  }
  
  public static GoogleMapOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, com.google.android.gms.e.MapAttrs);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(0)) {
      localGoogleMapOptions.a(localTypedArray.getInt(0, -1));
    }
    if (localTypedArray.hasValue(13)) {
      localGoogleMapOptions.a(localTypedArray.getBoolean(13, false));
    }
    if (localTypedArray.hasValue(12)) {
      localGoogleMapOptions.b(localTypedArray.getBoolean(12, false));
    }
    if (localTypedArray.hasValue(6)) {
      localGoogleMapOptions.d(localTypedArray.getBoolean(6, true));
    }
    if (localTypedArray.hasValue(7)) {
      localGoogleMapOptions.h(localTypedArray.getBoolean(7, true));
    }
    if (localTypedArray.hasValue(8)) {
      localGoogleMapOptions.e(localTypedArray.getBoolean(8, true));
    }
    if (localTypedArray.hasValue(9)) {
      localGoogleMapOptions.g(localTypedArray.getBoolean(9, true));
    }
    if (localTypedArray.hasValue(11)) {
      localGoogleMapOptions.f(localTypedArray.getBoolean(11, true));
    }
    if (localTypedArray.hasValue(10)) {
      localGoogleMapOptions.c(localTypedArray.getBoolean(10, true));
    }
    localGoogleMapOptions.a(CameraPosition.a(paramContext, paramAttributeSet));
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }
  
  int a()
  {
    return this.a;
  }
  
  public GoogleMapOptions a(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public GoogleMapOptions a(CameraPosition paramCameraPosition)
  {
    this.e = paramCameraPosition;
    return this;
  }
  
  public GoogleMapOptions a(boolean paramBoolean)
  {
    this.b = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte b()
  {
    return v.a(this.b);
  }
  
  public GoogleMapOptions b(boolean paramBoolean)
  {
    this.c = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte c()
  {
    return v.a(this.c);
  }
  
  public GoogleMapOptions c(boolean paramBoolean)
  {
    this.f = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte d()
  {
    return v.a(this.f);
  }
  
  public GoogleMapOptions d(boolean paramBoolean)
  {
    this.g = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  byte e()
  {
    return v.a(this.g);
  }
  
  public GoogleMapOptions e(boolean paramBoolean)
  {
    this.h = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte f()
  {
    return v.a(this.h);
  }
  
  public GoogleMapOptions f(boolean paramBoolean)
  {
    this.i = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte g()
  {
    return v.a(this.i);
  }
  
  public GoogleMapOptions g(boolean paramBoolean)
  {
    this.j = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte h()
  {
    return v.a(this.j);
  }
  
  public GoogleMapOptions h(boolean paramBoolean)
  {
    this.k = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  byte i()
  {
    return v.a(this.k);
  }
  
  public int j()
  {
    return this.d;
  }
  
  public CameraPosition k()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (bk.a())
    {
      e.a(this, paramParcel, paramInt);
      return;
    }
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * JD-Core Version:    0.7.0.1
 */