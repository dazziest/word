package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class cu
  extends dd
{
  private cr a;
  
  public cu(cr paramcr)
  {
    this.a = paramcr;
  }
  
  public void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    do.a("onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
    this.a.a(paramInt, paramIBinder, paramBundle);
    this.a = null;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cu
 * JD-Core Version:    0.7.0.1
 */