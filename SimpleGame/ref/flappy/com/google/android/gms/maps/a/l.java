package com.google.android.gms.maps.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

class l
  implements j
{
  private IBinder a;
  
  l(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.b.e a(com.google.android.gms.b.e parame1, com.google.android.gms.b.e parame2, Bundle paramBundle)
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
    //   18: ifnull +101 -> 119
    //   21: aload_1
    //   22: invokeinterface 34 1 0
    //   27: astore 7
    //   29: aload 4
    //   31: aload 7
    //   33: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aconst_null
    //   37: astore 8
    //   39: aload_2
    //   40: ifnull +11 -> 51
    //   43: aload_2
    //   44: invokeinterface 34 1 0
    //   49: astore 8
    //   51: aload 4
    //   53: aload 8
    //   55: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   58: aload_3
    //   59: ifnull +66 -> 125
    //   62: aload 4
    //   64: iconst_1
    //   65: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   68: aload_3
    //   69: aload 4
    //   71: iconst_0
    //   72: invokevirtual 47	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   75: aload_0
    //   76: getfield 15	com/google/android/gms/maps/a/l:a	Landroid/os/IBinder;
    //   79: iconst_4
    //   80: aload 4
    //   82: aload 5
    //   84: iconst_0
    //   85: invokeinterface 53 5 0
    //   90: pop
    //   91: aload 5
    //   93: invokevirtual 56	android/os/Parcel:readException	()V
    //   96: aload 5
    //   98: invokevirtual 59	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   101: invokestatic 64	com/google/android/gms/b/f:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/e;
    //   104: astore 10
    //   106: aload 5
    //   108: invokevirtual 67	android/os/Parcel:recycle	()V
    //   111: aload 4
    //   113: invokevirtual 67	android/os/Parcel:recycle	()V
    //   116: aload 10
    //   118: areturn
    //   119: aconst_null
    //   120: astore 7
    //   122: goto -93 -> 29
    //   125: aload 4
    //   127: iconst_0
    //   128: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   131: goto -56 -> 75
    //   134: astore 6
    //   136: aload 5
    //   138: invokevirtual 67	android/os/Parcel:recycle	()V
    //   141: aload 4
    //   143: invokevirtual 67	android/os/Parcel:recycle	()V
    //   146: aload 6
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	l
    //   0	149	1	parame1	com.google.android.gms.b.e
    //   0	149	2	parame2	com.google.android.gms.b.e
    //   0	149	3	paramBundle	Bundle
    //   3	139	4	localParcel1	Parcel
    //   8	129	5	localParcel2	Parcel
    //   134	13	6	localObject	Object
    //   27	94	7	localIBinder1	IBinder
    //   37	17	8	localIBinder2	IBinder
    //   104	13	10	locale	com.google.android.gms.b.e
    // Exception table:
    //   from	to	target	type
    //   10	17	134	finally
    //   21	29	134	finally
    //   29	36	134	finally
    //   43	51	134	finally
    //   51	58	134	finally
    //   62	75	134	finally
    //   75	106	134	finally
    //   125	131	134	finally
  }
  
  public d a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      d locald = e.a(localParcel2.readStrongBinder());
      return locald;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void a(Bundle paramBundle)
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
    //   15: ifnull +41 -> 56
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 47	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/l:a	Landroid/os/IBinder;
    //   33: iconst_3
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 53 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 56	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 67	android/os/Parcel:recycle	()V
    //   51: aload_2
    //   52: invokevirtual 67	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_2
    //   57: iconst_0
    //   58: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore 4
    //   66: aload_3
    //   67: invokevirtual 67	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 67	android/os/Parcel:recycle	()V
    //   74: aload 4
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	l
    //   0	77	1	paramBundle	Bundle
    //   3	68	2	localParcel1	Parcel
    //   7	60	3	localParcel2	Parcel
    //   64	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	64	finally
    //   18	29	64	finally
    //   29	47	64	finally
    //   56	61	64	finally
  }
  
  public void a(com.google.android.gms.b.e parame, GoogleMapOptions paramGoogleMapOptions, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    label132:
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
        IBinder localIBinder;
        if (parame != null)
        {
          localIBinder = parame.asBinder();
          localParcel1.writeStrongBinder(localIBinder);
          if (paramGoogleMapOptions != null)
          {
            localParcel1.writeInt(1);
            paramGoogleMapOptions.writeToParcel(localParcel1, 0);
            if (paramBundle == null) {
              break label132;
            }
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            this.a.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localIBinder = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public void b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void b(Bundle paramBundle)
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
    //   15: ifnull +54 -> 69
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 47	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/l:a	Landroid/os/IBinder;
    //   33: bipush 10
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 53 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 56	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 83	android/os/Parcel:readInt	()I
    //   52: ifeq +8 -> 60
    //   55: aload_1
    //   56: aload_3
    //   57: invokevirtual 87	android/os/Bundle:readFromParcel	(Landroid/os/Parcel;)V
    //   60: aload_3
    //   61: invokevirtual 67	android/os/Parcel:recycle	()V
    //   64: aload_2
    //   65: invokevirtual 67	android/os/Parcel:recycle	()V
    //   68: return
    //   69: aload_2
    //   70: iconst_0
    //   71: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   74: goto -45 -> 29
    //   77: astore 4
    //   79: aload_3
    //   80: invokevirtual 67	android/os/Parcel:recycle	()V
    //   83: aload_2
    //   84: invokevirtual 67	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	l
    //   0	90	1	paramBundle	Bundle
    //   3	81	2	localParcel1	Parcel
    //   7	73	3	localParcel2	Parcel
    //   77	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	77	finally
    //   18	29	77	finally
    //   29	60	77	finally
    //   69	74	77	finally
  }
  
  public void c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      this.a.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.l
 * JD-Core Version:    0.7.0.1
 */