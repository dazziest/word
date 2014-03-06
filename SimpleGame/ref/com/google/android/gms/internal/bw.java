package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public class bw
  implements Parcelable.Creator
{
  static void a(co paramco, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramco.g(), false);
    c.a(paramParcel, 1000, paramco.k());
    c.b(paramParcel, 2, paramco.a(), false);
    c.b(paramParcel, 3, paramco.b(), false);
    c.a(paramParcel, 4, paramco.c(), paramInt, false);
    c.a(paramParcel, 5, paramco.d(), false);
    c.a(paramParcel, 6, paramco.e(), false);
    c.a(paramParcel, 7, paramco.f(), false);
    c.a(paramParcel, 8, paramco.h(), false);
    c.a(paramParcel, 9, paramco.i(), false);
    c.a(paramParcel, 10, paramco.j());
    c.a(paramParcel, i);
  }
  
  public co a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle1 = null;
    int j = a.b(paramParcel);
    Bundle localBundle2 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    Uri localUri = null;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    String str4 = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str4 = a.l(paramParcel, m);
        break;
      case 1000: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        localArrayList2 = a.c(paramParcel, m, x.CREATOR);
        break;
      case 3: 
        localArrayList1 = a.c(paramParcel, m, Uri.CREATOR);
        break;
      case 4: 
        localUri = (Uri)a.a(paramParcel, m, Uri.CREATOR);
        break;
      case 5: 
        str3 = a.l(paramParcel, m);
        break;
      case 6: 
        str2 = a.l(paramParcel, m);
        break;
      case 7: 
        str1 = a.l(paramParcel, m);
        break;
      case 8: 
        localBundle2 = a.n(paramParcel, m);
        break;
      case 9: 
        localBundle1 = a.n(paramParcel, m);
        break;
      case 10: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new co(k, str4, localArrayList2, localArrayList1, localUri, str3, str2, str1, localBundle2, localBundle1, i);
  }
  
  public co[] a(int paramInt)
  {
    return new co[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bw
 * JD-Core Version:    0.7.0.1
 */