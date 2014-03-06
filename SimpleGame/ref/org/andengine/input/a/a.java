package org.andengine.input.a;

import android.view.MotionEvent;

public class a
{
  private static final b f = new b(null);
  protected int a;
  protected float b;
  protected float c;
  protected int d;
  protected MotionEvent e;
  
  public static a a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    a locala = (a)f.d();
    locala.b(paramFloat1, paramFloat2, paramInt1, paramInt2, paramMotionEvent);
    return locala;
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramInt1;
    this.a = paramInt2;
    this.e = paramMotionEvent;
  }
  
  public void a()
  {
    f.c(this);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.b = paramFloat1;
    this.c = paramFloat2;
  }
  
  public float b()
  {
    return this.b;
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    this.b = (paramFloat1 + this.b);
    this.c = (paramFloat2 + this.c);
  }
  
  public float c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.a;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public boolean f()
  {
    return this.d == 0;
  }
  
  public boolean g()
  {
    return this.d == 1;
  }
  
  public boolean h()
  {
    return this.d == 2;
  }
  
  public boolean i()
  {
    return this.d == 3;
  }
  
  public boolean j()
  {
    return this.d == 4;
  }
  
  public MotionEvent k()
  {
    return this.e;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.a.a
 * JD-Core Version:    0.7.0.1
 */