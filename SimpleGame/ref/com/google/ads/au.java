package com.google.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

final class au
  implements Runnable
{
  au(Context paramContext) {}
  
  public void run()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.a.getApplicationContext()).edit();
    localEditor.putString("drt", "");
    localEditor.putLong("drt_ts", 0L);
    localEditor.commit();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.au
 * JD-Core Version:    0.7.0.1
 */