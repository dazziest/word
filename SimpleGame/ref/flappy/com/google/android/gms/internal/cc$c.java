package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cc$c
  extends ae
  implements SafeParcelable, f
{
  public static final bq CREATOR = new bq();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private String d;
  
  static
  {
    a.put("url", ae.a.d("url", 2));
  }
  
  public cc$c()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  cc$c(Set paramSet, int paramInt, String paramString)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramString;
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
    }
    return this.d;
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
    if (!(paramObject instanceof c)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    c localc = (c)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localc.a(locala))
        {
          if (!b(locala).equals(localc.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localc.a(locala)) {
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
  
  public c h()
  {
    return this;
  }
  
  public int hashCode()
  {
    Iterator localIterator = a.values().iterator();
    int i = 0;
    ae.a locala;
    if (localIterator.hasNext())
    {
      locala = (ae.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int j = i + locala.g() + b(locala).hashCode();; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bq.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc.c
 * JD-Core Version:    0.7.0.1
 */