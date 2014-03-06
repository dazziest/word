package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;

public class da
{
  private static final Uri a = Uri.parse("http://plus.google.com/");
  private static final Uri b = a.buildUpon().appendPath("circles").appendPath("find").build();
  
  public static Intent a(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }
  
  public static Intent b(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(d(paramString));
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
  
  public static Intent c(String paramString)
  {
    Uri localUri = Uri.parse("bazaar://search?q=pname:" + paramString);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(localUri);
    localIntent.setFlags(524288);
    return localIntent;
  }
  
  private static Uri d(String paramString)
  {
    return Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString).build();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.da
 * JD-Core Version:    0.7.0.1
 */