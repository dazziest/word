package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.a.ac;
import com.google.ads.a.w;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.af;

public class bt
  extends aa
{
  public final ad a;
  public final ad b;
  public final af c;
  public final ad d;
  public final ad e;
  public final ad f;
  public final ad g;
  public final ad h;
  public final ad i;
  public final ad j;
  public final ad k;
  public final ae l = new ae(this, "currentAd", null);
  public final ae m = new ae(this, "nextAd", null);
  public final ae n;
  public final ae o = new ae(this, "adListener");
  public final ae p = new ae(this, "appEventListener");
  public final ae q = new ae(this, "swipeableEventListener");
  public final ae r = new ae(this, "spamSignals", null);
  public final ae s = new ae(this, "spamSignalsUtil", null);
  public final ae t = new ae(this, "usesManualImpressions", Boolean.valueOf(false));
  
  public bt(br parambr, a parama, AdView paramAdView, i parami, String paramString, Activity paramActivity, Context paramContext, ViewGroup paramViewGroup, ac paramac, w paramw)
  {
    this.d = new ad(this, "appState", parambr);
    this.a = new ad(this, "ad", parama);
    this.j = new ad(this, "adView", paramAdView);
    this.g = new ad(this, "adType", paramac);
    this.h = new ad(this, "adUnitId", paramString);
    this.c = new af(this, "activity", paramActivity);
    this.k = new ad(this, "interstitialAd", parami);
    this.i = new ad(this, "bannerContainer", paramViewGroup);
    this.f = new ad(this, "applicationContext", paramContext);
    this.n = new ae(this, "adSizes", null);
    this.b = new ad(this, "adManager", paramw);
    com.google.ads.a.a locala = null;
    if (paramac != null)
    {
      boolean bool = paramac.b();
      locala = null;
      if (bool) {
        locala = new com.google.ads.a.a(this);
      }
    }
    this.e = new ad(this, "activationOverlay", locala);
  }
  
  public boolean a()
  {
    return !b();
  }
  
  public boolean b()
  {
    return ((ac)this.g.a()).a();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bt
 * JD-Core Version:    0.7.0.1
 */