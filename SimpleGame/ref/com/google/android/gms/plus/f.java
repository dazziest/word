package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class f
  extends FrameLayout
{
  public f(Context paramContext, int paramInt)
  {
    super(paramContext);
    Button localButton = new Button(paramContext);
    localButton.setEnabled(false);
    localButton.setBackgroundDrawable(a().a(paramInt));
    Point localPoint = a(paramInt);
    addView(localButton, new FrameLayout.LayoutParams(localPoint.x, localPoint.y, 17));
  }
  
  private Point a(int paramInt)
  {
    int i = 24;
    int j = 20;
    Point localPoint = new Point();
    switch (paramInt)
    {
    default: 
      int k = i;
      i = 38;
      j = k;
    }
    for (;;)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      float f1 = TypedValue.applyDimension(1, i, localDisplayMetrics);
      float f2 = TypedValue.applyDimension(1, j, localDisplayMetrics);
      localPoint.x = ((int)(0.5D + f1));
      localPoint.y = ((int)(0.5D + f2));
      return localPoint;
      i = 32;
      continue;
      j = 14;
      continue;
      i = 50;
    }
  }
  
  private k a()
  {
    Object localObject = new i(getContext(), null);
    if (!((k)localObject).a()) {
      localObject = new j(getContext(), null);
    }
    if (!((k)localObject).a()) {
      localObject = new h(getContext(), null);
    }
    return localObject;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.f
 * JD-Core Version:    0.7.0.1
 */