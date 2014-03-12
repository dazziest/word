package com.dotgears.flappy;

import com.dotgears.g;
import com.dotgears.i;
import com.dotgears.m;
import com.dotgears.p;
import com.dotgears.r;

public class e
  extends m
{
  public r a = new r();
  public i b = g.D.b("text_game_over");
  public int c;
  public float d;
  public float e;
  public int f;
  
  public void a()
  {
    this.F = true;
    this.G = true;
    this.a.a(0.0F, 1.0F, 11, 1.0F);
    this.c = -1;
    this.d = -2.0F;
    this.e = 0.25F;
    this.f = 0;
    c.D.c(10, 0);
  }
  
  public void a(float paramFloat)
  {
    this.a.a(paramFloat);
    if (this.c < 0)
    {
      this.c = ((int)(this.c + this.d));
      this.d += this.e;
      switch (this.f)
      {
      }
    }
    do
    {
      do
      {
        return;
        this.c = 0;
        break;
      } while (!this.a.g);
      this.f = 1;
      g.D.C.a(g.D.y, g.D.z, 10, 20, 30, 40);
      c.D.c(10, 0);
      return;
    } while (g.D.C.k != 2);
    this.f = 2;
  }
  
  public void a(g paramg)
  {
    paramg.a(this.b, 288 - this.b.b >> 1, 130 + this.c, this.a.a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.flappy.e
 * JD-Core Version:    0.7.0.1
 */