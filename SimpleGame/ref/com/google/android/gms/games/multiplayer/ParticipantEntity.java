package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public final class ParticipantEntity
  extends av
  implements Participant
{
  public static final Parcelable.Creator CREATOR = new c();
  private final int a;
  private final String b;
  private final String c;
  private final Uri d;
  private final Uri e;
  private final int f;
  private final String g;
  private final boolean h;
  private final PlayerEntity i;
  private final int j;
  
  ParticipantEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, int paramInt2, String paramString3, boolean paramBoolean, PlayerEntity paramPlayerEntity, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramUri1;
    this.e = paramUri2;
    this.f = paramInt2;
    this.g = paramString3;
    this.h = paramBoolean;
    this.i = paramPlayerEntity;
    this.j = paramInt3;
  }
  
  public ParticipantEntity(Participant paramParticipant)
  {
    this.a = 1;
    this.b = paramParticipant.i();
    this.c = paramParticipant.f();
    this.d = paramParticipant.g();
    this.e = paramParticipant.h();
    this.f = paramParticipant.b();
    this.g = paramParticipant.c();
    this.h = paramParticipant.e();
    Player localPlayer = paramParticipant.j();
    if (localPlayer == null) {}
    for (PlayerEntity localPlayerEntity = null;; localPlayerEntity = new PlayerEntity(localPlayer))
    {
      this.i = localPlayerEntity;
      this.j = paramParticipant.d();
      return;
    }
  }
  
  static int a(Participant paramParticipant)
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramParticipant.j();
    arrayOfObject[1] = Integer.valueOf(paramParticipant.b());
    arrayOfObject[2] = paramParticipant.c();
    arrayOfObject[3] = Boolean.valueOf(paramParticipant.e());
    arrayOfObject[4] = paramParticipant.f();
    arrayOfObject[5] = paramParticipant.g();
    arrayOfObject[6] = paramParticipant.h();
    arrayOfObject[7] = Integer.valueOf(paramParticipant.d());
    return dl.a(arrayOfObject);
  }
  
  static boolean a(Participant paramParticipant, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Participant)) {
      bool = false;
    }
    Participant localParticipant;
    do
    {
      do
      {
        return bool;
      } while (paramParticipant == paramObject);
      localParticipant = (Participant)paramObject;
    } while ((dl.a(localParticipant.j(), paramParticipant.j())) && (dl.a(Integer.valueOf(localParticipant.b()), Integer.valueOf(paramParticipant.b()))) && (dl.a(localParticipant.c(), paramParticipant.c())) && (dl.a(Boolean.valueOf(localParticipant.e()), Boolean.valueOf(paramParticipant.e()))) && (dl.a(localParticipant.f(), paramParticipant.f())) && (dl.a(localParticipant.g(), paramParticipant.g())) && (dl.a(localParticipant.h(), paramParticipant.h())) && (dl.a(Integer.valueOf(localParticipant.d()), Integer.valueOf(paramParticipant.d()))));
    return false;
  }
  
  static String b(Participant paramParticipant)
  {
    return dl.a(paramParticipant).a("Player", paramParticipant.j()).a("Status", Integer.valueOf(paramParticipant.b())).a("ClientAddress", paramParticipant.c()).a("ConnectedToRoom", Boolean.valueOf(paramParticipant.e())).a("DisplayName", paramParticipant.f()).a("IconImage", paramParticipant.g()).a("HiResImage", paramParticipant.h()).a("Capabilities", Integer.valueOf(paramParticipant.d())).toString();
  }
  
  public int b()
  {
    return this.f;
  }
  
  public String c()
  {
    return this.g;
  }
  
  public int d()
  {
    return this.j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean e()
  {
    return this.h;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public String f()
  {
    if (this.i == null) {
      return this.c;
    }
    return this.i.c();
  }
  
  public Uri g()
  {
    if (this.i == null) {
      return this.d;
    }
    return this.i.d();
  }
  
  public Uri h()
  {
    if (this.i == null) {
      return this.e;
    }
    return this.i.e();
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public String i()
  {
    return this.b;
  }
  
  public Player j()
  {
    return this.i;
  }
  
  public int k()
  {
    return this.a;
  }
  
  public Participant l()
  {
    return this;
  }
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!v())
    {
      g.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    String str1;
    label39:
    String str2;
    label58:
    int k;
    label90:
    int m;
    if (this.d == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.e;
      str2 = null;
      if (localUri != null) {
        break label144;
      }
      paramParcel.writeString(str2);
      paramParcel.writeInt(this.f);
      paramParcel.writeString(this.g);
      if (!this.h) {
        break label156;
      }
      k = 1;
      paramParcel.writeInt(k);
      PlayerEntity localPlayerEntity = this.i;
      m = 0;
      if (localPlayerEntity != null) {
        break label162;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(m);
      if (this.i == null) {
        break;
      }
      this.i.writeToParcel(paramParcel, paramInt);
      return;
      str1 = this.d.toString();
      break label39;
      label144:
      str2 = this.e.toString();
      break label58;
      label156:
      k = 0;
      break label90;
      label162:
      m = 1;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantEntity
 * JD-Core Version:    0.7.0.1
 */