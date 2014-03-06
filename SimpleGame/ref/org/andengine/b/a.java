package org.andengine.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import org.andengine.opengl.b.h;

public class a
  implements SensorEventListener, LocationListener, View.OnTouchListener, org.andengine.input.a.a.e
{
  private static final org.andengine.input.sensor.b e = org.andengine.input.sensor.b.c;
  private final org.andengine.b.b.d A = new org.andengine.b.b.d(8);
  private final org.andengine.b.b.a B = new org.andengine.b.b.a(4);
  protected final org.andengine.b.a.a a;
  protected org.andengine.c.b.e b;
  protected int c = 1;
  protected int d = 1;
  private boolean f;
  private boolean g;
  private long h;
  private float i;
  private final c j;
  private final d k;
  private final org.andengine.b.b.a.a l = new org.andengine.b.b.a.a();
  private final org.andengine.b.c.b m;
  private org.andengine.input.a.a.d n;
  private final org.andengine.opengl.d.e o = new org.andengine.opengl.d.e();
  private final org.andengine.opengl.c.e p = new org.andengine.opengl.c.e();
  private final org.andengine.opengl.a.c q = new org.andengine.opengl.a.c();
  private final h r = new h();
  private final org.andengine.a.c.c s;
  private final org.andengine.a.b.b t;
  private org.andengine.input.sensor.location.a u;
  private Location v;
  private org.andengine.input.sensor.a.g w;
  private org.andengine.input.sensor.a.a x;
  private org.andengine.input.sensor.b.a y;
  private org.andengine.input.sensor.b.b z;
  
  public a(org.andengine.b.c.b paramb)
  {
    org.andengine.opengl.c.a.a.b.a();
    org.andengine.a.c.b.a();
    org.andengine.a.b.a.a();
    org.andengine.opengl.a.b.a();
    this.o.a();
    this.p.a();
    this.q.a();
    this.r.a();
    this.m = paramb;
    if (this.m.a())
    {
      this.j = paramb.b();
      this.a = paramb.i();
      if (!this.m.c().a()) {
        break label295;
      }
      a(new org.andengine.input.a.a.f());
      label189:
      if (!this.m.d().b()) {
        break label309;
      }
      this.s = new org.andengine.a.c.c(this.m.d().a().b());
      label226:
      if (!this.m.d().c()) {
        break label317;
      }
      this.t = new org.andengine.a.b.b();
      label250:
      if (!this.m.j()) {
        break label325;
      }
    }
    label295:
    label309:
    label317:
    label325:
    for (this.k = this.m.k();; this.k = new d())
    {
      this.k.a(this);
      return;
      this.j = new c(false);
      break;
      a(new org.andengine.input.a.a.g());
      break label189;
      this.s = null;
      break label226;
      this.t = null;
      break label250;
    }
  }
  
  private void n()
  {
    if (this.g) {
      throw new b(this);
    }
  }
  
  private long o()
  {
    return System.nanoTime() - this.h;
  }
  
  public void a()
  {
    this.k.start();
  }
  
  protected void a(float paramFloat)
  {
    if (this.b != null) {
      this.b.a_(paramFloat);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    f();
  }
  
  public void a(long paramLong)
  {
    float f1 = 1.0E-009F * (float)paramLong;
    this.i = (f1 + this.i);
    this.h = (paramLong + this.h);
    this.n.a_(f1);
    b(f1);
    a(f1);
  }
  
  public void a(org.andengine.c.b.e parame)
  {
    this.b = parame;
  }
  
  public void a(org.andengine.input.a.a.d paramd)
  {
    this.n = paramd;
    this.n.a(this);
  }
  
  public void a(org.andengine.opengl.util.e parame)
  {
    c localc = this.j;
    localc.lock();
    try
    {
      localc.c();
      this.o.a(parame);
      this.p.a(parame);
      this.q.a(parame);
      a(parame, this.a);
      b(parame, this.a);
      localc.b();
      return;
    }
    finally
    {
      localc.unlock();
    }
  }
  
  protected void a(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    this.B.a(parame, parama);
  }
  
  protected boolean a(org.andengine.b.a.a parama, org.andengine.input.a.a parama1)
  {
    if (parama.j()) {
      return parama.i().a(parama1);
    }
    return false;
  }
  
  protected boolean a(org.andengine.c.b.e parame, org.andengine.input.a.a parama)
  {
    if (parame != null) {
      return parame.a(parama);
    }
    return false;
  }
  
  public boolean a(org.andengine.input.a.a parama)
  {
    org.andengine.c.b.e locale = c(parama);
    org.andengine.b.a.a locala = b(parama);
    b(locala, parama);
    if (a(locala, parama)) {
      return true;
    }
    return a(locale, parama);
  }
  
  protected org.andengine.b.a.a b(org.andengine.input.a.a parama)
  {
    return e();
  }
  
  public void b()
  {
    try
    {
      if (!this.f)
      {
        this.h = System.nanoTime();
        this.f = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void b(float paramFloat)
  {
    this.l.a_(paramFloat);
    this.A.a_(paramFloat);
    e().a_(paramFloat);
  }
  
  protected void b(org.andengine.b.a.a parama, org.andengine.input.a.a parama1)
  {
    parama.a(parama1, this.c, this.d);
  }
  
  protected void b(org.andengine.opengl.util.e parame, org.andengine.b.a.a parama)
  {
    if (this.b != null) {
      this.b.a(parame, parama);
    }
    parama.a(parame);
  }
  
  protected org.andengine.c.b.e c(org.andengine.input.a.a parama)
  {
    return this.b;
  }
  
  public void c()
  {
    try
    {
      if (this.f) {
        this.f = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public org.andengine.b.c.b d()
  {
    return this.m;
  }
  
  public org.andengine.b.a.a e()
  {
    return this.a;
  }
  
  protected void f()
  {
    this.a.a(0, 0, this.c, this.d);
  }
  
  public org.andengine.opengl.d.e g()
  {
    return this.o;
  }
  
  public org.andengine.opengl.c.e h()
  {
    return this.p;
  }
  
  public org.andengine.a.c.c i()
  {
    if (this.s != null) {
      return this.s;
    }
    throw new IllegalStateException("To enable the SoundManager, check the EngineOptions!");
  }
  
  public org.andengine.a.b.b j()
  {
    if (this.t != null) {
      return this.t;
    }
    throw new IllegalStateException("To enable the MusicManager, check the EngineOptions!");
  }
  
  /* Error */
  public void k()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 148	org/andengine/b/a:j	Lorg/andengine/b/c;
    //   4: invokevirtual 262	org/andengine/b/c:lock	()V
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield 215	org/andengine/b/a:g	Z
    //   12: aload_0
    //   13: getfield 148	org/andengine/b/a:j	Lorg/andengine/b/c;
    //   16: invokevirtual 275	org/andengine/b/c:b	()V
    //   19: aload_0
    //   20: getfield 148	org/andengine/b/a:j	Lorg/andengine/b/c;
    //   23: invokevirtual 278	org/andengine/b/c:unlock	()V
    //   26: aload_0
    //   27: getfield 199	org/andengine/b/a:k	Lorg/andengine/b/d;
    //   30: invokevirtual 340	org/andengine/b/d:join	()V
    //   33: aload_0
    //   34: getfield 88	org/andengine/b/a:o	Lorg/andengine/opengl/d/e;
    //   37: invokevirtual 341	org/andengine/opengl/d/e:b	()V
    //   40: aload_0
    //   41: getfield 93	org/andengine/b/a:p	Lorg/andengine/opengl/c/e;
    //   44: invokevirtual 342	org/andengine/opengl/c/e:c	()V
    //   47: aload_0
    //   48: getfield 98	org/andengine/b/a:q	Lorg/andengine/opengl/a/c;
    //   51: invokevirtual 343	org/andengine/opengl/a/c:b	()V
    //   54: aload_0
    //   55: getfield 103	org/andengine/b/a:r	Lorg/andengine/opengl/b/h;
    //   58: invokevirtual 344	org/andengine/opengl/b/h:b	()V
    //   61: return
    //   62: astore_1
    //   63: aload_0
    //   64: getfield 148	org/andengine/b/a:j	Lorg/andengine/b/c;
    //   67: invokevirtual 278	org/andengine/b/c:unlock	()V
    //   70: aload_1
    //   71: athrow
    //   72: astore_2
    //   73: ldc_w 346
    //   76: aload_2
    //   77: invokestatic 351	org/andengine/d/e/a:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   80: ldc_w 353
    //   83: invokestatic 355	org/andengine/d/e/a:c	(Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield 199	org/andengine/b/a:k	Lorg/andengine/b/d;
    //   90: invokevirtual 358	org/andengine/b/d:interrupt	()V
    //   93: goto -60 -> 33
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	a
    //   62	9	1	localObject	Object
    //   72	5	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   7	19	62	finally
    //   26	33	72	java/lang/InterruptedException
  }
  
  public void l()
  {
    this.o.c();
    this.p.b();
    this.q.c();
    this.r.c();
  }
  
  void m()
  {
    if (this.f)
    {
      long l1 = o();
      this.j.lock();
      try
      {
        n();
        a(l1);
        n();
        this.j.a();
        this.j.d();
        return;
      }
      finally
      {
        this.j.unlock();
      }
    }
    this.j.lock();
    try
    {
      n();
      this.j.a();
      this.j.d();
      this.j.unlock();
      Thread.sleep(16L);
      return;
    }
    finally
    {
      this.j.unlock();
    }
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    if (this.f) {}
    switch (paramSensor.getType())
    {
    default: 
    case 1: 
      do
      {
        return;
        if (this.x != null)
        {
          this.x.a(paramInt);
          this.w.a(this.x);
          return;
        }
      } while (this.z == null);
      this.z.b(paramInt);
      this.y.a(this.z);
      return;
    }
    this.z.c(paramInt);
    this.y.a(this.z);
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    if (this.v == null)
    {
      this.v = paramLocation;
      return;
    }
    if (paramLocation == null)
    {
      this.u.b();
      return;
    }
    this.v = paramLocation;
    this.u.a(paramLocation);
  }
  
  public void onProviderDisabled(String paramString)
  {
    this.u.c();
  }
  
  public void onProviderEnabled(String paramString)
  {
    this.u.a();
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (this.f) {}
    switch (paramSensorEvent.sensor.getType())
    {
    default: 
    case 1: 
      do
      {
        return;
        if (this.x != null)
        {
          this.x.a(paramSensorEvent.values);
          this.w.b(this.x);
          return;
        }
      } while (this.z == null);
      this.z.b(paramSensorEvent.values);
      this.y.b(this.z);
      return;
    }
    this.z.c(paramSensorEvent.values);
    this.y.b(this.z);
  }
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2: 
      this.u.a(org.andengine.input.sensor.location.b.a, paramBundle);
      return;
    case 0: 
      this.u.a(org.andengine.input.sensor.location.b.b, paramBundle);
      return;
    }
    this.u.a(org.andengine.input.sensor.location.b.c, paramBundle);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.f)
    {
      this.n.a(paramMotionEvent);
      try
      {
        Thread.sleep(this.m.c().b());
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          org.andengine.d.e.a.a(localInterruptedException);
        }
      }
    }
    return false;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.a
 * JD-Core Version:    0.7.0.1
 */