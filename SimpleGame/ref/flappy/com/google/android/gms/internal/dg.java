package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class dg
  extends Binder
  implements df
{
  public static df a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    if ((localIInterface != null) && ((localIInterface instanceof df))) {
      return (df)localIInterface;
    }
    return new dh(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc10 = dd.a(paramParcel1.readStrongBinder());
      int i13 = paramParcel1.readInt();
      String str13 = paramParcel1.readString();
      String str14 = paramParcel1.readString();
      String[] arrayOfString2 = paramParcel1.createStringArray();
      String str15 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle10 = null)
      {
        a(localdc10, i13, str13, str14, arrayOfString2, str15, localBundle10);
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc9 = dd.a(paramParcel1.readStrongBinder());
      int i11 = paramParcel1.readInt();
      String str12 = paramParcel1.readString();
      int i12 = paramParcel1.readInt();
      Bundle localBundle9 = null;
      if (i12 != 0) {
        localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localdc9, i11, str12, localBundle9);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(dd.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(dd.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc8 = dd.a(paramParcel1.readStrongBinder());
      int i9 = paramParcel1.readInt();
      String str11 = paramParcel1.readString();
      int i10 = paramParcel1.readInt();
      Bundle localBundle8 = null;
      if (i10 != 0) {
        localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b(localdc8, i9, str11, localBundle8);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc7 = dd.a(paramParcel1.readStrongBinder());
      int i7 = paramParcel1.readInt();
      String str10 = paramParcel1.readString();
      int i8 = paramParcel1.readInt();
      Bundle localBundle7 = null;
      if (i8 != 0) {
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      c(localdc7, i7, str10, localBundle7);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc6 = dd.a(paramParcel1.readStrongBinder());
      int i5 = paramParcel1.readInt();
      String str9 = paramParcel1.readString();
      int i6 = paramParcel1.readInt();
      Bundle localBundle6 = null;
      if (i6 != 0) {
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      d(localdc6, i5, str9, localBundle6);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc5 = dd.a(paramParcel1.readStrongBinder());
      int i3 = paramParcel1.readInt();
      String str8 = paramParcel1.readString();
      int i4 = paramParcel1.readInt();
      Bundle localBundle5 = null;
      if (i4 != 0) {
        localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      e(localdc5, i3, str8, localBundle5);
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc4 = dd.a(paramParcel1.readStrongBinder());
      int i2 = paramParcel1.readInt();
      String str4 = paramParcel1.readString();
      String str5 = paramParcel1.readString();
      String[] arrayOfString1 = paramParcel1.createStringArray();
      String str6 = paramParcel1.readString();
      IBinder localIBinder = paramParcel1.readStrongBinder();
      String str7 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle4 = null)
      {
        a(localdc4, i2, str4, str5, arrayOfString1, str6, localIBinder, str7, localBundle4);
        paramParcel2.writeNoException();
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(dd.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc3 = dd.a(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (i1 != 0) {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      f(localdc3, n, str3, localBundle3);
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      dc localdc2 = dd.a(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      String str2 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (m != 0) {
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      g(localdc2, k, str2, localBundle2);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    dc localdc1 = dd.a(paramParcel1.readStrongBinder());
    int i = paramParcel1.readInt();
    String str1 = paramParcel1.readString();
    int j = paramParcel1.readInt();
    Bundle localBundle1 = null;
    if (j != 0) {
      localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    }
    h(localdc1, i, str1, localBundle1);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dg
 * JD-Core Version:    0.7.0.1
 */