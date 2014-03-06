package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class cg
  implements ce
{
  private IBinder a;
  
  cg(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public int a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
      this.a.transact(5001, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void a(ca paramca)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +46 -> 61
    //   18: aload_1
    //   19: invokeinterface 50 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   36: sipush 5005
    //   39: aload_2
    //   40: aload_3
    //   41: iconst_0
    //   42: invokeinterface 34 5 0
    //   47: pop
    //   48: aload_3
    //   49: invokevirtual 37	android/os/Parcel:readException	()V
    //   52: aload_3
    //   53: invokevirtual 43	android/os/Parcel:recycle	()V
    //   56: aload_2
    //   57: invokevirtual 43	android/os/Parcel:recycle	()V
    //   60: return
    //   61: aconst_null
    //   62: astore 5
    //   64: goto -38 -> 26
    //   67: astore 4
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload 4
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	cg
    //   0	80	1	paramca	ca
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    //   67	11	4	localObject	Object
    //   24	39	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	67	finally
    //   18	26	67	finally
    //   26	52	67	finally
  }
  
  /* Error */
  public void a(ca paramca, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +54 -> 70
    //   19: aload_1
    //   20: invokeinterface 50 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_3
    //   34: iload_2
    //   35: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   38: aload_0
    //   39: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   42: sipush 5004
    //   45: aload_3
    //   46: aload 4
    //   48: iconst_0
    //   49: invokeinterface 34 5 0
    //   54: pop
    //   55: aload 4
    //   57: invokevirtual 37	android/os/Parcel:readException	()V
    //   60: aload 4
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: aload_3
    //   66: invokevirtual 43	android/os/Parcel:recycle	()V
    //   69: return
    //   70: aconst_null
    //   71: astore 6
    //   73: goto -46 -> 27
    //   76: astore 5
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: aload 5
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	cg
    //   0	90	1	paramca	ca
    //   0	90	2	paramInt	int
    //   3	81	3	localParcel1	Parcel
    //   7	72	4	localParcel2	Parcel
    //   76	12	5	localObject	Object
    //   25	47	6	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	76	finally
    //   19	27	76	finally
    //   27	60	76	finally
  }
  
  /* Error */
  public void a(ca paramca, int paramInt, java.lang.String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 6
    //   10: aload 5
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +71 -> 89
    //   21: aload_1
    //   22: invokeinterface 50 1 0
    //   27: astore 8
    //   29: aload 5
    //   31: aload 8
    //   33: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 5
    //   38: iload_2
    //   39: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   42: aload 5
    //   44: aload_3
    //   45: invokevirtual 62	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   48: aload 5
    //   50: aload 4
    //   52: invokevirtual 66	android/os/Parcel:writeByteArray	([B)V
    //   55: aload_0
    //   56: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   59: sipush 5006
    //   62: aload 5
    //   64: aload 6
    //   66: iconst_0
    //   67: invokeinterface 34 5 0
    //   72: pop
    //   73: aload 6
    //   75: invokevirtual 37	android/os/Parcel:readException	()V
    //   78: aload 6
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload 5
    //   85: invokevirtual 43	android/os/Parcel:recycle	()V
    //   88: return
    //   89: aconst_null
    //   90: astore 8
    //   92: goto -63 -> 29
    //   95: astore 7
    //   97: aload 6
    //   99: invokevirtual 43	android/os/Parcel:recycle	()V
    //   102: aload 5
    //   104: invokevirtual 43	android/os/Parcel:recycle	()V
    //   107: aload 7
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	cg
    //   0	110	1	paramca	ca
    //   0	110	2	paramInt	int
    //   0	110	3	paramString	java.lang.String
    //   0	110	4	paramArrayOfByte	byte[]
    //   3	100	5	localParcel1	Parcel
    //   8	90	6	localParcel2	Parcel
    //   95	13	7	localObject	Object
    //   27	64	8	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   10	17	95	finally
    //   21	29	95	finally
    //   29	78	95	finally
  }
  
  /* Error */
  public void a(ca paramca, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +64 -> 82
    //   21: aload_1
    //   22: invokeinterface 50 1 0
    //   27: astore 7
    //   29: aload 4
    //   31: aload 7
    //   33: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 4
    //   38: iload_2
    //   39: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   42: aload 4
    //   44: aload_3
    //   45: invokevirtual 66	android/os/Parcel:writeByteArray	([B)V
    //   48: aload_0
    //   49: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   52: sipush 5003
    //   55: aload 4
    //   57: aload 5
    //   59: iconst_0
    //   60: invokeinterface 34 5 0
    //   65: pop
    //   66: aload 5
    //   68: invokevirtual 37	android/os/Parcel:readException	()V
    //   71: aload 5
    //   73: invokevirtual 43	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: invokevirtual 43	android/os/Parcel:recycle	()V
    //   81: return
    //   82: aconst_null
    //   83: astore 7
    //   85: goto -56 -> 29
    //   88: astore 6
    //   90: aload 5
    //   92: invokevirtual 43	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 43	android/os/Parcel:recycle	()V
    //   100: aload 6
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	cg
    //   0	103	1	paramca	ca
    //   0	103	2	paramInt	int
    //   0	103	3	paramArrayOfByte	byte[]
    //   3	93	4	localParcel1	Parcel
    //   8	83	5	localParcel2	Parcel
    //   88	13	6	localObject	Object
    //   27	57	7	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   10	17	88	finally
    //   21	29	88	finally
    //   29	71	88	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public int b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
      this.a.transact(5002, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void b(ca paramca)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +46 -> 61
    //   18: aload_1
    //   19: invokeinterface 50 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   36: sipush 5008
    //   39: aload_2
    //   40: aload_3
    //   41: iconst_0
    //   42: invokeinterface 34 5 0
    //   47: pop
    //   48: aload_3
    //   49: invokevirtual 37	android/os/Parcel:readException	()V
    //   52: aload_3
    //   53: invokevirtual 43	android/os/Parcel:recycle	()V
    //   56: aload_2
    //   57: invokevirtual 43	android/os/Parcel:recycle	()V
    //   60: return
    //   61: aconst_null
    //   62: astore 5
    //   64: goto -38 -> 26
    //   67: astore 4
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload 4
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	cg
    //   0	80	1	paramca	ca
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    //   67	11	4	localObject	Object
    //   24	39	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	67	finally
    //   18	26	67	finally
    //   26	52	67	finally
  }
  
  /* Error */
  public void b(ca paramca, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +54 -> 70
    //   19: aload_1
    //   20: invokeinterface 50 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_3
    //   34: iload_2
    //   35: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   38: aload_0
    //   39: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   42: sipush 5007
    //   45: aload_3
    //   46: aload 4
    //   48: iconst_0
    //   49: invokeinterface 34 5 0
    //   54: pop
    //   55: aload 4
    //   57: invokevirtual 37	android/os/Parcel:readException	()V
    //   60: aload 4
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: aload_3
    //   66: invokevirtual 43	android/os/Parcel:recycle	()V
    //   69: return
    //   70: aconst_null
    //   71: astore 6
    //   73: goto -46 -> 27
    //   76: astore 5
    //   78: aload 4
    //   80: invokevirtual 43	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 43	android/os/Parcel:recycle	()V
    //   87: aload 5
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	cg
    //   0	90	1	paramca	ca
    //   0	90	2	paramInt	int
    //   3	81	3	localParcel1	Parcel
    //   7	72	4	localParcel2	Parcel
    //   76	12	5	localObject	Object
    //   25	47	6	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	76	finally
    //   19	27	76	finally
    //   27	60	76	finally
  }
  
  /* Error */
  public void c(ca paramca)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +46 -> 61
    //   18: aload_1
    //   19: invokeinterface 50 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 53	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/internal/cg:a	Landroid/os/IBinder;
    //   36: sipush 5009
    //   39: aload_2
    //   40: aload_3
    //   41: iconst_0
    //   42: invokeinterface 34 5 0
    //   47: pop
    //   48: aload_3
    //   49: invokevirtual 37	android/os/Parcel:readException	()V
    //   52: aload_3
    //   53: invokevirtual 43	android/os/Parcel:recycle	()V
    //   56: aload_2
    //   57: invokevirtual 43	android/os/Parcel:recycle	()V
    //   60: return
    //   61: aconst_null
    //   62: astore 5
    //   64: goto -38 -> 26
    //   67: astore 4
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload 4
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	cg
    //   0	80	1	paramca	ca
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    //   67	11	4	localObject	Object
    //   24	39	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	67	finally
    //   18	26	67	finally
    //   26	52	67	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cg
 * JD-Core Version:    0.7.0.1
 */