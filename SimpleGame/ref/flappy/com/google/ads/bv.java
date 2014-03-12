package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class bv
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("name");
    if (str == null)
    {
      g.b("Error: App event with no name parameter.");
      return;
    }
    paramw.a(str, (String)paramHashMap.get("info"));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bv
 * JD-Core Version:    0.7.0.1
 */