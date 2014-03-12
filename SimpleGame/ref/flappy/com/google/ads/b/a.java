package com.google.ads.b;

import android.content.Context;
import com.google.ads.d;

public class a
{
  private d a;
  private boolean b;
  private boolean c;
  
  public a(d paramd, Context paramContext, boolean paramBoolean)
  {
    this.a = paramd;
    this.c = paramBoolean;
    if (paramContext == null)
    {
      this.b = true;
      return;
    }
    this.b = paramd.b(paramContext);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.a
 * JD-Core Version:    0.7.0.1
 */