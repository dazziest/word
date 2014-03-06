package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class bi
  implements SafeParcelable
{
  public static final ap CREATOR = new ap();
  private final int a;
  private final String b;
  private final long c;
  private final short d;
  private final double e;
  private final double f;
  private final float g;
  private final int h;
  
  public bi(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong)
  {
    a(paramString);
    a(paramFloat);
    a(paramDouble1, paramDouble2);
    int i = a(paramInt2);
    this.a = paramInt1;
    this.d = paramShort;
    this.b = paramString;
    this.e = paramDouble1;
    this.f = paramDouble2;
    this.g = paramFloat;
    this.c = paramLong;
    this.h = i;
  }
  
  private static int a(int paramInt)
  {
    int i = paramInt & 0x3;
    if (i == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt);
    }
    return i;
  }
  
  private static void a(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
  }
  
  private static void a(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
  }
  
  private static void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
  }
  
  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return "CIRCLE";
  }
  
  public int a()
  {
    return this.a;
  }
  
  public short b()
  {
    return this.d;
  }
  
  public double c()
  {
    return this.e;
  }
  
  public double d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public float e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    bi localbi;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof bi)) {
        return false;
      }
      localbi = (bi)paramObject;
      if (this.g != localbi.g) {
        return false;
      }
      if (this.e != localbi.e) {
        return false;
      }
      if (this.f != localbi.f) {
        return false;
      }
    } while (this.d == localbi.d);
    return false;
  }
  
  public String f()
  {
    return this.b;
  }
  
  public long g()
  {
    return this.c;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.e);
    int i = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.f);
    return 31 * (31 * (31 * (i * 31 + (int)(l2 ^ l2 >>> 32)) + Float.floatToIntBits(this.g)) + this.d) + this.h;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = b(this.d);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = Integer.valueOf(this.h);
    arrayOfObject[3] = Double.valueOf(this.e);
    arrayOfObject[4] = Double.valueOf(this.f);
    arrayOfObject[5] = Float.valueOf(this.g);
    arrayOfObject[6] = Long.valueOf(this.c);
    return String.format("Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, @%d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ap.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bi
 * JD-Core Version:    0.7.0.1
 */