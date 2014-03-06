package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public class bg
  implements Parcelable.Creator
{
  static void a(bv parambv, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, parambv.b(), false);
    c.a(paramParcel, 1000, parambv.a());
    c.b(paramParcel, 2, parambv.c(), false);
    c.b(paramParcel, 3, parambv.d(), false);
    c.a(paramParcel, 4, parambv.e());
    c.a(paramParcel, i);
  }
  
  public bv a(Parcel paramParcel)
  {
    boolean bool = false;
    ArrayList localArrayList1 = null;
    int i = a.b(paramParcel);
    ArrayList localArrayList2 = null;
    String str = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str = a.l(paramParcel, k);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        localArrayList2 = a.c(paramParcel, k, x.CREATOR);
        break;
      case 3: 
        localArrayList1 = a.c(paramParcel, k, x.CREATOR);
        break;
      case 4: 
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new bv(j, str, localArrayList2, localArrayList1, bool);
  }
  
  public bv[] a(int paramInt)
  {
    return new bv[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bg
 * JD-Core Version:    0.7.0.1
 */