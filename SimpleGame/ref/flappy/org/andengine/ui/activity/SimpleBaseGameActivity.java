package org.andengine.ui.activity;

import org.andengine.c.b.e;
import org.andengine.ui.b;
import org.andengine.ui.c;
import org.andengine.ui.d;

public abstract class SimpleBaseGameActivity
  extends BaseGameActivity
{
  public final void a(e parame, d paramd)
  {
    paramd.a();
  }
  
  public final void a(b paramb)
  {
    l();
    paramb.a();
  }
  
  public final void a(c paramc)
  {
    paramc.a(m());
  }
  
  protected abstract void l();
  
  protected abstract e m();
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.ui.activity.SimpleBaseGameActivity
 * JD-Core Version:    0.7.0.1
 */