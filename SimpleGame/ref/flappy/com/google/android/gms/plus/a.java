package com.google.android.gms.plus;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public class a
  implements SafeParcelable
{
  public static final l CREATOR = new l();
  private final int a;
  private final String b;
  private final String[] c;
  private final String[] d;
  private final String[] e;
  private final String f;
  private final String g;
  private final String h;
  
  public a(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
    this.e = paramArrayOfString3;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
  }
  
  public a(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4)
  {
    this.a = 1;
    this.b = paramString1;
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
    this.e = paramArrayOfString3;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String[] c()
  {
    return this.c;
  }
  
  public String[] d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String[] e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {}
    a locala;
    do
    {
      return false;
      locala = (a)paramObject;
    } while ((this.a != locala.a) || (!dl.a(this.b, locala.b)) || (!dl.a(this.c, locala.c)) || (!dl.a(this.d, locala.d)) || (!dl.a(this.e, locala.e)) || (!dl.a(this.f, locala.f)) || (!dl.a(this.g, locala.g)) || (!dl.a(this.h, locala.h)));
    return true;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.f;
    arrayOfObject[6] = this.g;
    arrayOfObject[7] = this.h;
    return dl.a(arrayOfObject);
  }
  
  public String toString()
  {
    return dl.a(this).a("versionCode", Integer.valueOf(this.a)).a("accountName", this.b).a("requestedScopes", this.c).a("visibleActivities", this.d).a("requiredFeatures", this.e).a("packageNameForAuth", this.f).a("callingPackageName", this.g).a("applicationName", this.h).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.a
 * JD-Core Version:    0.7.0.1
 */