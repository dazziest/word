package com.google.tagmanager;

import android.util.Log;

class g
  implements j
{
  private k a = k.d;
  
  public void a(String paramString)
  {
    if (this.a.ordinal() <= k.e.ordinal()) {
      Log.e("GoogleTagManager", paramString);
    }
  }
  
  public void b(String paramString)
  {
    if (this.a.ordinal() <= k.d.ordinal()) {
      Log.w("GoogleTagManager", paramString);
    }
  }
  
  public void c(String paramString)
  {
    if (this.a.ordinal() <= k.c.ordinal()) {
      Log.i("GoogleTagManager", paramString);
    }
  }
  
  public void d(String paramString)
  {
    if (this.a.ordinal() <= k.a.ordinal()) {
      Log.v("GoogleTagManager", paramString);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.g
 * JD-Core Version:    0.7.0.1
 */