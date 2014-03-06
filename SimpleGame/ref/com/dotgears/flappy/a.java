package com.dotgears.flappy;

import com.dotgears.d;
import com.dotgears.e;
import com.dotgears.g;
import com.dotgears.i;
import com.dotgears.j;
import com.dotgears.q;

public class a
  extends q
{
  private e A;
  private int B = 30;
  float q;
  float r;
  float s;
  float t;
  float u;
  boolean v;
  boolean w;
  int x;
  float y;
  int z;
  
  public a()
  {
    a("bird", 20, 20, 14, 14);
    int[] arrayOfInt = new int[12];
    arrayOfInt[1] = 1;
    arrayOfInt[2] = 2;
    arrayOfInt[3] = 1;
    arrayOfInt[5] = 1;
    arrayOfInt[6] = 2;
    arrayOfInt[7] = 1;
    arrayOfInt[9] = 1;
    arrayOfInt[10] = 2;
    arrayOfInt[11] = 1;
    a(0, "flap", arrayOfInt, 12, 30, false);
    a(1, "auto", arrayOfInt, 12, 10, true);
    this.w = true;
    this.z = (j.a() % 3);
    this.A = new e();
  }
  
  public void a()
  {
    super.a(80, 246);
    this.q = 0.0F;
    this.t = 0.0F;
    this.u = 1.0F;
    this.s = 0.4F;
    this.v = false;
    this.w = true;
    this.x = 0;
    a(1, true);
    this.z = (j.a() % 3);
  }
  
  public void a(float paramFloat)
  {
    super.a(paramFloat);
    if (!this.w)
    {
      this.y = 0.0F;
      this.t += this.u;
      if (this.t > 8.0F) {
        this.t = 8.0F;
      }
      this.c = ((int)(this.c + this.t));
      if (this.c > 400 - this.f)
      {
        this.c = (400 - this.f);
        this.u = 0.0F;
        this.t = 0.0F;
      }
      this.q += this.r;
      this.r += this.s;
      if (this.q < -20.0F) {
        this.q = -20.0F;
      }
      if (this.q > 90.0F) {
        this.q = 90.0F;
      }
      this.B = (-1 + this.B);
      if (this.B == 0) {
        this.B = 30;
      }
      if (this.A.m) {
        this.A.a(paramFloat);
      }
      return;
    }
    this.x = (8 + this.x);
    if (this.x == 360) {
      this.x = 0;
    }
    this.y = (4.0F * j.b(this.x));
  }
  
  public void a(g paramg)
  {
    if (!this.n) {
      return;
    }
    i locali = this.p[(1 + 3 * this.z)];
    if ((this.j != null) && (!this.j.a)) {
      locali = this.p[(this.j.j + 3 * this.z)];
    }
    paramg.a(locali, this.b - this.g, this.c - this.h + (int)this.y, 1.0F, (int)this.q);
  }
  
  public void b()
  {
    if (this.w) {
      this.w = false;
    }
    if (this.c < 0) {}
    while (this.v) {
      return;
    }
    a(0, true);
    this.t = -5.0F;
    this.u = 0.3F;
    this.r = -10.0F;
    this.s = 0.4F;
    c.D.a(4, null, 5);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.flappy.a
 * JD-Core Version:    0.7.0.1
 */