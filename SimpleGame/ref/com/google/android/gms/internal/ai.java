package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.view.View;

public class ai
{
  protected r a;
  protected al b;
  
  private ai(r paramr, int paramInt)
  {
    this.a = paramr;
    a(paramInt);
  }
  
  public static ai a(r paramr, int paramInt)
  {
    if (p.b()) {
      return new am(paramr, paramInt);
    }
    return new ai(paramr, paramInt);
  }
  
  public void a()
  {
    this.a.a(this.b.a, this.b.a());
  }
  
  protected void a(int paramInt)
  {
    this.b = new al(paramInt, new Binder(), null);
  }
  
  public void a(View paramView) {}
  
  public IBinder b()
  {
    return this.b.a;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ai
 * JD-Core Version:    0.7.0.1
 */