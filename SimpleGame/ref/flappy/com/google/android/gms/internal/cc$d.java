package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cc$d
  extends ae
  implements SafeParcelable, g
{
  public static final br CREATOR = new br();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  
  static
  {
    a.put("familyName", ae.a.d("familyName", 2));
    a.put("formatted", ae.a.d("formatted", 3));
    a.put("givenName", ae.a.d("givenName", 4));
    a.put("honorificPrefix", ae.a.d("honorificPrefix", 5));
    a.put("honorificSuffix", ae.a.d("honorificSuffix", 6));
    a.put("middleName", ae.a.d("middleName", 7));
  }
  
  public cc$d()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  cc$d(Set paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
  }
  
  protected Object a(String paramString)
  {
    return null;
  }
  
  protected boolean a(ae.a parama)
  {
    return this.b.contains(Integer.valueOf(parama.g()));
  }
  
  protected Object b(ae.a parama)
  {
    switch (parama.g())
    {
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.g());
    case 2: 
      return this.d;
    case 3: 
      return this.e;
    case 4: 
      return this.f;
    case 5: 
      return this.g;
    case 6: 
      return this.h;
    }
    return this.i;
  }
  
  public HashMap b()
  {
    return a;
  }
  
  protected boolean b(String paramString)
  {
    return false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  Set e()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    d locald = (d)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (locald.a(locala))
        {
          if (!b(locala).equals(locald.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (locald.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  int f()
  {
    return this.c;
  }
  
  public String g()
  {
    return this.d;
  }
  
  public String h()
  {
    return this.e;
  }
  
  public int hashCode()
  {
    Iterator localIterator = a.values().iterator();
    int j = 0;
    ae.a locala;
    if (localIterator.hasNext())
    {
      locala = (ae.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int k = j + locala.g() + b(locala).hashCode();; k = j)
    {
      j = k;
      break;
      return j;
    }
  }
  
  public String i()
  {
    return this.f;
  }
  
  public String j()
  {
    return this.g;
  }
  
  public String k()
  {
    return this.h;
  }
  
  public String l()
  {
    return this.i;
  }
  
  public d m()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    br.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc.d
 * JD-Core Version:    0.7.0.1
 */