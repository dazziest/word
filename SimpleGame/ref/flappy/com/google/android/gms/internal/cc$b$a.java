package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cc$b$a
  extends ae
  implements SafeParcelable, d
{
  public static final bo CREATOR = new bo();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private int d;
  private int e;
  
  static
  {
    a.put("leftImageOffset", ae.a.a("leftImageOffset", 2));
    a.put("topImageOffset", ae.a.a("topImageOffset", 3));
  }
  
  public cc$b$a()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  cc$b$a(Set paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
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
      return Integer.valueOf(this.d);
    }
    return Integer.valueOf(this.e);
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
    if (!(paramObject instanceof a)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    a locala = (a)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala1 = (ae.a)localIterator.next();
      if (a(locala1))
      {
        if (locala.a(locala1))
        {
          if (!b(locala1).equals(locala.b(locala1))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (locala.a(locala1)) {
        return false;
      }
    }
    return true;
  }
  
  int f()
  {
    return this.c;
  }
  
  public int g()
  {
    return this.d;
  }
  
  public int h()
  {
    return this.e;
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
  
  public a i()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bo.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc.b.a
 * JD-Core Version:    0.7.0.1
 */