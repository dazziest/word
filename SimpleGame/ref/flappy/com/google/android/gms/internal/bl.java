package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class bl
  implements Parcelable.Creator
{
  static void a(cc paramcc, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    Set localSet = paramcc.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.a(paramParcel, 1, paramcc.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, paramcc.g(), true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      c.a(paramParcel, 3, paramcc.h(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      c.a(paramParcel, 4, paramcc.i(), true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      c.a(paramParcel, 5, paramcc.j(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      c.a(paramParcel, 6, paramcc.k());
    }
    if (localSet.contains(Integer.valueOf(7))) {
      c.a(paramParcel, 7, paramcc.l(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(8))) {
      c.a(paramParcel, 8, paramcc.m(), true);
    }
    if (localSet.contains(Integer.valueOf(9))) {
      c.a(paramParcel, 9, paramcc.n(), true);
    }
    if (localSet.contains(Integer.valueOf(12))) {
      c.a(paramParcel, 12, paramcc.o());
    }
    if (localSet.contains(Integer.valueOf(14))) {
      c.a(paramParcel, 14, paramcc.p(), true);
    }
    if (localSet.contains(Integer.valueOf(15))) {
      c.a(paramParcel, 15, paramcc.q(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(16))) {
      c.a(paramParcel, 16, paramcc.r());
    }
    if (localSet.contains(Integer.valueOf(19))) {
      c.a(paramParcel, 19, paramcc.t(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(18))) {
      c.a(paramParcel, 18, paramcc.s(), true);
    }
    if (localSet.contains(Integer.valueOf(21))) {
      c.a(paramParcel, 21, paramcc.v());
    }
    if (localSet.contains(Integer.valueOf(20))) {
      c.a(paramParcel, 20, paramcc.u(), true);
    }
    if (localSet.contains(Integer.valueOf(23))) {
      c.b(paramParcel, 23, paramcc.x(), true);
    }
    if (localSet.contains(Integer.valueOf(22))) {
      c.b(paramParcel, 22, paramcc.w(), true);
    }
    if (localSet.contains(Integer.valueOf(25))) {
      c.a(paramParcel, 25, paramcc.z());
    }
    if (localSet.contains(Integer.valueOf(24))) {
      c.a(paramParcel, 24, paramcc.y());
    }
    if (localSet.contains(Integer.valueOf(27))) {
      c.a(paramParcel, 27, paramcc.B(), true);
    }
    if (localSet.contains(Integer.valueOf(26))) {
      c.a(paramParcel, 26, paramcc.A(), true);
    }
    if (localSet.contains(Integer.valueOf(29))) {
      c.a(paramParcel, 29, paramcc.D());
    }
    if (localSet.contains(Integer.valueOf(28))) {
      c.b(paramParcel, 28, paramcc.C(), true);
    }
    c.a(paramParcel, i);
  }
  
  public cc a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str1 = null;
    Object localObject1 = null;
    String str2 = null;
    String str3 = null;
    int k = 0;
    Object localObject2 = null;
    String str4 = null;
    String str5 = null;
    int m = 0;
    String str6 = null;
    Object localObject3 = null;
    boolean bool1 = false;
    String str7 = null;
    Object localObject4 = null;
    String str8 = null;
    int n = 0;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    int i1 = 0;
    int i2 = 0;
    String str9 = null;
    String str10 = null;
    ArrayList localArrayList3 = null;
    boolean bool2 = false;
    while (paramParcel.dataPosition() < i)
    {
      int i3 = a.a(paramParcel);
      switch (a.a(i3))
      {
      case 10: 
      case 11: 
      case 13: 
      case 17: 
      default: 
        a.b(paramParcel, i3);
        break;
      case 1: 
        j = a.f(paramParcel, i3);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        str1 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        cc.a locala = (cc.a)a.a(paramParcel, i3, cc.a.CREATOR);
        localHashSet.add(Integer.valueOf(3));
        localObject1 = locala;
        break;
      case 4: 
        str2 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5: 
        str3 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        k = a.f(paramParcel, i3);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7: 
        cc.b localb = (cc.b)a.a(paramParcel, i3, cc.b.CREATOR);
        localHashSet.add(Integer.valueOf(7));
        localObject2 = localb;
        break;
      case 8: 
        str4 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(8));
        break;
      case 9: 
        str5 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(9));
        break;
      case 12: 
        m = a.f(paramParcel, i3);
        localHashSet.add(Integer.valueOf(12));
        break;
      case 14: 
        str6 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(14));
        break;
      case 15: 
        cc.c localc = (cc.c)a.a(paramParcel, i3, cc.c.CREATOR);
        localHashSet.add(Integer.valueOf(15));
        localObject3 = localc;
        break;
      case 16: 
        bool1 = a.c(paramParcel, i3);
        localHashSet.add(Integer.valueOf(16));
        break;
      case 19: 
        cc.d locald = (cc.d)a.a(paramParcel, i3, cc.d.CREATOR);
        localHashSet.add(Integer.valueOf(19));
        localObject4 = locald;
        break;
      case 18: 
        str7 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(18));
        break;
      case 21: 
        n = a.f(paramParcel, i3);
        localHashSet.add(Integer.valueOf(21));
        break;
      case 20: 
        str8 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(20));
        break;
      case 23: 
        localArrayList2 = a.c(paramParcel, i3, cc.g.CREATOR);
        localHashSet.add(Integer.valueOf(23));
        break;
      case 22: 
        localArrayList1 = a.c(paramParcel, i3, cc.f.CREATOR);
        localHashSet.add(Integer.valueOf(22));
        break;
      case 25: 
        i2 = a.f(paramParcel, i3);
        localHashSet.add(Integer.valueOf(25));
        break;
      case 24: 
        i1 = a.f(paramParcel, i3);
        localHashSet.add(Integer.valueOf(24));
        break;
      case 27: 
        str10 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(27));
        break;
      case 26: 
        str9 = a.l(paramParcel, i3);
        localHashSet.add(Integer.valueOf(26));
        break;
      case 29: 
        bool2 = a.c(paramParcel, i3);
        localHashSet.add(Integer.valueOf(29));
        break;
      case 28: 
        localArrayList3 = a.c(paramParcel, i3, cc.h.CREATOR);
        localHashSet.add(Integer.valueOf(28));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new cc(localHashSet, j, str1, localObject1, str2, str3, k, localObject2, str4, str5, m, str6, localObject3, bool1, str7, localObject4, str8, n, localArrayList1, localArrayList2, i1, i2, str9, str10, localArrayList3, bool2);
  }
  
  public cc[] a(int paramInt)
  {
    return new cc[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bl
 * JD-Core Version:    0.7.0.1
 */