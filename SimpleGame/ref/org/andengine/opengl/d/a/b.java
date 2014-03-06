package org.andengine.opengl.d.a;

import org.andengine.opengl.GLES20Fix;

public class b
  extends a
{
  public b(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    super(paramInt1, paramString, paramInt2, paramInt3, paramBoolean, paramInt4);
  }
  
  public void a(int paramInt)
  {
    GLES20Fix.glVertexAttribPointer(this.a, this.c, this.d, this.e, paramInt, this.f);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.a.b
 * JD-Core Version:    0.7.0.1
 */