package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ae;
import com.google.ads.util.g;

public class a
  extends e
{
  private volatile boolean b = true;
  private boolean c = true;
  private int d = 0;
  private int e = 0;
  private final ad f;
  
  public a(bt parambt)
  {
    super(parambt, null);
    bs localbs = (bs)((br)parambt.d.a()).b.a();
    if (AdUtil.a < ((Integer)localbs.c.a()).intValue())
    {
      g.a("Disabling hardware acceleration for an activation overlay.");
      g();
    }
    this.f = ad.a((w)parambt.b.a(), h.c, true, true);
    setWebViewClient(this.f);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.e;
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    return false;
  }
  
  public boolean canScrollVertically(int paramInt)
  {
    return false;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public ad e()
  {
    return this.f;
  }
  
  public void setOverlayActivated(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void setOverlayEnabled(boolean paramBoolean)
  {
    if (!paramBoolean) {
      ((Handler)br.a().c.a()).post(new b(this, this));
    }
    this.b = paramBoolean;
  }
  
  public void setXPosition(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void setYPosition(int paramInt)
  {
    this.e = paramInt;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.a
 * JD-Core Version:    0.7.0.1
 */