package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public final class PlayerEntity
  extends av
  implements Player
{
  public static final Parcelable.Creator CREATOR = new g();
  private final int a;
  private final String b;
  private final String c;
  private final Uri d;
  private final Uri e;
  private final long f;
  
  PlayerEntity(int paramInt, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramUri1;
    this.e = paramUri2;
    this.f = paramLong;
  }
  
  public PlayerEntity(Player paramPlayer)
  {
    this.a = i;
    this.b = paramPlayer.b();
    this.c = paramPlayer.c();
    this.d = paramPlayer.d();
    this.e = paramPlayer.e();
    this.f = paramPlayer.f();
    cn.a(this.b);
    cn.a(this.c);
    if (this.f > 0L) {}
    for (;;)
    {
      cn.a(i);
      return;
      i = 0;
    }
  }
  
  static int a(Player paramPlayer)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramPlayer.b();
    arrayOfObject[1] = paramPlayer.c();
    arrayOfObject[2] = paramPlayer.d();
    arrayOfObject[3] = paramPlayer.e();
    arrayOfObject[4] = Long.valueOf(paramPlayer.f());
    return dl.a(arrayOfObject);
  }
  
  static boolean a(Player paramPlayer, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Player)) {
      bool = false;
    }
    Player localPlayer;
    do
    {
      do
      {
        return bool;
      } while (paramPlayer == paramObject);
      localPlayer = (Player)paramObject;
    } while ((dl.a(localPlayer.b(), paramPlayer.b())) && (dl.a(localPlayer.c(), paramPlayer.c())) && (dl.a(localPlayer.d(), paramPlayer.d())) && (dl.a(localPlayer.e(), paramPlayer.e())) && (dl.a(Long.valueOf(localPlayer.f()), Long.valueOf(paramPlayer.f()))));
    return false;
  }
  
  static String b(Player paramPlayer)
  {
    return dl.a(paramPlayer).a("PlayerId", paramPlayer.b()).a("DisplayName", paramPlayer.c()).a("IconImageUri", paramPlayer.d()).a("HiResImageUri", paramPlayer.e()).a("RetrievedTimestamp", Long.valueOf(paramPlayer.f())).toString();
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public Uri d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Uri e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public long f()
  {
    return this.f;
  }
  
  public int g()
  {
    return this.a;
  }
  
  public Player h()
  {
    return this;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!v())
    {
      i.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    String str1;
    String str2;
    if (this.d == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.e;
      str2 = null;
      if (localUri != null) {
        break label84;
      }
    }
    for (;;)
    {
      paramParcel.writeString(str2);
      paramParcel.writeLong(this.f);
      return;
      str1 = this.d.toString();
      break;
      label84:
      str2 = this.e.toString();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.PlayerEntity
 * JD-Core Version:    0.7.0.1
 */