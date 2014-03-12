package org.andengine.opengl.util;

import android.opengl.Matrix;

public class b
{
  final float[] a = new float[512];
  int b;
  private final float[] c = new float[32];
  
  public b()
  {
    a();
  }
  
  private static void a(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2)
  {
    paramArrayOfFloat[(paramInt + 0)] = 1.0F;
    paramArrayOfFloat[(paramInt + 1)] = ((float)Math.tan(-0.01745329F * paramFloat2));
    paramArrayOfFloat[(paramInt + 2)] = 0.0F;
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 4)] = ((float)Math.tan(-0.01745329F * paramFloat1));
    paramArrayOfFloat[(paramInt + 5)] = 1.0F;
    paramArrayOfFloat[(paramInt + 6)] = 0.0F;
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 8)] = 0.0F;
    paramArrayOfFloat[(paramInt + 9)] = 0.0F;
    paramArrayOfFloat[(paramInt + 10)] = 1.0F;
    paramArrayOfFloat[(paramInt + 11)] = 0.0F;
    paramArrayOfFloat[(paramInt + 12)] = 0.0F;
    paramArrayOfFloat[(paramInt + 13)] = 0.0F;
    paramArrayOfFloat[(paramInt + 14)] = 0.0F;
    paramArrayOfFloat[(paramInt + 15)] = 1.0F;
  }
  
  public void a()
  {
    Matrix.setIdentityM(this.a, this.b);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    a(this.c, 0, paramFloat1, paramFloat2);
    System.arraycopy(this.a, this.b, this.c, 16, 16);
    Matrix.multiplyMM(this.a, this.b, this.c, 16, this.c, 0);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Matrix.translateM(this.a, this.b, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Matrix.setRotateM(this.c, 0, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    System.arraycopy(this.a, this.b, this.c, 16, 16);
    Matrix.multiplyMM(this.a, this.b, this.c, 16, this.c, 0);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    Matrix.orthoM(this.a, this.b, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void b()
  {
    if (16 + this.b >= 512) {
      throw new c();
    }
    System.arraycopy(this.a, this.b, this.a, 16 + this.b, 16);
    this.b = (16 + this.b);
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Matrix.scaleM(this.a, this.b, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void c()
  {
    if (-16 + this.b <= -16) {
      throw new d();
    }
    this.b = (-16 + this.b);
  }
  
  public void d()
  {
    this.b = 0;
    a();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.util.b
 * JD-Core Version:    0.7.0.1
 */