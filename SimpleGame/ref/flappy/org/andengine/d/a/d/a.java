package org.andengine.d.a.d;

import android.util.FloatMath;

public class a
{
  private float a = 1.0F;
  private float b = 0.0F;
  private float c = 0.0F;
  private float d = 1.0F;
  private float e = 0.0F;
  private float f = 0.0F;
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    float f1 = this.a;
    float f2 = this.b;
    float f3 = this.c;
    float f4 = this.d;
    float f5 = this.e;
    float f6 = this.f;
    this.a = (f1 * paramFloat1 + f2 * paramFloat3);
    this.b = (f1 * paramFloat2 + f2 * paramFloat4);
    this.c = (f3 * paramFloat1 + f4 * paramFloat3);
    this.d = (f3 * paramFloat2 + f4 * paramFloat4);
    this.e = (paramFloat5 + (f5 * paramFloat1 + f6 * paramFloat3));
    this.f = (paramFloat6 + (f5 * paramFloat2 + f6 * paramFloat4));
  }
  
  private void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    float f1 = this.a;
    float f2 = this.b;
    float f3 = this.c;
    float f4 = this.d;
    float f5 = this.e;
    float f6 = this.f;
    this.a = (paramFloat1 * f1 + paramFloat2 * f3);
    this.b = (paramFloat1 * f2 + paramFloat2 * f4);
    this.c = (paramFloat3 * f1 + paramFloat4 * f3);
    this.d = (paramFloat3 * f2 + paramFloat4 * f4);
    this.e = (f5 + (f1 * paramFloat5 + f3 * paramFloat6));
    this.f = (f6 + (paramFloat5 * f2 + paramFloat6 * f4));
  }
  
  public final void a()
  {
    this.a = 1.0F;
    this.d = 1.0F;
    this.b = 0.0F;
    this.c = 0.0F;
    this.e = 0.0F;
    this.f = 0.0F;
  }
  
  public final void a(float paramFloat)
  {
    float f1 = 0.01745329F * paramFloat;
    float f2 = FloatMath.sin(f1);
    float f3 = FloatMath.cos(f1);
    float f4 = this.a;
    float f5 = this.b;
    float f6 = this.c;
    float f7 = this.d;
    float f8 = this.e;
    float f9 = this.f;
    this.a = (f4 * f3 - f5 * f2);
    this.b = (f4 * f2 + f5 * f3);
    this.c = (f6 * f3 - f7 * f2);
    this.d = (f6 * f2 + f7 * f3);
    this.e = (f8 * f3 - f9 * f2);
    this.f = (f2 * f8 + f3 * f9);
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    this.e = (paramFloat1 + this.e);
    this.f = (paramFloat2 + this.f);
  }
  
  public final void a(a parama)
  {
    this.a = parama.a;
    this.d = parama.d;
    this.b = parama.b;
    this.c = parama.c;
    this.e = parama.e;
    this.f = parama.f;
  }
  
  public final void a(float[] paramArrayOfFloat)
  {
    int i = 0;
    int j = paramArrayOfFloat.length >> 1;
    int k = 0;
    for (;;)
    {
      j--;
      if (j < 0) {
        return;
      }
      int m = k + 1;
      float f1 = paramArrayOfFloat[k];
      k = m + 1;
      float f2 = paramArrayOfFloat[m];
      int n = i + 1;
      paramArrayOfFloat[i] = (f1 * this.a + f2 * this.c + this.e);
      i = n + 1;
      paramArrayOfFloat[n] = (f1 * this.b + f2 * this.d + this.f);
    }
  }
  
  public final void b(float paramFloat1, float paramFloat2)
  {
    this.a = (paramFloat1 * this.a);
    this.b = (paramFloat2 * this.b);
    this.c = (paramFloat1 * this.c);
    this.d = (paramFloat2 * this.d);
    this.e = (paramFloat1 * this.e);
    this.f = (paramFloat2 * this.f);
  }
  
  public final void b(a parama)
  {
    a(parama.a, parama.b, parama.c, parama.d, parama.e, parama.f);
  }
  
  public final void c(float paramFloat1, float paramFloat2)
  {
    float f1 = (float)Math.tan(-0.01745329F * paramFloat1);
    float f2 = (float)Math.tan(-0.01745329F * paramFloat2);
    float f3 = this.a;
    float f4 = this.b;
    float f5 = this.c;
    float f6 = this.d;
    float f7 = this.e;
    float f8 = this.f;
    this.a = (f3 + f4 * f1);
    this.b = (f4 + f3 * f2);
    this.c = (f5 + f6 * f1);
    this.d = (f6 + f5 * f2);
    this.e = (f7 + f1 * f8);
    this.f = (f8 + f7 * f2);
  }
  
  public final void c(a parama)
  {
    b(parama.a, parama.b, parama.c, parama.d, parama.e, parama.f);
  }
  
  public String toString()
  {
    return "Transformation{[" + this.a + ", " + this.c + ", " + this.e + "][" + this.b + ", " + this.d + ", " + this.f + "][0.0, 0.0, 1.0]}";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.a.d.a
 * JD-Core Version:    0.7.0.1
 */