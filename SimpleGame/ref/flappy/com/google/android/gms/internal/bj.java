package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

public final class bj
  extends cr
{
  private final String f;
  
  public bj(Context paramContext, c paramc, d paramd, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, paramc, paramd, paramArrayOfString);
    this.f = ((String)do.a(paramString));
  }
  
  protected ce a(IBinder paramIBinder)
  {
    return cf.a(paramIBinder);
  }
  
  protected void a(df paramdf, cu paramcu)
  {
    paramdf.a(paramcu, 3265100, j().getPackageName(), this.f, k());
  }
  
  protected void a(String... paramVarArgs)
  {
    int i = 0;
    boolean bool = false;
    while (i < paramVarArgs.length)
    {
      if (paramVarArgs[i].equals("https://www.googleapis.com/auth/appstate")) {
        bool = true;
      }
      i++;
    }
    do.a(bool, String.format("AppStateClient requires %s to function.", new Object[] { "https://www.googleapis.com/auth/appstate" }));
  }
  
  protected String c()
  {
    return "com.google.android.gms.appstate.service.START";
  }
  
  protected String d()
  {
    return "com.google.android.gms.appstate.internal.IAppStateService";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bj
 * JD-Core Version:    0.7.0.1
 */