package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.r;

public final class c
  implements b
{
  private final r a;
  
  private c(Context paramContext, String paramString1, String paramString2, com.google.android.gms.common.c paramc, d paramd, String[] paramArrayOfString, int paramInt, View paramView)
  {
    this.a = new r(paramContext, paramString1, paramString2, paramc, paramd, paramArrayOfString, paramInt, paramView, false);
  }
  
  public Intent a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(String paramString, long paramLong)
  {
    this.a.a(null, paramString, paramLong);
  }
  
  public boolean b()
  {
    return this.a.h();
  }
  
  public void c()
  {
    this.a.b();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.c
 * JD-Core Version:    0.7.0.1
 */