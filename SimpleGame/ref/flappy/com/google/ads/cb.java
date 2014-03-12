package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.n;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class cb
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("type");
    String str2 = (String)paramHashMap.get("errors");
    g.e("Invalid " + str1 + " request error: " + str2);
    n localn = paramw.j();
    if (localn != null) {
      localn.a(e.a);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.cb
 * JD-Core Version:    0.7.0.1
 */