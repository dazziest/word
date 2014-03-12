package org.andengine.d.i;

import android.os.Build.VERSION;

public class a
{
  public static final boolean a;
  public static final boolean b;
  public static final boolean c;
  public static final boolean d;
  public static final boolean e;
  
  static
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label25:
    boolean bool4;
    label39:
    boolean bool5;
    if (Build.VERSION.SDK_INT >= 5)
    {
      bool2 = bool1;
      a = bool2;
      if (Build.VERSION.SDK_INT < 8) {
        break label77;
      }
      bool3 = bool1;
      b = bool3;
      if (Build.VERSION.SDK_INT < 9) {
        break label82;
      }
      bool4 = bool1;
      c = bool4;
      if (Build.VERSION.SDK_INT < 11) {
        break label87;
      }
      bool5 = bool1;
      label54:
      d = bool5;
      if (Build.VERSION.SDK_INT < 14) {
        break label93;
      }
    }
    for (;;)
    {
      e = bool1;
      return;
      bool2 = false;
      break;
      label77:
      bool3 = false;
      break label25;
      label82:
      bool4 = false;
      break label39;
      label87:
      bool5 = false;
      break label54;
      label93:
      bool1 = false;
    }
  }
  
  public static boolean a(int paramInt)
  {
    return Build.VERSION.SDK_INT <= paramInt;
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return (Build.VERSION.SDK_INT >= paramInt1) && (Build.VERSION.SDK_INT <= paramInt2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.i.a
 * JD-Core Version:    0.7.0.1
 */