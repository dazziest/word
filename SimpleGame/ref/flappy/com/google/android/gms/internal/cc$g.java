package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cc$g
  extends ae
  implements SafeParcelable, i
{
  public static final bt CREATOR = new bt();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private boolean d;
  private String e;
  
  static
  {
    a.put("primary", ae.a.c("primary", 2));
    a.put("value", ae.a.d("value", 3));
  }
  
  public cc$g()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  cc$g(Set paramSet, int paramInt, boolean paramBoolean, String paramString)
  {
    this.b = paramSet;
    this.c = paramInt;
    this.d = paramBoolean;
    this.e = paramString;
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
      return Boolean.valueOf(this.d);
    }
    return this.e;
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
    if (!(paramObject instanceof g)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    g localg = (g)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localg.a(locala))
        {
          if (!b(locala).equals(localg.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localg.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  int f()
  {
    return this.c;
  }
  
  public boolean g()
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
  
  public g i()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bt.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc.g
 * JD-Core Version:    0.7.0.1
 */