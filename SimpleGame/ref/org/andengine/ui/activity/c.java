package org.andengine.ui.activity;

import org.andengine.d.e.a;
import org.andengine.ui.b;

class c
  implements b
{
  c(BaseGameActivity paramBaseGameActivity, org.andengine.ui.c paramc) {}
  
  public void a()
  {
    try
    {
      a.b(this.a.getClass().getSimpleName() + ".onCreateScene" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      this.a.a(this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      a.b(this.a.getClass().getSimpleName() + ".onCreateScene failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", localThrowable);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.ui.activity.c
 * JD-Core Version:    0.7.0.1
 */