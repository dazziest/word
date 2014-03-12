package org.andengine.d.g;

import android.util.FloatMath;
import java.util.Random;

public final class a
{
  public static final Random a = new Random(System.nanoTime());
  
  public static final float a(float paramFloat)
  {
    return 0.01745329F * paramFloat;
  }
  
  public static final boolean a(int paramInt)
  {
    return (paramInt != 0) && ((paramInt & paramInt - 1) == 0);
  }
  
  public static float[] a(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f2;
    float f3;
    if (paramFloat1 != 0.0F)
    {
      float f1 = a(paramFloat1);
      f2 = FloatMath.sin(f1);
      f3 = FloatMath.cos(f1);
    }
    for (int i = -2 + paramArrayOfFloat.length;; i -= 2)
    {
      if (i < 0) {
        return paramArrayOfFloat;
      }
      float f4 = paramArrayOfFloat[i];
      float f5 = paramArrayOfFloat[(i + 1)];
      paramArrayOfFloat[i] = (paramFloat2 + (f3 * (f4 - paramFloat2) - f2 * (f5 - paramFloat3)));
      paramArrayOfFloat[(i + 1)] = (paramFloat3 + (f2 * (f4 - paramFloat2) + f3 * (f5 - paramFloat3)));
    }
  }
  
  public static float[] b(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return a(paramArrayOfFloat, -paramFloat1, paramFloat2, paramFloat3);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.g.a
 * JD-Core Version:    0.7.0.1
 */