package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.d;

public final class f
{
  private final Context a;
  private String b;
  private String c = "<<default account>>";
  private final com.google.android.gms.common.c d;
  private final d e;
  private String[] f = { "https://www.googleapis.com/auth/games" };
  private int g = 49;
  private View h;
  
  public f(Context paramContext, com.google.android.gms.common.c paramc, d paramd)
  {
    this.a = paramContext;
    this.b = paramContext.getPackageName();
    this.d = paramc;
    this.e = paramd;
  }
  
  public c a()
  {
    return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
  }
  
  public f a(int paramInt)
  {
    this.g = paramInt;
    return this;
  }
  
  public f a(String... paramVarArgs)
  {
    this.f = paramVarArgs;
    return this;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.f
 * JD-Core Version:    0.7.0.1
 */