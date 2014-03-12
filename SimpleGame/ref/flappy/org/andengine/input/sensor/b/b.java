package org.andengine.input.sensor.b;

import android.hardware.SensorManager;
import java.util.Arrays;
import org.andengine.input.sensor.a;

public class b
  extends a
{
  private final float[] d;
  private final float[] e;
  private final float[] f;
  private int g;
  
  private void a()
  {
    SensorManager.getRotationMatrix(this.f, null, this.d, this.e);
    float[] arrayOfFloat;
    switch (this.c)
    {
    case 0: 
    default: 
      arrayOfFloat = this.a;
      SensorManager.getOrientation(this.f, arrayOfFloat);
    }
    for (int i = -1 + arrayOfFloat.length;; i--)
    {
      if (i < 0)
      {
        return;
        SensorManager.remapCoordinateSystem(this.f, 2, 129, this.f);
        break;
      }
      arrayOfFloat[i] = (57.295776F * arrayOfFloat[i]);
    }
  }
  
  @Deprecated
  public void a(int paramInt)
  {
    super.a(paramInt);
  }
  
  @Deprecated
  public void a(float[] paramArrayOfFloat)
  {
    super.a(paramArrayOfFloat);
  }
  
  public void b(int paramInt)
  {
    super.a(paramInt);
  }
  
  public void b(float[] paramArrayOfFloat)
  {
    System.arraycopy(paramArrayOfFloat, 0, this.d, 0, paramArrayOfFloat.length);
    a();
  }
  
  public void c(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void c(float[] paramArrayOfFloat)
  {
    System.arraycopy(paramArrayOfFloat, 0, this.e, 0, paramArrayOfFloat.length);
    a();
  }
  
  public String toString()
  {
    return "Orientation: " + Arrays.toString(this.a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.sensor.b.b
 * JD-Core Version:    0.7.0.1
 */