package com.google.ads;

import com.google.ads.b.b;
import com.google.ads.util.e;
import com.google.ads.util.g;

class bl
  implements Runnable
{
  bl(bk parambk) {}
  
  public void run()
  {
    if (this.a.h()) {
      e.a(bk.a(this.a));
    }
    try
    {
      bk.a(this.a).a();
      g.a("Called destroy() for adapter with class: " + bk.a(this.a).getClass().getName());
      return;
    }
    catch (Throwable localThrowable)
    {
      g.b("Error while destroying adapter (" + this.a.f() + "):", localThrowable);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bl
 * JD-Core Version:    0.7.0.1
 */