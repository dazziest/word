package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public class ao
{
  static final ar a = new ap();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new aq();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ao
 * JD-Core Version:    0.7.0.1
 */