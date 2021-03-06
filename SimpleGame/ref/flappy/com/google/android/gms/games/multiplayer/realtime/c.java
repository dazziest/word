package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

public final class c
  extends com.google.android.gms.common.data.b
  implements Room
{
  private final int c;
  
  public String b()
  {
    return d("external_match_id");
  }
  
  public String c()
  {
    return d("creator_external");
  }
  
  public long d()
  {
    return a("creation_timestamp");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int e()
  {
    return b("status");
  }
  
  public boolean equals(Object paramObject)
  {
    return RoomEntity.a(this, paramObject);
  }
  
  public String f()
  {
    return d("description");
  }
  
  public int g()
  {
    return b("variant");
  }
  
  public Bundle h()
  {
    if (!c("has_automatch_criteria")) {
      return null;
    }
    return b.a(b("automatch_min_players"), b("automatch_max_players"), a("automatch_bit_mask"));
  }
  
  public int hashCode()
  {
    return RoomEntity.a(this);
  }
  
  public ArrayList i()
  {
    ArrayList localArrayList = new ArrayList(this.c);
    for (int i = 0; i < this.c; i++) {
      localArrayList.add(new d(this.a, i + this.b));
    }
    return localArrayList;
  }
  
  public int j()
  {
    return b("automatch_wait_estimate_sec");
  }
  
  public Room k()
  {
    return new RoomEntity(this);
  }
  
  public String toString()
  {
    return RoomEntity.b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((RoomEntity)k()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.c
 * JD-Core Version:    0.7.0.1
 */