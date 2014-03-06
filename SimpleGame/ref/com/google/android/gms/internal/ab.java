package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class ab
  implements SafeParcelable, d
{
  public static final b CREATOR = new b();
  private final int a;
  private final HashMap b;
  private final HashMap c;
  private final ArrayList d;
  
  public ab()
  {
    this.a = 1;
    this.b = new HashMap();
    this.c = new HashMap();
    this.d = null;
  }
  
  ab(int paramInt, ArrayList paramArrayList)
  {
    this.a = paramInt;
    this.b = new HashMap();
    this.c = new HashMap();
    this.d = null;
    a(paramArrayList);
  }
  
  private void a(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      ab.a locala = (ab.a)localIterator.next();
      a(locala.b, locala.c);
    }
  }
  
  int a()
  {
    return this.a;
  }
  
  public ab a(String paramString, int paramInt)
  {
    this.b.put(paramString, Integer.valueOf(paramInt));
    this.c.put(Integer.valueOf(paramInt), paramString);
    return this;
  }
  
  public String a(Integer paramInteger)
  {
    String str = (String)this.c.get(paramInteger);
    if ((str == null) && (this.b.containsKey("gms_unknown"))) {
      str = "gms_unknown";
    }
    return str;
  }
  
  ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new ab.a(str, ((Integer)this.b.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public int c()
  {
    return 7;
  }
  
  public int d()
  {
    return 0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ab
 * JD-Core Version:    0.7.0.1
 */