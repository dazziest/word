package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.PlayerEntity;

public class g
  implements Parcelable.Creator
{
  static void a(ParticipantEntity paramParticipantEntity, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramParticipantEntity.i(), false);
    c.a(paramParcel, 1000, paramParticipantEntity.k());
    c.a(paramParcel, 2, paramParticipantEntity.f(), false);
    c.a(paramParcel, 3, paramParticipantEntity.g(), paramInt, false);
    c.a(paramParcel, 4, paramParticipantEntity.h(), paramInt, false);
    c.a(paramParcel, 5, paramParticipantEntity.b());
    c.a(paramParcel, 6, paramParticipantEntity.c(), false);
    c.a(paramParcel, 7, paramParticipantEntity.e());
    c.a(paramParcel, 8, paramParticipantEntity.j(), paramInt, false);
    c.a(paramParcel, 9, paramParticipantEntity.d());
    c.a(paramParcel, i);
  }
  
  public ParticipantEntity a(Parcel paramParcel)
  {
    int i = 0;
    PlayerEntity localPlayerEntity = null;
    int j = a.b(paramParcel);
    boolean bool = false;
    String str1 = null;
    int k = 0;
    Uri localUri1 = null;
    Uri localUri2 = null;
    String str2 = null;
    String str3 = null;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        str3 = a.l(paramParcel, n);
        break;
      case 1000: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        str2 = a.l(paramParcel, n);
        break;
      case 3: 
        localUri2 = (Uri)a.a(paramParcel, n, Uri.CREATOR);
        break;
      case 4: 
        localUri1 = (Uri)a.a(paramParcel, n, Uri.CREATOR);
        break;
      case 5: 
        k = a.f(paramParcel, n);
        break;
      case 6: 
        str1 = a.l(paramParcel, n);
        break;
      case 7: 
        bool = a.c(paramParcel, n);
        break;
      case 8: 
        localPlayerEntity = (PlayerEntity)a.a(paramParcel, n, PlayerEntity.CREATOR);
        break;
      case 9: 
        i = a.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new b("Overread allowed size end=" + j, paramParcel);
    }
    return new ParticipantEntity(m, str3, str2, localUri2, localUri1, k, str1, bool, localPlayerEntity, i);
  }
  
  public ParticipantEntity[] a(int paramInt)
  {
    return new ParticipantEntity[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.g
 * JD-Core Version:    0.7.0.1
 */