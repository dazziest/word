package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public final class GameEntity
  extends av
  implements Game
{
  public static final Parcelable.Creator CREATOR = new a();
  private final int a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final Uri h;
  private final Uri i;
  private final Uri j;
  private final boolean k;
  private final boolean l;
  private final String m;
  private final int n;
  private final int o;
  private final int p;
  
  GameEntity(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramUri1;
    this.i = paramUri2;
    this.j = paramUri3;
    this.k = paramBoolean1;
    this.l = paramBoolean2;
    this.m = paramString7;
    this.n = paramInt2;
    this.o = paramInt3;
    this.p = paramInt4;
  }
  
  public GameEntity(Game paramGame)
  {
    this.a = 1;
    this.b = paramGame.b();
    this.d = paramGame.d();
    this.e = paramGame.e();
    this.f = paramGame.f();
    this.g = paramGame.g();
    this.c = paramGame.c();
    this.h = paramGame.h();
    this.i = paramGame.i();
    this.j = paramGame.j();
    this.k = paramGame.k();
    this.l = paramGame.l();
    this.m = paramGame.m();
    this.n = paramGame.n();
    this.o = paramGame.o();
    this.p = paramGame.p();
  }
  
  static int a(Game paramGame)
  {
    Object[] arrayOfObject = new Object[15];
    arrayOfObject[0] = paramGame.b();
    arrayOfObject[1] = paramGame.c();
    arrayOfObject[2] = paramGame.d();
    arrayOfObject[3] = paramGame.e();
    arrayOfObject[4] = paramGame.f();
    arrayOfObject[5] = paramGame.g();
    arrayOfObject[6] = paramGame.h();
    arrayOfObject[7] = paramGame.i();
    arrayOfObject[8] = paramGame.j();
    arrayOfObject[9] = Boolean.valueOf(paramGame.k());
    arrayOfObject[10] = Boolean.valueOf(paramGame.l());
    arrayOfObject[11] = paramGame.m();
    arrayOfObject[12] = Integer.valueOf(paramGame.n());
    arrayOfObject[13] = Integer.valueOf(paramGame.o());
    arrayOfObject[14] = Integer.valueOf(paramGame.p());
    return dl.a(arrayOfObject);
  }
  
  static boolean a(Game paramGame, Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof Game)) {
      bool = false;
    }
    Game localGame;
    do
    {
      do
      {
        return bool;
      } while (paramGame == paramObject);
      localGame = (Game)paramObject;
    } while ((dl.a(localGame.b(), paramGame.b())) && (dl.a(localGame.c(), paramGame.c())) && (dl.a(localGame.d(), paramGame.d())) && (dl.a(localGame.e(), paramGame.e())) && (dl.a(localGame.f(), paramGame.f())) && (dl.a(localGame.g(), paramGame.g())) && (dl.a(localGame.h(), paramGame.h())) && (dl.a(localGame.i(), paramGame.i())) && (dl.a(localGame.j(), paramGame.j())) && (dl.a(Boolean.valueOf(localGame.k()), Boolean.valueOf(paramGame.k()))) && (dl.a(Boolean.valueOf(localGame.l()), Boolean.valueOf(paramGame.l()))) && (dl.a(localGame.m(), paramGame.m())) && (dl.a(Integer.valueOf(localGame.n()), Integer.valueOf(paramGame.n()))) && (dl.a(Integer.valueOf(localGame.o()), Integer.valueOf(paramGame.o()))) && (dl.a(Integer.valueOf(localGame.p()), Integer.valueOf(paramGame.p()))));
    return false;
  }
  
  static String b(Game paramGame)
  {
    return dl.a(paramGame).a("ApplicationId", paramGame.b()).a("DisplayName", paramGame.c()).a("PrimaryCategory", paramGame.d()).a("SecondaryCategory", paramGame.e()).a("Description", paramGame.f()).a("DeveloperName", paramGame.g()).a("IconImageUri", paramGame.h()).a("HiResImageUri", paramGame.i()).a("FeaturedImageUri", paramGame.j()).a("PlayEnabledGame", Boolean.valueOf(paramGame.k())).a("InstanceInstalled", Boolean.valueOf(paramGame.l())).a("InstancePackageName", paramGame.m()).a("GameplayAclStatus", Integer.valueOf(paramGame.n())).a("AchievementTotalCount", Integer.valueOf(paramGame.o())).a("LeaderboardCount", Integer.valueOf(paramGame.p())).toString();
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }
  
  public String f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public Uri h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    return a(this);
  }
  
  public Uri i()
  {
    return this.i;
  }
  
  public Uri j()
  {
    return this.j;
  }
  
  public boolean k()
  {
    return this.k;
  }
  
  public boolean l()
  {
    return this.l;
  }
  
  public String m()
  {
    return this.m;
  }
  
  public int n()
  {
    return this.n;
  }
  
  public int o()
  {
    return this.o;
  }
  
  public int p()
  {
    return this.p;
  }
  
  public int q()
  {
    return this.a;
  }
  
  public Game r()
  {
    return this;
  }
  
  public String toString()
  {
    return b(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = 1;
    if (!v())
    {
      h.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    String str1;
    String str2;
    label90:
    String str3;
    label110:
    int i2;
    if (this.h == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      if (this.i != null) {
        break label189;
      }
      str2 = null;
      paramParcel.writeString(str2);
      Uri localUri = this.j;
      str3 = null;
      if (localUri != null) {
        break label201;
      }
      paramParcel.writeString(str3);
      if (!this.k) {
        break label213;
      }
      i2 = i1;
      label126:
      paramParcel.writeInt(i2);
      if (!this.l) {
        break label219;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i1);
      paramParcel.writeString(this.m);
      paramParcel.writeInt(this.n);
      paramParcel.writeInt(this.o);
      paramParcel.writeInt(this.p);
      return;
      str1 = this.h.toString();
      break;
      label189:
      str2 = this.i.toString();
      break label90;
      label201:
      str3 = this.j.toString();
      break label110;
      label213:
      i2 = 0;
      break label126;
      label219:
      i1 = 0;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GameEntity
 * JD-Core Version:    0.7.0.1
 */