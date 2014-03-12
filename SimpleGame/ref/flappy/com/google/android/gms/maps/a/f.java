package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;

class f
  implements d
{
  private IBinder a;
  
  f(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.maps.model.CameraPosition a()
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   18: iconst_1
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 34 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 37	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 41	android/os/Parcel:readInt	()I
    //   36: ifeq +27 -> 63
    //   39: getstatic 47	com/google/android/gms/maps/model/CameraPosition:CREATOR	Lcom/google/android/gms/maps/model/c;
    //   42: aload_2
    //   43: invokevirtual 52	com/google/android/gms/maps/model/c:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/CameraPosition;
    //   46: astore 6
    //   48: aload 6
    //   50: astore 5
    //   52: aload_2
    //   53: invokevirtual 55	android/os/Parcel:recycle	()V
    //   56: aload_1
    //   57: invokevirtual 55	android/os/Parcel:recycle	()V
    //   60: aload 5
    //   62: areturn
    //   63: aconst_null
    //   64: astore 5
    //   66: goto -14 -> 52
    //   69: astore_3
    //   70: aload_2
    //   71: invokevirtual 55	android/os/Parcel:recycle	()V
    //   74: aload_1
    //   75: invokevirtual 55	android/os/Parcel:recycle	()V
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	f
    //   3	72	1	localParcel1	Parcel
    //   7	64	2	localParcel2	Parcel
    //   69	10	3	localObject	Object
    //   50	15	5	localCameraPosition1	com.google.android.gms.maps.model.CameraPosition
    //   46	3	6	localCameraPosition2	com.google.android.gms.maps.model.CameraPosition
    // Exception table:
    //   from	to	target	type
    //   8	48	69	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.a.a a(com.google.android.gms.maps.model.PolylineOptions paramPolylineOptions)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 66	com/google/android/gms/maps/model/PolylineOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   33: bipush 9
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 75	com/google/android/gms/maps/model/a/b:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/a;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 55	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 55	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	paramPolylineOptions	com.google.android.gms.maps.model.PolylineOptions
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	locala	com.google.android.gms.maps.model.a.a
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.a.g a(com.google.android.gms.maps.model.CircleOptions paramCircleOptions)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 79	com/google/android/gms/maps/model/CircleOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   33: bipush 35
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 84	com/google/android/gms/maps/model/a/h:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/g;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 55	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 55	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	paramCircleOptions	com.google.android.gms.maps.model.CircleOptions
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	localg	com.google.android.gms.maps.model.a.g
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.a.j a(com.google.android.gms.maps.model.GroundOverlayOptions paramGroundOverlayOptions)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 88	com/google/android/gms/maps/model/GroundOverlayOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   33: bipush 12
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 93	com/google/android/gms/maps/model/a/k:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/j;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 55	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 55	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	paramGroundOverlayOptions	com.google.android.gms.maps.model.GroundOverlayOptions
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	localj	com.google.android.gms.maps.model.a.j
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.a.m a(com.google.android.gms.maps.model.MarkerOptions paramMarkerOptions)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 97	com/google/android/gms/maps/model/MarkerOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   33: bipush 11
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 102	com/google/android/gms/maps/model/a/n:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/m;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 55	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 55	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	paramMarkerOptions	com.google.android.gms.maps.model.MarkerOptions
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	localm	com.google.android.gms.maps.model.a.m
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.a.p a(com.google.android.gms.maps.model.PolygonOptions paramPolygonOptions)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 106	com/google/android/gms/maps/model/PolygonOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   33: bipush 10
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 111	com/google/android/gms/maps/model/a/q:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/p;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 55	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 55	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	paramPolygonOptions	com.google.android.gms.maps.model.PolygonOptions
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	localp	com.google.android.gms.maps.model.a.p
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.a.s a(com.google.android.gms.maps.model.TileOverlayOptions paramTileOverlayOptions)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 115	com/google/android/gms/maps/model/TileOverlayOptions:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   33: bipush 13
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 34 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 37	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 70	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 120	com/google/android/gms/maps/model/a/t:a	(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/a/s;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 55	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 55	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 55	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 55	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	f
    //   0	89	1	paramTileOverlayOptions	com.google.android.gms.maps.model.TileOverlayOptions
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	locals	com.google.android.gms.maps.model.a.s
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  public void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      localParcel1.writeInt(paramInt);
      this.a.transact(16, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeInt(paramInt3);
      localParcel1.writeInt(paramInt4);
      this.a.transact(39, localParcel1, localParcel2, 0);
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
  public void a(e parame)
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
    //   19: invokeinterface 127 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: iconst_4
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 55	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 55	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 55	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 55	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	f
    //   0	78	1	parame	e
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
  public void a(e parame, int paramInt, w paramw)
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
    //   18: ifnull +79 -> 97
    //   21: aload_1
    //   22: invokeinterface 127 1 0
    //   27: astore 7
    //   29: aload 4
    //   31: aload 7
    //   33: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 4
    //   38: iload_2
    //   39: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   42: aconst_null
    //   43: astore 8
    //   45: aload_3
    //   46: ifnull +11 -> 57
    //   49: aload_3
    //   50: invokeinterface 134 1 0
    //   55: astore 8
    //   57: aload 4
    //   59: aload 8
    //   61: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   64: aload_0
    //   65: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   68: bipush 7
    //   70: aload 4
    //   72: aload 5
    //   74: iconst_0
    //   75: invokeinterface 34 5 0
    //   80: pop
    //   81: aload 5
    //   83: invokevirtual 37	android/os/Parcel:readException	()V
    //   86: aload 5
    //   88: invokevirtual 55	android/os/Parcel:recycle	()V
    //   91: aload 4
    //   93: invokevirtual 55	android/os/Parcel:recycle	()V
    //   96: return
    //   97: aconst_null
    //   98: astore 7
    //   100: goto -71 -> 29
    //   103: astore 6
    //   105: aload 5
    //   107: invokevirtual 55	android/os/Parcel:recycle	()V
    //   110: aload 4
    //   112: invokevirtual 55	android/os/Parcel:recycle	()V
    //   115: aload 6
    //   117: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	this	f
    //   0	118	1	parame	e
    //   0	118	2	paramInt	int
    //   0	118	3	paramw	w
    //   3	108	4	localParcel1	Parcel
    //   8	98	5	localParcel2	Parcel
    //   103	13	6	localObject	Object
    //   27	72	7	localIBinder1	IBinder
    //   43	17	8	localIBinder2	IBinder
    // Exception table:
    //   from	to	target	type
    //   10	17	103	finally
    //   21	29	103	finally
    //   29	42	103	finally
    //   49	57	103	finally
    //   57	86	103	finally
  }
  
  /* Error */
  public void a(e parame, w paramw)
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
    //   16: ifnull +69 -> 85
    //   19: aload_1
    //   20: invokeinterface 127 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aconst_null
    //   34: astore 7
    //   36: aload_2
    //   37: ifnull +11 -> 48
    //   40: aload_2
    //   41: invokeinterface 134 1 0
    //   46: astore 7
    //   48: aload_3
    //   49: aload 7
    //   51: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   54: aload_0
    //   55: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   58: bipush 6
    //   60: aload_3
    //   61: aload 4
    //   63: iconst_0
    //   64: invokeinterface 34 5 0
    //   69: pop
    //   70: aload 4
    //   72: invokevirtual 37	android/os/Parcel:readException	()V
    //   75: aload 4
    //   77: invokevirtual 55	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 55	android/os/Parcel:recycle	()V
    //   84: return
    //   85: aconst_null
    //   86: astore 6
    //   88: goto -61 -> 27
    //   91: astore 5
    //   93: aload 4
    //   95: invokevirtual 55	android/os/Parcel:recycle	()V
    //   98: aload_3
    //   99: invokevirtual 55	android/os/Parcel:recycle	()V
    //   102: aload 5
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	f
    //   0	105	1	parame	e
    //   0	105	2	paramw	w
    //   3	96	3	localParcel1	Parcel
    //   7	87	4	localParcel2	Parcel
    //   91	12	5	localObject	Object
    //   25	62	6	localIBinder1	IBinder
    //   34	16	7	localIBinder2	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	91	finally
    //   19	27	91	finally
    //   27	33	91	finally
    //   40	48	91	finally
    //   48	75	91	finally
  }
  
  /* Error */
  public void a(ac paramac)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 139 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 33
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramac	ac
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(af paramaf)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 143 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 27
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramaf	af
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(ai paramai)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 147 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 32
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramai	ai
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(ao paramao)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 151 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 28
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramao	ao
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(ar paramar)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 155 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 29
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramar	ar
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(au paramau)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 159 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 30
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramau	au
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(ax paramax)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 163 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 31
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramax	ax
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(ba paramba)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 167 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 37
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramba	ba
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(bd parambd)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 171 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 36
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	parambd	bd
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(bg parambg, e parame)
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
    //   16: ifnull +69 -> 85
    //   19: aload_1
    //   20: invokeinterface 175 1 0
    //   25: astore 6
    //   27: aload_3
    //   28: aload 6
    //   30: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   33: aconst_null
    //   34: astore 7
    //   36: aload_2
    //   37: ifnull +11 -> 48
    //   40: aload_2
    //   41: invokeinterface 127 1 0
    //   46: astore 7
    //   48: aload_3
    //   49: aload 7
    //   51: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   54: aload_0
    //   55: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   58: bipush 38
    //   60: aload_3
    //   61: aload 4
    //   63: iconst_0
    //   64: invokeinterface 34 5 0
    //   69: pop
    //   70: aload 4
    //   72: invokevirtual 37	android/os/Parcel:readException	()V
    //   75: aload 4
    //   77: invokevirtual 55	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 55	android/os/Parcel:recycle	()V
    //   84: return
    //   85: aconst_null
    //   86: astore 6
    //   88: goto -61 -> 27
    //   91: astore 5
    //   93: aload 4
    //   95: invokevirtual 55	android/os/Parcel:recycle	()V
    //   98: aload_3
    //   99: invokevirtual 55	android/os/Parcel:recycle	()V
    //   102: aload 5
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	f
    //   0	105	1	parambg	bg
    //   0	105	2	parame	e
    //   3	96	3	localParcel1	Parcel
    //   7	87	4	localParcel2	Parcel
    //   91	12	5	localObject	Object
    //   25	62	6	localIBinder1	IBinder
    //   34	16	7	localIBinder2	IBinder
    // Exception table:
    //   from	to	target	type
    //   9	15	91	finally
    //   19	27	91	finally
    //   27	33	91	finally
    //   40	48	91	finally
    //   48	75	91	finally
  }
  
  /* Error */
  public void a(g paramg)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 179 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: bipush 24
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 34 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 55	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 55	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	f
    //   0	79	1	paramg	g
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  public void a(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(18, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public float b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(2, localParcel1, localParcel2, 0);
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
  public void b(e parame)
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
    //   19: invokeinterface 127 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 130	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   36: iconst_5
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 55	android/os/Parcel:recycle	()V
    //   54: aload_2
    //   55: invokevirtual 55	android/os/Parcel:recycle	()V
    //   58: return
    //   59: aconst_null
    //   60: astore 5
    //   62: goto -36 -> 26
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 55	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 55	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	f
    //   0	78	1	parame	e
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
  public boolean b(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: aload_3
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: iload_1
    //   18: ifeq +56 -> 74
    //   21: iload_2
    //   22: istore 6
    //   24: aload_3
    //   25: iload 6
    //   27: invokevirtual 60	android/os/Parcel:writeInt	(I)V
    //   30: aload_0
    //   31: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   34: bipush 20
    //   36: aload_3
    //   37: aload 4
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload 4
    //   48: invokevirtual 37	android/os/Parcel:readException	()V
    //   51: aload 4
    //   53: invokevirtual 41	android/os/Parcel:readInt	()I
    //   56: istore 8
    //   58: iload 8
    //   60: ifeq +20 -> 80
    //   63: aload 4
    //   65: invokevirtual 55	android/os/Parcel:recycle	()V
    //   68: aload_3
    //   69: invokevirtual 55	android/os/Parcel:recycle	()V
    //   72: iload_2
    //   73: ireturn
    //   74: iconst_0
    //   75: istore 6
    //   77: goto -53 -> 24
    //   80: iconst_0
    //   81: istore_2
    //   82: goto -19 -> 63
    //   85: astore 5
    //   87: aload 4
    //   89: invokevirtual 55	android/os/Parcel:recycle	()V
    //   92: aload_3
    //   93: invokevirtual 55	android/os/Parcel:recycle	()V
    //   96: aload 5
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	f
    //   0	99	1	paramBoolean	boolean
    //   1	81	2	i	int
    //   5	88	3	localParcel1	Parcel
    //   9	79	4	localParcel2	Parcel
    //   85	12	5	localObject	Object
    //   22	4	6	j	int
    //   75	1	6	k	int
    //   56	3	8	m	int
    // Exception table:
    //   from	to	target	type
    //   11	17	85	finally
    //   24	58	85	finally
  }
  
  public float c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(3, localParcel1, localParcel2, 0);
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
  
  public void c(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(22, localParcel1, localParcel2, 0);
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
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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
  
  public void e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(14, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(15, localParcel1, localParcel2, 0);
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
  
  public boolean g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(17, localParcel1, localParcel2, 0);
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
  
  public boolean h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(19, localParcel1, localParcel2, 0);
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
  
  public boolean i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(21, localParcel1, localParcel2, 0);
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
  
  /* Error */
  public android.location.Location j()
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/a/f:a	Landroid/os/IBinder;
    //   18: bipush 23
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 34 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 37	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 41	android/os/Parcel:readInt	()I
    //   37: ifeq +28 -> 65
    //   40: getstatic 201	android/location/Location:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 207 2 0
    //   49: checkcast 198	android/location/Location
    //   52: astore 5
    //   54: aload_2
    //   55: invokevirtual 55	android/os/Parcel:recycle	()V
    //   58: aload_1
    //   59: invokevirtual 55	android/os/Parcel:recycle	()V
    //   62: aload 5
    //   64: areturn
    //   65: aconst_null
    //   66: astore 5
    //   68: goto -14 -> 54
    //   71: astore_3
    //   72: aload_2
    //   73: invokevirtual 55	android/os/Parcel:recycle	()V
    //   76: aload_1
    //   77: invokevirtual 55	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	f
    //   3	74	1	localParcel1	Parcel
    //   7	66	2	localParcel2	Parcel
    //   71	10	3	localObject	Object
    //   52	15	5	localLocation	android.location.Location
    // Exception table:
    //   from	to	target	type
    //   8	54	71	finally
  }
  
  public s k()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(25, localParcel1, localParcel2, 0);
      localParcel2.readException();
      s locals = t.a(localParcel2.readStrongBinder());
      return locals;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public p l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(26, localParcel1, localParcel2, 0);
      localParcel2.readException();
      p localp = q.a(localParcel2.readStrongBinder());
      return localp;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public e m()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      this.a.transact(34, localParcel1, localParcel2, 0);
      localParcel2.readException();
      e locale = com.google.android.gms.b.f.a(localParcel2.readStrongBinder());
      return locale;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.f
 * JD-Core Version:    0.7.0.1
 */