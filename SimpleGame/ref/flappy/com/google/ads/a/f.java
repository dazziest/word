package com.google.ads.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.AdActivity;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;

class f
  implements DownloadListener
{
  f(e parame) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      AdActivity localAdActivity = this.a.i();
      if ((localAdActivity != null) && (AdUtil.a(localIntent, localAdActivity))) {
        localAdActivity.startActivity(localIntent);
      }
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      g.a("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
      return;
    }
    catch (Throwable localThrowable)
    {
      g.b("Unknown error trying to start activity to view URL: " + paramString1, localThrowable);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.f
 * JD-Core Version:    0.7.0.1
 */