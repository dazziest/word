package org.andengine.opengl.view;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class a
  implements GLSurfaceView.EGLConfigChooser
{
  private static final int[] a = new int[1];
  private static final int[] b;
  private static final int[] c;
  private static final int[] d;
  private final boolean e;
  private boolean f;
  private boolean g;
  private int h = -1;
  private int i = -1;
  private int j = -1;
  private int k = -1;
  private int l = -1;
  private int m = -1;
  
  static
  {
    int[] arrayOfInt1 = new int[19];
    arrayOfInt1[0] = 12324;
    arrayOfInt1[1] = 5;
    arrayOfInt1[2] = 12323;
    arrayOfInt1[3] = 6;
    arrayOfInt1[4] = 12322;
    arrayOfInt1[5] = 5;
    arrayOfInt1[6] = 12321;
    arrayOfInt1[8] = 12325;
    arrayOfInt1[10] = 12326;
    arrayOfInt1[12] = 12352;
    arrayOfInt1[13] = 4;
    arrayOfInt1[14] = 12338;
    arrayOfInt1[15] = 1;
    arrayOfInt1[16] = 12337;
    arrayOfInt1[17] = 2;
    arrayOfInt1[18] = 12344;
    b = arrayOfInt1;
    int[] arrayOfInt2 = new int[19];
    arrayOfInt2[0] = 12324;
    arrayOfInt2[1] = 5;
    arrayOfInt2[2] = 12323;
    arrayOfInt2[3] = 6;
    arrayOfInt2[4] = 12322;
    arrayOfInt2[5] = 5;
    arrayOfInt2[6] = 12321;
    arrayOfInt2[8] = 12325;
    arrayOfInt2[10] = 12326;
    arrayOfInt2[12] = 12352;
    arrayOfInt2[13] = 4;
    arrayOfInt2[14] = 12512;
    arrayOfInt2[15] = 1;
    arrayOfInt2[16] = 12513;
    arrayOfInt2[17] = 2;
    arrayOfInt2[18] = 12344;
    c = arrayOfInt2;
    int[] arrayOfInt3 = new int[15];
    arrayOfInt3[0] = 12324;
    arrayOfInt3[1] = 5;
    arrayOfInt3[2] = 12323;
    arrayOfInt3[3] = 6;
    arrayOfInt3[4] = 12322;
    arrayOfInt3[5] = 5;
    arrayOfInt3[6] = 12321;
    arrayOfInt3[8] = 12325;
    arrayOfInt3[10] = 12326;
    arrayOfInt3[12] = 12352;
    arrayOfInt3[13] = 4;
    arrayOfInt3[14] = 12344;
    d = arrayOfInt3;
  }
  
  public a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  private static int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt1, int paramInt2)
  {
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt1, a)) {
      paramInt2 = a[0];
    }
    return paramInt2;
  }
  
  private static int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, int[] paramArrayOfInt)
  {
    if (!paramEGL10.eglChooseConfig(paramEGLDisplay, paramArrayOfInt, null, 0, a)) {
      throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
    }
    return a[0];
  }
  
  private EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, b paramb)
  {
    a[0] = 0;
    if (this.e)
    {
      int i1 = a(paramEGL10, paramEGLDisplay, b);
      if (i1 > 0)
      {
        this.f = true;
        return a(paramEGL10, paramEGLDisplay, b, i1, paramb);
      }
      int i2 = a(paramEGL10, paramEGLDisplay, c);
      if (i2 > 0)
      {
        this.g = true;
        return a(paramEGL10, paramEGLDisplay, c, i2, paramb);
      }
    }
    int n = a(paramEGL10, paramEGLDisplay, d);
    if (n > 0) {
      return a(paramEGL10, paramEGLDisplay, d, n, paramb);
    }
    throw new IllegalArgumentException("No " + EGLConfig.class.getSimpleName() + " found!");
  }
  
  private EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, int[] paramArrayOfInt, int paramInt, b paramb)
  {
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[paramInt];
    if (!paramEGL10.eglChooseConfig(paramEGLDisplay, paramArrayOfInt, arrayOfEGLConfig, paramInt, a)) {
      throw new IllegalArgumentException("findEGLConfig failed!");
    }
    return a(paramEGL10, paramEGLDisplay, arrayOfEGLConfig, paramb);
  }
  
  private EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig, b paramb)
  {
    for (int n = 0;; n++)
    {
      if (n >= paramArrayOfEGLConfig.length) {
        throw new IllegalArgumentException("No EGLConfig found!");
      }
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[n];
      if (localEGLConfig != null)
      {
        int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324, 0);
        int i2 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323, 0);
        int i3 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322, 0);
        int i4 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321, 0);
        int i5 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325, 0);
        int i6 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326, 0);
        if (paramb.a(i1, i2, i3, i4, i5, i6))
        {
          this.h = i1;
          this.i = i2;
          this.j = i3;
          this.k = i4;
          this.l = i5;
          this.m = i6;
          return localEGLConfig;
        }
      }
    }
  }
  
  public boolean a()
  {
    return this.g;
  }
  
  public int b()
  {
    return this.h;
  }
  
  public int c()
  {
    return this.i;
  }
  
  public EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
  {
    try
    {
      EGLConfig localEGLConfig3 = a(paramEGL10, paramEGLDisplay, b.a);
      return localEGLConfig3;
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      try
      {
        EGLConfig localEGLConfig2 = a(paramEGL10, paramEGLDisplay, b.b);
        return localEGLConfig2;
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        try
        {
          EGLConfig localEGLConfig1 = a(paramEGL10, paramEGLDisplay, b.c);
          return localEGLConfig1;
        }
        catch (IllegalArgumentException localIllegalArgumentException3) {}
      }
    }
    return a(paramEGL10, paramEGLDisplay, b.d);
  }
  
  public int d()
  {
    return this.j;
  }
  
  public int e()
  {
    return this.k;
  }
  
  public int f()
  {
    return this.l;
  }
  
  public int g()
  {
    return this.m;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.view.a
 * JD-Core Version:    0.7.0.1
 */