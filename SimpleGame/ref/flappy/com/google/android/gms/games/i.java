package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class i
  implements Parcelable.Creator
{
  static void a(PlayerEntity paramPlayerEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramPlayerEntity.b(), false);
    c.a(paramParcel, 1000, paramPlayerEntity.g());
    c.a(paramParcel, 2, paramPlayerEntity.c(), false);
    c.a(paramParcel, 3, paramPlayerEntity.d(), paramInt, false);
    c.a(paramParcel, 4, paramPlayerEntity.e(), paramInt, false);
    c.a(paramParcel, 5, paramPlayerEntity.f());
    c.a(paramParcel, i);
  }
  
  public PlayerEntity a(Parcel paramParcel)
  {
    Uri localUri1 = null;
    int i = a.b(paramParcel);
    int j = 0;
    long l = 0L;
    Uri localUri2 = null;
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str2 = a.l(paramParcel, k);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        str1 = a.l(paramParcel, k);
        break;
      case 3: 
        localUri2 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 4: 
        localUri1 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 5: 
        l = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new b("Overread allowed size end=" + i, paramParcel);
    }
    return new PlayerEntity(j, str2, str1, localUri2, localUri1, l);
  }
  
  public PlayerEntity[] a(int paramInt)
  {
    return new PlayerEntity[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.i
 * JD-Core Version:    0.7.0.1
 */