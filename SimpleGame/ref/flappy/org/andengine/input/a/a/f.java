package org.andengine.input.a.a;

import android.view.MotionEvent;

public class f
  extends a
{
  private void a(int paramInt, MotionEvent paramMotionEvent)
  {
    int i = c(paramMotionEvent);
    int j = paramMotionEvent.getPointerId(i);
    a(paramMotionEvent.getX(i), paramMotionEvent.getY(i), paramInt, j, paramMotionEvent);
  }
  
  private void b(MotionEvent paramMotionEvent)
  {
    for (int i = -1 + paramMotionEvent.getPointerCount();; i--)
    {
      if (i < 0) {
        return;
      }
      int j = paramMotionEvent.getPointerId(i);
      a(paramMotionEvent.getX(i), paramMotionEvent.getY(i), 2, j, paramMotionEvent);
    }
  }
  
  private static int c(MotionEvent paramMotionEvent)
  {
    return (0xFF00 & paramMotionEvent.getAction()) >> 8;
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    int i = 0xFF & paramMotionEvent.getAction();
    switch (i)
    {
    default: 
      throw new IllegalArgumentException("Invalid Action detected: " + i);
    case 0: 
    case 5: 
      a(0, paramMotionEvent);
      return;
    case 1: 
    case 6: 
      a(1, paramMotionEvent);
      return;
    case 3: 
    case 4: 
      a(i, paramMotionEvent);
      return;
    }
    b(paramMotionEvent);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.input.a.a.f
 * JD-Core Version:    0.7.0.1
 */