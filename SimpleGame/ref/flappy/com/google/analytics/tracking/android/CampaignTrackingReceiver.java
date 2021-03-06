package com.google.analytics.tracking.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class CampaignTrackingReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("referrer");
    if ((!"com.android.vending.INSTALL_REFERRER".equals(paramIntent.getAction())) || (str == null)) {
      return;
    }
    Intent localIntent = new Intent(paramContext, CampaignTrackingService.class);
    localIntent.putExtra("referrer", str);
    paramContext.startService(localIntent);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.CampaignTrackingReceiver
 * JD-Core Version:    0.7.0.1
 */