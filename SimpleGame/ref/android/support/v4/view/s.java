package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public class s
{
  static final w a = new t();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new v();
      return;
    }
  }
  
  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.b(paramKeyEvent.getMetaState());
  }
  
  public static boolean a(KeyEvent paramKeyEvent, int paramInt)
  {
    return a.a(paramKeyEvent.getMetaState(), paramInt);
  }
  
  public static void b(KeyEvent paramKeyEvent)
  {
    a.a(paramKeyEvent);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.s
 * JD-Core Version:    0.7.0.1
 */