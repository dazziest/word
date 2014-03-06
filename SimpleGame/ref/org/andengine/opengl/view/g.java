package org.andengine.opengl.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.andengine.b.c.b;
import org.andengine.b.c.d;
import org.andengine.opengl.util.e;

public class g
  implements GLSurfaceView.Renderer
{
  final org.andengine.b.a a;
  final a b;
  final boolean c;
  final h d;
  final e e;
  
  public g(org.andengine.b.a parama, a parama1, h paramh)
  {
    this.a = parama;
    this.b = parama1;
    this.d = paramh;
    this.e = new e();
    this.c = this.a.d().e().a();
  }
  
  /* Error */
  public void onDrawFrame(GL10 paramGL10)
  {
    // Byte code:
    //   0: ldc 29
    //   2: monitorenter
    //   3: aload_0
    //   4: getfield 49	org/andengine/opengl/view/g:c	Z
    //   7: ifeq +18 -> 25
    //   10: aload_0
    //   11: getfield 25	org/andengine/opengl/view/g:b	Lorg/andengine/opengl/view/a;
    //   14: invokevirtual 56	org/andengine/opengl/view/a:a	()Z
    //   17: ifeq +8 -> 25
    //   20: ldc 57
    //   22: invokestatic 63	android/opengl/GLES20:glClear	(I)V
    //   25: aload_0
    //   26: getfield 23	org/andengine/opengl/view/g:a	Lorg/andengine/b/a;
    //   29: aload_0
    //   30: getfield 32	org/andengine/opengl/view/g:e	Lorg/andengine/opengl/util/e;
    //   33: invokevirtual 66	org/andengine/b/a:a	(Lorg/andengine/opengl/util/e;)V
    //   36: ldc 29
    //   38: monitorexit
    //   39: return
    //   40: astore_3
    //   41: ldc 68
    //   43: aload_3
    //   44: invokestatic 73	org/andengine/d/e/a:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   47: goto -11 -> 36
    //   50: astore_2
    //   51: ldc 29
    //   53: monitorexit
    //   54: aload_2
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	g
    //   0	56	1	paramGL10	GL10
    //   50	5	2	localObject	Object
    //   40	4	3	localInterruptedException	java.lang.InterruptedException
    // Exception table:
    //   from	to	target	type
    //   25	36	40	java/lang/InterruptedException
    //   3	25	50	finally
    //   25	36	50	finally
    //   36	39	50	finally
    //   41	47	50	finally
    //   51	54	50	finally
  }
  
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
    GLES20.glViewport(0, 0, paramInt1, paramInt2);
    this.e.o();
    if (this.d != null) {
      this.d.a(this.e, paramInt1, paramInt2);
    }
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    try
    {
      d locald = this.a.d().e();
      this.e.a(locald, this.b, paramEGLConfig);
      this.e.g();
      this.e.a();
      this.e.a(locald.b());
      if (this.d != null) {
        this.d.a(this.e);
      }
      return;
    }
    finally {}
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.view.g
 * JD-Core Version:    0.7.0.1
 */