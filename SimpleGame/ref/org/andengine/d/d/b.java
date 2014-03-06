package org.andengine.d.d;

public class b
{
  private static final float[] a = new float[3];
  
  public static final float a(int paramInt)
  {
    return Float.intBitsToFloat(paramInt & 0xFFFFFFFF);
  }
  
  public static final int a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (int)(255.0F * paramFloat4) << 24 | (int)(255.0F * paramFloat1) << 16 | (int)(255.0F * paramFloat2) << 8 | (int)(255.0F * paramFloat3) << 0;
  }
  
  public static final int b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (int)(255.0F * paramFloat4) << 24 | (int)(255.0F * paramFloat3) << 16 | (int)(255.0F * paramFloat2) << 8 | (int)(255.0F * paramFloat1) << 0;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.d.b
 * JD-Core Version:    0.7.0.1
 */