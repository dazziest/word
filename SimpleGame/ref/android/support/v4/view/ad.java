package android.support.v4.view;

import android.view.MotionEvent;

class ad
{
  public static int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getPointerCount();
  }
  
  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.findPointerIndex(paramInt);
  }
  
  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getPointerId(paramInt);
  }
  
  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getX(paramInt);
  }
  
  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getY(paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ad
 * JD-Core Version:    0.7.0.1
 */