package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.e;

public class d
  extends g
{
  public static int a = -1;
  public static int b = -1;
  private static d c;
  
  private d()
  {
    super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n}");
  }
  
  public static d a()
  {
    if (c == null) {
      c = new d();
    }
    return c;
  }
  
  protected void a(e parame)
  {
    GLES20.glBindAttribLocation(this.h, 0, "a_position");
    GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
    super.a(parame);
    a = a("u_modelViewProjectionMatrix");
    b = a("u_texture_0");
  }
  
  public void a(e parame, c paramc)
  {
    GLES20.glDisableVertexAttribArray(1);
    super.a(parame, paramc);
    GLES20.glUniformMatrix4fv(a, 1, false, parame.p(), 0);
    GLES20.glUniform1i(b, 0);
  }
  
  public void b(e parame)
  {
    GLES20.glEnableVertexAttribArray(1);
    super.b(parame);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.b.d
 * JD-Core Version:    0.7.0.1
 */