package com.google.android.gms.maps.model.a;

import android.os.IBinder;
import android.os.Parcel;

class l
  implements j
{
  private IBinder a;
  
  l(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void a(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localParcel1.writeFloat(paramFloat);
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
  
  public void a(float paramFloat1, float paramFloat2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localParcel1.writeFloat(paramFloat1);
      localParcel1.writeFloat(paramFloat2);
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
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLng paramLatLng)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +41 -> 56
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 55	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/model/a/l:a	Landroid/os/IBinder;
    //   33: iconst_3
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 33 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 36	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 39	android/os/Parcel:recycle	()V
    //   51: aload_2
    //   52: invokevirtual 39	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_2
    //   57: iconst_0
    //   58: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore 4
    //   66: aload_3
    //   67: invokevirtual 39	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 39	android/os/Parcel:recycle	()V
    //   74: aload 4
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	l
    //   0	77	1	paramLatLng	com.google.android.gms.maps.model.LatLng
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
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLngBounds paramLatLngBounds)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 59	com/google/android/gms/maps/model/LatLngBounds:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/model/a/l:a	Landroid/os/IBinder;
    //   33: bipush 9
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 33 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 36	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 39	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 39	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 39	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 39	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	l
    //   0	78	1	paramLatLngBounds	com.google.android.gms.maps.model.LatLngBounds
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  public void a(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(15, localParcel1, localParcel2, 0);
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
  public boolean a(j paramj)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +64 -> 79
    //   18: aload_1
    //   19: invokeinterface 65 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 68	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/model/a/l:a	Landroid/os/IBinder;
    //   36: bipush 19
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 33 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 36	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 72	android/os/Parcel:readInt	()I
    //   55: istore 7
    //   57: iconst_0
    //   58: istore 8
    //   60: iload 7
    //   62: ifeq +6 -> 68
    //   65: iconst_1
    //   66: istore 8
    //   68: aload_3
    //   69: invokevirtual 39	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 39	android/os/Parcel:recycle	()V
    //   76: iload 8
    //   78: ireturn
    //   79: aconst_null
    //   80: astore 5
    //   82: goto -56 -> 26
    //   85: astore 4
    //   87: aload_3
    //   88: invokevirtual 39	android/os/Parcel:recycle	()V
    //   91: aload_2
    //   92: invokevirtual 39	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	l
    //   0	98	1	paramj	j
    //   3	89	2	localParcel1	Parcel
    //   7	81	3	localParcel2	Parcel
    //   85	11	4	localObject	Object
    //   24	57	5	localIBinder	IBinder
    //   55	6	7	i	int
    //   58	19	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   8	14	85	finally
    //   18	26	85	finally
    //   26	57	85	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public String b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void b(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localParcel1.writeFloat(paramFloat);
      this.a.transact(11, localParcel1, localParcel2, 0);
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
  public com.google.android.gms.maps.model.LatLng c()
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/model/a/l:a	Landroid/os/IBinder;
    //   18: iconst_4
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 33 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 36	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 72	android/os/Parcel:readInt	()I
    //   36: ifeq +27 -> 63
    //   39: getstatic 83	com/google/android/gms/maps/model/LatLng:CREATOR	Lcom/google/android/gms/maps/model/g;
    //   42: aload_2
    //   43: invokevirtual 88	com/google/android/gms/maps/model/g:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLng;
    //   46: astore 6
    //   48: aload 6
    //   50: astore 5
    //   52: aload_2
    //   53: invokevirtual 39	android/os/Parcel:recycle	()V
    //   56: aload_1
    //   57: invokevirtual 39	android/os/Parcel:recycle	()V
    //   60: aload 5
    //   62: areturn
    //   63: aconst_null
    //   64: astore 5
    //   66: goto -14 -> 52
    //   69: astore_3
    //   70: aload_2
    //   71: invokevirtual 39	android/os/Parcel:recycle	()V
    //   74: aload_1
    //   75: invokevirtual 39	android/os/Parcel:recycle	()V
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	l
    //   3	72	1	localParcel1	Parcel
    //   7	64	2	localParcel2	Parcel
    //   69	10	3	localObject	Object
    //   50	15	5	localLatLng1	com.google.android.gms.maps.model.LatLng
    //   46	3	6	localLatLng2	com.google.android.gms.maps.model.LatLng
    // Exception table:
    //   from	to	target	type
    //   8	48	69	finally
  }
  
  public void c(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localParcel1.writeFloat(paramFloat);
      this.a.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public float d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void d(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      localParcel1.writeFloat(paramFloat);
      this.a.transact(17, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public float e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public com.google.android.gms.maps.model.LatLngBounds f()
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/model/a/l:a	Landroid/os/IBinder;
    //   18: bipush 10
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 33 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 36	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 72	android/os/Parcel:readInt	()I
    //   37: ifeq +27 -> 64
    //   40: getstatic 99	com/google/android/gms/maps/model/LatLngBounds:CREATOR	Lcom/google/android/gms/maps/model/f;
    //   43: aload_2
    //   44: invokevirtual 104	com/google/android/gms/maps/model/f:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLngBounds;
    //   47: astore 6
    //   49: aload 6
    //   51: astore 5
    //   53: aload_2
    //   54: invokevirtual 39	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: invokevirtual 39	android/os/Parcel:recycle	()V
    //   61: aload 5
    //   63: areturn
    //   64: aconst_null
    //   65: astore 5
    //   67: goto -14 -> 53
    //   70: astore_3
    //   71: aload_2
    //   72: invokevirtual 39	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: invokevirtual 39	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	l
    //   3	73	1	localParcel1	Parcel
    //   7	65	2	localParcel2	Parcel
    //   70	10	3	localObject	Object
    //   51	15	5	localLatLngBounds1	com.google.android.gms.maps.model.LatLngBounds
    //   47	3	6	localLatLngBounds2	com.google.android.gms.maps.model.LatLngBounds
    // Exception table:
    //   from	to	target	type
    //   8	49	70	finally
  }
  
  public float g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public float h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(14, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(16, localParcel1, localParcel2, 0);
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
  
  public float j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(18, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int k()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
      this.a.transact(20, localParcel1, localParcel2, 0);
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
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.a.l
 * JD-Core Version:    0.7.0.1
 */