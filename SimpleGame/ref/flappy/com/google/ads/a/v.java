package com.google.ads.a;

import android.webkit.WebView;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.g;
import com.google.ads.util.ad;
import java.util.LinkedList;

class v
  implements Runnable
{
  private final w b;
  private final WebView c;
  private final LinkedList d;
  private final int e;
  private final boolean f;
  private final String g;
  private final g h;
  
  public v(n paramn, w paramw, WebView paramWebView, LinkedList paramLinkedList, int paramInt, boolean paramBoolean, String paramString, g paramg)
  {
    this.b = paramw;
    this.c = paramWebView;
    this.d = paramLinkedList;
    this.e = paramInt;
    this.f = paramBoolean;
    this.g = paramString;
    this.h = paramg;
  }
  
  public void run()
  {
    if (this.c != null)
    {
      this.c.stopLoading();
      this.c.destroy();
    }
    this.b.a(this.d);
    this.b.a(this.e);
    this.b.a(this.f);
    this.b.a(this.g);
    if (this.h != null)
    {
      ((ac)((bt)n.b(this.a).a.a()).g.a()).b(this.h);
      this.b.k().setAdSize(this.h);
    }
    this.b.z();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.v
 * JD-Core Version:    0.7.0.1
 */