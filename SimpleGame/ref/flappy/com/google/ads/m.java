package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.ae;
import com.google.ads.util.af;
import com.google.ads.util.g;
import java.util.HashMap;

public class m
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    if ((Activity)paramw.h().c.a() == null) {
      g.e("Activity was null while responding to touch gmsg.");
    }
    for (;;)
    {
      return;
      String str1 = (String)paramHashMap.get("tx");
      String str2 = (String)paramHashMap.get("ty");
      String str3 = (String)paramHashMap.get("td");
      try
      {
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt(str2);
        int k = Integer.parseInt(str3);
        ai localai = (ai)paramw.h().r.a();
        if (localai != null)
        {
          localai.a(i, j, k);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        g.e("Could not parse touch parameters from gmsg.");
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.m
 * JD-Core Version:    0.7.0.1
 */