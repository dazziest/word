package com.google.ads;

import android.view.View;
import com.google.ads.a.w;
import com.google.ads.util.g;

class bg
  implements Runnable
{
  bg(bd parambd, bk parambk, View paramView, bh parambh) {}
  
  public void run()
  {
    if (bd.a(this.d, this.a))
    {
      g.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
      return;
    }
    bd.b(this.d).a(this.b, this.a, this.c, false);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bg
 * JD-Core Version:    0.7.0.1
 */