package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public abstract class bb
  extends Binder
  implements ba
{
  public static ba a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
    if ((localIInterface != null) && ((localIInterface instanceof ba))) {
      return (ba)localIInterface;
    }
    return new bc(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      if (paramParcel1.readInt() != 0) {}
      for (ak localak = ak.CREATOR.a(paramParcel1);; localak = null)
      {
        a(localak);
        paramParcel2.writeNoException();
        return true;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      String str10 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str10);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b();
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      c(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq11 = ar.a(paramParcel1.readStrongBinder());
      Uri localUri3;
      if (paramParcel1.readInt() != 0)
      {
        localUri3 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label636;
        }
      }
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        a(localaq11, localUri3, localBundle2);
        paramParcel2.writeNoException();
        return true;
        localUri3 = null;
        break;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      d(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b(ar.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq10 = ar.a(paramParcel1.readStrongBinder());
      int i4 = paramParcel1.readInt();
      String str9 = paramParcel1.readString();
      int i5 = paramParcel1.readInt();
      Uri localUri2 = null;
      if (i5 != 0) {
        localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      a(localaq10, i4, str9, localUri2, paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      e(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      c(ar.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq9 = ar.a(paramParcel1.readStrongBinder());
      String str8 = paramParcel1.readString();
      int i3 = paramParcel1.readInt();
      boolean bool6 = false;
      if (i3 != 0) {
        bool6 = true;
      }
      a(localaq9, str8, bool6);
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq8 = ar.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool4 = true;; bool4 = false)
      {
        int i2 = paramParcel1.readInt();
        boolean bool5 = false;
        if (i2 != 0) {
          bool5 = true;
        }
        a(localaq8, bool4, bool5);
        paramParcel2.writeNoException();
        return true;
      }
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createStringArrayList(), paramParcel1.createStringArrayList(), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      f(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq7 = ar.a(paramParcel1.readStrongBinder());
      String str7 = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      bv localbv = null;
      if (i1 != 0) {
        localbv = bv.CREATOR.a(paramParcel1);
      }
      a(localaq7, str7, localbv);
      paramParcel2.writeNoException();
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      g(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 27: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq6 = ar.a(paramParcel1.readStrongBinder());
      String str6 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      boolean bool3 = false;
      if (n != 0) {
        bool3 = true;
      }
      a(localaq6, str6, bool3, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createTypedArrayList(x.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 29: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq5 = ar.a(paramParcel1.readStrongBinder());
      String str5 = paramParcel1.readString();
      ArrayList localArrayList2 = paramParcel1.createTypedArrayList(x.CREATOR);
      int m = paramParcel1.readInt();
      boolean bool2 = false;
      if (m != 0) {
        bool2 = true;
      }
      a(localaq5, str5, localArrayList2, bool2);
      paramParcel2.writeNoException();
      return true;
    case 30: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq4 = ar.a(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      co localco = null;
      if (k != 0) {
        localco = co.CREATOR.a(paramParcel1);
      }
      a(localaq4, localco);
      paramParcel2.writeNoException();
      return true;
    case 31: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq3 = ar.a(paramParcel1.readStrongBinder());
      String str4 = paramParcel1.readString();
      ArrayList localArrayList1 = paramParcel1.createTypedArrayList(x.CREATOR);
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        a(localaq3, str4, localArrayList1, localBundle1);
        paramParcel2.writeNoException();
        return true;
      }
    case 32: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq2 = ar.a(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      Uri localUri1 = null;
      if (j != 0) {
        localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      }
      a(localaq2, i, str3, localUri1, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 33: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      h(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 34: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 35: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      i(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 36: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 37: 
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      aq localaq1 = ar.a(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        a(localaq1, str1, str2, bool1, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 38: 
      label636:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      d(ar.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
    a(ar.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bb
 * JD-Core Version:    0.7.0.1
 */