package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class co
  implements SafeParcelable
{
  public static final bw CREATOR = new bw();
  private final int a;
  private final String b;
  private final List c;
  private final List d;
  private final Uri e;
  private final String f;
  private final String g;
  private final String h;
  private final Bundle i;
  private final Bundle j;
  private final int k;
  
  public co(int paramInt1, String paramString1, List paramList1, List paramList2, Uri paramUri, String paramString2, String paramString3, String paramString4, Bundle paramBundle1, Bundle paramBundle2, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramList1;
    this.d = paramList2;
    this.e = paramUri;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
    this.i = paramBundle1;
    this.j = paramBundle2;
    this.k = paramInt2;
  }
  
  public List a()
  {
    return this.c;
  }
  
  public List b()
  {
    return this.d;
  }
  
  public Uri c()
  {
    return this.e;
  }
  
  public String d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof co)) {}
    co localco;
    do
    {
      return false;
      localco = (co)paramObject;
    } while ((this.a != localco.a) || (!dl.a(this.c, localco.c)) || (!dl.a(this.d, localco.d)) || (!dl.a(this.e, localco.e)) || (!dl.a(this.f, localco.f)) || (!dl.a(this.g, localco.g)) || (!dl.a(this.h, localco.h)));
    return true;
  }
  
  public String f()
  {
    return this.h;
  }
  
  public String g()
  {
    return this.b;
  }
  
  public Bundle h()
  {
    return this.i;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = this.f;
    arrayOfObject[5] = this.g;
    arrayOfObject[6] = this.h;
    return dl.a(arrayOfObject);
  }
  
  public Bundle i()
  {
    return this.j;
  }
  
  public int j()
  {
    return this.k;
  }
  
  public int k()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bw.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.co
 * JD-Core Version:    0.7.0.1
 */