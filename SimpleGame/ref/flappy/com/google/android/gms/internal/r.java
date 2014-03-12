package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.games.PlayerEntity;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class r
  extends cr
{
  private final String f;
  private final String g;
  private final Map h;
  private PlayerEntity i;
  private final ai j;
  private boolean k = false;
  private final Binder l;
  private final long m;
  private final boolean n;
  
  public r(Context paramContext, String paramString1, String paramString2, c paramc, d paramd, String[] paramArrayOfString, int paramInt, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramc, paramd, paramArrayOfString);
    this.f = paramString1;
    this.g = ((String)do.a(paramString2));
    this.l = new Binder();
    this.h = new HashMap();
    this.j = ai.a(this, paramInt);
    a(paramView);
    this.m = hashCode();
    this.n = paramBoolean;
  }
  
  private void o()
  {
    this.i = null;
  }
  
  private void p()
  {
    Iterator localIterator = this.h.values().iterator();
    while (localIterator.hasNext())
    {
      an localan = (an)localIterator.next();
      try
      {
        localan.a();
      }
      catch (IOException localIOException)
      {
        w.a("GamesClient", "IOException:", localIOException);
      }
    }
    this.h.clear();
  }
  
  public Intent a(String paramString)
  {
    m();
    Intent localIntent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
    localIntent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", paramString);
    localIntent.addFlags(67108864);
    return v.a(localIntent);
  }
  
  protected ad a(IBinder paramIBinder)
  {
    return af.a(paramIBinder);
  }
  
  public void a()
  {
    o();
    super.a();
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null)) {
      this.k = paramBundle.getBoolean("show_welcome_popup");
    }
    super.a(paramInt, paramIBinder, paramBundle);
  }
  
  public void a(IBinder paramIBinder, Bundle paramBundle)
  {
    if (h()) {}
    try
    {
      ((ad)n()).a(paramIBinder, paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      w.a("GamesClient", "service died");
    }
  }
  
  public void a(View paramView)
  {
    this.j.a(paramView);
  }
  
  protected void a(com.google.android.gms.common.a parama)
  {
    super.a(parama);
    this.k = false;
  }
  
  public void a(com.google.android.gms.games.a.a parama, String paramString, long paramLong)
  {
    if (parama == null) {}
    for (Object localObject = null;; localObject = locals)
    {
      try
      {
        ((ad)n()).a((y)localObject, paramString, paramLong);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        s locals;
        w.a("GamesClient", "service died");
      }
      locals = new s(this, parama);
    }
  }
  
  protected void a(df paramdf, cu paramcu)
  {
    String str = j().getResources().getConfiguration().locale.toString();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.n);
    paramdf.a(paramcu, 3265100, j().getPackageName(), this.g, k(), this.f, this.j.b(), str, localBundle);
  }
  
  protected void a(String... paramVarArgs)
  {
    int i1 = 0;
    int i2 = 0;
    boolean bool1 = false;
    if (i1 < paramVarArgs.length)
    {
      String str = paramVarArgs[i1];
      if (str.equals("https://www.googleapis.com/auth/games")) {
        bool1 = true;
      }
      for (;;)
      {
        i1++;
        break;
        if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
          i2 = 1;
        }
      }
    }
    if (i2 != 0)
    {
      if (!bool1) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        do.a(bool2, String.format("Cannot have both %s and %s!", new Object[] { "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty" }));
        return;
      }
    }
    do.a(bool1, String.format("GamesClient requires %s to function.", new Object[] { "https://www.googleapis.com/auth/games" }));
  }
  
  public void b()
  {
    this.k = false;
    if (h()) {}
    try
    {
      ad localad = (ad)n();
      localad.c();
      localad.b(this.m);
      localad.a(this.m);
      p();
      super.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.a("GamesClient", "Failed to notify client disconnect.");
      }
    }
  }
  
  protected String c()
  {
    return "com.google.android.gms.games.service.START";
  }
  
  protected String d()
  {
    return "com.google.android.gms.games.internal.IGamesService";
  }
  
  protected Bundle e()
  {
    try
    {
      Bundle localBundle = ((ad)n()).b();
      if (localBundle != null) {
        localBundle.setClassLoader(r.class.getClassLoader());
      }
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      w.a("GamesClient", "service died");
    }
    return null;
  }
  
  protected void f()
  {
    super.f();
    if (this.k)
    {
      this.j.a();
      this.k = false;
    }
  }
  
  public void g()
  {
    if (h()) {}
    try
    {
      ((ad)n()).c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      w.a("GamesClient", "service died");
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.r
 * JD-Core Version:    0.7.0.1
 */