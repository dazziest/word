package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.g;

public abstract class b
  extends Binder
  implements a
{
  public static a a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof a))) {
      return (a)localIInterface;
    }
    return new c(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      e locale11 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder11 = null;
      if (locale11 != null) {
        localIBinder11 = locale11.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder11);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      e locale10 = b();
      paramParcel2.writeNoException();
      IBinder localIBinder10 = null;
      if (locale10 != null) {
        localIBinder10 = locale10.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder10);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      e locale9 = a(paramParcel1.readFloat(), paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder9 = null;
      if (locale9 != null) {
        localIBinder9 = locale9.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder9);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      e locale8 = a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder8 = null;
      if (locale8 != null) {
        localIBinder8 = locale8.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder8);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      e locale7 = b(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder7 = null;
      if (locale7 != null) {
        localIBinder7 = locale7.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder7);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      e locale6 = a(paramParcel1.readFloat(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (locale6 != null) {
        localIBinder6 = locale6.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (CameraPosition localCameraPosition = CameraPosition.CREATOR.a(paramParcel1);; localCameraPosition = null)
      {
        e locale5 = a(localCameraPosition);
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (locale5 != null) {
          localIBinder5 = locale5.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng2 = LatLng.CREATOR.a(paramParcel1);; localLatLng2 = null)
      {
        e locale4 = a(localLatLng2);
        paramParcel2.writeNoException();
        IBinder localIBinder4 = null;
        if (locale4 != null) {
          localIBinder4 = locale4.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng1 = LatLng.CREATOR.a(paramParcel1);; localLatLng1 = null)
      {
        e locale3 = a(localLatLng1, paramParcel1.readFloat());
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (locale3 != null) {
          localIBinder3 = locale3.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLngBounds localLatLngBounds2 = LatLngBounds.CREATOR.a(paramParcel1);; localLatLngBounds2 = null)
      {
        e locale2 = a(localLatLngBounds2, paramParcel1.readInt());
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locale2 != null) {
          localIBinder2 = locale2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if (paramParcel1.readInt() != 0) {}
    for (LatLngBounds localLatLngBounds1 = LatLngBounds.CREATOR.a(paramParcel1);; localLatLngBounds1 = null)
    {
      e locale1 = a(localLatLngBounds1, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locale1 != null) {
        localIBinder1 = locale1.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.b
 * JD-Core Version:    0.7.0.1
 */