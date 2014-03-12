package com.dotgears;

import android.util.Log;

public class j
{
  public static float A;
  public static float B;
  public static float[] a;
  public static float[] b;
  public static float[] c;
  public static float[] d;
  public static float[] e;
  public static float[] f;
  public static float[] g;
  public static float[] h;
  public static float[] i;
  public static float[] j;
  public static float[] k;
  public static float[] l;
  public static float[] m;
  public static float[] n;
  public static float[] o;
  public static float[] p;
  public static float[] q;
  public static float[] r;
  public static float[] s;
  public static float[] t;
  public static float[] u;
  public static float[] v;
  public static float[] w;
  public static j x;
  public static int y;
  public static int z;
  
  j()
  {
    a = new float[360];
    b = new float[360];
    int i2 = 0;
    if (i2 >= 360)
    {
      c = new float[101];
      d = new float[101];
      e = new float[101];
      f = new float[101];
      g = new float[101];
      h = new float[101];
      i = new float[101];
      j = new float[101];
      k = new float[101];
      l = new float[101];
      m = new float[101];
      n = new float[101];
      o = new float[101];
      p = new float[101];
      q = new float[101];
      r = new float[101];
      s = new float[101];
      t = new float[101];
      u = new float[101];
      v = new float[101];
      w = new float[101];
    }
    for (;;)
    {
      if (i1 > 100)
      {
        return;
        float f1 = 3.141593F * i2 / 180.0F;
        a[i2] = ((float)Math.sin(f1));
        b[i2] = ((float)Math.cos(f1));
        i2++;
        break;
      }
      double d1 = i1 / 100.0D;
      c[i1] = ((float)a(d1));
      d[i1] = ((float)b(d1));
      e[i1] = ((float)c(d1));
      f[i1] = ((float)d(d1));
      g[i1] = ((float)e(d1));
      h[i1] = ((float)f(d1));
      i[i1] = ((float)g(d1));
      j[i1] = ((float)h(d1));
      k[i1] = ((float)i(d1));
      l[i1] = ((float)j(d1));
      m[i1] = ((float)k(d1));
      n[i1] = ((float)l(d1));
      o[i1] = ((float)m(d1));
      p[i1] = ((float)n(d1));
      q[i1] = ((float)o(d1));
      r[i1] = ((float)p(d1));
      s[i1] = ((float)q(d1));
      t[i1] = ((float)r(d1));
      u[i1] = ((float)s(d1));
      v[i1] = ((float)t(d1));
      w[i1] = ((float)u(d1));
      i1++;
    }
  }
  
  public static float a(float paramFloat)
  {
    float f1 = paramFloat;
    if (f1 <= 360.0F) {}
    for (;;)
    {
      if (f1 >= 0.0F)
      {
        return f1;
        f1 -= 360.0F;
        break;
      }
      f1 += 360.0F;
    }
  }
  
  public static int a()
  {
    z = 36969 * (0xFFFF & z) + (z >> 16);
    y = 18000 * (0xFFFF & y) + (y >> 16);
    return Math.abs((z << 16) + y);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 + a() % (paramInt2 - paramInt1);
  }
  
  public static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    float f1 = paramFloat1 - paramFloat3;
    float f2 = paramFloat2 - paramFloat4;
    float f3 = a(paramFloat5);
    A = paramFloat3 + (f1 * c(f3) - f2 * b(f3));
    B = paramFloat4 + (f1 * b(f3) + f2 * c(f3));
  }
  
  public static void a(int paramInt)
  {
    Log.i("FlappyBird", "Engine: Randomize " + paramInt);
    y = paramInt % 32000;
    z = paramInt % 65535;
  }
  
  public static float b(float paramFloat)
  {
    return a[((int)paramFloat)];
  }
  
  public static float b(int paramInt)
  {
    return i[paramInt];
  }
  
  static double c(double paramDouble)
  {
    if (paramDouble < 0.5D) {
      return paramDouble * (2.0D * paramDouble);
    }
    return paramDouble * (-2.0D * paramDouble) + 4.0D * paramDouble - 1.0D;
  }
  
  public static float c(float paramFloat)
  {
    return b[((int)paramFloat)];
  }
  
  public static float c(int paramInt)
  {
    return d[paramInt];
  }
  
  static double d(double paramDouble)
  {
    return paramDouble * (paramDouble * paramDouble);
  }
  
  public static float d(int paramInt)
  {
    return e[paramInt];
  }
  
  static double e(double paramDouble)
  {
    double d1 = paramDouble - 1.0D;
    return 1.0D + d1 * (d1 * d1);
  }
  
  public static float e(int paramInt)
  {
    return f[paramInt];
  }
  
  static double f(double paramDouble)
  {
    if (paramDouble < 0.5D) {
      return paramDouble * (paramDouble * (4.0D * paramDouble));
    }
    double d1 = 2.0D * paramDouble - 2.0D;
    return 1.0D + d1 * (d1 * (0.5D * d1));
  }
  
  public static float f(int paramInt)
  {
    return g[paramInt];
  }
  
  static double g(double paramDouble)
  {
    return paramDouble * (paramDouble * (paramDouble * paramDouble));
  }
  
  public static float g(int paramInt)
  {
    return h[paramInt];
  }
  
  static double h(double paramDouble)
  {
    double d1 = paramDouble - 1.0D;
    return 1.0D + d1 * (d1 * d1) * (1.0D - paramDouble);
  }
  
  public static float h(int paramInt)
  {
    return i[paramInt];
  }
  
  static double i(double paramDouble)
  {
    if (paramDouble < 0.5D) {
      return paramDouble * (paramDouble * (paramDouble * (8.0D * paramDouble)));
    }
    double d1 = paramDouble - 1.0D;
    return 1.0D + d1 * (d1 * (d1 * (-8.0D * d1)));
  }
  
  public static float i(int paramInt)
  {
    return j[paramInt];
  }
  
  static double j(double paramDouble)
  {
    return paramDouble * (paramDouble * (paramDouble * (paramDouble * paramDouble)));
  }
  
  public static float j(int paramInt)
  {
    return k[paramInt];
  }
  
  static double k(double paramDouble)
  {
    double d1 = paramDouble - 1.0D;
    return 1.0D + d1 * (d1 * (d1 * (d1 * d1)));
  }
  
  public static float k(int paramInt)
  {
    return l[paramInt];
  }
  
  static double l(double paramDouble)
  {
    if (paramDouble < 0.5D) {
      return paramDouble * (paramDouble * (paramDouble * (paramDouble * (16.0D * paramDouble))));
    }
    double d1 = 2.0D * paramDouble - 2.0D;
    return 1.0D + d1 * (d1 * (d1 * (d1 * (0.5D * d1))));
  }
  
  public static float l(int paramInt)
  {
    return m[paramInt];
  }
  
  public static float m(int paramInt)
  {
    return n[paramInt];
  }
  
  public static float n(int paramInt)
  {
    return o[paramInt];
  }
  
  public static float o(int paramInt)
  {
    return p[paramInt];
  }
  
  public static float p(int paramInt)
  {
    return q[paramInt];
  }
  
  public static float q(int paramInt)
  {
    return o[paramInt];
  }
  
  public static float r(int paramInt)
  {
    return p[paramInt];
  }
  
  public static float s(int paramInt)
  {
    return q[paramInt];
  }
  
  public static float t(int paramInt)
  {
    return u[paramInt];
  }
  
  public static float u(int paramInt)
  {
    return v[paramInt];
  }
  
  public static float v(int paramInt)
  {
    return w[paramInt];
  }
  
  double a(double paramDouble)
  {
    return paramDouble * paramDouble;
  }
  
  double b(double paramDouble)
  {
    return -(paramDouble * (paramDouble - 2.0D));
  }
  
  double m(double paramDouble)
  {
    return Math.sin(20.420352248333657D * paramDouble) * Math.pow(2.0D, 10.0D * (paramDouble - 1.0D));
  }
  
  double n(double paramDouble)
  {
    return 1.0D + Math.sin(-20.420352248333657D * (paramDouble + 1.0D)) * Math.pow(2.0D, -10.0D * paramDouble);
  }
  
  double o(double paramDouble)
  {
    if (paramDouble < 0.5D) {
      return 0.5D * Math.sin(20.420352248333657D * (2.0D * paramDouble)) * Math.pow(2.0D, 10.0D * (2.0D * paramDouble - 1.0D));
    }
    return 0.5D * (2.0D + Math.sin(-20.420352248333657D * (1.0D + (2.0D * paramDouble - 1.0D))) * Math.pow(2.0D, -10.0D * (2.0D * paramDouble - 1.0D)));
  }
  
  double p(double paramDouble)
  {
    return paramDouble * (paramDouble * paramDouble) - paramDouble * Math.sin(3.141592653589793D * paramDouble);
  }
  
  double q(double paramDouble)
  {
    double d1 = 1.0D - paramDouble;
    return 1.0D - (d1 * (d1 * d1) - d1 * Math.sin(3.141592653589793D * d1));
  }
  
  double r(double paramDouble)
  {
    if (paramDouble < 0.5D)
    {
      double d2 = 2.0D * paramDouble;
      return 0.5D * (d2 * (d2 * d2) - d2 * Math.sin(3.141592653589793D * d2));
    }
    double d1 = 1.0D - (2.0D * paramDouble - 1.0D);
    return 0.5D + 0.5D * (1.0D - (d1 * (d1 * d1) - d1 * Math.sin(3.141592653589793D * d1)));
  }
  
  double s(double paramDouble)
  {
    return 1.0D - t(1.0D - paramDouble);
  }
  
  double t(double paramDouble)
  {
    if (paramDouble < 0.3636363636363637D) {
      return paramDouble * (121.0D * paramDouble) / 16.0D;
    }
    if (paramDouble < 0.7272727272727273D) {
      return 3.4D + (paramDouble * (9.074999999999999D * paramDouble) - 9.9D * paramDouble);
    }
    if (paramDouble < 0.9D) {
      return 8.898060941828256D + (paramDouble * (12.066481994459833D * paramDouble) - 19.635457063711911D * paramDouble);
    }
    return 10.720000000000001D + (paramDouble * (10.800000000000001D * paramDouble) - 20.52D * paramDouble);
  }
  
  double u(double paramDouble)
  {
    if (paramDouble < 0.5D) {
      return 0.5D * s(paramDouble * 2.0D);
    }
    return 0.5D + 0.5D * t(paramDouble * 2.0D - 1.0D);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.dotgears.j
 * JD-Core Version:    0.7.0.1
 */