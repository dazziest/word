package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class al
{
  public IBinder a;
  public int b;
  public int c = -1;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public int g = 0;
  
  private al(int paramInt, IBinder paramIBinder)
  {
    this.b = paramInt;
    this.a = paramIBinder;
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("popupLocationInfo.gravity", this.b);
    localBundle.putInt("popupLocationInfo.displayId", this.c);
    localBundle.putInt("popupLocationInfo.left", this.d);
    localBundle.putInt("popupLocationInfo.top", this.e);
    localBundle.putInt("popupLocationInfo.right", this.f);
    localBundle.putInt("popupLocationInfo.bottom", this.g);
    return localBundle;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.al
 * JD-Core Version:    0.7.0.1
 */