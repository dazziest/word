package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class ds
  implements Parcelable.Creator
{
  static void a(x paramx, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramx.b());
    c.a(paramParcel, 1000, paramx.a());
    c.a(paramParcel, 2, paramx.c());
    c.a(paramParcel, 3, paramx.d(), false);
    c.a(paramParcel, 4, paramx.e(), false);
    c.a(paramParcel, 5, paramx.f(), false);
    c.a(paramParcel, 6, paramx.g(), false);
    c.a(paramParcel, i);
  }
  
  public x a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = a.b(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.f(paramParcel, n);
        break;
      case 1000: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        i = a.f(paramParcel, n);
        break;
      case 3: 
        str4 = a.l(paramParcel, n);
        break;
      case 4: 
        str3 = a.l(paramParcel, n);
        break;
      case 5: 
        str2 = a.l(paramParcel, n);
        break;
      case 6: 
        str1 = a.l(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new x(m, k, i, str4, str3, str2, str1);
  }
  
  public x[] a(int paramInt)
  {
    return new x[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ds
 * JD-Core Version:    0.7.0.1
 */