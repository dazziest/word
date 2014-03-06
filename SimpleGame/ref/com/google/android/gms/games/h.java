package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class h
  implements Parcelable.Creator
{
  static void a(GameEntity paramGameEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramGameEntity.b(), false);
    c.a(paramParcel, 2, paramGameEntity.c(), false);
    c.a(paramParcel, 3, paramGameEntity.d(), false);
    c.a(paramParcel, 4, paramGameEntity.e(), false);
    c.a(paramParcel, 5, paramGameEntity.f(), false);
    c.a(paramParcel, 6, paramGameEntity.g(), false);
    c.a(paramParcel, 7, paramGameEntity.h(), paramInt, false);
    c.a(paramParcel, 8, paramGameEntity.i(), paramInt, false);
    c.a(paramParcel, 9, paramGameEntity.j(), paramInt, false);
    c.a(paramParcel, 10, paramGameEntity.k());
    c.a(paramParcel, 11, paramGameEntity.l());
    c.a(paramParcel, 12, paramGameEntity.m(), false);
    c.a(paramParcel, 13, paramGameEntity.n());
    c.a(paramParcel, 14, paramGameEntity.o());
    c.a(paramParcel, 15, paramGameEntity.p());
    c.a(paramParcel, 1000, paramGameEntity.q());
    c.a(paramParcel, i);
  }
  
  public GameEntity a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    Uri localUri1 = null;
    Uri localUri2 = null;
    Uri localUri3 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    String str7 = null;
    int k = 0;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        str1 = a.l(paramParcel, i1);
        break;
      case 2: 
        str2 = a.l(paramParcel, i1);
        break;
      case 3: 
        str3 = a.l(paramParcel, i1);
        break;
      case 4: 
        str4 = a.l(paramParcel, i1);
        break;
      case 5: 
        str5 = a.l(paramParcel, i1);
        break;
      case 6: 
        str6 = a.l(paramParcel, i1);
        break;
      case 7: 
        localUri1 = (Uri)a.a(paramParcel, i1, Uri.CREATOR);
        break;
      case 8: 
        localUri2 = (Uri)a.a(paramParcel, i1, Uri.CREATOR);
        break;
      case 9: 
        localUri3 = (Uri)a.a(paramParcel, i1, Uri.CREATOR);
        break;
      case 10: 
        bool1 = a.c(paramParcel, i1);
        break;
      case 11: 
        bool2 = a.c(paramParcel, i1);
        break;
      case 12: 
        str7 = a.l(paramParcel, i1);
        break;
      case 13: 
        k = a.f(paramParcel, i1);
        break;
      case 14: 
        m = a.f(paramParcel, i1);
        break;
      case 15: 
        n = a.f(paramParcel, i1);
        break;
      case 1000: 
        j = a.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new GameEntity(j, str1, str2, str3, str4, str5, str6, localUri1, localUri2, localUri3, bool1, bool2, str7, k, m, n);
  }
  
  public GameEntity[] a(int paramInt)
  {
    return new GameEntity[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.h
 * JD-Core Version:    0.7.0.1
 */