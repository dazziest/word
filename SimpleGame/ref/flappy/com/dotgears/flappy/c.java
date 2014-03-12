package com.dotgears.flappy;

import com.dotgears.g;
import com.dotgears.h;
import com.dotgears.i;
import com.dotgears.j;
import com.dotgears.l;
import com.dotgears.m;
import com.dotgears.n;
import com.dotgears.p;
import com.dotgears.r;
import java.io.InputStream;

public class c
  extends g
{
  boolean H;
  boolean I;
  a J;
  com.dotgears.f K;
  com.dotgears.f L;
  com.dotgears.f M;
  com.dotgears.f N;
  com.dotgears.f O;
  com.dotgears.f P;
  com.dotgears.f Q;
  com.dotgears.f R;
  l S;
  i T;
  i U;
  i V;
  i W;
  i X;
  i Y;
  i Z;
  i aa;
  i ab;
  int ac;
  int ad;
  int ae;
  int af;
  int ag;
  int ah;
  int ai;
  int aj;
  int ak;
  f al;
  e am;
  h an;
  int ao;
  private boolean ap = true;
  
  public c(int paramInt1, int paramInt2, InputStream paramInputStream)
  {
    super(paramInt1, paramInt2, paramInputStream);
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (paramInt1 + paramInt3 >= paramInt5) && (paramInt1 <= paramInt5 + paramInt7) && (paramInt2 + paramInt4 >= paramInt6) && (paramInt2 <= paramInt6 + paramInt8);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.H) || ((paramInt1 >= -20 + this.M.b) && (paramInt1 <= 20 + (this.M.b + this.M.d)) && (paramInt2 >= -20 + this.M.c) && (paramInt2 <= 20 + (this.M.c + this.M.e)))) {}
    do
    {
      do
      {
        return;
        if (this.J.w) {
          break;
        }
      } while (this.ao <= 0);
      this.J.b();
      return;
    } while ((!this.al.F) || (this.al.d != 1));
    this.al.d = 2;
    this.al.a.a(1.0F, 0.0F, 0, 0.5F);
    this.J.w = false;
    this.J.b();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.H) && (paramInt4 >= 482 - this.ab.c) && (paramInt4 <= 482)) {
      a(7, null, 5);
    }
  }
  
  public void a(int paramInt, m paramm)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 6: 
      e();
      a(false, 0, 0.5F);
      c(6, 0);
      return;
    case 5: 
      e();
      this.K.F = false;
      this.P.F = false;
      this.R.F = false;
      this.H = false;
      a(false, 0, 0.5F);
      this.ac = 0;
      this.J.a();
      this.ao = 2;
      this.ak = 1;
      this.y = 0;
      this.al.a();
      this.A = (1 + this.A);
      c(7, 0);
      return;
    case 2: 
      this.I = true;
      c(0, this.y);
      this.am.a();
      c(8, 0);
      return;
    case 3: 
      c(11, 0);
      return;
    case 4: 
      c(13, 0);
      return;
    }
    c(3, 0);
  }
  
  public void b(float paramFloat)
  {
    a(this.T, 0, 0, 1.0F);
    this.ac -= this.ao;
    if (this.ac <= -24) {
      this.ac = 0;
    }
    if (!this.J.w)
    {
      this.ag -= this.ao;
      this.ah -= this.ao;
      this.ai -= this.ao;
      if ((this.ao > 0) && (this.ak <= 0) && ((this.ag == this.J.b) || (this.ag == -1 + this.J.b)))
      {
        this.y = (1 + this.y);
        c(9, 0);
      }
      if (this.ag < -this.Y.b)
      {
        this.ag = this.ah;
        this.ad = this.ae;
        this.ah = this.ai;
        this.ae = this.af;
        this.ai = (this.ah + this.aj + this.Y.b);
        this.af = j.a(180, 360);
        if (this.ak > 0)
        {
          this.ak = (-1 + this.ak);
          if (this.ak == 0)
          {
            this.ah = (-this.Y.b);
            this.ag = (-this.Y.b);
          }
        }
      }
    }
    this.J.a(paramFloat);
    if (!this.H)
    {
      if ((this.J.c >= 400 - this.J.f) && (this.ao > 0))
      {
        c(1.0F);
        a(4, 0.5F);
        this.ao = 0;
        c(12, 0);
        a(2, this.C, 1000);
      }
      if ((!this.J.v) && (this.ak <= 0) && (this.ao > 0))
      {
        int i = -96 + (this.ad - this.Z.c);
        if (a(this.J.b, this.J.c, this.J.e, this.J.f, this.ag, i, this.Z.b, this.Z.c))
        {
          c(1.0F);
          a(4, 0.5F);
          this.ao = 0;
          c(12, 0);
          a(3, null, 500);
          a(2, this.C, 1000);
          int j = -96 + (this.ae - this.Z.c);
          if (!a(this.J.b, this.J.c, this.J.e, this.J.f, this.ah, j, this.Z.b, this.Z.c)) {
            break label1230;
          }
          c(1.0F);
          a(4, 0.5F);
          this.J.v = true;
          this.ao = 0;
          c(12, 0);
          a(3, null, 500);
          a(2, this.C, 1000);
        }
      }
      else
      {
        label616:
        if (this.ak <= 0)
        {
          a(this.Y, this.ag, this.ad, 1.0F);
          a(this.Z, this.ag, -96 + (this.ad - this.Z.c), 1.0F);
          a(this.Y, this.ah, this.ae, 1.0F);
          a(this.Z, this.ah, -96 + (this.ae - this.Z.c), 1.0F);
          if (this.ai < 288)
          {
            a(this.Y, this.ai, this.af, 1.0F);
            a(this.Z, this.ai, -96 + (this.af - this.Z.c), 1.0F);
          }
        }
        if ((this.C.F) && (this.C.k == 2) && (!this.K.F))
        {
          this.K.a(288 - (16 + (this.K.d + this.P.d)) >> 1, 340);
          this.P.a(16 + (this.K.b + this.K.d), 340);
        }
        if (!this.am.F) {
          break label1342;
        }
        this.am.a(paramFloat);
        this.am.a(this);
        label887:
        this.J.a(this);
        a(this.X, this.ac, 512 - this.X.c, 1.0F);
      }
    }
    for (;;)
    {
      if (this.al.F)
      {
        this.al.a(paramFloat);
        this.al.a(this);
      }
      if (this.H) {
        a(this.ab, 288 - this.ab.b >> 1, 432 - this.ab.c, 1.0F);
      }
      if (this.K.F)
      {
        this.K.a(paramFloat);
        this.K.a(this);
        this.P.a(paramFloat);
        this.P.a(this);
        if (this.K.h)
        {
          a(true, 5, 0.5F);
          c(10, 0);
        }
        if (this.P.h)
        {
          c(1, 0);
          c(10, 0);
        }
        if (this.R.F)
        {
          this.R.a(paramFloat);
          this.R.a(this);
          if (this.R.h) {
            c(2, 0);
          }
        }
      }
      return;
      if (!a(this.J.b, this.J.c, this.J.e, this.J.f, this.ag, this.ad, this.Y.b, this.Y.c)) {
        break;
      }
      c(1.0F);
      a(4, 0.5F);
      this.J.v = true;
      this.ao = 0;
      c(12, 0);
      a(3, null, 500);
      a(2, this.C, 1000);
      break;
      label1230:
      if (!a(this.J.b, this.J.c, this.J.e, this.J.f, this.ah, this.ae, this.Y.b, this.Y.c)) {
        break label616;
      }
      c(1.0F);
      a(4, 0.5F);
      this.J.v = true;
      this.ao = 0;
      c(12, 0);
      a(3, null, 500);
      a(2, this.C, 1000);
      break label616;
      label1342:
      this.an.a(144, 100, 6, 1.0F);
      this.an.a(this.y, 20);
      this.an.a(this);
      break label887;
      a(this.aa, 288 - this.aa.b >> 1, 150, 1.0F);
      this.J.b = (288 - this.J.e >> 1);
      this.J.c = (20 + (150 + this.aa.c));
      this.J.a(this);
      a(this.X, this.ac, 512 - this.X.c, 1.0F);
    }
  }
  
  public void c()
  {
    this.an = new b();
    this.K = new com.dotgears.f();
    this.K.a("button_play");
    this.P = new com.dotgears.f();
    this.P.a("button_score");
    this.L = new com.dotgears.f();
    this.L.a("button_ok");
    this.O = new com.dotgears.f();
    this.O.a("button_menu");
    this.M = new com.dotgears.f();
    this.M.a("button_pause");
    this.N = new com.dotgears.f();
    this.N.a("button_resume");
    this.Q = new com.dotgears.f();
    this.Q.a("button_share");
    this.R = new com.dotgears.f();
    this.R.a("button_rate");
    this.S = new l("number_score");
    this.U = b("bg_day");
    this.V = b("bg_night");
    this.W = b("bg_forest");
    this.X = b("land");
    this.Y = b("pipe_up");
    this.Z = b("pipe_down");
    this.aa = b("title");
    this.ab = b("brand_copyright");
    this.aj = ((288 - 3 * this.Y.b / 2) / 2);
    this.ag = (this.aj - (this.Y.b >> 1));
    this.ad = 274;
    this.ah = (this.ag + this.aj + this.Y.b);
    this.ae = 274;
    this.ai = (this.ah + this.aj + this.Y.b);
    this.af = 274;
    this.J = new a();
    this.J.a();
    this.al = new f();
    this.am = new e();
    this.H = true;
    a(6, this, 1);
  }
  
  public void e()
  {
    if (j.a() % 10 > 3) {}
    for (this.T = this.U;; this.T = this.V)
    {
      this.n.b();
      this.K.a(288 - (16 + (this.K.d + this.P.d)) >> 1, 340);
      this.P.a(16 + (this.K.b + this.K.d), 340);
      this.R.a(288 - this.R.d >> 1, 270);
      this.al.F = false;
      this.am.F = false;
      this.C.F = false;
      this.C.G = false;
      this.L.F = false;
      this.L.G = false;
      this.O.F = false;
      this.O.G = false;
      this.M.F = false;
      this.M.G = false;
      this.N.F = false;
      this.N.G = false;
      this.Q.F = false;
      this.Q.G = false;
      this.H = true;
      this.ac = 0;
      this.J.a();
      this.ao = 2;
      this.ak = 1;
      this.y = 0;
      return;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.flappy.c
 * JD-Core Version:    0.7.0.1
 */