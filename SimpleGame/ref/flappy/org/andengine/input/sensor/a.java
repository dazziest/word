package org.andengine.input.sensor;

import java.util.Arrays;

public class a
{
  protected final float[] a;
  protected int b;
  protected int c;
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    System.arraycopy(paramArrayOfFloat, 0, this.a, 0, paramArrayOfFloat.length);
  }
  
  public String toString()
  {
    return "Values: " + Arrays.toString(this.a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.sensor.a
 * JD-Core Version:    0.7.0.1
 */