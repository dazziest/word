package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.a.d;

public abstract class aa
  extends Binder
  implements z
{
  public static z a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
    if ((localIInterface != null) && ((localIInterface instanceof z))) {
      return (z)localIInterface;
    }
    return new ab(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICreator");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      a(f.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      j localj = b(f.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localj != null) {
        localIBinder4 = localj.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      e locale = f.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.CREATOR.a(paramParcel1);; localGoogleMapOptions = null)
      {
        m localm = a(locale, localGoogleMapOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (localm != null) {
          localIBinder3 = localm.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      a locala = a();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (locala != null) {
        localIBinder2 = locala.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      d locald = b();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locald != null) {
        localIBinder1 = locald.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
    a(f.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.aa
 * JD-Core Version:    0.7.0.1
 */