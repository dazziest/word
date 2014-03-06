package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.a;
import com.google.android.gms.games.Player;

public abstract interface Participant
  extends Parcelable, a
{
  public abstract int b();
  
  public abstract String c();
  
  public abstract int d();
  
  public abstract boolean e();
  
  public abstract String f();
  
  public abstract Uri g();
  
  public abstract Uri h();
  
  public abstract String i();
  
  public abstract Player j();
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.Participant
 * JD-Core Version:    0.7.0.1
 */