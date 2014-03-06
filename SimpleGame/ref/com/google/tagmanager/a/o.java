package com.google.tagmanager.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class o
{
  private static volatile boolean a = false;
  private static final o c = new o(true);
  private final Map b;
  
  o()
  {
    this.b = new HashMap();
  }
  
  private o(boolean paramBoolean)
  {
    this.b = Collections.emptyMap();
  }
  
  public static o a()
  {
    return c;
  }
  
  public aa a(am paramam, int paramInt)
  {
    return (aa)this.b.get(new p(paramam, paramInt));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.o
 * JD-Core Version:    0.7.0.1
 */