package org.andengine.b.c.a;

import android.view.View.MeasureSpec;
import org.andengine.opengl.view.RenderSurfaceView;

public class b
  extends a
{
  private final float a;
  private final float b;
  private float c;
  private float d;
  private float e;
  private float f;
  private float g;
  private float h;
  
  public b(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  public void a(RenderSurfaceView paramRenderSurfaceView, int paramInt1, int paramInt2)
  {
    a.a(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    float f1 = this.a / this.b;
    float f3;
    float f2;
    if (i / j < f1)
    {
      f3 = f1 * j;
      f2 = j;
    }
    for (float f4 = this.b / f2;; f4 = this.a / f3)
    {
      this.c = (f4 * i);
      this.d = (f4 * j);
      this.e = ((this.a - this.c) / 2.0F);
      this.f = (this.c + this.e);
      this.h = ((this.b - this.d) / 2.0F);
      this.g = (this.d + this.h);
      paramRenderSurfaceView.a((int)f3, (int)f2);
      return;
      f2 = i / f1;
      f3 = i;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.b.c.a.b
 * JD-Core Version:    0.7.0.1
 */