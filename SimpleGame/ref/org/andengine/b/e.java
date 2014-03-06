package org.andengine.b;

import org.andengine.b.c.b;

public class e
  extends a
{
  private final long e;
  
  public e(b paramb, int paramInt)
  {
    super(paramb);
    this.e = (1000000000L / paramInt);
  }
  
  public void a(long paramLong)
  {
    long l = this.e - paramLong;
    if (l <= 0L)
    {
      super.a(paramLong);
      return;
    }
    Thread.sleep((int)(l / 1000000L));
    super.a(l + paramLong);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.e
 * JD-Core Version:    0.7.0.1
 */