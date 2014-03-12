package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.a;

public final class cw
  extends ct
{
  public final int a;
  public final Bundle c;
  public final IBinder d;
  
  public cw(cr paramcr, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramcr, Boolean.valueOf(true));
    this.a = paramInt;
    this.d = paramIBinder;
    this.c = paramBundle;
  }
  
  protected void a() {}
  
  protected void a(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return;
    }
    switch (this.a)
    {
    default: 
      if (this.c == null) {
        break;
      }
    }
    for (PendingIntent localPendingIntent = (PendingIntent)this.c.getParcelable("pendingIntent");; localPendingIntent = null)
    {
      if (cr.e(this.e) != null)
      {
        cx.a(cr.f(this.e)).b(this.e.c(), cr.e(this.e));
        cr.a(this.e, null);
      }
      cr.a(this.e, null);
      this.e.a(new a(this.a, localPendingIntent));
      return;
      try
      {
        String str = this.d.getInterfaceDescriptor();
        if (this.e.d().equals(str))
        {
          cr.a(this.e, this.e.b(this.d));
          if (cr.d(this.e) != null)
          {
            this.e.f();
            return;
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        cx.a(cr.f(this.e)).b(this.e.c(), cr.e(this.e));
        cr.a(this.e, null);
        cr.a(this.e, null);
        this.e.a(new a(8, null));
        return;
      }
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cw
 * JD-Core Version:    0.7.0.1
 */