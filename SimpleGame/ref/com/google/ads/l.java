package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.a;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class l
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    int i = -1;
    if ((paramWebView instanceof a)) {}
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("w"))) {
          break label255;
        }
        j = Integer.parseInt((String)paramHashMap.get("w"));
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("h"))) {
          break label248;
        }
        k = Integer.parseInt((String)paramHashMap.get("h"));
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("x"))) {
          break label241;
        }
        m = Integer.parseInt((String)paramHashMap.get("x"));
        if (!TextUtils.isEmpty((CharSequence)paramHashMap.get("y")))
        {
          int n = Integer.parseInt((String)paramHashMap.get("y"));
          i = n;
        }
        if ((paramHashMap.get("a") != null) && (((String)paramHashMap.get("a")).equals("1")))
        {
          paramw.a(null, true, m, i, j, k);
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        g.d("Invalid number format in activation overlay response.", localNumberFormatException);
        return;
      }
      if ((paramHashMap.get("a") != null) && (((String)paramHashMap.get("a")).equals("0")))
      {
        paramw.a(null, false, m, i, j, k);
        return;
      }
      paramw.a(m, i, j, k);
      return;
      g.b("Trying to activate an overlay when this is not an overlay.");
      return;
      label241:
      int m = i;
      continue;
      label248:
      int k = i;
      continue;
      label255:
      int j = i;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.l
 * JD-Core Version:    0.7.0.1
 */