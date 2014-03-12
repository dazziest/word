package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ah
  implements SafeParcelable
{
  public static final g CREATOR = new g();
  private final int a;
  private final HashMap b;
  private final ArrayList c;
  private final String d;
  
  ah(int paramInt, ArrayList paramArrayList, String paramString)
  {
    this.a = paramInt;
    this.c = null;
    this.b = a(paramArrayList);
    this.d = ((String)do.a(paramString));
    a();
  }
  
  private static HashMap a(ArrayList paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      ah.a locala = (ah.a)paramArrayList.get(j);
      localHashMap.put(locala.b, locala.a());
    }
    return localHashMap;
  }
  
  public HashMap a(String paramString)
  {
    return (HashMap)this.b.get(paramString);
  }
  
  public void a()
  {
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      HashMap localHashMap = (HashMap)this.b.get(str);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext()) {
        ((ae.a)localHashMap.get((String)localIterator2.next())).a(this);
      }
    }
  }
  
  int b()
  {
    return this.a;
  }
  
  ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new ah.a(str, (HashMap)this.b.get(str)));
    }
    return localArrayList;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.b.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      localStringBuilder.append(str1).append(":\n");
      HashMap localHashMap = (HashMap)this.b.get(str1);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str2).append(": ");
        localStringBuilder.append(localHashMap.get(str2));
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ah
 * JD-Core Version:    0.7.0.1
 */