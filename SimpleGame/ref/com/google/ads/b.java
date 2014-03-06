package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.ads.a.w;
import com.google.ads.a.x;
import com.google.ads.util.af;
import com.google.ads.util.g;

public class b
{
  public void a(w paramw, x paramx)
  {
    Activity localActivity;
    synchronized ()
    {
      if (AdActivity.g() == null) {
        AdActivity.b(paramw);
      }
      while (AdActivity.g() == paramw)
      {
        localActivity = (Activity)paramw.h().c.a();
        if (localActivity != null) {
          break;
        }
        g.e("activity was null while launching an AdActivity.");
        return;
      }
      g.b("Tried to launch a new AdActivity with a different AdManager.");
      return;
    }
    Intent localIntent = new Intent(localActivity.getApplicationContext(), AdActivity.class);
    localIntent.putExtra("com.google.ads.AdOpener", paramx.a());
    try
    {
      g.a("Launching AdActivity.");
      localActivity.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      g.b("Activity not found.", localActivityNotFoundException);
    }
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized ()
      {
        if (AdActivity.e() != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean b()
  {
    for (;;)
    {
      synchronized ()
      {
        if (AdActivity.f() != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b
 * JD-Core Version:    0.7.0.1
 */