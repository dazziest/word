package com.google.ads.a;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.bt;
import com.google.ads.util.ad;

class r
  implements Runnable
{
  private final w a;
  private final WebView b;
  private final y c;
  private final com.google.ads.e d;
  private final boolean e;
  
  public r(w paramw, WebView paramWebView, y paramy, com.google.ads.e parame, boolean paramBoolean)
  {
    this.a = paramw;
    this.b = paramWebView;
    this.c = paramy;
    this.d = parame;
    this.e = paramBoolean;
  }
  
  public void run()
  {
    if (this.b != null)
    {
      this.b.stopLoading();
      this.b.destroy();
    }
    if (this.c != null) {
      this.c.a();
    }
    if (this.e)
    {
      this.a.k().stopLoading();
      if (this.a.h().i.a() != null) {
        ((ViewGroup)this.a.h().i.a()).setVisibility(8);
      }
    }
    this.a.a(this.d);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.r
 * JD-Core Version:    0.7.0.1
 */