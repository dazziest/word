package org.andengine.input.sensor.a;

import java.util.Arrays;

public class a
  extends org.andengine.input.sensor.a
{
  private static final f[] d = new f[4];
  
  static
  {
    d[0] = new b();
    d[1] = new c();
    d[2] = new d();
    d[3] = new e();
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    super.a(paramArrayOfFloat);
    d[this.c].a(this.a);
  }
  
  public String toString()
  {
    return "Acceleration: " + Arrays.toString(this.a);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.sensor.a.a
 * JD-Core Version:    0.7.0.1
 */