package org.andengine.opengl.d.a;

import android.opengl.GLES20;

public class a
{
  final int a;
  final String b;
  final int c;
  final int d;
  final boolean e;
  final int f;
  
  public a(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramBoolean;
    this.f = paramInt4;
  }
  
  public void a(int paramInt)
  {
    GLES20.glVertexAttribPointer(this.a, this.c, this.d, this.e, paramInt, this.f);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.a.a
 * JD-Core Version:    0.7.0.1
 */