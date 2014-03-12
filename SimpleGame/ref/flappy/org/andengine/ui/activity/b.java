package org.andengine.ui.activity;

import org.andengine.c.b.e;
import org.andengine.ui.c;
import org.andengine.ui.d;

class b
  implements c
{
  b(BaseGameActivity paramBaseGameActivity, d paramd) {}
  
  public void a(e parame)
  {
    this.a.k.a(parame);
    try
    {
      org.andengine.d.e.a.b(this.a.getClass().getSimpleName() + ".onPopulateScene" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      this.a.a(parame, this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      org.andengine.d.e.a.b(this.a.getClass().getSimpleName() + ".onPopulateScene failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", localThrowable);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.ui.activity.b
 * JD-Core Version:    0.7.0.1
 */