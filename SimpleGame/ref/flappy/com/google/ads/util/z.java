package com.google.ads.util;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.google.ads.bt;

@TargetApi(17)
public final class z
{
  public static void a(WebSettings paramWebSettings, bt parambt)
  {
    p.a(paramWebSettings, parambt);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.z
 * JD-Core Version:    0.7.0.1
 */