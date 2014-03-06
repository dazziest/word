package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class cy
{
  private final String b;
  private final cz c;
  private final HashSet d;
  private int e;
  private boolean f;
  private IBinder g;
  private ComponentName h;
  
  public cy(cx paramcx, String paramString)
  {
    this.b = paramString;
    this.c = new cz(this);
    this.d = new HashSet();
    this.e = 0;
  }
  
  public cz a()
  {
    return this.c;
  }
  
  public void a(cv paramcv)
  {
    this.d.add(paramcv);
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(cv paramcv)
  {
    this.d.remove(paramcv);
  }
  
  public boolean c()
  {
    return this.f;
  }
  
  public boolean c(cv paramcv)
  {
    return this.d.contains(paramcv);
  }
  
  public int d()
  {
    return this.e;
  }
  
  public boolean e()
  {
    return this.d.isEmpty();
  }
  
  public IBinder f()
  {
    return this.g;
  }
  
  public ComponentName g()
  {
    return this.h;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cy
 * JD-Core Version:    0.7.0.1
 */