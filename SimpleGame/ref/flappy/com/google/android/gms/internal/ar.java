package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

public abstract class ar
  extends Binder
  implements aq
{
  public static aq a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof aq))) {
      return (aq)localIInterface;
    }
    return new as(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i16 = paramParcel1.readInt();
      Bundle localBundle14;
      if (paramParcel1.readInt() != 0)
      {
        localBundle14 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label250;
        }
      }
      for (Bundle localBundle15 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle15 = null)
      {
        a(i16, localBundle14, localBundle15);
        paramParcel2.writeNoException();
        return true;
        localBundle14 = null;
        break;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i15 = paramParcel1.readInt();
      Bundle localBundle13;
      if (paramParcel1.readInt() != 0)
      {
        localBundle13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label332;
        }
      }
      for (ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; localParcelFileDescriptor = null)
      {
        a(i15, localBundle13, localParcelFileDescriptor);
        paramParcel2.writeNoException();
        return true;
        localBundle13 = null;
        break;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i14 = paramParcel1.readInt();
      d locald3 = null;
      if (i14 != 0) {
        locald3 = d.CREATOR.a(paramParcel1);
      }
      a(locald3, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i12 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle12 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle12 = null)
      {
        int i13 = paramParcel1.readInt();
        ak localak = null;
        if (i13 != 0) {
          localak = ak.CREATOR.a(paramParcel1);
        }
        a(i12, localBundle12, localak);
        paramParcel2.writeNoException();
        return true;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i11 = paramParcel1.readInt();
      d locald2 = null;
      if (i11 != 0) {
        locald2 = d.CREATOR.a(paramParcel1);
      }
      a(locald2, paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i10 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle11 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle11 = null)
      {
        a(i10, localBundle11);
        paramParcel2.writeNoException();
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i9 = paramParcel1.readInt();
      d locald1 = null;
      if (i9 != 0) {
        locald1 = d.CREATOR.a(paramParcel1);
      }
      b(locald1, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i8 = paramParcel1.readInt();
      Bundle localBundle9;
      if (paramParcel1.readInt() != 0)
      {
        localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label704;
        }
      }
      for (Bundle localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle10 = null)
      {
        b(i8, localBundle9, localBundle10);
        paramParcel2.writeNoException();
        return true;
        localBundle9 = null;
        break;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i6 = paramParcel1.readInt();
      int i7 = paramParcel1.readInt();
      Bundle localBundle8 = null;
      if (i7 != 0) {
        localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(i6, localBundle8, paramParcel1.readString(), paramParcel1.createStringArrayList(), paramParcel1.createStringArrayList(), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i4 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle7 = null)
      {
        String str = paramParcel1.readString();
        int i5 = paramParcel1.readInt();
        bv localbv = null;
        if (i5 != 0) {
          localbv = bv.CREATOR.a(paramParcel1);
        }
        a(i4, localBundle7, str, localbv);
        paramParcel2.writeNoException();
        return true;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i3 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle6 = null)
      {
        b(i3, localBundle6);
        paramParcel2.writeNoException();
        return true;
      }
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
      {
        int i2 = paramParcel1.readInt();
        co localco = null;
        if (i2 != 0) {
          localco = co.CREATOR.a(paramParcel1);
        }
        a(i1, localBundle5, localco);
        paramParcel2.writeNoException();
        return true;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int m = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle4 = null)
      {
        int n = paramParcel1.readInt();
        cq localcq = null;
        if (n != 0) {
          localcq = cq.CREATOR.a(paramParcel1);
        }
        a(m, localBundle4, localcq);
        paramParcel2.writeNoException();
        return true;
      }
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int k = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
      {
        a(k, localBundle3, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 16: 
      label250:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      label332:
      int j = paramParcel1.readInt();
      label704:
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        a(j, localBundle2, paramParcel1.createTypedArrayList(x.CREATOR));
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
    int i = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0) {}
    for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
    {
      a(i, localBundle1, paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ar
 * JD-Core Version:    0.7.0.1
 */