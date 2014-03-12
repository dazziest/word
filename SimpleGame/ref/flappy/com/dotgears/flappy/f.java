package com.dotgears.flappy;

import com.dotgears.g;
import com.dotgears.i;
import com.dotgears.m;
import com.dotgears.r;

public class f
  extends m
{
  public r a = new r();
  public i b = g.D.b("text_ready");
  public i c = g.D.b("tutorial");
  int d;
  
  public void a()
  {
    this.F = true;
    this.G = true;
    this.a.a(0.0F, 1.0F, 0, 0.5F);
    this.d = 0;
  }
  
  public void a(float paramFloat)
  {
    this.a.a(paramFloat);
    switch (this.d)
    {
    }
    do
    {
      do
      {
        return;
      } while (!this.a.g);
      this.d = 1;
      return;
    } while (!this.a.g);
    this.F = true;
    this.G = false;
  }
  
  public void a(g paramg)
  {
    paramg.a(this.b, 288 - this.b.b >> 1, 146, this.a.a);
    paramg.a(this.c, 288 - this.c.b >> 1, 220, this.a.a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.flappy.f
 * JD-Core Version:    0.7.0.1
 */