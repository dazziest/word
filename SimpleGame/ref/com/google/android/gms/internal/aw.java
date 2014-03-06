package com.google.android.gms.internal;

import android.os.IBinder;

class aw
  implements at
{
  private IBinder a;
  
  aw(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.b.e a(com.google.android.gms.b.e parame, int paramInt1, int paramInt2, java.lang.String paramString, int paramInt3)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: aload 6
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +88 -> 106
    //   21: aload_1
    //   22: invokeinterface 34 1 0
    //   27: astore 9
    //   29: aload 6
    //   31: aload 9
    //   33: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 6
    //   38: iload_2
    //   39: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   42: aload 6
    //   44: iload_3
    //   45: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   48: aload 6
    //   50: aload 4
    //   52: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   55: aload 6
    //   57: iload 5
    //   59: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   62: aload_0
    //   63: getfield 15	com/google/android/gms/internal/aw:a	Landroid/os/IBinder;
    //   66: iconst_1
    //   67: aload 6
    //   69: aload 7
    //   71: iconst_0
    //   72: invokeinterface 50 5 0
    //   77: pop
    //   78: aload 7
    //   80: invokevirtual 53	android/os/Parcel:readException	()V
    //   83: aload 7
    //   85: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   88: invokestatic 61	com/google/android/gms/b/f:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/e;
    //   91: astore 11
    //   93: aload 7
    //   95: invokevirtual 64	android/os/Parcel:recycle	()V
    //   98: aload 6
    //   100: invokevirtual 64	android/os/Parcel:recycle	()V
    //   103: aload 11
    //   105: areturn
    //   106: aconst_null
    //   107: astore 9
    //   109: goto -80 -> 29
    //   112: astore 8
    //   114: aload 7
    //   116: invokevirtual 64	android/os/Parcel:recycle	()V
    //   119: aload 6
    //   121: invokevirtual 64	android/os/Parcel:recycle	()V
    //   124: aload 8
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	aw
    //   0	127	1	parame	com.google.android.gms.b.e
    //   0	127	2	paramInt1	int
    //   0	127	3	paramInt2	int
    //   0	127	4	paramString	java.lang.String
    //   0	127	5	paramInt3	int
    //   3	117	6	localParcel1	android.os.Parcel
    //   8	107	7	localParcel2	android.os.Parcel
    //   112	13	8	localObject	Object
    //   27	81	9	localIBinder	IBinder
    //   91	13	11	locale	com.google.android.gms.b.e
    // Exception table:
    //   from	to	target	type
    //   10	17	112	finally
    //   21	29	112	finally
    //   29	93	112	finally
  }
  
  /* Error */
  public com.google.android.gms.b.e a(com.google.android.gms.b.e parame, int paramInt1, int paramInt2, java.lang.String paramString1, java.lang.String paramString2)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 6
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 7
    //   10: aload 6
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +88 -> 106
    //   21: aload_1
    //   22: invokeinterface 34 1 0
    //   27: astore 9
    //   29: aload 6
    //   31: aload 9
    //   33: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 6
    //   38: iload_2
    //   39: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   42: aload 6
    //   44: iload_3
    //   45: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   48: aload 6
    //   50: aload 4
    //   52: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   55: aload 6
    //   57: aload 5
    //   59: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield 15	com/google/android/gms/internal/aw:a	Landroid/os/IBinder;
    //   66: iconst_2
    //   67: aload 6
    //   69: aload 7
    //   71: iconst_0
    //   72: invokeinterface 50 5 0
    //   77: pop
    //   78: aload 7
    //   80: invokevirtual 53	android/os/Parcel:readException	()V
    //   83: aload 7
    //   85: invokevirtual 56	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   88: invokestatic 61	com/google/android/gms/b/f:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/e;
    //   91: astore 11
    //   93: aload 7
    //   95: invokevirtual 64	android/os/Parcel:recycle	()V
    //   98: aload 6
    //   100: invokevirtual 64	android/os/Parcel:recycle	()V
    //   103: aload 11
    //   105: areturn
    //   106: aconst_null
    //   107: astore 9
    //   109: goto -80 -> 29
    //   112: astore 8
    //   114: aload 7
    //   116: invokevirtual 64	android/os/Parcel:recycle	()V
    //   119: aload 6
    //   121: invokevirtual 64	android/os/Parcel:recycle	()V
    //   124: aload 8
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	aw
    //   0	127	1	parame	com.google.android.gms.b.e
    //   0	127	2	paramInt1	int
    //   0	127	3	paramInt2	int
    //   0	127	4	paramString1	java.lang.String
    //   0	127	5	paramString2	java.lang.String
    //   3	117	6	localParcel1	android.os.Parcel
    //   8	107	7	localParcel2	android.os.Parcel
    //   112	13	8	localObject	Object
    //   27	81	9	localIBinder	IBinder
    //   91	13	11	locale	com.google.android.gms.b.e
    // Exception table:
    //   from	to	target	type
    //   10	17	112	finally
    //   21	29	112	finally
    //   29	93	112	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aw
 * JD-Core Version:    0.7.0.1
 */