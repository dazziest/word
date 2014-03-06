package org.andengine.opengl.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.andengine.opengl.c.c;
import org.andengine.opengl.c.f;
import org.andengine.opengl.util.e;

public class a
{
  protected final Paint a;
  protected final Paint.FontMetrics b;
  protected final Canvas c;
  private final org.andengine.opengl.c.a d;
  private final SparseArray e;
  private final ArrayList f;
  private final Paint g;
  
  public float a()
  {
    return this.b.ascent;
  }
  
  protected Bitmap a(d paramd)
  {
    String str = String.valueOf(paramd.a);
    Bitmap localBitmap = Bitmap.createBitmap(2 + paramd.d, 2 + paramd.e, Bitmap.Config.ARGB_8888);
    this.c.setBitmap(localBitmap);
    this.c.drawRect(0.0F, 0.0F, localBitmap.getWidth(), localBitmap.getHeight(), this.g);
    a(str, -paramd.f, -(paramd.g + a()));
    return localBitmap;
  }
  
  protected void a(String paramString, float paramFloat1, float paramFloat2)
  {
    this.c.drawText(paramString, paramFloat1 + 1.0F, 1.0F + paramFloat2, this.a);
  }
  
  public void a(e parame)
  {
    for (;;)
    {
      try
      {
        ArrayList localArrayList;
        c localc;
        boolean bool;
        int i;
        if (this.d.c())
        {
          localArrayList = this.f;
          if (localArrayList.size() > 0)
          {
            this.d.d(parame);
            localc = this.d.f();
            bool = this.d.g().n;
            i = -1 + localArrayList.size();
            if (i >= 0) {
              continue;
            }
            localArrayList.clear();
            System.gc();
          }
        }
        return;
        d locald = (d)localArrayList.get(i);
        if (!locald.a())
        {
          Bitmap localBitmap = a(locald);
          if ((!org.andengine.d.g.a.a(localBitmap.getWidth())) || (!org.andengine.d.g.a.a(localBitmap.getHeight())) || (localc != c.d)) {
            break label236;
          }
          j = 1;
          if (j == 0) {
            GLES20.glPixelStorei(3317, 1);
          }
          if (bool)
          {
            GLUtils.texSubImage2D(3553, 0, locald.b, locald.c, localBitmap);
            if (j == 0) {
              GLES20.glPixelStorei(3317, 4);
            }
            localBitmap.recycle();
          }
          else
          {
            parame.a(3553, 0, locald.b, locald.c, localBitmap, localc);
            continue;
          }
        }
        i--;
      }
      finally {}
      continue;
      label236:
      int j = 0;
    }
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 101	org/andengine/opengl/a/a:f	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 173	org/andengine/opengl/a/a:e	Landroid/util/SparseArray;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual 176	android/util/SparseArray:size	()I
    //   16: istore 4
    //   18: iload 4
    //   20: iconst_1
    //   21: isub
    //   22: istore 5
    //   24: iload 5
    //   26: ifge +6 -> 32
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_2
    //   33: aload_3
    //   34: iload 5
    //   36: invokevirtual 179	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   39: checkcast 29	org/andengine/opengl/a/d
    //   42: invokevirtual 183	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   45: pop
    //   46: iinc 5 255
    //   49: goto -25 -> 24
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	a
    //   52	4	1	localObject	Object
    //   6	27	2	localArrayList	ArrayList
    //   11	23	3	localSparseArray	SparseArray
    //   16	6	4	i	int
    //   22	25	5	j	int
    // Exception table:
    //   from	to	target	type
    //   2	18	52	finally
    //   32	46	52	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.a.a
 * JD-Core Version:    0.7.0.1
 */