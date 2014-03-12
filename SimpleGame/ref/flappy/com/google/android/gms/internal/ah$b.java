package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ah$b
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  final int a;
  final String b;
  final ae.a c;
  
  ah$b(int paramInt, String paramString, ae.a parama)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = parama;
  }
  
  ah$b(String paramString, ae.a parama)
  {
    this.a = 1;
    this.b = paramString;
    this.c = parama;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ah.b
 * JD-Core Version:    0.7.0.1
 */