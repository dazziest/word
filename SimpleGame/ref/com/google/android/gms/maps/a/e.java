package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.n;

public abstract class e
  extends Binder
  implements d
{
  public static d a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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
      paramParcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      CameraPosition localCameraPosition = a();
      paramParcel2.writeNoException();
      if (localCameraPosition != null)
      {
        paramParcel2.writeInt(1);
        localCameraPosition.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      float f2 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f2);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      float f1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(com.google.android.gms.b.f.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      b(com.google.android.gms.b.f.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(com.google.android.gms.b.f.a(paramParcel1.readStrongBinder()), x.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(com.google.android.gms.b.f.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), x.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      d();
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (PolylineOptions localPolylineOptions = PolylineOptions.CREATOR.a(paramParcel1);; localPolylineOptions = null)
      {
        a locala = a(localPolylineOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder9 = null;
        if (locala != null) {
          localIBinder9 = locala.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder9);
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (PolygonOptions localPolygonOptions = PolygonOptions.CREATOR.a(paramParcel1);; localPolygonOptions = null)
      {
        com.google.android.gms.maps.model.a.p localp1 = a(localPolygonOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder8 = null;
        if (localp1 != null) {
          localIBinder8 = localp1.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder8);
        return true;
      }
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (MarkerOptions localMarkerOptions = MarkerOptions.CREATOR.a(paramParcel1);; localMarkerOptions = null)
      {
        m localm = a(localMarkerOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder7 = null;
        if (localm != null) {
          localIBinder7 = localm.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder7);
        return true;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (GroundOverlayOptions localGroundOverlayOptions = GroundOverlayOptions.CREATOR.a(paramParcel1);; localGroundOverlayOptions = null)
      {
        com.google.android.gms.maps.model.a.j localj = a(localGroundOverlayOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder6 = null;
        if (localj != null) {
          localIBinder6 = localj.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder6);
        return true;
      }
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (TileOverlayOptions localTileOverlayOptions = TileOverlayOptions.CREATOR.a(paramParcel1);; localTileOverlayOptions = null)
      {
        com.google.android.gms.maps.model.a.s locals1 = a(localTileOverlayOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (locals1 != null) {
          localIBinder5 = locals1.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      e();
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i2 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i2);
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool7 = g();
      paramParcel2.writeNoException();
      int i1 = 0;
      if (bool7) {
        i1 = 1;
      }
      paramParcel2.writeInt(i1);
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int n = paramParcel1.readInt();
      boolean bool6 = false;
      if (n != 0) {
        bool6 = true;
      }
      a(bool6);
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool5 = h();
      paramParcel2.writeNoException();
      int m = 0;
      if (bool5) {
        m = 1;
      }
      paramParcel2.writeInt(m);
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool3 = true;; bool3 = false)
      {
        boolean bool4 = b(bool3);
        paramParcel2.writeNoException();
        int k = 0;
        if (bool4) {
          k = 1;
        }
        paramParcel2.writeInt(k);
        return true;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      boolean bool2 = i();
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2) {
        j = 1;
      }
      paramParcel2.writeInt(j);
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      int i = paramParcel1.readInt();
      boolean bool1 = false;
      if (i != 0) {
        bool1 = true;
      }
      c(bool1);
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      Location localLocation = j();
      paramParcel2.writeNoException();
      if (localLocation != null)
      {
        paramParcel2.writeInt(1);
        localLocation.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(h.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      s locals = k();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (locals != null) {
        localIBinder4 = locals.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      p localp = l();
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (localp != null) {
        localIBinder3 = localp.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 27: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(ag.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(ap.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 29: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(as.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 30: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(av.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 31: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(ay.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 32: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(aj.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 33: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(ad.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 34: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      com.google.android.gms.b.e locale = m();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (locale != null) {
        localIBinder2 = locale.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 35: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (CircleOptions localCircleOptions = CircleOptions.CREATOR.a(paramParcel1);; localCircleOptions = null)
      {
        g localg = a(localCircleOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder1 = null;
        if (localg != null) {
          localIBinder1 = localg.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder1);
        return true;
      }
    case 36: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(be.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 37: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(bb.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 38: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      a(bh.a(paramParcel1.readStrongBinder()), com.google.android.gms.b.f.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
    a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.e
 * JD-Core Version:    0.7.0.1
 */