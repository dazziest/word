package org.andengine.d.b.a;

public class a
{
  public static int a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    float f1 = paramFloat3 - paramFloat1;
    float f2 = paramFloat4 - paramFloat2;
    float f3 = paramFloat5 - paramFloat1;
    float f4 = paramFloat6 - paramFloat2;
    float f5 = f3 * f2 - f4 * f1;
    if (f5 == 0.0F)
    {
      f5 = f3 * f1 + f4 * f2;
      if (f5 > 0.0F)
      {
        float f6 = f3 - f1;
        float f7 = f4 - f2;
        f5 = f6 * f1 + f7 * f2;
        if (f5 < 0.0F) {
          f5 = 0.0F;
        }
      }
    }
    if (f5 < 0.0F) {
      return -1;
    }
    if (f5 > 0.0F) {
      return 1;
    }
    return 0;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.b.a.a
 * JD-Core Version:    0.7.0.1
 */