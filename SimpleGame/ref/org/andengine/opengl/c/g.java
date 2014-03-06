package org.andengine.opengl.c;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.e;

public class g
  extends org.andengine.opengl.d.d
{
  public static final c a = new org.andengine.opengl.d.a.d(2).a(0, "a_position", 2, 5126, false).a(3, "a_textureCoordinates", 2, 5126, false).a();
  protected final FloatBuffer b = this.f.asFloatBuffer();
  
  public g()
  {
    super(null, 12, org.andengine.opengl.d.a.a, true, a);
    this.b.put(0, 0.0F);
    this.b.put(1, 0.0F);
    this.b.put(2, 0.0F);
    this.b.put(3, 0.0F);
    this.b.put(4, 1.0F);
    this.b.put(5, 0.0F);
    this.b.put(6, 1.0F);
    this.b.put(7, 0.0F);
    this.b.put(8, 0.0F);
    this.b.put(9, 1.0F);
    this.b.put(10, 0.0F);
    this.b.put(11, 1.0F);
  }
  
  protected void a()
  {
    GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
  }
  
  public void a(e parame, a parama)
  {
    parama.d(parame);
    a(parame, org.andengine.opengl.b.d.a());
    parame.j();
    parame.l();
    parame.a(1000000.0F, 1000000.0F, 0.0F);
    parame.a(1.0E-004F, 1.0E-004F, 0);
    a(4, 3);
    parame.k();
    b(parame, org.andengine.opengl.b.d.a());
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.g
 * JD-Core Version:    0.7.0.1
 */