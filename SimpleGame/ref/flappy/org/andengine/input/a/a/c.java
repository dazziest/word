package org.andengine.input.a.a;

import android.view.MotionEvent;
import org.andengine.d.a.b.f;

class c
  extends f
{
  private org.andengine.input.a.a d;
  
  c(a parama) {}
  
  protected void a()
  {
    super.a();
    org.andengine.input.a.a locala = this.d;
    locala.k().recycle();
    locala.a();
  }
  
  public void a(org.andengine.input.a.a parama)
  {
    this.d = parama;
  }
  
  public void run()
  {
    a.a(this.a).a(this.d);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.a.a.c
 * JD-Core Version:    0.7.0.1
 */