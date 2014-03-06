package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class bz
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof e))
    {
      ((e)paramWebView).setCustomClose("1".equals(paramHashMap.get("custom_close")));
      return;
    }
    g.b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bz
 * JD-Core Version:    0.7.0.1
 */