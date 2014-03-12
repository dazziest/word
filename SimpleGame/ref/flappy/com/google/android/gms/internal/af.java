package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.d;

public abstract class af
  extends Binder
  implements ad
{
  public static ad a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
    if ((localIInterface != null) && ((localIInterface instanceof ad))) {
      return (ad)localIInterface;
    }
    return new ag(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.games.internal.IGamesService");
      return true;
    case 5001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str27 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str27);
      return true;
    case 5004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      Bundle localBundle7 = b();
      paramParcel2.writeNoException();
      if (localBundle7 != null)
      {
        paramParcel2.writeInt(1);
        localBundle7.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5005: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      IBinder localIBinder6 = paramParcel1.readStrongBinder();
      int i47 = paramParcel1.readInt();
      Bundle localBundle6 = null;
      if (i47 != 0) {
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localIBinder6, localBundle6);
      paramParcel2.writeNoException();
      return true;
    case 5006: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c();
      paramParcel2.writeNoException();
      return true;
    case 5007: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str26 = d();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str26);
      return true;
    case 5064: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str25 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str25);
      return true;
    case 5065: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5008: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5009: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5010: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5011: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy29 = aa.a(paramParcel1.readStrongBinder());
      String str24 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool38 = true;; bool38 = false)
      {
        a(localy29, str24, bool38, paramParcel1.createLongArray());
        paramParcel2.writeNoException();
        return true;
      }
    case 5012: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str23 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str23);
      return true;
    case 5013: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d locald2 = f();
      paramParcel2.writeNoException();
      if (locald2 != null)
      {
        paramParcel2.writeInt(1);
        locald2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5014: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5015: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy28 = aa.a(paramParcel1.readStrongBinder());
      int i45 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool36 = true;; bool36 = false)
      {
        int i46 = paramParcel1.readInt();
        boolean bool37 = false;
        if (i46 != 0) {
          bool37 = true;
        }
        a(localy28, i45, bool36, bool37);
        paramParcel2.writeNoException();
        return true;
      }
    case 5016: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5017: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5018: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5019: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy27 = aa.a(paramParcel1.readStrongBinder());
      String str22 = paramParcel1.readString();
      int i42 = paramParcel1.readInt();
      int i43 = paramParcel1.readInt();
      int i44 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool35 = true;; bool35 = false)
      {
        a(localy27, str22, i42, i43, i44, bool35);
        paramParcel2.writeNoException();
        return true;
      }
    case 5020: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy26 = aa.a(paramParcel1.readStrongBinder());
      String str21 = paramParcel1.readString();
      int i39 = paramParcel1.readInt();
      int i40 = paramParcel1.readInt();
      int i41 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool34 = true;; bool34 = false)
      {
        b(localy26, str21, i39, i40, i41, bool34);
        paramParcel2.writeNoException();
        return true;
      }
    case 5021: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy25 = aa.a(paramParcel1.readStrongBinder());
      int i38 = paramParcel1.readInt();
      Bundle localBundle5 = null;
      if (i38 != 0) {
        localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localy25, localBundle5, paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5022: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5023: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy24 = aa.a(paramParcel1.readStrongBinder());
      String str20 = paramParcel1.readString();
      IBinder localIBinder5 = paramParcel1.readStrongBinder();
      int i37 = paramParcel1.readInt();
      Bundle localBundle4 = null;
      if (i37 != 0) {
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(localy24, str20, localIBinder5, localBundle4);
      paramParcel2.writeNoException();
      return true;
    case 5024: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy23 = aa.a(paramParcel1.readStrongBinder());
      String str19 = paramParcel1.readString();
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      int i36 = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (i36 != 0) {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b(localy23, str19, localIBinder4, localBundle3);
      paramParcel2.writeNoException();
      return true;
    case 5025: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy22 = aa.a(paramParcel1.readStrongBinder());
      String str18 = paramParcel1.readString();
      int i35 = paramParcel1.readInt();
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        a(localy22, str18, i35, localIBinder3, localBundle2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5026: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5027: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      e(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5028: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5029: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5058: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5059: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 5030: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy21 = aa.a(paramParcel1.readStrongBinder());
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      int i34 = paramParcel1.readInt();
      String[] arrayOfString = paramParcel1.createStringArray();
      Bundle localBundle1;
      if (paramParcel1.readInt() != 0)
      {
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2034;
        }
      }
      for (boolean bool33 = true;; bool33 = false)
      {
        a(localy21, localIBinder2, i34, arrayOfString, localBundle1, bool33, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
        localBundle1 = null;
        break;
      }
    case 5031: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy20 = aa.a(paramParcel1.readStrongBinder());
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      String str17 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool32 = true;; bool32 = false)
      {
        a(localy20, localIBinder1, str17, bool32, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 5032: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      e(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5033: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i33 = a(aa.a(paramParcel1.readStrongBinder()), paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i33);
      return true;
    case 5034: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i32 = a(paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i32);
      return true;
    case 5035: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      String str16 = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str16);
      return true;
    case 5036: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5037: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      f(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5038: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      b(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5039: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy19 = aa.a(paramParcel1.readStrongBinder());
      String str14 = paramParcel1.readString();
      String str15 = paramParcel1.readString();
      int i28 = paramParcel1.readInt();
      int i29 = paramParcel1.readInt();
      int i30 = paramParcel1.readInt();
      int i31 = paramParcel1.readInt();
      boolean bool31 = false;
      if (i31 != 0) {
        bool31 = true;
      }
      a(localy19, str14, str15, i28, i29, i30, bool31);
      paramParcel2.writeNoException();
      return true;
    case 5040: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy18 = aa.a(paramParcel1.readStrongBinder());
      String str12 = paramParcel1.readString();
      String str13 = paramParcel1.readString();
      int i24 = paramParcel1.readInt();
      int i25 = paramParcel1.readInt();
      int i26 = paramParcel1.readInt();
      int i27 = paramParcel1.readInt();
      boolean bool30 = false;
      if (i27 != 0) {
        bool30 = true;
      }
      b(localy18, str12, str13, i24, i25, i26, bool30);
      paramParcel2.writeNoException();
      return true;
    case 5041: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5042: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      g(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5043: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      h(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5044: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy17 = aa.a(paramParcel1.readStrongBinder());
      int i22 = paramParcel1.readInt();
      int i23 = paramParcel1.readInt();
      boolean bool28;
      if (paramParcel1.readInt() != 0)
      {
        bool28 = true;
        if (paramParcel1.readInt() == 0) {
          break label2647;
        }
      }
      for (boolean bool29 = true;; bool29 = false)
      {
        a(localy17, i22, i23, bool28, bool29);
        paramParcel2.writeNoException();
        return true;
        bool28 = false;
        break;
      }
    case 5045: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy16 = aa.a(paramParcel1.readStrongBinder());
      String str11 = paramParcel1.readString();
      int i21 = paramParcel1.readInt();
      boolean bool26;
      if (paramParcel1.readInt() != 0)
      {
        bool26 = true;
        if (paramParcel1.readInt() == 0) {
          break label2726;
        }
      }
      for (boolean bool27 = true;; bool27 = false)
      {
        a(localy16, str11, i21, bool26, bool27);
        paramParcel2.writeNoException();
        return true;
        bool26 = false;
        break;
      }
    case 5046: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy15 = aa.a(paramParcel1.readStrongBinder());
      int i19 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool24 = true;; bool24 = false)
      {
        int i20 = paramParcel1.readInt();
        boolean bool25 = false;
        if (i20 != 0) {
          bool25 = true;
        }
        b(localy15, i19, bool24, bool25);
        paramParcel2.writeNoException();
        return true;
      }
    case 5047: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      f(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5048: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy14 = aa.a(paramParcel1.readStrongBinder());
      int i17 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool22 = true;; bool22 = false)
      {
        int i18 = paramParcel1.readInt();
        boolean bool23 = false;
        if (i18 != 0) {
          bool23 = true;
        }
        c(localy14, i17, bool22, bool23);
        paramParcel2.writeNoException();
        return true;
      }
    case 5049: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      g(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5050: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5051: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5052: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      i(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5053: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i16 = j(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i16);
      return true;
    case 5060: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i15 = d(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i15);
      return true;
    case 5054: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy13 = aa.a(paramParcel1.readStrongBinder());
      String str10 = paramParcel1.readString();
      int i14 = paramParcel1.readInt();
      boolean bool21 = false;
      if (i14 != 0) {
        bool21 = true;
      }
      a(localy13, str10, bool21);
      paramParcel2.writeNoException();
      return true;
    case 5061: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      k(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5055: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      c(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5067: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      boolean bool20 = g();
      paramParcel2.writeNoException();
      int i13 = 0;
      if (bool20) {
        i13 = 1;
      }
      paramParcel2.writeInt(i13);
      return true;
    case 5068: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      int i12 = paramParcel1.readInt();
      boolean bool19 = false;
      if (i12 != 0) {
        bool19 = true;
      }
      a(bool19);
      paramParcel2.writeNoException();
      return true;
    case 5056: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      h(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5057: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      l(aa.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5062: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      i(aa.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5063: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy12 = aa.a(paramParcel1.readStrongBinder());
      int i11 = paramParcel1.readInt();
      boolean bool18 = false;
      if (i11 != 0) {
        bool18 = true;
      }
      a(localy12, bool18);
      paramParcel2.writeNoException();
      return true;
    case 5066: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      Uri localUri2 = e(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localUri2 != null)
      {
        paramParcel2.writeInt(1);
        localUri2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 5501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy11 = aa.a(paramParcel1.readStrongBinder());
      String str9 = paramParcel1.readString();
      int i10 = paramParcel1.readInt();
      boolean bool16;
      if (paramParcel1.readInt() != 0)
      {
        bool16 = true;
        if (paramParcel1.readInt() == 0) {
          break label3473;
        }
      }
      for (boolean bool17 = true;; bool17 = false)
      {
        b(localy11, str9, i10, bool16, bool17);
        paramParcel2.writeNoException();
        return true;
        bool16 = false;
        break;
      }
    case 5502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      d locald1 = h();
      paramParcel2.writeNoException();
      if (locald1 != null)
      {
        paramParcel2.writeInt(1);
        locald1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 6001: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy10 = aa.a(paramParcel1.readStrongBinder());
      int i9 = paramParcel1.readInt();
      boolean bool15 = false;
      if (i9 != 0) {
        bool15 = true;
      }
      b(localy10, bool15);
      paramParcel2.writeNoException();
      return true;
    case 6002: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy9 = aa.a(paramParcel1.readStrongBinder());
      String str7 = paramParcel1.readString();
      String str8 = paramParcel1.readString();
      int i8 = paramParcel1.readInt();
      boolean bool14 = false;
      if (i8 != 0) {
        bool14 = true;
      }
      a(localy9, str7, str8, bool14);
      paramParcel2.writeNoException();
      return true;
    case 6003: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy8 = aa.a(paramParcel1.readStrongBinder());
      int i6 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool12 = true;; bool12 = false)
      {
        int i7 = paramParcel1.readInt();
        boolean bool13 = false;
        if (i7 != 0) {
          bool13 = true;
        }
        d(localy8, i6, bool12, bool13);
        paramParcel2.writeNoException();
        return true;
      }
    case 6004: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy7 = aa.a(paramParcel1.readStrongBinder());
      int i4 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool10 = true;; bool10 = false)
      {
        int i5 = paramParcel1.readInt();
        boolean bool11 = false;
        if (i5 != 0) {
          bool11 = true;
        }
        e(localy7, i4, bool10, bool11);
        paramParcel2.writeNoException();
        return true;
      }
    case 6501: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy6 = aa.a(paramParcel1.readStrongBinder());
      String str6 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      boolean bool6;
      boolean bool7;
      if (paramParcel1.readInt() != 0)
      {
        bool6 = true;
        if (paramParcel1.readInt() == 0) {
          break label3877;
        }
        bool7 = true;
        if (paramParcel1.readInt() == 0) {
          break label3883;
        }
      }
      for (boolean bool8 = true;; bool8 = false)
      {
        int i3 = paramParcel1.readInt();
        boolean bool9 = false;
        if (i3 != 0) {
          bool9 = true;
        }
        a(localy6, str6, i2, bool6, bool7, bool8, bool9);
        paramParcel2.writeNoException();
        return true;
        bool6 = false;
        break;
        bool7 = false;
        break label3820;
      }
    case 6502: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy5 = aa.a(paramParcel1.readStrongBinder());
      String str5 = paramParcel1.readString();
      int i1 = paramParcel1.readInt();
      boolean bool5 = false;
      if (i1 != 0) {
        bool5 = true;
      }
      b(localy5, str5, bool5);
      paramParcel2.writeNoException();
      return true;
    case 6503: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy4 = aa.a(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      boolean bool4 = false;
      if (n != 0) {
        bool4 = true;
      }
      c(localy4, bool4);
      paramParcel2.writeNoException();
      return true;
    case 6504: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy3 = aa.a(paramParcel1.readStrongBinder());
      String str4 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      boolean bool3 = false;
      if (m != 0) {
        bool3 = true;
      }
      c(localy3, str4, bool3);
      paramParcel2.writeNoException();
      return true;
    case 6505: 
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      y localy2 = aa.a(paramParcel1.readStrongBinder());
      String str3 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      boolean bool2 = false;
      if (k != 0) {
        bool2 = true;
      }
      d(localy2, str3, bool2);
      paramParcel2.writeNoException();
      return true;
    case 6506: 
      label2034:
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      label2647:
      label3820:
      y localy1 = aa.a(paramParcel1.readStrongBinder());
      label2726:
      label3883:
      String str1 = paramParcel1.readString();
      label3473:
      label3877:
      String str2 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      boolean bool1 = false;
      if (j != 0) {
        bool1 = true;
      }
      b(localy1, str1, str2, bool1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
    int i = paramParcel1.readInt();
    Uri localUri1 = null;
    if (i != 0) {
      localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
    }
    ParcelFileDescriptor localParcelFileDescriptor = a(localUri1);
    paramParcel2.writeNoException();
    if (localParcelFileDescriptor != null)
    {
      paramParcel2.writeInt(1);
      localParcelFileDescriptor.writeToParcel(paramParcel2, 1);
      return true;
    }
    paramParcel2.writeInt(0);
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.af
 * JD-Core Version:    0.7.0.1
 */