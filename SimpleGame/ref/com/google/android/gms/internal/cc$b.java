package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cc$b
  extends ae
  implements SafeParcelable, c
{
  public static final bn CREATOR = new bn();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private cc.b.a d;
  private cc.b.b e;
  private int f;
  
  static
  {
    a.put("coverInfo", ae.a.a("coverInfo", 2, cc.b.a.class));
    a.put("coverPhoto", ae.a.a("coverPhoto", 3, cc.b.b.class));
    a.put("layout", ae.a.a("layout", 4, new ab().a("banner", 0), false));
  }
  
  public cc$b()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  cc$b(Set paramSet, int paramInt1, cc.b.a parama, cc.b.b paramb, int paramInt2)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = parama;
    this.e = paramb;
    this.f = paramInt2;
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
    }
    return Integer.valueOf(this.f);
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
    if (!(paramObject instanceof b)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    b localb = (b)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localb.a(locala))
        {
          if (!b(locala).equals(localb.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localb.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  int f()
  {
    return this.c;
  }
  
  cc.b.a g()
  {
    return this.d;
  }
  
  cc.b.b h()
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
  
  public int i()
  {
    return this.f;
  }
  
  public b j()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bn.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc.b
 * JD-Core Version:    0.7.0.1
 */