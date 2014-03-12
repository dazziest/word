package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class cq
  implements SafeParcelable
{
  public static final by CREATOR = new by();
  private final int a;
  private final ArrayList b;
  private final ArrayList c;
  private final Bundle d;
  private final boolean e;
  private final int f;
  
  public cq(int paramInt1, ArrayList paramArrayList1, ArrayList paramArrayList2, Bundle paramBundle, boolean paramBoolean, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramArrayList1;
    this.c = paramArrayList2;
    this.d = paramBundle;
    this.e = paramBoolean;
    this.f = paramInt2;
  }
  
  public ArrayList a()
  {
    return this.b;
  }
  
  public ArrayList b()
  {
    return this.c;
  }
  
  public Bundle c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cq)) {}
    cq localcq;
    do
    {
      return false;
      localcq = (cq)paramObject;
    } while ((this.a != localcq.a) || (!dl.a(this.b, localcq.b)) || (!dl.a(this.c, localcq.c)) || (!dl.a(this.d, localcq.d)) || (!dl.a(Integer.valueOf(this.f), Integer.valueOf(localcq.f))));
    return true;
  }
  
  public int f()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = Integer.valueOf(this.f);
    return dl.a(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    by.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cq
 * JD-Core Version:    0.7.0.1
 */