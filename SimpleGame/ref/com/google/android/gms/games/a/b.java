package com.google.android.gms.games.a;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import java.util.HashMap;

public final class b
{
  private static final String[] a = { "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest" };
  private String b;
  private String c;
  private int d;
  private HashMap e;
  
  public b(d paramd)
  {
    this.d = paramd.e();
    this.e = new HashMap();
    int j = paramd.g();
    if (j == 3) {}
    for (boolean bool = true;; bool = false)
    {
      do.b(bool);
      while (i < j)
      {
        int k = paramd.a(i);
        if (i == 0)
        {
          this.b = paramd.c("leaderboardId", i, k);
          this.c = paramd.c("playerId", i, k);
        }
        if (paramd.d("hasResult", i, k)) {
          a(new c(paramd.a("rawScore", i, k), paramd.c("formattedScore", i, k), paramd.d("newBest", i, k)), paramd.b("timeSpan", i, k));
        }
        i++;
      }
    }
  }
  
  private void a(c paramc, int paramInt)
  {
    this.e.put(Integer.valueOf(paramInt), paramc);
  }
  
  public int a()
  {
    return this.d;
  }
  
  public String toString()
  {
    dn localdn = dl.a(this).a("PlayerId", this.c).a("StatusCode", Integer.valueOf(this.d));
    int i = 0;
    if (i < 3)
    {
      c localc = (c)this.e.get(Integer.valueOf(i));
      localdn.a("TimesSpan", ao.a(i));
      if (localc == null) {}
      for (String str = "null";; str = localc.toString())
      {
        localdn.a("Result", str);
        i++;
        break;
      }
    }
    return localdn.toString();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.a.b
 * JD-Core Version:    0.7.0.1
 */