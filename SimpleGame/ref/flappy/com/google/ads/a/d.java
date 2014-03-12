package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.util.ad;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;

class d
  implements Runnable
{
  private final WeakReference a;
  
  public d(c paramc)
  {
    this.a = new WeakReference(paramc);
  }
  
  public void a()
  {
    ((Handler)br.a().c.a()).postDelayed(this, 250L);
  }
  
  public void run()
  {
    c localc = (c)this.a.get();
    if (localc == null)
    {
      g.d("The video must be gone, so cancelling the timeupdate task.");
      return;
    }
    localc.f();
    ((Handler)br.a().c.a()).postDelayed(this, 250L);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.d
 * JD-Core Version:    0.7.0.1
 */