package com.google.ads;

import com.google.ads.a.n;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

public final class bq
  extends aa
{
  public final ad a;
  public final ae b;
  public final ae c = new ae(this, "disableNativeScroll", Boolean.valueOf(false));
  
  public bq(bt parambt)
  {
    this.a = new ad(this, "slotState", parambt);
    this.b = new ae(this, "adLoader", new n(this));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bq
 * JD-Core Version:    0.7.0.1
 */