package org.andengine.b;

import android.os.Process;
import org.andengine.b.c.b;

public class d
  extends Thread
{
  private a a;
  private final org.andengine.b.b.a.a b = new org.andengine.b.b.a.a();
  
  public d()
  {
    super(d.class.getSimpleName());
  }
  
  public void a(a parama)
  {
    this.a = parama;
  }
  
  public void run()
  {
    Process.setThreadPriority(this.a.d().l());
    try
    {
      for (;;)
      {
        this.b.a_(0.0F);
        this.a.m();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      org.andengine.d.e.a.a(getClass().getSimpleName() + " interrupted. Don't worry - this " + localInterruptedException.getClass().getSimpleName() + " is most likely expected!", localInterruptedException);
      interrupt();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.d
 * JD-Core Version:    0.7.0.1
 */