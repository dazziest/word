package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import java.util.ArrayList;

public abstract class cr
  implements b
{
  public static final String[] e = { "service_esmobile", "service_googleme" };
  final Handler a;
  final ArrayList b = new ArrayList();
  boolean c = false;
  boolean d = false;
  private final Context f;
  private IInterface g;
  private ArrayList h;
  private boolean i = false;
  private ArrayList j;
  private boolean k = false;
  private final ArrayList l = new ArrayList();
  private cv m;
  private final String[] n;
  private final Object o = new Object();
  
  protected cr(Context paramContext, c paramc, d paramd, String... paramVarArgs)
  {
    this.f = ((Context)do.a(paramContext));
    this.h = new ArrayList();
    this.h.add(do.a(paramc));
    this.j = new ArrayList();
    this.j.add(do.a(paramd));
    this.a = new cs(this, paramContext.getMainLooper());
    a(paramVarArgs);
    this.n = paramVarArgs;
  }
  
  public void a()
  {
    this.c = true;
    do
    {
      synchronized (this.o)
      {
        this.d = true;
        int i1 = f.a(this.f);
        if (i1 != 0)
        {
          this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(i1)));
          return;
        }
      }
      if (this.m != null)
      {
        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
        this.g = null;
        cx.a(this.f).b(c(), this.m);
      }
      this.m = new cv(this);
    } while (cx.a(this.f).a(c(), this.m));
    Log.e("GmsClient", "unable to connect to service: " + c());
    this.a.sendMessage(this.a.obtainMessage(3, Integer.valueOf(9)));
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    this.a.sendMessage(this.a.obtainMessage(1, new cw(this, paramInt, paramIBinder, paramBundle)));
  }
  
  protected void a(a parama)
  {
    this.a.removeMessages(4);
    for (;;)
    {
      int i2;
      synchronized (this.j)
      {
        this.k = true;
        ArrayList localArrayList2 = this.j;
        int i1 = localArrayList2.size();
        i2 = 0;
        if (i2 < i1)
        {
          if (!this.c) {
            return;
          }
          if (this.j.contains(localArrayList2.get(i2))) {
            ((d)localArrayList2.get(i2)).a(parama);
          }
        }
        else
        {
          this.k = false;
          return;
        }
      }
      i2++;
    }
  }
  
  public final void a(ct paramct)
  {
    synchronized (this.l)
    {
      this.l.add(paramct);
      this.a.sendMessage(this.a.obtainMessage(2, paramct));
      return;
    }
  }
  
  protected abstract void a(df paramdf, cu paramcu);
  
  protected void a(String... paramVarArgs) {}
  
  protected abstract IInterface b(IBinder paramIBinder);
  
  public void b()
  {
    this.c = false;
    synchronized (this.o)
    {
      this.d = false;
    }
    synchronized (this.l)
    {
      int i1 = this.l.size();
      int i2 = 0;
      while (i2 < i1)
      {
        ((ct)this.l.get(i2)).d();
        i2++;
        continue;
        localObject2 = finally;
        throw localObject2;
      }
      this.l.clear();
      this.g = null;
      if (this.m != null)
      {
        cx.a(this.f).b(c(), this.m);
        this.m = null;
      }
      return;
    }
  }
  
  protected abstract String c();
  
  protected final void c(IBinder paramIBinder)
  {
    try
    {
      a(dg.a(paramIBinder), new cu(this));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("GmsClient", "service died");
    }
  }
  
  protected abstract String d();
  
  protected Bundle e()
  {
    return null;
  }
  
  protected void f()
  {
    boolean bool1 = true;
    for (;;)
    {
      int i2;
      synchronized (this.h)
      {
        if (!this.i)
        {
          bool2 = bool1;
          do.a(bool2);
          this.a.removeMessages(4);
          this.i = true;
          if (this.b.size() != 0) {
            break label165;
          }
          do.a(bool1);
          Bundle localBundle = e();
          ArrayList localArrayList2 = this.h;
          int i1 = localArrayList2.size();
          i2 = 0;
          if ((i2 >= i1) || (!this.c) || (!h()))
          {
            this.b.clear();
            this.i = false;
            return;
          }
          this.b.size();
          if (this.b.contains(localArrayList2.get(i2))) {
            break label170;
          }
          ((c)localArrayList2.get(i2)).a(localBundle);
        }
      }
      boolean bool2 = false;
      continue;
      label165:
      bool1 = false;
      continue;
      label170:
      i2++;
    }
  }
  
  public boolean h()
  {
    return this.g != null;
  }
  
  public boolean i()
  {
    synchronized (this.o)
    {
      boolean bool = this.d;
      return bool;
    }
  }
  
  public final Context j()
  {
    return this.f;
  }
  
  public final String[] k()
  {
    return this.n;
  }
  
  protected final void l()
  {
    this.a.removeMessages(4);
    for (;;)
    {
      int i2;
      synchronized (this.h)
      {
        this.i = true;
        ArrayList localArrayList2 = this.h;
        int i1 = localArrayList2.size();
        i2 = 0;
        if ((i2 >= i1) || (!this.c))
        {
          this.i = false;
          return;
        }
        if (this.h.contains(localArrayList2.get(i2))) {
          ((c)localArrayList2.get(i2)).a();
        }
      }
      i2++;
    }
  }
  
  protected final void m()
  {
    if (!h()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  protected final IInterface n()
  {
    m();
    return this.g;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cr
 * JD-Core Version:    0.7.0.1
 */