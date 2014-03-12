package com.dotgears.flappy;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen
  extends Activity
{
  private static int a = 2000;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    new Handler().postDelayed(new d(this), a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.flappy.SplashScreen
 * JD-Core Version:    0.7.0.1
 */