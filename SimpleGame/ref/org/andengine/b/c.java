package org.andengine.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c
  extends ReentrantLock
{
  final Condition a = newCondition();
  final AtomicBoolean b = new AtomicBoolean(false);
  
  public c(boolean paramBoolean)
  {
    super(paramBoolean);
  }
  
  void a()
  {
    this.b.set(true);
    this.a.signalAll();
  }
  
  void b()
  {
    this.b.set(false);
    this.a.signalAll();
  }
  
  void c()
  {
    for (;;)
    {
      if (this.b.get()) {
        return;
      }
      this.a.await();
    }
  }
  
  void d()
  {
    for (;;)
    {
      if (!this.b.get()) {
        return;
      }
      this.a.await();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.c
 * JD-Core Version:    0.7.0.1
 */