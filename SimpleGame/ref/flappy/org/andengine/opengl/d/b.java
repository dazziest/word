package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.BufferUtils;

public class b
  extends d
{
  protected final float[] a;
  protected final FloatBuffer b;
  
  public b(e parame, int paramInt, a parama, boolean paramBoolean, c paramc)
  {
    super(parame, paramInt, parama, paramBoolean, paramc);
    this.a = new float[paramInt];
    if (org.andengine.d.i.a.d)
    {
      this.b = this.f.asFloatBuffer();
      return;
    }
    this.b = null;
  }
  
  protected void a()
  {
    if (org.andengine.d.i.a.d)
    {
      this.b.position(0);
      this.b.put(this.a);
      GLES20.glBufferData(34962, this.f.capacity(), this.f, this.e);
      return;
    }
    BufferUtils.a(this.f, this.a, this.a.length, 0);
    GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.b
 * JD-Core Version:    0.7.0.1
 */