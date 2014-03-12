package com.google.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.analytics.tracking.android.CampaignTrackingService;

public final class InstallReferrerService
  extends IntentService
{
  CampaignTrackingService a;
  Context b;
  
  public InstallReferrerService()
  {
    super("InstallReferrerService");
  }
  
  private void a(Context paramContext, Intent paramIntent)
  {
    if (this.a == null) {
      this.a = new CampaignTrackingService();
    }
    this.a.a(paramContext, paramIntent);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("referrer");
    if (this.b != null) {}
    for (Context localContext = this.b;; localContext = getApplicationContext())
    {
      h.a(localContext, str);
      a(localContext, paramIntent);
      return;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.InstallReferrerService
 * JD-Core Version:    0.7.0.1
 */