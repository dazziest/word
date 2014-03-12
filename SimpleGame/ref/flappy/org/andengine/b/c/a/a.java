package org.andengine.b.c.a;

import android.view.View.MeasureSpec;

public abstract class a
  implements c
{
  protected static void a(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    if ((i != 1073741824) || (j != 1073741824)) {
      throw new IllegalStateException("This IResolutionPolicy requires MeasureSpec.EXACTLY ! That means ");
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.c.a.a
 * JD-Core Version:    0.7.0.1
 */