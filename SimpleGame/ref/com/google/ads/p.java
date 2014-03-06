package com.google.ads;

import com.google.ads.a.w;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;

public class p
  implements Runnable
{
  private WeakReference a;
  
  public p(w paramw)
  {
    this.a = new WeakReference(paramw);
  }
  
  public void run()
  {
    w localw = (w)this.a.get();
    if (localw == null)
    {
      g.a("The ad must be gone, so cancelling the refresh timer.");
      return;
    }
    localw.x();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.p
 * JD-Core Version:    0.7.0.1
 */