package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.DisplayMetrics;

@TargetApi(4)
public final class n
{
  private static int a(Context paramContext, float paramFloat, int paramInt)
  {
    if ((0x2000 & paramContext.getApplicationInfo().flags) != 0) {
      paramInt = (int)(paramInt / paramFloat);
    }
    return paramInt;
  }
  
  public static int a(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.heightPixels);
  }
  
  public static void a(Intent paramIntent, String paramString)
  {
    paramIntent.setPackage(paramString);
  }
  
  public static int b(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.widthPixels);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.n
 * JD-Core Version:    0.7.0.1
 */