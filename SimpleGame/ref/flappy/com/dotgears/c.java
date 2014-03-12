package com.dotgears;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import org.andengine.c.b.e;

public class c
  extends e
  implements org.andengine.c.b.c
{
  public static org.andengine.c.d.a[] a;
  static int c;
  public final int b = 50;
  public GameActivity d;
  public int e;
  float[] f = new float[10];
  float[] g = new float[10];
  boolean h = false;
  int i = 0;
  int j = 0;
  
  public c(GameActivity paramGameActivity, org.andengine.opengl.c.c.c paramc)
  {
    this.d = paramGameActivity;
    this.e = paramGameActivity.getSharedPreferences("FlappyBird", 0).getInt("score", 0);
    g.D = new com.dotgears.flappy.c(this.e, 0, paramGameActivity.getApplication().getResources().openRawResource(2130968576));
    g.D.a();
    j.a((int)System.currentTimeMillis());
    a = new org.andengine.c.d.a[50];
    for (int k = 0;; k++)
    {
      if (k >= 50)
      {
        a(this);
        return;
      }
      org.andengine.opengl.c.c.c localc = paramc.i();
      a[k] = new org.andengine.c.d.a(0.0F, 0.0F, localc, paramGameActivity.x().g());
      a[k].a(false);
      b(a[k]);
    }
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    org.andengine.c.d.a locala = a[c];
    locala.b(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    locala.b(paramFloat5);
    locala.a(true);
    c = 1 + c;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    org.andengine.c.d.a locala = a[c];
    j.a(paramInt1, paramInt2, 0.5F * (paramInt1 + paramInt3), 0.5F * (paramInt2 + paramInt4), paramFloat6);
    float f1 = j.A - paramInt1;
    float f2 = j.B - paramInt2;
    j.a(paramInt1, paramInt4, 0.5F * (paramInt1 + paramInt3), 0.5F * (paramInt2 + paramInt4), paramFloat6);
    float f3 = j.A - paramInt1;
    float f4 = j.B - paramInt2;
    j.a(paramInt3, paramInt2, 0.5F * (paramInt1 + paramInt3), 0.5F * (paramInt2 + paramInt4), paramFloat6);
    float f5 = j.A - paramInt1;
    float f6 = j.B - paramInt2;
    j.a(paramInt3, paramInt4, 0.5F * (paramInt1 + paramInt3), 0.5F * (paramInt2 + paramInt4), paramFloat6);
    float f7 = j.A - paramInt1;
    float f8 = j.B - paramInt2;
    locala.a(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, paramFloat4, f1, f2, f3, f4, f5, f6, f7, f8);
    locala.b(paramFloat5);
    locala.a(true);
    c = 1 + c;
  }
  
  public void a()
  {
    for (int k = 0;; k++)
    {
      if (k >= 50)
      {
        c = 0;
        return;
      }
      a[k].a(false);
    }
  }
  
  protected void a(float paramFloat)
  {
    super.a(paramFloat);
    a();
    g.D.a(this.f, this.g);
    if (this.h)
    {
      g.D.a(this.i, this.j);
      g.D.a(this.i, this.j, this.i, this.j);
      this.h = false;
    }
    g.D.b();
    int k = 0;
    if (k >= g.D.v) {
      return;
    }
    switch (g.D.w[k])
    {
    }
    for (;;)
    {
      k++;
      break;
      this.d.d();
      continue;
      this.d.c();
      continue;
      this.d.d();
      continue;
      int m = (int)g.D.x[k];
      if (this.d.o()) {
        this.d.g.b().a("CgkI5J2sk6QXEAIQAA", m);
      }
      if (m > this.e)
      {
        SharedPreferences.Editor localEditor = this.d.getSharedPreferences("FlappyBird", 0).edit();
        localEditor.clear();
        localEditor.putInt("score", (int)g.D.x[k]);
        localEditor.commit();
        this.e = m;
        continue;
        if (this.d.o())
        {
          this.d.startActivityForResult(this.d.n().a("CgkI5J2sk6QXEAIQAA"), 1);
        }
        else
        {
          this.d.p();
          continue;
          this.d.e();
          continue;
          this.d.h();
          continue;
          this.d.f();
          continue;
          this.d.i();
          continue;
          this.d.g();
          continue;
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setData(Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.dotgears.flappybird"));
          this.d.startActivity(localIntent);
        }
      }
    }
  }
  
  public boolean a(e parame, org.andengine.input.a.a parama)
  {
    if (parama.f())
    {
      if (g.D != null)
      {
        this.h = true;
        this.i = ((int)parama.b());
        this.j = ((int)parama.c());
      }
      this.f[(parama.d() % 10)] = parama.b();
      this.g[(parama.d() % 10)] = parama.c();
    }
    while ((!parama.g()) && (!parama.j()) && (!parama.i())) {
      return true;
    }
    this.f[(parama.d() % 10)] = -100.0F;
    this.g[(parama.d() % 10)] = -100.0F;
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.c
 * JD-Core Version:    0.7.0.1
 */