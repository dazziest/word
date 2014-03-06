package com.google.android.gms.games.a;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public final class c
{
  public final long a;
  public final String b;
  public final boolean c;
  
  public c(long paramLong, String paramString, boolean paramBoolean)
  {
    this.a = paramLong;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  public String toString()
  {
    return dl.a(this).a("RawScore", Long.valueOf(this.a)).a("FormattedScore", this.b).a("NewBest", Boolean.valueOf(this.c)).toString();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.a.c
 * JD-Core Version:    0.7.0.1
 */