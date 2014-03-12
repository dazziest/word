package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

public class by
  implements Parcelable.Creator
{
  static void a(cq paramcq, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1000, paramcq.f());
    c.b(paramParcel, 2, paramcq.a(), false);
    c.b(paramParcel, 3, paramcq.b(), false);
    c.a(paramParcel, 4, paramcq.c(), false);
    c.a(paramParcel, 5, paramcq.d());
    c.a(paramParcel, 6, paramcq.e());
    c.a(paramParcel, i);
  }
  
  public cq a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    int i = 0;
    int j = a.b(paramParcel);
    boolean bool = false;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1000: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        localArrayList2 = a.c(paramParcel, m, x.CREATOR);
        break;
      case 3: 
        localArrayList1 = a.c(paramParcel, m, x.CREATOR);
        break;
      case 4: 
        localBundle = a.n(paramParcel, m);
        break;
      case 5: 
        bool = a.c(paramParcel, m);
        break;
      case 6: 
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new cq(k, localArrayList2, localArrayList1, localBundle, bool, i);
  }
  
  public cq[] a(int paramInt)
  {
    return new cq[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.by
 * JD-Core Version:    0.7.0.1
 */