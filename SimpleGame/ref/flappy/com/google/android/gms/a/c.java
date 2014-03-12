package com.google.android.gms.a;

import android.content.Context;
import com.google.android.gms.common.d;

public final class c
{
  private static final String[] a = { "https://www.googleapis.com/auth/appstate" };
  private Context b;
  private com.google.android.gms.common.c c;
  private d d;
  private String[] e;
  private String f;
  
  public c(Context paramContext, com.google.android.gms.common.c paramc, d paramd)
  {
    this.b = paramContext;
    this.c = paramc;
    this.d = paramd;
    this.e = a;
    this.f = "<<default account>>";
  }
  
  public a a()
  {
    return new a(this.b, this.c, this.d, this.f, this.e, null);
  }
  
  public c a(String... paramVarArgs)
  {
    this.e = paramVarArgs;
    return this;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.a.c
 * JD-Core Version:    0.7.0.1
 */