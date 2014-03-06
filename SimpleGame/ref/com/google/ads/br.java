package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

public class br
  extends aa
{
  private static final br d = new br();
  public final ae a = new ae(this, "marketPackages", null);
  public final ad b = new ad(this, "constants", new bs());
  public final ad c = new ad(this, "uiHandler", new Handler(Looper.getMainLooper()));
  
  public static br a()
  {
    return d;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.br
 * JD-Core Version:    0.7.0.1
 */