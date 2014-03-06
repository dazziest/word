package android.support.v4.view;

import android.view.animation.Interpolator;

final class bw
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    float f = paramFloat - 1.0F;
    return 1.0F + f * (f * (f * (f * f)));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bw
 * JD-Core Version:    0.7.0.1
 */