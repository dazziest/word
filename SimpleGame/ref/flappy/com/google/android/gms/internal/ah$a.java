package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ah$a
  implements SafeParcelable
{
  public static final h CREATOR = new h();
  final int a;
  final String b;
  final ArrayList c;
  
  ah$a(int paramInt, String paramString, ArrayList paramArrayList)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramArrayList;
  }
  
  ah$a(String paramString, HashMap paramHashMap)
  {
    this.a = 1;
    this.b = paramString;
    this.c = a(paramHashMap);
  }
  
  private static ArrayList a(HashMap paramHashMap)
  {
    if (paramHashMap == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new ah.b(str, (ae.a)paramHashMap.get(str)));
    }
    return localArrayList;
  }
  
  HashMap a()
  {
    HashMap localHashMap = new HashMap();
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      ah.b localb = (ah.b)this.c.get(j);
      localHashMap.put(localb.b, localb.c);
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ah.a
 * JD-Core Version:    0.7.0.1
 */