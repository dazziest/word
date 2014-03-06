package org.andengine.opengl.b;

import android.opengl.GLES20;
import java.util.HashMap;
import org.andengine.opengl.util.e;

public class g
{
  private static final int[] a = new int[1];
  private static final int[] b = new int[1];
  private static final int[] c = new int[1];
  private static final int[] d = new int[1];
  private static final int[] e = new int[1];
  private static final byte[] l = new byte[64];
  protected final org.andengine.opengl.b.b.a f;
  protected final org.andengine.opengl.b.b.a g;
  protected int h = -1;
  protected boolean i;
  protected final HashMap j = new HashMap();
  protected final HashMap k = new HashMap();
  
  public g(String paramString1, String paramString2)
  {
    this(new org.andengine.opengl.b.b.b(paramString1), new org.andengine.opengl.b.b.b(paramString2));
  }
  
  public g(org.andengine.opengl.b.b.a parama1, org.andengine.opengl.b.b.a parama2)
  {
    this.f = parama1;
    this.g = parama2;
  }
  
  private static int a(String paramString, int paramInt)
  {
    int m = GLES20.glCreateShader(paramInt);
    if (m == 0) {
      throw new org.andengine.opengl.b.a.b("Could not create Shader of type: '" + paramInt + '"');
    }
    GLES20.glShaderSource(m, paramString);
    GLES20.glCompileShader(m);
    GLES20.glGetShaderiv(m, 35713, a, 0);
    if (a[0] == 0) {
      throw new org.andengine.opengl.b.a.a(GLES20.glGetShaderInfoLog(m), paramString);
    }
    return m;
  }
  
  private void a()
  {
    this.j.clear();
    b[0] = 0;
    GLES20.glGetProgramiv(this.h, 35718, b, 0);
    int m = b[0];
    for (int n = 0;; n++)
    {
      if (n >= m) {
        return;
      }
      GLES20.glGetActiveUniform(this.h, n, 64, c, 0, d, 0, e, 0, l, 0);
      int i1 = c[0];
      String str;
      int i2;
      if (i1 == 0)
      {
        if ((i1 < 64) && (l[i1] != 0)) {}
      }
      else
      {
        str = new String(l, 0, i1);
        i2 = GLES20.glGetUniformLocation(this.h, str);
        if (i2 != -1) {
          break label214;
        }
      }
      for (int i3 = 0;; i3++) {
        if ((i3 >= 64) || (l[i3] == 0))
        {
          str = new String(l, 0, i3);
          i2 = GLES20.glGetUniformLocation(this.h, str);
          if (i2 != -1) {
            break label214;
          }
          throw new org.andengine.opengl.b.a.c("Invalid location for uniform: '" + str + "'.");
          i1++;
          break;
        }
      }
      label214:
      this.j.put(str, Integer.valueOf(i2));
    }
  }
  
  @Deprecated
  private void c()
  {
    this.k.clear();
    b[0] = 0;
    GLES20.glGetProgramiv(this.h, 35721, b, 0);
    int m = b[0];
    for (int n = 0;; n++)
    {
      if (n >= m) {
        return;
      }
      GLES20.glGetActiveAttrib(this.h, n, 64, c, 0, d, 0, e, 0, l, 0);
      int i1 = c[0];
      String str;
      int i2;
      if (i1 == 0)
      {
        if ((i1 < 64) && (l[i1] != 0)) {}
      }
      else
      {
        str = new String(l, 0, i1);
        i2 = GLES20.glGetAttribLocation(this.h, str);
        if (i2 != -1) {
          break label214;
        }
      }
      for (int i3 = 0;; i3++) {
        if ((i3 >= 64) || (l[i3] == 0))
        {
          str = new String(l, 0, i3);
          i2 = GLES20.glGetAttribLocation(this.h, str);
          if (i2 != -1) {
            break label214;
          }
          throw new org.andengine.opengl.b.a.c("Invalid location for attribute: '" + str + "'.");
          i1++;
          break;
        }
      }
      label214:
      this.k.put(str, Integer.valueOf(i2));
    }
  }
  
  public int a(String paramString)
  {
    Integer localInteger = (Integer)this.j.get(paramString);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    throw new org.andengine.opengl.b.a.b("Unexpected uniform: '" + paramString + "'. Existing uniforms: " + this.j.toString());
  }
  
  protected void a(e parame)
  {
    GLES20.glLinkProgram(this.h);
    GLES20.glGetProgramiv(this.h, 35714, a, 0);
    if (a[0] == 0) {
      throw new org.andengine.opengl.b.a.c(GLES20.glGetProgramInfoLog(this.h));
    }
    c();
    a();
    this.i = true;
  }
  
  public void a(e parame, org.andengine.opengl.d.a.c paramc)
  {
    if (!this.i) {
      c(parame);
    }
    parame.c(this.h);
    paramc.a();
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void b(e parame) {}
  
  public boolean b()
  {
    return this.i;
  }
  
  protected void c(e parame)
  {
    String str1 = this.f.a(parame);
    int m = a(str1, 35633);
    String str2 = this.g.a(parame);
    int n = a(str2, 35632);
    this.h = GLES20.glCreateProgram();
    GLES20.glAttachShader(this.h, m);
    GLES20.glAttachShader(this.h, n);
    try
    {
      a(parame);
      GLES20.glDeleteShader(m);
      GLES20.glDeleteShader(n);
      return;
    }
    catch (org.andengine.opengl.b.a.c localc)
    {
      throw new org.andengine.opengl.b.a.c("VertexShaderSource:\n##########################\n" + str1 + "\n##########################" + "\n\nFragmentShaderSource:\n##########################\n" + str2 + "\n##########################", localc);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.b.g
 * JD-Core Version:    0.7.0.1
 */