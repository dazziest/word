package com.dotgears;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.AdView;
import java.io.IOException;
import org.andengine.b.c.h;
import org.andengine.opengl.c.f;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

public class GameActivity
  extends SimpleBaseGameActivity
  implements com.google.example.games.basegameutils.b
{
  public AdView a;
  public org.andengine.a.c.a b;
  public org.andengine.a.c.a c;
  public org.andengine.a.c.a d;
  public org.andengine.a.c.a e;
  public org.andengine.a.c.a f;
  protected com.google.example.games.basegameutils.a g;
  protected int h = 1;
  protected String i = "BaseGameActivity";
  protected boolean j = false;
  private org.andengine.b.a.a m;
  private org.andengine.opengl.c.c.c n;
  private String[] o;
  
  public org.andengine.b.a a(org.andengine.b.c.b paramb)
  {
    return new org.andengine.b.e(paramb, 60);
  }
  
  public org.andengine.b.c.b a()
  {
    this.m = new org.andengine.b.a.a(0.0F, 0.0F, 288.0F, 512.0F);
    org.andengine.b.c.b localb = new org.andengine.b.c.b(true, org.andengine.b.c.e.c, new org.andengine.b.c.a.b(288.0F, 512.0F), this.m);
    localb.d().b(true).a(true);
    localb.e().a(true);
    localb.c().a(true);
    localb.a(h.d);
    return localb;
  }
  
  protected void b()
  {
    RelativeLayout localRelativeLayout = new RelativeLayout(this);
    FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
    this.l = new RenderSurfaceView(this);
    this.l.a(this.k, this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(BaseGameActivity.B());
    localLayoutParams.addRule(13);
    localRelativeLayout.addView(this.l, localLayoutParams);
    FrameLayout localFrameLayout = new FrameLayout(this);
    this.a = new AdView(this, com.google.ads.g.a, "a152df006159b75");
    this.a.refreshDrawableState();
    FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-2, -2, 49);
    localFrameLayout.addView(this.a, localLayoutParams2);
    localRelativeLayout.addView(localFrameLayout);
    com.google.ads.d locald = new com.google.ads.d();
    this.a.a(locald);
    setContentView(localRelativeLayout, localLayoutParams1);
  }
  
  public void c()
  {
    runOnUiThread(new a(this));
  }
  
  public void d()
  {
    runOnUiThread(new b(this));
  }
  
  public void e()
  {
    this.b.d();
  }
  
  public void f()
  {
    this.c.d();
  }
  
  public void g()
  {
    this.d.d();
  }
  
  public void h()
  {
    this.e.d();
  }
  
  public void i()
  {
    this.f.d();
  }
  
  public void j() {}
  
  public void k() {}
  
  protected void l()
  {
    org.andengine.opengl.c.a.a.b.a("gfx/");
    org.andengine.opengl.c.a.a.a locala = new org.andengine.opengl.c.a.a.a(y(), 1024, 1024, f.i);
    this.n = org.andengine.opengl.c.a.a.b.a(locala, this, "atlas.png", 0, 0);
    locala.i();
    org.andengine.a.c.b.a("sounds/");
    try
    {
      this.b = org.andengine.a.c.b.a(this.k.i(), this, "sfx_point.ogg");
      this.c = org.andengine.a.c.b.a(this.k.i(), this, "sfx_die.ogg");
      this.d = org.andengine.a.c.b.a(this.k.i(), this, "sfx_hit.ogg");
      this.e = org.andengine.a.c.b.a(this.k.i(), this, "sfx_swooshing.ogg");
      this.f = org.andengine.a.c.b.a(this.k.i(), this, "sfx_wing.ogg");
      return;
    }
    catch (IOException localIOException) {}
  }
  
  protected org.andengine.c.b.e m()
  {
    return new c(this, this.n);
  }
  
  protected com.google.android.gms.games.c n()
  {
    return this.g.b();
  }
  
  public boolean o()
  {
    return this.g.c();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.g.a(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.g = new com.google.example.games.basegameutils.a(this);
    if (this.j) {
      this.g.a(this.j, this.i);
    }
    this.g.a(this, this.h, this.o);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    System.exit(0);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      Log.i("FlappyBird", "Back key pressed.");
    }
    return false;
  }
  
  protected void onStart()
  {
    super.onStart();
    this.g.a(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    this.g.d();
  }
  
  public void p()
  {
    this.g.f();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.GameActivity
 * JD-Core Version:    0.7.0.1
 */