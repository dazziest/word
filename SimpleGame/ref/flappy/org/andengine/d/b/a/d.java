package org.andengine.d.b.a;

import org.andengine.opengl.util.f;

public class d
  extends a
{
  public static boolean a(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2)
  {
    return a(paramArrayOfFloat, paramInt, 0, 1, 2, paramFloat1, paramFloat2);
  }
  
  public static boolean a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2)
  {
    int i = paramInt1 - 1;
    boolean bool1 = false;
    int j = 0;
    if (j >= paramInt1) {
      return bool1;
    }
    float f1 = f.a(paramArrayOfFloat, paramInt2, paramInt4, j);
    float f2 = f.a(paramArrayOfFloat, paramInt3, paramInt4, j);
    float f3 = f.a(paramArrayOfFloat, paramInt2, paramInt4, i);
    float f4 = f.a(paramArrayOfFloat, paramInt3, paramInt4, i);
    boolean bool3;
    if (((f2 < paramFloat2) && (f4 >= paramFloat2)) || ((f4 < paramFloat2) && (f2 >= paramFloat2) && ((f1 <= paramFloat1) || (f3 <= paramFloat1)))) {
      if (f1 + (paramFloat2 - f2) / (f4 - f2) * (f3 - f1) < paramFloat1) {
        bool3 = true;
      }
    }
    label141:
    for (boolean bool2 = bool3 ^ bool1;; bool2 = bool1)
    {
      int k = j + 1;
      bool1 = bool2;
      i = j;
      j = k;
      break;
      bool3 = false;
      break label141;
    }
  }
  
  private static boolean a(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float[] paramArrayOfFloat2, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    float f1 = f.a(paramArrayOfFloat1, paramInt1, paramInt3, paramInt4);
    float f2 = f.a(paramArrayOfFloat1, paramInt2, paramInt3, paramInt4);
    float f3 = f.a(paramArrayOfFloat1, paramInt1, paramInt3, paramInt5);
    float f4 = f.a(paramArrayOfFloat1, paramInt2, paramInt3, paramInt5);
    for (int i = paramInt6 - 2;; i--)
    {
      if (i < 0)
      {
        if (!b.a(f1, f2, f3, f4, f.a(paramArrayOfFloat2, paramInt7, paramInt9, paramInt6 - 1), f.a(paramArrayOfFloat2, paramInt8, paramInt9, paramInt6 - 1), f.a(paramArrayOfFloat2, paramInt7, paramInt9, 0), f.a(paramArrayOfFloat2, paramInt8, paramInt9, 0))) {
          break;
        }
        return true;
      }
      if (b.a(f1, f2, f3, f4, f.a(paramArrayOfFloat2, paramInt7, paramInt9, i), f.a(paramArrayOfFloat2, paramInt8, paramInt9, i), f.a(paramArrayOfFloat2, paramInt7, paramInt9, i + 1), f.a(paramArrayOfFloat2, paramInt8, paramInt9, i + 1))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat2, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    for (int i = paramInt1 - 2;; i--)
    {
      if (i < 0)
      {
        if (!a(paramArrayOfFloat1, paramInt2, paramInt3, paramInt4, paramInt1 - 1, 0, paramArrayOfFloat2, paramInt5, paramInt6, paramInt7, paramInt8)) {
          break;
        }
        return true;
      }
      if (a(paramArrayOfFloat1, paramInt2, paramInt3, paramInt4, i, i + 1, paramArrayOfFloat2, paramInt5, paramInt6, paramInt7, paramInt8)) {
        return true;
      }
    }
    if (a(paramArrayOfFloat1, paramInt1, f.a(paramArrayOfFloat2, paramInt6, paramInt8, 0), f.a(paramArrayOfFloat2, paramInt7, paramInt8, 0))) {
      return true;
    }
    return a(paramArrayOfFloat2, paramInt5, f.a(paramArrayOfFloat1, paramInt2, paramInt4, 0), f.a(paramArrayOfFloat1, paramInt3, paramInt4, 0));
  }
  
  public static boolean a(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    return a(paramArrayOfFloat1, paramInt1, 0, 1, 2, paramArrayOfFloat2, paramInt2, 0, 1, 2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.b.a.d
 * JD-Core Version:    0.7.0.1
 */