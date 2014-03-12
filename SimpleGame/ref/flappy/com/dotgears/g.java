package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class g
  extends m
{
  public static g D;
  public int A;
  public l B;
  public p C;
  public final float E = 0.015F;
  public i[] a;
  public int[] b = new int[50];
  public int[] c = new int[50];
  public m[] d = new m[50];
  public int e;
  public r f;
  public int g;
  public r h;
  public int i;
  public int j;
  public int k;
  public int l;
  public n m;
  public n n;
  protected i o;
  protected i p;
  public int q = 1;
  public boolean r;
  protected int[] s = new int[10];
  protected int[] t = new int[10];
  protected int u;
  int v;
  int[] w = new int[50];
  double[] x = new double[50];
  public int y;
  public int z;
  
  public g(int paramInt1, int paramInt2, InputStream paramInputStream)
  {
    this.z = paramInt1;
    this.A = paramInt2;
    this.a = new i[512];
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
      for (;;)
      {
        String str = localBufferedReader.readLine();
        if (str == null) {
          return;
        }
        if (str.length() > 1)
        {
          String[] arrayOfString = str.split("\\s+");
          i locali = new i(arrayOfString[0], Integer.parseInt(arrayOfString[1]), Integer.parseInt(arrayOfString[2]), Float.parseFloat(arrayOfString[3]), Float.parseFloat(arrayOfString[4]), Float.parseFloat(arrayOfString[5]), Float.parseFloat(arrayOfString[6]));
          locali.f = (locali.d + locali.f);
          locali.g = (locali.e + locali.g);
          this.a[locali.i] = locali;
          Log.i("FlappyBird", locali.a + " " + locali.b + " " + locali.c + " " + locali.d + " " + locali.e + " " + locali.f + " " + locali.g);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void a()
  {
    j.x = new j();
    this.f = new r();
    this.h = new r();
    this.o = b("black");
    this.p = b("white");
    this.u = 0;
    this.m = new n();
    int i1 = 0;
    if (i1 >= 20) {
      this.n = new n();
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 >= 10)
      {
        this.B = new l("number_score");
        this.C = new p();
        this.l = 0;
        this.r = false;
        this.v = 0;
        d();
        c();
        a(false, 0, 0.5F);
        return;
        this.m.a(new o());
        i1++;
        break;
      }
      this.n.a(new e());
    }
  }
  
  public void a(int paramInt)
  {
    c(0, paramInt);
    if (paramInt > this.z) {
      this.z = paramInt;
    }
  }
  
  public void a(int paramInt, float paramFloat) {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    i locali = this.a[paramInt1];
    a(paramInt2, paramInt3, (int)(paramInt2 + paramFloat1 * locali.b), (int)(paramInt3 + paramFloat2 * locali.c), locali.d, locali.e, locali.f, locali.g, paramFloat3);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    c.a(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, int paramInt5)
  {
    c.a(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramInt5);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat)
  {
    i locali = this.a[paramInt1];
    a(paramInt2, paramInt3, paramInt2 + paramInt4, paramInt3 + paramInt5, locali.d, locali.e, locali.f, locali.g, paramFloat);
  }
  
  public void a(int paramInt, m paramm) {}
  
  public void a(int paramInt1, m paramm, int paramInt2)
  {
    this.c[this.e] = paramInt1;
    this.d[this.e] = paramm;
    this.b[this.e] = paramInt2;
    this.e = (1 + this.e);
    if (this.e >= 50) {
      this.e = 0;
    }
  }
  
  public void a(i parami, int paramInt1, int paramInt2, float paramFloat)
  {
    a(paramInt1, paramInt2, paramInt1 + parami.b, paramInt2 + parami.c, parami.d, parami.e, parami.f, parami.g, paramFloat);
  }
  
  public void a(i parami, int paramInt1, int paramInt2, float paramFloat, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt1 + parami.b, paramInt2 + parami.c, parami.d, parami.e, parami.f, parami.g, paramFloat, paramInt3);
  }
  
  public void a(boolean paramBoolean, int paramInt, float paramFloat)
  {
    if (this.f.g)
    {
      if (!paramBoolean) {
        break label39;
      }
      this.f.a(0.0F, 1.0F, 5, paramFloat);
    }
    for (;;)
    {
      this.f.a(0.0F);
      this.g = paramInt;
      return;
      label39:
      this.f.a(1.0F, 0.0F, 5, paramFloat);
    }
  }
  
  public void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    for (int i1 = 0;; i1++)
    {
      if (i1 >= 10)
      {
        this.u = 10;
        return;
      }
      this.s[i1] = ((int)paramArrayOfFloat1[i1]);
      this.t[i1] = ((int)paramArrayOfFloat2[i1]);
    }
  }
  
  public i[] a(String paramString)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    i[] arrayOfi;
    int i4;
    if (i2 >= 512)
    {
      if (i3 > 0)
      {
        arrayOfi = new i[i3];
        i4 = 0;
      }
    }
    else {
      for (;;)
      {
        if (i1 >= 512)
        {
          return arrayOfi;
          if ((this.a[i2] != null) && (this.a[i2].a.startsWith(paramString))) {
            i3++;
          }
          i2++;
          break;
        }
        if ((this.a[i1] != null) && (this.a[i1].a.startsWith(paramString)))
        {
          arrayOfi[i4] = this.a[i1];
          i4++;
        }
        i1++;
      }
    }
    return null;
  }
  
  public i b(String paramString)
  {
    for (int i1 = 0;; i1++)
    {
      if (i1 >= 512) {
        return null;
      }
      if ((this.a[i1] != null) && (this.a[i1].a.startsWith(paramString))) {
        return this.a[i1];
      }
    }
  }
  
  public void b()
  {
    this.v = 0;
    int i1;
    if (!this.r)
    {
      i1 = 0;
      if (i1 < 50) {}
    }
    else
    {
      b(0.015F);
      if (!this.r)
      {
        this.C.a(0.015F);
        this.n.a(0.015F);
        if ((!this.f.g) || (this.f.a != 0.0F))
        {
          this.f.a(0.015F);
          if (this.f.g) {
            a(this.g, this);
          }
        }
        if ((!this.h.g) || (this.h.a != 0.0F)) {
          this.h.a(0.015F);
        }
        if (this.l <= 0) {
          break label356;
        }
        this.l = (-1 + this.l);
        this.i = j.a(-this.k, this.k);
      }
    }
    for (this.j = j.a(-this.k, this.k);; this.j = 0)
    {
      this.C.a(this);
      this.n.a(this);
      if ((!this.f.g) || (this.f.a != 0.0F)) {
        a(this.o.i, -144, -256, 864, 1536, this.f.a);
      }
      if ((!this.h.g) || (this.h.a != 0.0F)) {
        a(this.p.i, -144, -256, 864, 1536, this.h.a);
      }
      return;
      if (this.b[i1] > 0)
      {
        int[] arrayOfInt = this.b;
        arrayOfInt[i1] = (-30 + arrayOfInt[i1]);
        if (this.b[i1] <= 0) {
          a(this.c[i1], this.d[i1]);
        }
      }
      i1++;
      break;
      label356:
      this.i = 0;
    }
  }
  
  public void b(float paramFloat) {}
  
  public void b(int paramInt1, int paramInt2)
  {
    ((e)this.n.c()).a(paramInt1, paramInt2);
  }
  
  public void c() {}
  
  public void c(float paramFloat)
  {
    if (this.h.g)
    {
      this.h.a(1.0F, 0.0F, 11, paramFloat);
      this.h.a(0.0F);
    }
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.w[this.v] = paramInt1;
    this.x[this.v] = paramInt2;
    this.v = (1 + this.v);
  }
  
  public void d()
  {
    this.e = 0;
    for (int i1 = 0;; i1++)
    {
      if (i1 >= 50) {
        return;
      }
      this.b[i1] = 0;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.g
 * JD-Core Version:    0.7.0.1
 */