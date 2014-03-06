package org.andengine.ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.widget.FrameLayout.LayoutParams;
import org.andengine.a.c.c;
import org.andengine.opengl.view.RenderSurfaceView;

public abstract class BaseGameActivity
  extends BaseActivity
  implements org.andengine.opengl.view.h, org.andengine.ui.a
{
  private PowerManager.WakeLock a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  protected org.andengine.b.a k;
  protected RenderSurfaceView l;
  
  protected static FrameLayout.LayoutParams B()
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.gravity = 17;
    return localLayoutParams;
  }
  
  private void a(org.andengine.b.c.h paramh)
  {
    if (paramh == org.andengine.b.c.h.d)
    {
      org.andengine.d.a.b(this);
      return;
    }
    this.a = ((PowerManager)getSystemService("power")).newWakeLock(0x20000000 | paramh.a(), "AndEngine");
    try
    {
      this.a.acquire();
      return;
    }
    catch (SecurityException localSecurityException)
    {
      org.andengine.d.e.a.b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", localSecurityException);
    }
  }
  
  private void c()
  {
    runOnUiThread(new d(this));
  }
  
  private void d()
  {
    a(this.k.d().m());
  }
  
  private void e()
  {
    if ((this.a != null) && (this.a.isHeld())) {
      this.a.release();
    }
  }
  
  private void f()
  {
    org.andengine.b.c.b localb = this.k.d();
    if (localb.f()) {
      org.andengine.d.a.a(this);
    }
    if ((localb.d().c()) || (localb.d().b())) {
      setVolumeControlStream(3);
    }
    switch (C()[localb.g().ordinal()])
    {
    default: 
      return;
    case 1: 
      setRequestedOrientation(0);
      return;
    case 2: 
      if (org.andengine.d.i.a.c)
      {
        setRequestedOrientation(6);
        return;
      }
      org.andengine.d.e.a.c(org.andengine.b.c.e.class.getSimpleName() + "." + org.andengine.b.c.e.b + " is not supported on this device. Falling back to " + org.andengine.b.c.e.class.getSimpleName() + "." + org.andengine.b.c.e.a);
      setRequestedOrientation(0);
      return;
    case 3: 
      setRequestedOrientation(1);
      return;
    }
    if (org.andengine.d.i.a.c)
    {
      setRequestedOrientation(7);
      return;
    }
    org.andengine.d.e.a.c(org.andengine.b.c.e.class.getSimpleName() + "." + org.andengine.b.c.e.d + " is not supported on this device. Falling back to " + org.andengine.b.c.e.class.getSimpleName() + "." + org.andengine.b.c.e.c);
    setRequestedOrientation(1);
  }
  
  public org.andengine.a.b.b A()
  {
    return this.k.j();
  }
  
  public org.andengine.b.a a(org.andengine.b.c.b paramb)
  {
    return new org.andengine.b.a(paramb);
  }
  
  public void a(org.andengine.opengl.util.e parame)
  {
    for (;;)
    {
      try
      {
        org.andengine.d.e.a.b(getClass().getSimpleName() + ".onSurfaceCreated" + " @(Thread: '" + Thread.currentThread().getName() + "')");
        if (this.c)
        {
          t();
          if ((this.b) && (this.c)) {
            s();
          }
          return;
        }
        if (this.d)
        {
          this.e = true;
          continue;
        }
        this.d = true;
      }
      finally {}
      q();
    }
  }
  
  public void a(org.andengine.opengl.util.e parame, int paramInt1, int paramInt2)
  {
    try
    {
      org.andengine.d.e.a.b(getClass().getSimpleName() + ".onSurfaceChanged(Width=" + paramInt1 + ",  Height=" + paramInt2 + ")" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void b()
  {
    this.l = new RenderSurfaceView(this);
    this.l.a(this.k, this);
    setContentView(this.l, B());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    org.andengine.d.e.a.b(getClass().getSimpleName() + ".onCreate" + " @(Thread: '" + Thread.currentThread().getName() + "')");
    super.onCreate(paramBundle);
    this.b = true;
    this.k = a(a());
    this.k.a();
    f();
    b();
  }
  
  protected void onDestroy()
  {
    org.andengine.d.e.a.b(getClass().getSimpleName() + ".onDestroy" + " @(Thread: '" + Thread.currentThread().getName() + "')");
    super.onDestroy();
    this.k.k();
    try
    {
      v();
      w();
      this.k = null;
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        org.andengine.d.e.a.b(getClass().getSimpleName() + ".onDestroyResources failed." + " @(Thread: '" + Thread.currentThread().getName() + "')", localThrowable);
      }
    }
  }
  
  protected void onPause()
  {
    org.andengine.d.e.a.b(getClass().getSimpleName() + ".onPause" + " @(Thread: '" + Thread.currentThread().getName() + "')");
    super.onPause();
    this.l.onPause();
    e();
    if (!this.b) {
      u();
    }
  }
  
  protected void onResume()
  {
    try
    {
      org.andengine.d.e.a.b(getClass().getSimpleName() + ".onResume" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      super.onResume();
      d();
      this.l.onResume();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    try
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (this.b) && (this.c)) {
        s();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  protected void q()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 170	java/lang/StringBuilder
    //   5: dup
    //   6: aload_0
    //   7: invokevirtual 217	java/lang/Object:getClass	()Ljava/lang/Class;
    //   10: invokevirtual 176	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   13: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   16: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: ldc_w 334
    //   22: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc 221
    //   27: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokestatic 227	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   33: invokevirtual 230	java/lang/Thread:getName	()Ljava/lang/String;
    //   36: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc 232
    //   41: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokestatic 234	org/andengine/d/e/a:b	(Ljava/lang/String;)V
    //   50: new 336	org/andengine/ui/activity/c
    //   53: dup
    //   54: aload_0
    //   55: new 338	org/andengine/ui/activity/b
    //   58: dup
    //   59: aload_0
    //   60: new 340	org/andengine/ui/activity/a
    //   63: dup
    //   64: aload_0
    //   65: invokespecial 341	org/andengine/ui/activity/a:<init>	(Lorg/andengine/ui/activity/BaseGameActivity;)V
    //   68: invokespecial 344	org/andengine/ui/activity/b:<init>	(Lorg/andengine/ui/activity/BaseGameActivity;Lorg/andengine/ui/d;)V
    //   71: invokespecial 347	org/andengine/ui/activity/c:<init>	(Lorg/andengine/ui/activity/BaseGameActivity;Lorg/andengine/ui/c;)V
    //   74: astore_2
    //   75: new 170	java/lang/StringBuilder
    //   78: dup
    //   79: aload_0
    //   80: invokevirtual 217	java/lang/Object:getClass	()Ljava/lang/Class;
    //   83: invokevirtual 176	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   86: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   89: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: ldc_w 349
    //   95: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: ldc 221
    //   100: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokestatic 227	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   106: invokevirtual 230	java/lang/Thread:getName	()Ljava/lang/String;
    //   109: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: ldc 232
    //   114: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokestatic 234	org/andengine/d/e/a:b	(Ljava/lang/String;)V
    //   123: aload_0
    //   124: aload_2
    //   125: invokevirtual 352	org/andengine/ui/activity/BaseGameActivity:a	(Lorg/andengine/ui/b;)V
    //   128: aload_0
    //   129: monitorexit
    //   130: return
    //   131: astore_3
    //   132: new 170	java/lang/StringBuilder
    //   135: dup
    //   136: aload_0
    //   137: invokevirtual 217	java/lang/Object:getClass	()Ljava/lang/Class;
    //   140: invokevirtual 176	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   143: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   146: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   149: ldc_w 354
    //   152: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 221
    //   157: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokestatic 227	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   163: invokevirtual 230	java/lang/Thread:getName	()Ljava/lang/String;
    //   166: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: ldc 232
    //   171: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: aload_3
    //   178: invokestatic 105	org/andengine/d/e/a:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   181: goto -53 -> 128
    //   184: astore_1
    //   185: aload_0
    //   186: monitorexit
    //   187: aload_1
    //   188: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	BaseGameActivity
    //   184	4	1	localObject	Object
    //   74	51	2	localc	c
    //   131	47	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   75	128	131	java/lang/Throwable
    //   2	75	184	finally
    //   75	128	184	finally
    //   132	181	184	finally
  }
  
  /* Error */
  public void r()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 235	org/andengine/ui/activity/BaseGameActivity:c	Z
    //   7: aload_0
    //   8: getfield 247	org/andengine/ui/activity/BaseGameActivity:e	Z
    //   11: ifeq +12 -> 23
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 247	org/andengine/ui/activity/BaseGameActivity:e	Z
    //   19: aload_0
    //   20: invokevirtual 238	org/andengine/ui/activity/BaseGameActivity:t	()V
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: astore_2
    //   27: new 170	java/lang/StringBuilder
    //   30: dup
    //   31: aload_0
    //   32: invokevirtual 217	java/lang/Object:getClass	()Ljava/lang/Class;
    //   35: invokevirtual 176	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   38: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   41: invokespecial 185	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: ldc_w 357
    //   47: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc 221
    //   52: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokestatic 227	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   58: invokevirtual 230	java/lang/Thread:getName	()Ljava/lang/String;
    //   61: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc 232
    //   66: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: aload_2
    //   73: invokestatic 105	org/andengine/d/e/a:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   76: goto -53 -> 23
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	BaseGameActivity
    //   79	4	1	localObject	Object
    //   26	47	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   19	23	26	java/lang/Throwable
    //   2	19	79	finally
    //   19	23	79	finally
    //   27	76	79	finally
  }
  
  public void s()
  {
    try
    {
      org.andengine.d.e.a.b(getClass().getSimpleName() + ".onResumeGame" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      this.k.b();
      this.b = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void t()
  {
    org.andengine.d.e.a.b(getClass().getSimpleName() + ".onReloadResources" + " @(Thread: '" + Thread.currentThread().getName() + "')");
    this.k.l();
  }
  
  public void u()
  {
    try
    {
      org.andengine.d.e.a.b(getClass().getSimpleName() + ".onPauseGame" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      this.b = true;
      this.k.c();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void v()
  {
    org.andengine.d.e.a.b(getClass().getSimpleName() + ".onDestroyResources" + " @(Thread: '" + Thread.currentThread().getName() + "')");
    if (this.k.d().d().c()) {
      A().b();
    }
    if (this.k.d().d().b()) {
      z().b();
    }
  }
  
  public void w()
  {
    try
    {
      org.andengine.d.e.a.b(getClass().getSimpleName() + ".onGameDestroyed" + " @(Thread: '" + Thread.currentThread().getName() + "')");
      this.c = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public org.andengine.b.a x()
  {
    return this.k;
  }
  
  public org.andengine.opengl.c.e y()
  {
    return this.k.h();
  }
  
  public c z()
  {
    return this.k.i();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.ui.activity.BaseGameActivity
 * JD-Core Version:    0.7.0.1
 */