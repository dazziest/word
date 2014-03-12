package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.a;
import com.google.android.gms.games.Game;

public abstract interface Invitation
  extends Parcelable, a, e
{
  public abstract Game b();
  
  public abstract String c();
  
  public abstract Participant d();
  
  public abstract long e();
  
  public abstract int f();
  
  public abstract int g();
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.Invitation
 * JD-Core Version:    0.7.0.1
 */