package org.andengine.input.a.a;

import android.view.MotionEvent;
import org.andengine.d.a.b.g;

public abstract class a
  implements d
{
  private e a;
  private final g b = new b(this);
  
  protected void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    org.andengine.input.a.a locala = org.andengine.input.a.a.a(paramFloat1, paramFloat2, paramInt1, paramInt2, MotionEvent.obtain(paramMotionEvent));
    c localc = (c)this.b.d();
    localc.a(locala);
    this.b.b(localc);
  }
  
  public void a(e parame)
  {
    this.a = parame;
  }
  
  public void a_(float paramFloat)
  {
    this.b.a_(paramFloat);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.a.a.a
 * JD-Core Version:    0.7.0.1
 */