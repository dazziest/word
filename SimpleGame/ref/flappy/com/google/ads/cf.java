package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.a.x;
import com.google.ads.util.g;
import java.util.HashMap;

public class cf
  implements bu
{
  private b a;
  
  public cf()
  {
    this(new b());
  }
  
  public cf(b paramb)
  {
    this.a = paramb;
  }
  
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("a");
    if (str == null)
    {
      g.a("Could not get the action parameter for open GMSG.");
      return;
    }
    if (str.equals("webapp"))
    {
      this.a.a(paramw, new x("webapp", paramHashMap));
      return;
    }
    if (str.equals("expand"))
    {
      this.a.a(paramw, new x("expand", paramHashMap));
      return;
    }
    this.a.a(paramw, new x("intent", paramHashMap));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.cf
 * JD-Core Version:    0.7.0.1
 */