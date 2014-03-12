package com.google.android.gms.internal;

import java.util.ArrayList;

public abstract class ct
{
  private Object a;
  private boolean c;
  
  public ct(cr paramcr, Object paramObject)
  {
    this.a = paramObject;
    this.c = false;
  }
  
  protected abstract void a();
  
  protected abstract void a(Object paramObject);
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/google/android/gms/internal/ct:a	Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 21	com/google/android/gms/internal/ct:c	Z
    //   11: ifeq +33 -> 44
    //   14: ldc 26
    //   16: new 28	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   23: ldc 31
    //   25: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_0
    //   29: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   32: ldc 40
    //   34: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 50	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   43: pop
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_2
    //   47: ifnull +36 -> 83
    //   50: aload_0
    //   51: aload_2
    //   52: invokevirtual 52	com/google/android/gms/internal/ct:a	(Ljava/lang/Object;)V
    //   55: aload_0
    //   56: monitorenter
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield 21	com/google/android/gms/internal/ct:c	Z
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_0
    //   65: invokevirtual 54	com/google/android/gms/internal/ct:c	()V
    //   68: return
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    //   74: astore 4
    //   76: aload_0
    //   77: invokevirtual 56	com/google/android/gms/internal/ct:a	()V
    //   80: aload 4
    //   82: athrow
    //   83: aload_0
    //   84: invokevirtual 56	com/google/android/gms/internal/ct:a	()V
    //   87: goto -32 -> 55
    //   90: astore_3
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_3
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	ct
    //   69	4	1	localObject1	Object
    //   6	46	2	localObject2	Object
    //   90	4	3	localObject3	Object
    //   74	7	4	localRuntimeException	java.lang.RuntimeException
    // Exception table:
    //   from	to	target	type
    //   2	44	69	finally
    //   44	46	69	finally
    //   70	72	69	finally
    //   50	55	74	java/lang/RuntimeException
    //   57	64	90	finally
    //   91	93	90	finally
  }
  
  public void c()
  {
    d();
    synchronized (cr.c(this.b))
    {
      cr.c(this.b).remove(this);
      return;
    }
  }
  
  public void d()
  {
    try
    {
      this.a = null;
      return;
    }
    finally {}
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ct
 * JD-Core Version:    0.7.0.1
 */