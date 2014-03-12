package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bz
  extends ae
  implements SafeParcelable, b
{
  public static final bk CREATOR = new bk();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private String d;
  private bx e;
  private String f;
  private bx g;
  private String h;
  
  static
  {
    a.put("id", ae.a.d("id", 2));
    a.put("result", ae.a.a("result", 4, bx.class));
    a.put("startDate", ae.a.d("startDate", 5));
    a.put("target", ae.a.a("target", 6, bx.class));
    a.put("type", ae.a.d("type", 7));
  }
  
  public bz()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  bz(Set paramSet, int paramInt, String paramString1, bx parambx1, String paramString2, bx parambx2, String paramString3)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramString1;
    this.e = parambx1;
    this.f = paramString2;
    this.g = parambx2;
    this.h = paramString3;
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
    case 3: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.g());
    case 2: 
      return this.d;
    case 4: 
      return this.e;
    case 5: 
      return this.f;
    case 6: 
      return this.g;
    }
    return this.h;
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
    if (!(paramObject instanceof bz)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    bz localbz = (bz)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localbz.a(locala))
        {
          if (!b(locala).equals(localbz.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localbz.a(locala)) {
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
  
  bx h()
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
  
  public String i()
  {
    return this.f;
  }
  
  bx j()
  {
    return this.g;
  }
  
  public String k()
  {
    return this.h;
  }
  
  public bz l()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bk.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bz
 * JD-Core Version:    0.7.0.1
 */