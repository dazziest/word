package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class bj
{
  static final bm a = new bk();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bl();
      return;
    }
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bj
 * JD-Core Version:    0.7.0.1
 */