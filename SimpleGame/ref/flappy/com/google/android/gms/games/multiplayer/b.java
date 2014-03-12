package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public final class b
  extends com.google.android.gms.common.data.b
  implements Invitation
{
  private final Game c;
  private final d d;
  private final ArrayList e;
  
  public Game b()
  {
    return this.c;
  }
  
  public String c()
  {
    return d("external_invitation_id");
  }
  
  public Participant d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long e()
  {
    return a("creation_timestamp");
  }
  
  public boolean equals(Object paramObject)
  {
    return InvitationEntity.a(this, paramObject);
  }
  
  public int f()
  {
    return b("type");
  }
  
  public int g()
  {
    return b("variant");
  }
  
  public Invitation h()
  {
    return new InvitationEntity(this);
  }
  
  public int hashCode()
  {
    return InvitationEntity.a(this);
  }
  
  public ArrayList i()
  {
    return this.e;
  }
  
  public String toString()
  {
    return InvitationEntity.b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((InvitationEntity)h()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.b
 * JD-Core Version:    0.7.0.1
 */