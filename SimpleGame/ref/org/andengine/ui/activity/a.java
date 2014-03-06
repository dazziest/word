package org.andengine.ui.activity;

import org.andengine.ui.d;

class a
  implements d
{
  a(BaseGameActivity paramBaseGameActivity) {}
  
  public void a()
  {
    try
    {
      org.andengine.d.e.a.b(this.a.getClass().getSimpleName() + ".onGameCreated" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      this.a.r();
      BaseGameActivity.a(this.a);
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        org.andengine.d.e.a.b(this.a.getClass().getSimpleName() + ".onGameCreated failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", localThrowable);
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.ui.activity.a
 * JD-Core Version:    0.7.0.1
 */