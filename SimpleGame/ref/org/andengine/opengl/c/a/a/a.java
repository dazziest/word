package org.andengine.opengl.c.a.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.ArrayList;
import org.andengine.opengl.c.f;

public class a
  extends org.andengine.opengl.c.a.c
{
  private final org.andengine.opengl.c.b.a j;
  
  public a(org.andengine.opengl.c.e parame, int paramInt1, int paramInt2, org.andengine.opengl.c.b.a parama, f paramf, org.andengine.opengl.c.a.b paramb)
  {
    super(parame, paramInt1, paramInt2, parama.b(), paramf, paramb);
    this.j = parama;
  }
  
  public a(org.andengine.opengl.c.e parame, int paramInt1, int paramInt2, f paramf)
  {
    this(parame, paramInt1, paramInt2, org.andengine.opengl.c.b.a.a, paramf, null);
  }
  
  protected void e(org.andengine.opengl.util.e parame)
  {
    org.andengine.opengl.c.c localc = this.j.b();
    int i = localc.a();
    int k = localc.b();
    int m = localc.c();
    GLES20.glTexImage2D(3553, 0, i, this.g, this.h, 0, k, m, null);
    boolean bool = this.c.n;
    Bitmap.Config localConfig;
    ArrayList localArrayList;
    int n;
    org.andengine.opengl.c.a.b localb;
    if (bool)
    {
      localConfig = this.j.a();
      localArrayList = this.i;
      n = localArrayList.size();
      localb = k();
    }
    org.andengine.opengl.c.a.a.a.b localb1;
    Bitmap localBitmap;
    for (int i1 = 0;; i1++)
    {
      if (i1 >= n)
      {
        return;
        localConfig = Bitmap.Config.ARGB_8888;
        break;
      }
      localb1 = (org.andengine.opengl.c.a.a.a.b)localArrayList.get(i1);
      try
      {
        localBitmap = localb1.a(localConfig);
        if (localBitmap != null) {
          break label210;
        }
        throw new org.andengine.d.f.b("Caused by: " + localb1.getClass().toString() + " --> " + localb1.toString() + " returned a null Bitmap.");
      }
      catch (org.andengine.d.f.b localb2)
      {
        if (localb == null) {
          break label352;
        }
      }
      localb.a(this, localb1, localb2);
    }
    label210:
    if ((org.andengine.d.g.a.a(localBitmap.getWidth())) && (org.andengine.d.g.a.a(localBitmap.getHeight())) && (localc == org.andengine.opengl.c.c.d)) {}
    for (int i2 = 1;; i2 = 0)
    {
      if (i2 == 0) {
        GLES20.glPixelStorei(3317, 1);
      }
      if (bool) {
        GLUtils.texSubImage2D(3553, 0, localb1.a(), localb1.b(), localBitmap, k, m);
      }
      for (;;)
      {
        if (i2 == 0) {
          GLES20.glPixelStorei(3317, 4);
        }
        localBitmap.recycle();
        if (localb == null) {
          break;
        }
        localb.a(this, localb1);
        break;
        parame.a(3553, 0, localb1.a(), localb1.b(), localBitmap, this.b);
      }
      label352:
      throw localb2;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.a.a.a
 * JD-Core Version:    0.7.0.1
 */