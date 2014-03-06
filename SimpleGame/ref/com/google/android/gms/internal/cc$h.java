package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cc$h
  extends ae
  implements SafeParcelable, j
{
  public static final bu CREATOR = new bu();
  private static final HashMap a = new HashMap();
  private final Set b;
  private final int c;
  private String d;
  private final int e = 4;
  private int f;
  private String g;
  
  static
  {
    a.put("label", ae.a.d("label", 5));
    a.put("type", ae.a.a("type", 6, new ab().a("home", 0).a("work", 1).a("blog", 2).a("profile", 3).a("other", 4).a("otherProfile", 5).a("contributor", 6).a("website", 7), false));
    a.put("value", ae.a.d("value", 4));
  }
  
  public cc$h()
  {
    this.c = 2;
    this.b = new HashSet();
  }
  
  cc$h(Set paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramString1;
    this.f = paramInt2;
    this.g = paramString2;
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
    case 5: 
      return this.d;
    case 6: 
      return Integer.valueOf(this.f);
    }
    return this.g;
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
    if (!(paramObject instanceof h)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    h localh = (h)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localh.a(locala))
        {
          if (!b(locala).equals(localh.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localh.a(locala)) {
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
  
  @Deprecated
  public int h()
  {
    return 4;
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
  
  public String j()
  {
    return this.g;
  }
  
  public h k()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bu.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc.h
 * JD-Core Version:    0.7.0.1
 */