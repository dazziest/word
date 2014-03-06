package com.dotgears.flappy;

import android.content.Intent;
import com.dotgears.GameActivity;

class d
  implements Runnable
{
  d(SplashScreen paramSplashScreen) {}
  
  public void run()
  {
    Intent localIntent = new Intent(this.a, GameActivity.class);
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.flappy.d
 * JD-Core Version:    0.7.0.1
 */