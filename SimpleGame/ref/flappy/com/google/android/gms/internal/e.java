package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class e
  implements Parcelable.Creator
{
  static void a(ae.a parama, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, parama.a());
    c.a(paramParcel, 2, parama.b());
    c.a(paramParcel, 3, parama.c());
    c.a(paramParcel, 4, parama.d());
    c.a(paramParcel, 5, parama.e());
    c.a(paramParcel, 6, parama.f(), false);
    c.a(paramParcel, 7, parama.g());
    c.a(paramParcel, 8, parama.i(), false);
    c.a(paramParcel, 9, parama.k(), paramInt, false);
    c.a(paramParcel, i);
  }
  
  public ae.a a(Parcel paramParcel)
  {
    z localz = null;
    int i = 0;
    int j = a.b(paramParcel);
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        n = a.f(paramParcel, i1);
        break;
      case 2: 
        m = a.f(paramParcel, i1);
        break;
      case 3: 
        bool2 = a.c(paramParcel, i1);
        break;
      case 4: 
        k = a.f(paramParcel, i1);
        break;
      case 5: 
        bool1 = a.c(paramParcel, i1);
        break;
      case 6: 
        str2 = a.l(paramParcel, i1);
        break;
      case 7: 
        i = a.f(paramParcel, i1);
        break;
      case 8: 
        str1 = a.l(paramParcel, i1);
        break;
      case 9: 
        localz = (z)a.a(paramParcel, i1, z.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new ae.a(n, m, bool2, k, bool1, str2, i, str1, localz);
  }
  
  public ae.a[] a(int paramInt)
  {
    return new ae.a[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.e
 * JD-Core Version:    0.7.0.1
 */