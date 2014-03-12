package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.a;
import com.google.ads.a.ac;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import com.google.ads.util.p;
import java.util.HashMap;

public class cd
  implements bu
{
  private void a(HashMap paramHashMap, String paramString, ae paramae)
  {
    try
    {
      String str = (String)paramHashMap.get(paramString);
      if (!TextUtils.isEmpty(str)) {
        paramae.a(Integer.valueOf(str));
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      g.a("Could not parse \"" + paramString + "\" constant.");
    }
  }
  
  private void b(HashMap paramHashMap, String paramString, ae paramae)
  {
    try
    {
      String str = (String)paramHashMap.get(paramString);
      if (!TextUtils.isEmpty(str)) {
        paramae.a(Long.valueOf(str));
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      g.a("Could not parse \"" + paramString + "\" constant.");
    }
  }
  
  private void c(HashMap paramHashMap, String paramString, ae paramae)
  {
    String str = (String)paramHashMap.get(paramString);
    if (!TextUtils.isEmpty(str)) {
      paramae.a(str);
    }
  }
  
  public void a(w paramw, HashMap paramHashMap, WebView paramWebView)
  {
    bt localbt = paramw.h();
    bs localbs = (bs)((br)localbt.d.a()).b.a();
    c(paramHashMap, "as_domains", localbs.a);
    c(paramHashMap, "bad_ad_report_path", localbs.h);
    a(paramHashMap, "min_hwa_banner", localbs.b);
    a(paramHashMap, "min_hwa_activation_overlay", localbs.c);
    a(paramHashMap, "min_hwa_overlay", localbs.d);
    c(paramHashMap, "mraid_banner_path", localbs.e);
    c(paramHashMap, "mraid_expanded_banner_path", localbs.f);
    c(paramHashMap, "mraid_interstitial_path", localbs.g);
    b(paramHashMap, "ac_max_size", localbs.i);
    b(paramHashMap, "ac_padding", localbs.j);
    b(paramHashMap, "ac_total_quota", localbs.k);
    b(paramHashMap, "db_total_quota", localbs.l);
    b(paramHashMap, "db_quota_per_origin", localbs.m);
    b(paramHashMap, "db_quota_step_size", localbs.n);
    e locale = paramw.k();
    if (AdUtil.a >= 11)
    {
      p.a(locale.getSettings(), localbt);
      p.a(paramWebView.getSettings(), localbt);
    }
    boolean bool2;
    int j;
    label296:
    a locala;
    boolean bool1;
    int i;
    if (!((ac)localbt.g.a()).a())
    {
      bool2 = locale.k();
      if (AdUtil.a < ((Integer)localbs.b.a()).intValue())
      {
        j = 1;
        if ((j != 0) || (!bool2)) {
          break label446;
        }
        g.a("Re-enabling hardware acceleration for a banner after reading constants.");
        locale.h();
      }
    }
    else
    {
      locala = (a)localbt.e.a();
      if ((!((ac)localbt.g.a()).b()) && (locala != null))
      {
        bool1 = locala.k();
        if (AdUtil.a >= ((Integer)localbs.c.a()).intValue()) {
          break label469;
        }
        i = 1;
        label361:
        if ((i != 0) || (!bool1)) {
          break label475;
        }
        g.a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
        locala.h();
      }
    }
    for (;;)
    {
      String str = (String)localbs.a.a();
      ak localak = (ak)localbt.s.a();
      if ((localak != null) && (!TextUtils.isEmpty(str))) {
        localak.a(str);
      }
      localbs.o.a(Boolean.valueOf(true));
      return;
      j = 0;
      break;
      label446:
      if ((j == 0) || (bool2)) {
        break label296;
      }
      g.a("Disabling hardware acceleration for a banner after reading constants.");
      locale.g();
      break label296;
      label469:
      i = 0;
      break label361;
      label475:
      if ((i != 0) && (!bool1))
      {
        g.a("Disabling hardware acceleration for an activation overlay after reading constants.");
        locala.g();
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.cd
 * JD-Core Version:    0.7.0.1
 */