package org.andengine.opengl.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import org.andengine.b.c.d;
import org.andengine.opengl.c.c;

public class e
{
  private final float[] A = new float[16];
  private final float[] B = new float[16];
  private final int[] a = new int[1];
  private String b;
  private String c;
  private String d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j = -1;
  private int k = -1;
  private int l = -1;
  private final int[] m = new int[31];
  private int n = -1;
  private int o = 0;
  private int p = -1;
  private int q = -1;
  private boolean r = true;
  private boolean s = true;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private float w = 1.0F;
  private final b x = new b();
  private final b y = new b();
  private final float[] z = new float[16];
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.x.a(paramFloat1, paramFloat2);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.x.a(paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.x.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.y.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
  }
  
  public void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    this.x.b(paramFloat1, paramFloat2, paramInt);
  }
  
  public void a(int paramInt)
  {
    if (this.j != paramInt)
    {
      this.j = paramInt;
      GLES20.glBindBuffer(34962, paramInt);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.p != paramInt1) || (this.q != paramInt2))
    {
      this.p = paramInt1;
      this.q = paramInt2;
      GLES20.glBlendFunc(paramInt1, paramInt2);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap paramBitmap, c paramc)
  {
    Buffer localBuffer = a.a(paramBitmap, paramc, ByteOrder.BIG_ENDIAN);
    GLES20.glTexSubImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramBitmap.getWidth(), paramBitmap.getHeight(), paramc.b(), paramc.c(), localBuffer);
  }
  
  public void a(d paramd, org.andengine.opengl.view.a parama, EGLConfig paramEGLConfig)
  {
    this.b = GLES20.glGetString(7938);
    this.c = GLES20.glGetString(7937);
    this.d = GLES20.glGetString(7939);
    this.e = f(34921);
    this.f = f(36347);
    this.g = f(36349);
    this.i = f(34930);
    this.h = f(3379);
    org.andengine.d.e.a.b("VERSION: " + this.b);
    org.andengine.d.e.a.b("RENDERER: " + this.c);
    org.andengine.d.e.a.b("EGLCONFIG: " + EGLConfig.class.getSimpleName() + "(Red=" + parama.b() + ", Green=" + parama.c() + ", Blue=" + parama.d() + ", Alpha=" + parama.e() + ", Depth=" + parama.f() + ", Stencil=" + parama.g() + ")");
    org.andengine.d.e.a.b("EXTENSIONS: " + this.d);
    org.andengine.d.e.a.b("MAX_VERTEX_ATTRIBS: " + this.e);
    org.andengine.d.e.a.b("MAX_VERTEX_UNIFORM_VECTORS: " + this.f);
    org.andengine.d.e.a.b("MAX_FRAGMENT_UNIFORM_VECTORS: " + this.g);
    org.andengine.d.e.a.b("MAX_TEXTURE_IMAGE_UNITS: " + this.i);
    org.andengine.d.e.a.b("MAX_TEXTURE_SIZE: " + this.h);
    this.x.d();
    this.y.d();
    this.j = -1;
    this.k = -1;
    this.l = -1;
    Arrays.fill(this.m, -1);
    this.n = -1;
    this.o = 0;
    this.p = -1;
    this.q = -1;
    d();
    f();
    b();
    c();
    GLES20.glEnableVertexAttribArray(0);
    GLES20.glEnableVertexAttribArray(1);
    GLES20.glEnableVertexAttribArray(3);
    this.w = 1.0F;
  }
  
  public boolean a()
  {
    if (this.u) {
      return true;
    }
    this.u = true;
    GLES20.glEnable(3042);
    return false;
  }
  
  public boolean a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return d();
    }
    return e();
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.y.a(paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.y.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void b(int paramInt)
  {
    if (this.j == paramInt) {
      this.j = -1;
    }
    this.a[0] = paramInt;
    GLES20.glDeleteBuffers(1, this.a, 0);
  }
  
  public boolean b()
  {
    if (!this.u) {
      return false;
    }
    this.u = false;
    GLES20.glDisable(3042);
    return true;
  }
  
  public void c(int paramInt)
  {
    if (this.l != paramInt)
    {
      this.l = paramInt;
      GLES20.glUseProgram(paramInt);
    }
  }
  
  public boolean c()
  {
    if (!this.v) {
      return false;
    }
    this.v = false;
    GLES20.glDisable(2884);
    return true;
  }
  
  public void d(int paramInt)
  {
    if (this.m[this.o] != paramInt)
    {
      this.m[this.o] = paramInt;
      GLES20.glBindTexture(3553, paramInt);
    }
  }
  
  public boolean d()
  {
    if (this.r) {
      return true;
    }
    this.r = true;
    GLES20.glEnable(3024);
    return false;
  }
  
  public void e(int paramInt)
  {
    if (this.m[this.o] == paramInt) {
      this.m[this.o] = -1;
    }
    this.a[0] = paramInt;
    GLES20.glDeleteTextures(1, this.a, 0);
  }
  
  public boolean e()
  {
    if (!this.r) {
      return false;
    }
    this.r = false;
    GLES20.glDisable(3024);
    return true;
  }
  
  public int f(int paramInt)
  {
    GLES20.glGetIntegerv(paramInt, this.a, 0);
    return this.a[0];
  }
  
  public boolean f()
  {
    if (this.s) {
      return true;
    }
    this.s = true;
    GLES20.glEnable(2929);
    return false;
  }
  
  public boolean g()
  {
    if (!this.s) {
      return false;
    }
    this.s = false;
    GLES20.glDisable(2929);
    return true;
  }
  
  public int h()
  {
    GLES20.glGenBuffers(1, this.a, 0);
    return this.a[0];
  }
  
  public int i()
  {
    GLES20.glGenTextures(1, this.a, 0);
    return this.a[0];
  }
  
  public void j()
  {
    this.x.b();
  }
  
  public void k()
  {
    this.x.c();
  }
  
  public void l()
  {
    this.x.a();
  }
  
  public void m()
  {
    this.y.b();
  }
  
  public void n()
  {
    this.y.c();
  }
  
  public void o()
  {
    this.y.a();
  }
  
  public float[] p()
  {
    Matrix.multiplyMM(this.B, 0, this.y.a, this.y.b, this.x.a, this.x.b);
    return this.B;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.util.e
 * JD-Core Version:    0.7.0.1
 */