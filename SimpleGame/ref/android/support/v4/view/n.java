package android.support.v4.view;

import android.os.Build.VERSION;

public class n
{
  static final o a = new p();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new q();
      return;
    }
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.n
 * JD-Core Version:    0.7.0.1
 */