package org.andengine.d.d;

public class a
{
  public static final float A = i.f();
  public static final int B = a.g();
  public static final int C = b.g();
  public static final int D = c.g();
  public static final int E = d.g();
  public static final int F = e.g();
  public static final int G = f.g();
  public static final int H = g.g();
  public static final int I = h.g();
  public static final int J = i.g();
  public static final a a = new a(1.0F, 1.0F, 1.0F, 1.0F);
  public static final a b = new a(0.0F, 0.0F, 0.0F, 1.0F);
  public static final a c = new a(1.0F, 0.0F, 0.0F, 1.0F);
  public static final a d = new a(1.0F, 1.0F, 0.0F, 1.0F);
  public static final a e = new a(0.0F, 1.0F, 0.0F, 1.0F);
  public static final a f = new a(0.0F, 1.0F, 1.0F, 1.0F);
  public static final a g = new a(0.0F, 0.0F, 1.0F, 1.0F);
  public static final a h = new a(1.0F, 0.0F, 1.0F, 1.0F);
  public static final a i = new a(0.0F, 0.0F, 0.0F, 0.0F);
  public static final int j = a.e();
  public static final int k = b.e();
  public static final int l = c.e();
  public static final int m = d.e();
  public static final int n = e.e();
  public static final int o = f.e();
  public static final int p = g.e();
  public static final int q = h.e();
  public static final int r = i.e();
  public static final float s = a.f();
  public static final float t = b.f();
  public static final float u = c.f();
  public static final float v = d.f();
  public static final float w = e.f();
  public static final float x = f.f();
  public static final float y = g.f();
  public static final float z = h.f();
  private float K;
  private float L;
  private float M;
  private float N;
  private int O;
  private float P;
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  private final void h()
  {
    this.O = (0xFFFFFF & this.O | (int)(255.0F * this.N) << 24);
    this.P = b.a(this.O);
  }
  
  private final void i()
  {
    this.O = b.b(this.K, this.L, this.M, this.N);
    this.P = b.a(this.O);
  }
  
  public final float a()
  {
    return this.K;
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.K = paramFloat1;
    this.L = paramFloat2;
    this.M = paramFloat3;
    this.N = paramFloat4;
    i();
  }
  
  public final void a(a parama)
  {
    this.K = parama.K;
    this.L = parama.L;
    this.M = parama.M;
    this.N = parama.N;
    this.O = parama.O;
    this.P = parama.P;
  }
  
  public final boolean a(float paramFloat)
  {
    if (this.N != paramFloat)
    {
      this.N = paramFloat;
      h();
      return true;
    }
    return false;
  }
  
  public final float b()
  {
    return this.L;
  }
  
  public boolean b(a parama)
  {
    return this.O == parama.O;
  }
  
  public final float c()
  {
    return this.M;
  }
  
  public final float d()
  {
    return this.N;
  }
  
  public final int e()
  {
    return this.O;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    Class localClass1;
    Class localClass2;
    do
    {
      do
      {
        return bool;
        bool = false;
      } while (paramObject == null);
      localClass1 = getClass();
      localClass2 = paramObject.getClass();
      bool = false;
    } while (localClass1 != localClass2);
    return b((a)paramObject);
  }
  
  public final float f()
  {
    return this.P;
  }
  
  public final int g()
  {
    return b.a(this.K, this.L, this.M, this.N);
  }
  
  public int hashCode()
  {
    return this.O;
  }
  
  public String toString()
  {
    return "[Red: " + this.K + ", Green: " + this.L + ", Blue: " + this.M + ", Alpha: " + this.N + "]";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.d.a
 * JD-Core Version:    0.7.0.1
 */