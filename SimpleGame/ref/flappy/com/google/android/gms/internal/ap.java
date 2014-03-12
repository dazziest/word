package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class ap
  implements Parcelable.Creator
{
  static void a(bi parambi, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, parambi.f(), false);
    c.a(paramParcel, 1000, parambi.a());
    c.a(paramParcel, 2, parambi.g());
    c.a(paramParcel, 3, parambi.b());
    c.a(paramParcel, 4, parambi.c());
    c.a(paramParcel, 5, parambi.d());
    c.a(paramParcel, 6, parambi.e());
    c.a(paramParcel, 7, parambi.h());
    c.a(paramParcel, i);
  }
  
  public bi a(Parcel paramParcel)
  {
    double d1 = 0.0D;
    short s = 0;
    int i = a.b(paramParcel);
    String str = null;
    float f = 0.0F;
    long l = 0L;
    double d2 = d1;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str = a.l(paramParcel, m);
        break;
      case 1000: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        l = a.g(paramParcel, m);
        break;
      case 3: 
        s = a.e(paramParcel, m);
        break;
      case 4: 
        d2 = a.j(paramParcel, m);
        break;
      case 5: 
        d1 = a.j(paramParcel, m);
        break;
      case 6: 
        f = a.i(paramParcel, m);
        break;
      case 7: 
        j = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new bi(k, str, j, s, d2, d1, f, l);
  }
  
  public bi[] a(int paramInt)
  {
    return new bi[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ap
 * JD-Core Version:    0.7.0.1
 */