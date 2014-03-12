package org.andengine.opengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import org.andengine.b.c.a.c;
import org.andengine.b.c.b;
import org.andengine.b.c.d;

public class RenderSurfaceView
  extends GLSurfaceView
{
  private g a;
  private a b;
  
  public RenderSurfaceView(Context paramContext)
  {
    super(paramContext);
    setEGLContextClientVersion(2);
  }
  
  public RenderSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setEGLContextClientVersion(2);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void a(org.andengine.b.a parama, h paramh)
  {
    if (this.b == null) {
      this.b = new a(parama.d().e().a());
    }
    setEGLConfigChooser(this.b);
    setOnTouchListener(parama);
    this.a = new g(parama, this.b, paramh);
    setRenderer(this.a);
  }
  
  public a getConfigChooser()
  {
    if (this.b == null) {
      throw new IllegalStateException(a.class.getSimpleName() + " not yet set.");
    }
    return this.b;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (isInEditMode())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    this.a.a.d().h().a(this, paramInt1, paramInt2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.view.RenderSurfaceView
 * JD-Core Version:    0.7.0.1
 */