package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.ad;
import com.google.ads.util.g;
import java.util.HashMap;

public class ca
  implements bu
{
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("u");
    if (TextUtils.isEmpty(str))
    {
      g.e("Could not get URL from track gmsg.");
      return;
    }
    new Thread(new o(str, (Context)paramw.h().f.a())).start();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ca
 * JD-Core Version:    0.7.0.1
 */