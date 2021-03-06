package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import java.io.File;

@TargetApi(11)
public class p
{
  public static void a(View paramView)
  {
    paramView.setLayerType(1, null);
  }
  
  public static void a(Window paramWindow)
  {
    paramWindow.setFlags(16777216, 16777216);
  }
  
  public static void a(WebSettings paramWebSettings, bt parambt)
  {
    Context localContext = (Context)parambt.f.a();
    bs localbs = (bs)((br)parambt.d.a()).b.a();
    paramWebSettings.setAppCacheEnabled(true);
    paramWebSettings.setAppCacheMaxSize(((Long)localbs.i.a()).longValue());
    paramWebSettings.setAppCachePath(new File(localContext.getCacheDir(), "admob").getAbsolutePath());
    paramWebSettings.setDatabaseEnabled(true);
    paramWebSettings.setDatabasePath(localContext.getDatabasePath("admob").getAbsolutePath());
    paramWebSettings.setDomStorageEnabled(true);
    paramWebSettings.setSupportZoom(true);
    paramWebSettings.setBuiltInZoomControls(true);
    paramWebSettings.setDisplayZoomControls(false);
  }
  
  public static void b(View paramView)
  {
    paramView.setLayerType(0, null);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.p
 * JD-Core Version:    0.7.0.1
 */