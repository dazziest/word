package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

public class bk
  implements Parcelable.Creator
{
  static void a(bz parambz, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    Set localSet = parambz.e();
    if (localSet.contains(Integer.valueOf(1))) {
      c.a(paramParcel, 1, parambz.f());
    }
    if (localSet.contains(Integer.valueOf(2))) {
      c.a(paramParcel, 2, parambz.g(), true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      c.a(paramParcel, 4, parambz.h(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      c.a(paramParcel, 5, parambz.i(), true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      c.a(paramParcel, 6, parambz.j(), paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      c.a(paramParcel, 7, parambz.k(), true);
    }
    c.a(paramParcel, i);
  }
  
  public bz a(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.b(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    Object localObject1 = null;
    String str2 = null;
    Object localObject2 = null;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      case 3: 
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        j = a.f(paramParcel, k);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        str3 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 4: 
        bx localbx2 = (bx)a.a(paramParcel, k, bx.CREATOR);
        localHashSet.add(Integer.valueOf(4));
        localObject2 = localbx2;
        break;
      case 5: 
        str2 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        bx localbx1 = (bx)a.a(paramParcel, k, bx.CREATOR);
        localHashSet.add(Integer.valueOf(6));
        localObject1 = localbx1;
        break;
      case 7: 
        str1 = a.l(paramParcel, k);
        localHashSet.add(Integer.valueOf(7));
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new bz(localHashSet, j, str3, localObject2, str2, localObject1, str1);
  }
  
  public bz[] a(int paramInt)
  {
    return new bz[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bk
 * JD-Core Version:    0.7.0.1
 */