package com.google.ads.util;

import java.lang.ref.WeakReference;

public final class af
  extends ac
{
  public af(aa paramaa, String paramString, Object paramObject)
  {
    super(paramaa, paramString, new WeakReference(paramObject), null);
  }
  
  public Object a()
  {
    return ((WeakReference)this.a).get();
  }
  
  public String toString()
  {
    return this.d.toString() + "." + this.b + " = " + a() + " (?)";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.af
 * JD-Core Version:    0.7.0.1
 */