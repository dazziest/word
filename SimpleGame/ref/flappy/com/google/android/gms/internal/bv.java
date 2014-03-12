package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class bv
  implements SafeParcelable
{
  public static final bg CREATOR = new bg();
  private final int a;
  private final String b;
  private final ArrayList c;
  private final ArrayList d;
  private final boolean e;
  
  public bv(int paramInt, String paramString, ArrayList paramArrayList1, ArrayList paramArrayList2, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramArrayList1;
    this.d = paramArrayList2;
    this.e = paramBoolean;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public ArrayList c()
  {
    return this.c;
  }
  
  public ArrayList d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bg.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bv
 * JD-Core Version:    0.7.0.1
 */