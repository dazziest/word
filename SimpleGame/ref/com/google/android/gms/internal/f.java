package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class f
  implements Parcelable.Creator
{
  static void a(ah.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramb.a);
    c.a(paramParcel, 2, paramb.b, false);
    c.a(paramParcel, 3, paramb.c, paramInt, false);
    c.a(paramParcel, i);
  }
  
  public ah.b a(Parcel paramParcel)
  {
    ae.a locala = null;
    int i = a.b(paramParcel);
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        str = a.l(paramParcel, k);
        break;
      case 3: 
        locala = (ae.a)a.a(paramParcel, k, ae.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new ah.b(j, str, locala);
  }
  
  public ah.b[] a(int paramInt)
  {
    return new ah.b[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.f
 * JD-Core Version:    0.7.0.1
 */