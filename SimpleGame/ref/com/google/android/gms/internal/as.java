package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

class as
  implements aq
{
  private IBinder a;
  
  as(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public void a(int paramInt, Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   39: bipush 7
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 44 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 47	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 50	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 50	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 50	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 50	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	as
    //   0	88	1	paramInt	int
    //   0	88	2	paramBundle	Bundle
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: iload_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_2
    //   24: ifnull +55 -> 79
    //   27: aload 4
    //   29: iconst_1
    //   30: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   33: aload_2
    //   34: aload 4
    //   36: iconst_0
    //   37: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   40: aload 4
    //   42: iload_3
    //   43: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   50: bipush 17
    //   52: aload 4
    //   54: aload 5
    //   56: iconst_0
    //   57: invokeinterface 44 5 0
    //   62: pop
    //   63: aload 5
    //   65: invokevirtual 47	android/os/Parcel:readException	()V
    //   68: aload 5
    //   70: invokevirtual 50	android/os/Parcel:recycle	()V
    //   73: aload 4
    //   75: invokevirtual 50	android/os/Parcel:recycle	()V
    //   78: return
    //   79: aload 4
    //   81: iconst_0
    //   82: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   85: goto -45 -> 40
    //   88: astore 6
    //   90: aload 5
    //   92: invokevirtual 50	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 50	android/os/Parcel:recycle	()V
    //   100: aload 6
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	as
    //   0	103	1	paramInt1	int
    //   0	103	2	paramBundle	Bundle
    //   0	103	3	paramInt2	int
    //   3	93	4	localParcel1	Parcel
    //   8	83	5	localParcel2	Parcel
    //   88	13	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	23	88	finally
    //   27	40	88	finally
    //   40	68	88	finally
    //   79	85	88	finally
  }
  
  public void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle1 != null)
        {
          localParcel1.writeInt(1);
          paramBundle1.writeToParcel(localParcel1, 0);
          if (paramBundle2 != null)
          {
            localParcel1.writeInt(1);
            paramBundle2.writeToParcel(localParcel1, 0);
            this.a.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramParcelFileDescriptor != null)
          {
            localParcel1.writeInt(1);
            paramParcelFileDescriptor.writeToParcel(localParcel1, 0);
            this.a.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void a(int paramInt, Bundle paramBundle, ak paramak)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramak != null)
          {
            localParcel1.writeInt(1);
            paramak.writeToParcel(localParcel1, 0);
            this.a.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void a(int paramInt, Bundle paramBundle, co paramco)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramco != null)
          {
            localParcel1.writeInt(1);
            paramco.writeToParcel(localParcel1, 0);
            this.a.transact(13, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void a(int paramInt, Bundle paramBundle, cq paramcq)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramcq != null)
          {
            localParcel1.writeInt(1);
            paramcq.writeToParcel(localParcel1, 0);
            this.a.transact(14, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void a(int paramInt, Bundle paramBundle, String paramString)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: iload_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_2
    //   24: ifnull +55 -> 79
    //   27: aload 4
    //   29: iconst_1
    //   30: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   33: aload_2
    //   34: aload 4
    //   36: iconst_0
    //   37: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   50: bipush 15
    //   52: aload 4
    //   54: aload 5
    //   56: iconst_0
    //   57: invokeinterface 44 5 0
    //   62: pop
    //   63: aload 5
    //   65: invokevirtual 47	android/os/Parcel:readException	()V
    //   68: aload 5
    //   70: invokevirtual 50	android/os/Parcel:recycle	()V
    //   73: aload 4
    //   75: invokevirtual 50	android/os/Parcel:recycle	()V
    //   78: return
    //   79: aload 4
    //   81: iconst_0
    //   82: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   85: goto -45 -> 40
    //   88: astore 6
    //   90: aload 5
    //   92: invokevirtual 50	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 50	android/os/Parcel:recycle	()V
    //   100: aload 6
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	as
    //   0	103	1	paramInt	int
    //   0	103	2	paramBundle	Bundle
    //   0	103	3	paramString	String
    //   3	93	4	localParcel1	Parcel
    //   8	83	5	localParcel2	Parcel
    //   88	13	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	23	88	finally
    //   27	40	88	finally
    //   40	68	88	finally
    //   79	85	88	finally
  }
  
  public void a(int paramInt, Bundle paramBundle, String paramString, bv parambv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          localParcel1.writeString(paramString);
          if (parambv != null)
          {
            localParcel1.writeInt(1);
            parambv.writeToParcel(localParcel1, 0);
            this.a.transact(11, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void a(int paramInt, Bundle paramBundle, String paramString, java.util.List paramList1, java.util.List paramList2, java.util.List paramList3)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 7
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 8
    //   10: aload 7
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 7
    //   19: iload_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_2
    //   24: ifnull +76 -> 100
    //   27: aload 7
    //   29: iconst_1
    //   30: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   33: aload_2
    //   34: aload 7
    //   36: iconst_0
    //   37: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   40: aload 7
    //   42: aload_3
    //   43: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload 7
    //   48: aload 4
    //   50: invokevirtual 81	android/os/Parcel:writeStringList	(Ljava/util/List;)V
    //   53: aload 7
    //   55: aload 5
    //   57: invokevirtual 81	android/os/Parcel:writeStringList	(Ljava/util/List;)V
    //   60: aload 7
    //   62: aload 6
    //   64: invokevirtual 81	android/os/Parcel:writeStringList	(Ljava/util/List;)V
    //   67: aload_0
    //   68: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   71: bipush 10
    //   73: aload 7
    //   75: aload 8
    //   77: iconst_0
    //   78: invokeinterface 44 5 0
    //   83: pop
    //   84: aload 8
    //   86: invokevirtual 47	android/os/Parcel:readException	()V
    //   89: aload 8
    //   91: invokevirtual 50	android/os/Parcel:recycle	()V
    //   94: aload 7
    //   96: invokevirtual 50	android/os/Parcel:recycle	()V
    //   99: return
    //   100: aload 7
    //   102: iconst_0
    //   103: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   106: goto -66 -> 40
    //   109: astore 9
    //   111: aload 8
    //   113: invokevirtual 50	android/os/Parcel:recycle	()V
    //   116: aload 7
    //   118: invokevirtual 50	android/os/Parcel:recycle	()V
    //   121: aload 9
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	this	as
    //   0	124	1	paramInt	int
    //   0	124	2	paramBundle	Bundle
    //   0	124	3	paramString	String
    //   0	124	4	paramList1	java.util.List
    //   0	124	5	paramList2	java.util.List
    //   0	124	6	paramList3	java.util.List
    //   3	114	7	localParcel1	Parcel
    //   8	104	8	localParcel2	Parcel
    //   109	13	9	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	23	109	finally
    //   27	40	109	finally
    //   40	89	109	finally
    //   100	106	109	finally
  }
  
  /* Error */
  public void a(int paramInt, Bundle paramBundle, java.util.List paramList)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: iload_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_2
    //   24: ifnull +55 -> 79
    //   27: aload 4
    //   29: iconst_1
    //   30: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   33: aload_2
    //   34: aload 4
    //   36: iconst_0
    //   37: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 85	android/os/Parcel:writeTypedList	(Ljava/util/List;)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   50: bipush 16
    //   52: aload 4
    //   54: aload 5
    //   56: iconst_0
    //   57: invokeinterface 44 5 0
    //   62: pop
    //   63: aload 5
    //   65: invokevirtual 47	android/os/Parcel:readException	()V
    //   68: aload 5
    //   70: invokevirtual 50	android/os/Parcel:recycle	()V
    //   73: aload 4
    //   75: invokevirtual 50	android/os/Parcel:recycle	()V
    //   78: return
    //   79: aload 4
    //   81: iconst_0
    //   82: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   85: goto -45 -> 40
    //   88: astore 6
    //   90: aload 5
    //   92: invokevirtual 50	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 50	android/os/Parcel:recycle	()V
    //   100: aload 6
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	as
    //   0	103	1	paramInt	int
    //   0	103	2	paramBundle	Bundle
    //   0	103	3	paramList	java.util.List
    //   3	93	4	localParcel1	Parcel
    //   8	83	5	localParcel2	Parcel
    //   88	13	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	23	88	finally
    //   27	40	88	finally
    //   40	68	88	finally
    //   79	85	88	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.common.data.d paramd, String paramString)
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
    //   16: ifnull +49 -> 65
    //   19: aload_3
    //   20: iconst_1
    //   21: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   24: aload_1
    //   25: aload_3
    //   26: iconst_0
    //   27: invokevirtual 89	com/google/android/gms/common/data/d:writeToParcel	(Landroid/os/Parcel;I)V
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   39: iconst_4
    //   40: aload_3
    //   41: aload 4
    //   43: iconst_0
    //   44: invokeinterface 44 5 0
    //   49: pop
    //   50: aload 4
    //   52: invokevirtual 47	android/os/Parcel:readException	()V
    //   55: aload 4
    //   57: invokevirtual 50	android/os/Parcel:recycle	()V
    //   60: aload_3
    //   61: invokevirtual 50	android/os/Parcel:recycle	()V
    //   64: return
    //   65: aload_3
    //   66: iconst_0
    //   67: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   70: goto -40 -> 30
    //   73: astore 5
    //   75: aload 4
    //   77: invokevirtual 50	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 50	android/os/Parcel:recycle	()V
    //   84: aload 5
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	as
    //   0	87	1	paramd	com.google.android.gms.common.data.d
    //   0	87	2	paramString	String
    //   3	78	3	localParcel1	Parcel
    //   7	69	4	localParcel2	Parcel
    //   73	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	73	finally
    //   19	30	73	finally
    //   30	55	73	finally
    //   65	70	73	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.common.data.d paramd, String paramString1, String paramString2)
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
    //   18: ifnull +61 -> 79
    //   21: aload 4
    //   23: iconst_1
    //   24: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   27: aload_1
    //   28: aload 4
    //   30: iconst_0
    //   31: invokevirtual 89	com/google/android/gms/common/data/d:writeToParcel	(Landroid/os/Parcel;I)V
    //   34: aload 4
    //   36: aload_2
    //   37: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   50: bipush 6
    //   52: aload 4
    //   54: aload 5
    //   56: iconst_0
    //   57: invokeinterface 44 5 0
    //   62: pop
    //   63: aload 5
    //   65: invokevirtual 47	android/os/Parcel:readException	()V
    //   68: aload 5
    //   70: invokevirtual 50	android/os/Parcel:recycle	()V
    //   73: aload 4
    //   75: invokevirtual 50	android/os/Parcel:recycle	()V
    //   78: return
    //   79: aload 4
    //   81: iconst_0
    //   82: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   85: goto -51 -> 34
    //   88: astore 6
    //   90: aload 5
    //   92: invokevirtual 50	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: invokevirtual 50	android/os/Parcel:recycle	()V
    //   100: aload 6
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	as
    //   0	103	1	paramd	com.google.android.gms.common.data.d
    //   0	103	2	paramString1	String
    //   0	103	3	paramString2	String
    //   3	93	4	localParcel1	Parcel
    //   8	83	5	localParcel2	Parcel
    //   88	13	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	17	88	finally
    //   21	34	88	finally
    //   34	68	88	finally
    //   79	85	88	finally
  }
  
  public void a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      localParcel1.writeString(paramString);
      this.a.transact(3, localParcel1, localParcel2, 0);
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
  
  /* Error */
  public void b(int paramInt, Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: iload_1
    //   17: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 38	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   39: bipush 12
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 44 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 47	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 50	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 50	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 50	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 50	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	as
    //   0	88	1	paramInt	int
    //   0	88	2	paramBundle	Bundle
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  public void b(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle1 != null)
        {
          localParcel1.writeInt(1);
          paramBundle1.writeToParcel(localParcel1, 0);
          if (paramBundle2 != null)
          {
            localParcel1.writeInt(1);
            paramBundle2.writeToParcel(localParcel1, 0);
            this.a.transact(9, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void b(com.google.android.gms.common.data.d paramd, String paramString)
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
    //   16: ifnull +50 -> 66
    //   19: aload_3
    //   20: iconst_1
    //   21: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   24: aload_1
    //   25: aload_3
    //   26: iconst_0
    //   27: invokevirtual 89	com/google/android/gms/common/data/d:writeToParcel	(Landroid/os/Parcel;I)V
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/internal/as:a	Landroid/os/IBinder;
    //   39: bipush 8
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 44 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 47	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 50	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 50	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -41 -> 30
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 50	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 50	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	as
    //   0	88	1	paramd	com.google.android.gms.common.data.d
    //   0	88	2	paramString	String
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	74	finally
    //   19	30	74	finally
    //   30	56	74	finally
    //   66	71	74	finally
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.as
 * JD-Core Version:    0.7.0.1
 */