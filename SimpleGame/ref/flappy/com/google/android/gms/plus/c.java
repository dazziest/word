package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.bd;
import java.util.ArrayList;
import java.util.Arrays;

public class c
{
  private Context a;
  private String b;
  private com.google.android.gms.common.c c;
  private d d;
  private ArrayList e;
  private String[] f;
  private String[] g;
  private String h;
  private String i;
  private String j;
  
  public c(Context paramContext, com.google.android.gms.common.c paramc, d paramd)
  {
    this.a = paramContext;
    this.c = paramc;
    this.d = paramd;
    this.e = new ArrayList();
    this.i = this.a.getPackageName();
    this.h = this.a.getPackageName();
    this.e.add("https://www.googleapis.com/auth/plus.login");
  }
  
  public b a()
  {
    if (this.b == null) {
      this.b = "<<default account>>";
    }
    String[] arrayOfString = (String[])this.e.toArray(new String[this.e.size()]);
    a locala = new a(this.b, arrayOfString, this.f, this.g, this.h, this.i, this.j);
    return new b(new bd(this.a, locala, this.c, this.d));
  }
  
  public c a(String... paramVarArgs)
  {
    this.e.clear();
    this.e.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.c
 * JD-Core Version:    0.7.0.1
 */