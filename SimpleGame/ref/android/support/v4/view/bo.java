package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public class bo
{
  static final br a = new bt();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 18)
    {
      a = new bs();
      return;
    }
    if (i >= 14)
    {
      a = new bq();
      return;
    }
    if (i >= 11)
    {
      a = new bp();
      return;
    }
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bo
 * JD-Core Version:    0.7.0.1
 */