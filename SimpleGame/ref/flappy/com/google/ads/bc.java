package com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class bc
{
  private ba a = null;
  private long b = -1L;
  
  public void a(ba paramba, int paramInt)
  {
    this.a = paramba;
    this.b = (TimeUnit.MILLISECONDS.convert(paramInt, TimeUnit.SECONDS) + SystemClock.elapsedRealtime());
  }
  
  public boolean a()
  {
    return (this.a != null) && (SystemClock.elapsedRealtime() < this.b);
  }
  
  public ba b()
  {
    return this.a;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bc
 * JD-Core Version:    0.7.0.1
 */