package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.a.d;
import com.google.android.gms.maps.model.a.e;

class ab
  implements z
{
  private IBinder a;
  
  ab(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public a a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      a locala = b.a(localParcel2.readStrongBinder());
      return locala;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public m a(com.google.android.gms.b.e parame, com.google.android.gms.maps.GoogleMapOptions paramGoogleMapOptions)
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
    //   16: ifnull +74 -> 90
    //   19: aload_1
    //   20: invokeinterface 55 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_2
    //   34: ifnull +62 -> 96
    //   37: aload_3
    //   38: iconst_1
    //   39: invokevirtual 62	android/os/Parcel:writeInt	(I)V
    //   42: aload_2
    //   43: aload_3
    //   44: iconst_0
    //   45: invokevirtual 68	com/google/android/gms/maps/GoogleMapOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   48: aload_0
    //   49: getfield 15	com/google/android/gms/maps/a/ab:a	Landroid/os/IBinder;
    //   52: iconst_3
    //   53: aload_3
    //   54: aload 4
    //   56: iconst_0
    //   57: invokeinterface 34 5 0
    //   62: pop
    //   63: aload 4
    //   65: invokevirtual 37	android/os/Parcel:readException	()V
    //   68: aload 4
    //   70: invokevirtual 41	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   73: invokestatic 73	com/google/android/gms/maps/a/n:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/a/m;
    //   76: astore 8
    //   78: aload 4
    //   80: invokevirtual 49	android/os/Parcel:recycle	()V
    //   83: aload_3
    //   84: invokevirtual 49	android/os/Parcel:recycle	()V
    //   87: aload 8
    //   89: areturn
    //   90: aconst_null
    //   91: astore 6
    //   93: goto -66 -> 27
    //   96: aload_3
    //   97: iconst_0
    //   98: invokevirtual 62	android/os/Parcel:writeInt	(I)V
    //   101: goto -53 -> 48
    //   104: astore 5
    //   106: aload 4
    //   108: invokevirtual 49	android/os/Parcel:recycle	()V
    //   111: aload_3
    //   112: invokevirtual 49	android/os/Parcel:recycle	()V
    //   115: aload 5
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	ab
    //   0	118	1	parame	com.google.android.gms.b.e
    //   0	118	2	paramGoogleMapOptions	com.google.android.gms.maps.GoogleMapOptions
    //   3	109	3	localParcel1	Parcel
    //   7	100	4	localParcel2	Parcel
    //   104	12	5	localObject	Object
    //   25	67	6	localIBinder	IBinder
    //   76	12	8	localm	m
    // Exception table:
    //   from	to	target	type
    //   9	15	104	finally
    //   19	27	104	finally
    //   27	33	104	finally
    //   37	48	104	finally
    //   48	78	104	finally
    //   96	101	104	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.b.e parame)
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
    //   15: ifnull +44 -> 59
    //   18: aload_1
    //   19: invokeinterface 55 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/ab:a	Landroid/os/IBinder;
    //   36: iconst_1
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 49	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 49	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 49	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 49	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	ab
    //   0	78	1	parame	com.google.android.gms.b.e
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    //   24	37	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	26	65	finally
    //   26	50	65	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.b.e parame, int paramInt)
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
    //   16: ifnull +53 -> 69
    //   19: aload_1
    //   20: invokeinterface 55 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aload_3
    //   34: iload_2
    //   35: invokevirtual 62	android/os/Parcel:writeInt	(I)V
    //   38: aload_0
    //   39: getfield 15	com/google/android/gms/maps/a/ab:a	Landroid/os/IBinder;
    //   42: bipush 6
    //   44: aload_3
    //   45: aload 4
    //   47: iconst_0
    //   48: invokeinterface 34 5 0
    //   53: pop
    //   54: aload 4
    //   56: invokevirtual 37	android/os/Parcel:readException	()V
    //   59: aload 4
    //   61: invokevirtual 49	android/os/Parcel:recycle	()V
    //   64: aload_3
    //   65: invokevirtual 49	android/os/Parcel:recycle	()V
    //   68: return
    //   69: aconst_null
    //   70: astore 6
    //   72: goto -45 -> 27
    //   75: astore 5
    //   77: aload 4
    //   79: invokevirtual 49	android/os/Parcel:recycle	()V
    //   82: aload_3
    //   83: invokevirtual 49	android/os/Parcel:recycle	()V
    //   86: aload 5
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	ab
    //   0	89	1	parame	com.google.android.gms.b.e
    //   0	89	2	paramInt	int
    //   3	80	3	localParcel1	Parcel
    //   7	71	4	localParcel2	Parcel
    //   75	12	5	localObject	Object
    //   25	46	6	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	75	finally
    //   19	27	75	finally
    //   27	59	75	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public j b(com.google.android.gms.b.e parame)
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
    //   15: ifnull +55 -> 70
    //   18: aload_1
    //   19: invokeinterface 55 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 58	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/ab:a	Landroid/os/IBinder;
    //   36: iconst_2
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 41	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   54: invokestatic 82	com/google/android/gms/maps/a/k:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/a/j;
    //   57: astore 7
    //   59: aload_3
    //   60: invokevirtual 49	android/os/Parcel:recycle	()V
    //   63: aload_2
    //   64: invokevirtual 49	android/os/Parcel:recycle	()V
    //   67: aload 7
    //   69: areturn
    //   70: aconst_null
    //   71: astore 5
    //   73: goto -47 -> 26
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 49	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 49	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	ab
    //   0	89	1	parame	com.google.android.gms.b.e
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   24	48	5	localIBinder	IBinder
    //   57	11	7	localj	j
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	26	76	finally
    //   26	59	76	finally
  }
  
  public d b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
      this.a.transact(5, localParcel1, localParcel2, 0);
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
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.ab
 * JD-Core Version:    0.7.0.1
 */