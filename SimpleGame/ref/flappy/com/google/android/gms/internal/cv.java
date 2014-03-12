package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class cv
  implements ServiceConnection
{
  cv(cr paramcr) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.c(paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    cr.a(this.a, null);
    this.a.l();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cv
 * JD-Core Version:    0.7.0.1
 */