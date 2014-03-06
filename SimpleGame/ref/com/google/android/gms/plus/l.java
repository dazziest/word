package com.google.android.gms.plus;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class l
  implements Parcelable.Creator
{
  static void a(a parama, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, parama.b(), false);
    c.a(paramParcel, 1000, parama.a());
    c.a(paramParcel, 2, parama.c(), false);
    c.a(paramParcel, 3, parama.d(), false);
    c.a(paramParcel, 4, parama.e(), false);
    c.a(paramParcel, 5, parama.f(), false);
    c.a(paramParcel, 6, parama.g(), false);
    c.a(paramParcel, 7, parama.h(), false);
    c.a(paramParcel, i);
  }
  
  public a a(Parcel paramParcel)
  {
    String str1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.a.b(paramParcel);
    int j = 0;
    String str2 = null;
    String str3 = null;
    String[] arrayOfString1 = null;
    String[] arrayOfString2 = null;
    String[] arrayOfString3 = null;
    String str4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.a(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1: 
        str4 = com.google.android.gms.common.internal.safeparcel.a.l(paramParcel, k);
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.a.f(paramParcel, k);
        break;
      case 2: 
        arrayOfString3 = com.google.android.gms.common.internal.safeparcel.a.w(paramParcel, k);
        break;
      case 3: 
        arrayOfString2 = com.google.android.gms.common.internal.safeparcel.a.w(paramParcel, k);
        break;
      case 4: 
        arrayOfString1 = com.google.android.gms.common.internal.safeparcel.a.w(paramParcel, k);
        break;
      case 5: 
        str3 = com.google.android.gms.common.internal.safeparcel.a.l(paramParcel, k);
        break;
      case 6: 
        str2 = com.google.android.gms.common.internal.safeparcel.a.l(paramParcel, k);
        break;
      case 7: 
        str1 = com.google.android.gms.common.internal.safeparcel.a.l(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new a(j, str4, arrayOfString3, arrayOfString2, arrayOfString1, str3, str2, str1);
  }
  
  public a[] a(int paramInt)
  {
    return new a[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.l
 * JD-Core Version:    0.7.0.1
 */