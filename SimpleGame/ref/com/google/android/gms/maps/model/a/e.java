package com.google.android.gms.maps.model.a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class e
  extends Binder
  implements d
{
  public static d a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof d))) {
      return (d)localIInterface;
    }
    return new f(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      com.google.android.gms.b.e locale7 = a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (locale7 != null) {}
      for (IBinder localIBinder7 = locale7.asBinder();; localIBinder7 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder7);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      com.google.android.gms.b.e locale6 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (locale6 != null) {
        localIBinder6 = locale6.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      com.google.android.gms.b.e locale5 = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder5 = null;
      if (locale5 != null) {
        localIBinder5 = locale5.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder5);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      com.google.android.gms.b.e locale4 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (locale4 != null) {
        localIBinder4 = locale4.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      com.google.android.gms.b.e locale3 = a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (locale3 != null) {
        localIBinder3 = locale3.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (Bitmap localBitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; localBitmap = null)
      {
        com.google.android.gms.b.e locale2 = a(localBitmap);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locale2 != null) {
          localIBinder2 = locale2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    com.google.android.gms.b.e locale1 = c(paramParcel1.readString());
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (locale1 != null) {
      localIBinder1 = locale1.asBinder();
    }
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.a.e
 * JD-Core Version:    0.7.0.1
 */