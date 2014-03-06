package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

public class by
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof e))
    {
      ((e)paramWebView).f();
      return;
    }
    g.b("Trying to close WebView that isn't an AdWebView");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.by
 * JD-Core Version:    0.7.0.1
 */