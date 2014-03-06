package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cc
  extends ae
  implements SafeParcelable, a
{
  public static final bl CREATOR = new bl();
  private static final HashMap a = new HashMap();
  private boolean A;
  private final Set b;
  private final int c;
  private String d;
  private cc.a e;
  private String f;
  private String g;
  private int h;
  private cc.b i;
  private String j;
  private String k;
  private int l;
  private String m;
  private cc.c n;
  private boolean o;
  private String p;
  private cc.d q;
  private String r;
  private int s;
  private List t;
  private List u;
  private int v;
  private int w;
  private String x;
  private String y;
  private List z;
  
  static
  {
    a.put("aboutMe", ae.a.d("aboutMe", 2));
    a.put("ageRange", ae.a.a("ageRange", 3, cc.a.class));
    a.put("birthday", ae.a.d("birthday", 4));
    a.put("braggingRights", ae.a.d("braggingRights", 5));
    a.put("circledByCount", ae.a.a("circledByCount", 6));
    a.put("cover", ae.a.a("cover", 7, cc.b.class));
    a.put("currentLocation", ae.a.d("currentLocation", 8));
    a.put("displayName", ae.a.d("displayName", 9));
    a.put("gender", ae.a.a("gender", 12, new ab().a("male", 0).a("female", 1).a("other", 2), false));
    a.put("id", ae.a.d("id", 14));
    a.put("image", ae.a.a("image", 15, cc.c.class));
    a.put("isPlusUser", ae.a.c("isPlusUser", 16));
    a.put("language", ae.a.d("language", 18));
    a.put("name", ae.a.a("name", 19, cc.d.class));
    a.put("nickname", ae.a.d("nickname", 20));
    a.put("objectType", ae.a.a("objectType", 21, new ab().a("person", 0).a("page", 1), false));
    a.put("organizations", ae.a.b("organizations", 22, cc.f.class));
    a.put("placesLived", ae.a.b("placesLived", 23, cc.g.class));
    a.put("plusOneCount", ae.a.a("plusOneCount", 24));
    a.put("relationshipStatus", ae.a.a("relationshipStatus", 25, new ab().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
    a.put("tagline", ae.a.d("tagline", 26));
    a.put("url", ae.a.d("url", 27));
    a.put("urls", ae.a.b("urls", 28, cc.h.class));
    a.put("verified", ae.a.c("verified", 29));
  }
  
  public cc()
  {
    this.c = 2;
    this.b = new HashSet();
  }
  
  cc(Set paramSet, int paramInt1, String paramString1, cc.a parama, String paramString2, String paramString3, int paramInt2, cc.b paramb, String paramString4, String paramString5, int paramInt3, String paramString6, cc.c paramc, boolean paramBoolean1, String paramString7, cc.d paramd, String paramString8, int paramInt4, List paramList1, List paramList2, int paramInt5, int paramInt6, String paramString9, String paramString10, List paramList3, boolean paramBoolean2)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = paramString1;
    this.e = parama;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramInt2;
    this.i = paramb;
    this.j = paramString4;
    this.k = paramString5;
    this.l = paramInt3;
    this.m = paramString6;
    this.n = paramc;
    this.o = paramBoolean1;
    this.p = paramString7;
    this.q = paramd;
    this.r = paramString8;
    this.s = paramInt4;
    this.t = paramList1;
    this.u = paramList2;
    this.v = paramInt5;
    this.w = paramInt6;
    this.x = paramString9;
    this.y = paramString10;
    this.z = paramList3;
    this.A = paramBoolean2;
  }
  
  public static cc a(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    cc localcc = CREATOR.a(localParcel);
    localParcel.recycle();
    return localcc;
  }
  
  public String A()
  {
    return this.x;
  }
  
  public String B()
  {
    return this.y;
  }
  
  List C()
  {
    return this.z;
  }
  
  public boolean D()
  {
    return this.A;
  }
  
  public cc E()
  {
    return this;
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
    case 10: 
    case 11: 
    case 13: 
    case 17: 
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
      return Integer.valueOf(this.h);
    case 7: 
      return this.i;
    case 8: 
      return this.j;
    case 9: 
      return this.k;
    case 12: 
      return Integer.valueOf(this.l);
    case 14: 
      return this.m;
    case 15: 
      return this.n;
    case 16: 
      return Boolean.valueOf(this.o);
    case 18: 
      return this.p;
    case 19: 
      return this.q;
    case 20: 
      return this.r;
    case 21: 
      return Integer.valueOf(this.s);
    case 22: 
      return this.t;
    case 23: 
      return this.u;
    case 24: 
      return Integer.valueOf(this.v);
    case 25: 
      return Integer.valueOf(this.w);
    case 26: 
      return this.x;
    case 27: 
      return this.y;
    case 28: 
      return this.z;
    }
    return Boolean.valueOf(this.A);
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
    if (!(paramObject instanceof cc)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    cc localcc = (cc)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localcc.a(locala))
        {
          if (!b(locala).equals(localcc.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localcc.a(locala)) {
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
  
  cc.a h()
  {
    return this.e;
  }
  
  public int hashCode()
  {
    Iterator localIterator = a.values().iterator();
    int i1 = 0;
    ae.a locala;
    if (localIterator.hasNext())
    {
      locala = (ae.a)localIterator.next();
      if (!a(locala)) {
        break label66;
      }
    }
    label66:
    for (int i2 = i1 + locala.g() + b(locala).hashCode();; i2 = i1)
    {
      i1 = i2;
      break;
      return i1;
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
  
  public int k()
  {
    return this.h;
  }
  
  cc.b l()
  {
    return this.i;
  }
  
  public String m()
  {
    return this.j;
  }
  
  public String n()
  {
    return this.k;
  }
  
  public int o()
  {
    return this.l;
  }
  
  public String p()
  {
    return this.m;
  }
  
  cc.c q()
  {
    return this.n;
  }
  
  public boolean r()
  {
    return this.o;
  }
  
  public String s()
  {
    return this.p;
  }
  
  cc.d t()
  {
    return this.q;
  }
  
  public String u()
  {
    return this.r;
  }
  
  public int v()
  {
    return this.s;
  }
  
  List w()
  {
    return this.t;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bl.a(this, paramParcel, paramInt);
  }
  
  List x()
  {
    return this.u;
  }
  
  public int y()
  {
    return this.v;
  }
  
  public int z()
  {
    return this.w;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cc
 * JD-Core Version:    0.7.0.1
 */