package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import java.util.ArrayList;

public final class InvitationEntity
  extends av
  implements Invitation
{
  public static final Parcelable.Creator CREATOR = new a();
  private final int a;
  private final GameEntity b;
  private final String c;
  private final long d;
  private final int e;
  private final ParticipantEntity f;
  private final ArrayList g;
  private final int h;
  
  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList paramArrayList, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramGameEntity;
    this.c = paramString;
    this.d = paramLong;
    this.e = paramInt2;
    this.f = paramParticipantEntity;
    this.g = paramArrayList;
    this.h = paramInt3;
  }
  
  InvitationEntity(Invitation paramInvitation)
  {
    this.a = 1;
    this.b = new GameEntity(paramInvitation.b());
    this.c = paramInvitation.c();
    this.d = paramInvitation.e();
    this.e = paramInvitation.f();
    this.h = paramInvitation.g();
    String str = paramInvitation.d().i();
    Object localObject = null;
    ArrayList localArrayList = paramInvitation.i();
    int i = localArrayList.size();
    this.g = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      Participant localParticipant = (Participant)localArrayList.get(j);
      if (localParticipant.i().equals(str)) {
        localObject = localParticipant;
      }
      this.g.add((ParticipantEntity)localParticipant.a());
    }
    do.a(localObject, "Must have a valid inviter!");
    this.f = ((ParticipantEntity)localObject.a());
  }
  
  static int a(Invitation paramInvitation)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramInvitation.b();
    arrayOfObject[1] = paramInvitation.c();
    arrayOfObject[2] = Long.valueOf(paramInvitation.e());
    arrayOfObject[3] = Integer.valueOf(paramInvitation.f());
    arrayOfObject[4] = paramInvitation.d();
    arrayOfObject[5] = paramInvitation.i();
    arrayOfObject[6] = Integer.valueOf(paramInvitation.g());
    return dl.a(arrayOfObject);
  }
  
  static boolean a(Invitation paramInvitation, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Invitation)) {
      bool = false;
    }
    Invitation localInvitation;
    do
    {
      do
      {
        return bool;
      } while (paramInvitation == paramObject);
      localInvitation = (Invitation)paramObject;
    } while ((dl.a(localInvitation.b(), paramInvitation.b())) && (dl.a(localInvitation.c(), paramInvitation.c())) && (dl.a(Long.valueOf(localInvitation.e()), Long.valueOf(paramInvitation.e()))) && (dl.a(Integer.valueOf(localInvitation.f()), Integer.valueOf(paramInvitation.f()))) && (dl.a(localInvitation.d(), paramInvitation.d())) && (dl.a(localInvitation.i(), paramInvitation.i())) && (dl.a(Integer.valueOf(localInvitation.g()), Integer.valueOf(paramInvitation.g()))));
    return false;
  }
  
  static String b(Invitation paramInvitation)
  {
    return dl.a(paramInvitation).a("Game", paramInvitation.b()).a("InvitationId", paramInvitation.c()).a("CreationTimestamp", Long.valueOf(paramInvitation.e())).a("InvitationType", Integer.valueOf(paramInvitation.f())).a("Inviter", paramInvitation.d()).a("Participants", paramInvitation.i()).a("Variant", Integer.valueOf(paramInvitation.g())).toString();
  }
  
  public Game b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public Participant d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long e()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public int f()
  {
    return this.e;
  }
  
  public int g()
  {
    return this.h;
  }
  
  public int h()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public ArrayList i()
  {
    return new ArrayList(this.g);
  }
  
  public Invitation j()
  {
    return this;
  }
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!v()) {
      f.a(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      this.b.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.c);
      paramParcel.writeLong(this.d);
      paramParcel.writeInt(this.e);
      this.f.writeToParcel(paramParcel, paramInt);
      int i = this.g.size();
      paramParcel.writeInt(i);
      for (int j = 0; j < i; j++) {
        ((ParticipantEntity)this.g.get(j)).writeToParcel(paramParcel, paramInt);
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationEntity
 * JD-Core Version:    0.7.0.1
 */