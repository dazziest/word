package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

public final class cx
  implements Handler.Callback
{
  private static final Object a = new Object();
  private static cx b;
  private final Context c;
  private final HashMap d = new HashMap();
  private final Handler e = new Handler(paramContext.getMainLooper(), this);
  
  private cx(Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
  }
  
  public static cx a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new cx(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  public boolean a(String paramString, cv paramcv)
  {
    for (;;)
    {
      cy localcy;
      synchronized (this.d)
      {
        localcy = (cy)this.d.get(paramString);
        if (localcy == null)
        {
          localcy = new cy(this, paramString);
          localcy.a(paramcv);
          Intent localIntent1 = new Intent(paramString).setPackage("com.google.android.gms");
          localcy.a(this.c.bindService(localIntent1, localcy.a(), 129));
          this.d.put(paramString, localcy);
          boolean bool = localcy.c();
          return bool;
        }
        this.e.removeMessages(0, localcy);
        if (localcy.c(paramcv)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + paramString);
        }
      }
      localcy.a(paramcv);
      switch (localcy.d())
      {
      case 1: 
        paramcv.onServiceConnected(localcy.g(), localcy.f());
        break;
      case 2: 
        Intent localIntent2 = new Intent(paramString).setPackage("com.google.android.gms");
        localcy.a(this.c.bindService(localIntent2, localcy.a(), 129));
      }
    }
  }
  
  public void b(String paramString, cv paramcv)
  {
    cy localcy;
    synchronized (this.d)
    {
      localcy = (cy)this.d.get(paramString);
      if (localcy == null) {
        throw new IllegalStateException("Nonexistent connection status for service action: " + paramString);
      }
    }
    if (!localcy.c(paramcv)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + paramString);
    }
    localcy.b(paramcv);
    if (localcy.e())
    {
      Message localMessage = this.e.obtainMessage(0, localcy);
      this.e.sendMessageDelayed(localMessage, 5000L);
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    cy localcy = (cy)paramMessage.obj;
    synchronized (this.d)
    {
      if (localcy.e())
      {
        this.c.unbindService(localcy.a());
        this.d.remove(localcy.b());
      }
      return true;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cx
 * JD-Core Version:    0.7.0.1
 */