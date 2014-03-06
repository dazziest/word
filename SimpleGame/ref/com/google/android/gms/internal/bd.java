package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

public class bd
  extends cr
{
  private com.google.android.gms.plus.a.b.a f;
  private com.google.android.gms.plus.a g;
  
  public bd(Context paramContext, com.google.android.gms.plus.a parama, c paramc, d paramd)
  {
    super(paramContext, paramc, paramd, parama.c());
    this.g = parama;
  }
  
  protected ba a(IBinder paramIBinder)
  {
    return bb.a(paramIBinder);
  }
  
  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("loaded_person"))) {
      this.f = cc.a(paramBundle.getByteArray("loaded_person"));
    }
    super.a(paramInt, paramIBinder, paramBundle);
  }
  
  protected void a(df paramdf, cu paramcu)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("skip_oob", false);
    localBundle.putStringArray("request_visible_actions", this.g.d());
    if (this.g.e() != null) {
      localBundle.putStringArray("required_features", this.g.e());
    }
    if (this.g.h() != null) {
      localBundle.putString("application_name", this.g.h());
    }
    paramdf.a(paramcu, 3265100, this.g.g(), this.g.f(), k(), this.g.b(), localBundle);
  }
  
  protected String c()
  {
    return "com.google.android.gms.plus.service.START";
  }
  
  protected String d()
  {
    return "com.google.android.gms.plus.internal.IPlusService";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bd
 * JD-Core Version:    0.7.0.1
 */