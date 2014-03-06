package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bx
  extends ae
  implements SafeParcelable, a
{
  public static final bh CREATOR = new bh();
  private static final HashMap a = new HashMap();
  private String A;
  private String B;
  private String C;
  private String D;
  private bx E;
  private String F;
  private String G;
  private String H;
  private String I;
  private bx J;
  private double K;
  private bx L;
  private double M;
  private String N;
  private bx O;
  private List P;
  private String Q;
  private String R;
  private String S;
  private String T;
  private bx U;
  private String V;
  private String W;
  private String X;
  private bx Y;
  private String Z;
  private String aa;
  private String ab;
  private String ac;
  private String ad;
  private String ae;
  private final Set b;
  private final int c;
  private bx d;
  private List e;
  private bx f;
  private String g;
  private String h;
  private String i;
  private List j;
  private int k;
  private List l;
  private bx m;
  private List n;
  private String o;
  private String p;
  private bx q;
  private String r;
  private String s;
  private String t;
  private List u;
  private String v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  static
  {
    a.put("about", ae.a.a("about", 2, bx.class));
    a.put("additionalName", ae.a.e("additionalName", 3));
    a.put("address", ae.a.a("address", 4, bx.class));
    a.put("addressCountry", ae.a.d("addressCountry", 5));
    a.put("addressLocality", ae.a.d("addressLocality", 6));
    a.put("addressRegion", ae.a.d("addressRegion", 7));
    a.put("associated_media", ae.a.b("associated_media", 8, bx.class));
    a.put("attendeeCount", ae.a.a("attendeeCount", 9));
    a.put("attendees", ae.a.b("attendees", 10, bx.class));
    a.put("audio", ae.a.a("audio", 11, bx.class));
    a.put("author", ae.a.b("author", 12, bx.class));
    a.put("bestRating", ae.a.d("bestRating", 13));
    a.put("birthDate", ae.a.d("birthDate", 14));
    a.put("byArtist", ae.a.a("byArtist", 15, bx.class));
    a.put("caption", ae.a.d("caption", 16));
    a.put("contentSize", ae.a.d("contentSize", 17));
    a.put("contentUrl", ae.a.d("contentUrl", 18));
    a.put("contributor", ae.a.b("contributor", 19, bx.class));
    a.put("dateCreated", ae.a.d("dateCreated", 20));
    a.put("dateModified", ae.a.d("dateModified", 21));
    a.put("datePublished", ae.a.d("datePublished", 22));
    a.put("description", ae.a.d("description", 23));
    a.put("duration", ae.a.d("duration", 24));
    a.put("embedUrl", ae.a.d("embedUrl", 25));
    a.put("endDate", ae.a.d("endDate", 26));
    a.put("familyName", ae.a.d("familyName", 27));
    a.put("gender", ae.a.d("gender", 28));
    a.put("geo", ae.a.a("geo", 29, bx.class));
    a.put("givenName", ae.a.d("givenName", 30));
    a.put("height", ae.a.d("height", 31));
    a.put("id", ae.a.d("id", 32));
    a.put("image", ae.a.d("image", 33));
    a.put("inAlbum", ae.a.a("inAlbum", 34, bx.class));
    a.put("latitude", ae.a.b("latitude", 36));
    a.put("location", ae.a.a("location", 37, bx.class));
    a.put("longitude", ae.a.b("longitude", 38));
    a.put("name", ae.a.d("name", 39));
    a.put("partOfTVSeries", ae.a.a("partOfTVSeries", 40, bx.class));
    a.put("performers", ae.a.b("performers", 41, bx.class));
    a.put("playerType", ae.a.d("playerType", 42));
    a.put("postOfficeBoxNumber", ae.a.d("postOfficeBoxNumber", 43));
    a.put("postalCode", ae.a.d("postalCode", 44));
    a.put("ratingValue", ae.a.d("ratingValue", 45));
    a.put("reviewRating", ae.a.a("reviewRating", 46, bx.class));
    a.put("startDate", ae.a.d("startDate", 47));
    a.put("streetAddress", ae.a.d("streetAddress", 48));
    a.put("text", ae.a.d("text", 49));
    a.put("thumbnail", ae.a.a("thumbnail", 50, bx.class));
    a.put("thumbnailUrl", ae.a.d("thumbnailUrl", 51));
    a.put("tickerSymbol", ae.a.d("tickerSymbol", 52));
    a.put("type", ae.a.d("type", 53));
    a.put("url", ae.a.d("url", 54));
    a.put("width", ae.a.d("width", 55));
    a.put("worstRating", ae.a.d("worstRating", 56));
  }
  
  public bx()
  {
    this.c = 1;
    this.b = new HashSet();
  }
  
  bx(Set paramSet, int paramInt1, bx parambx1, List paramList1, bx parambx2, String paramString1, String paramString2, String paramString3, List paramList2, int paramInt2, List paramList3, bx parambx3, List paramList4, String paramString4, String paramString5, bx parambx4, String paramString6, String paramString7, String paramString8, List paramList5, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, bx parambx5, String paramString18, String paramString19, String paramString20, String paramString21, bx parambx6, double paramDouble1, bx parambx7, double paramDouble2, String paramString22, bx parambx8, List paramList6, String paramString23, String paramString24, String paramString25, String paramString26, bx parambx9, String paramString27, String paramString28, String paramString29, bx parambx10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.b = paramSet;
    this.c = paramInt1;
    this.d = parambx1;
    this.e = paramList1;
    this.f = parambx2;
    this.g = paramString1;
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramList2;
    this.k = paramInt2;
    this.l = paramList3;
    this.m = parambx3;
    this.n = paramList4;
    this.o = paramString4;
    this.p = paramString5;
    this.q = parambx4;
    this.r = paramString6;
    this.s = paramString7;
    this.t = paramString8;
    this.u = paramList5;
    this.v = paramString9;
    this.w = paramString10;
    this.x = paramString11;
    this.y = paramString12;
    this.z = paramString13;
    this.A = paramString14;
    this.B = paramString15;
    this.C = paramString16;
    this.D = paramString17;
    this.E = parambx5;
    this.F = paramString18;
    this.G = paramString19;
    this.H = paramString20;
    this.I = paramString21;
    this.J = parambx6;
    this.K = paramDouble1;
    this.L = parambx7;
    this.M = paramDouble2;
    this.N = paramString22;
    this.O = parambx8;
    this.P = paramList6;
    this.Q = paramString23;
    this.R = paramString24;
    this.S = paramString25;
    this.T = paramString26;
    this.U = parambx9;
    this.V = paramString27;
    this.W = paramString28;
    this.X = paramString29;
    this.Y = parambx10;
    this.Z = paramString30;
    this.aa = paramString31;
    this.ab = paramString32;
    this.ac = paramString33;
    this.ad = paramString34;
    this.ae = paramString35;
  }
  
  public String A()
  {
    return this.x;
  }
  
  public String B()
  {
    return this.y;
  }
  
  public String C()
  {
    return this.z;
  }
  
  public String D()
  {
    return this.A;
  }
  
  public String E()
  {
    return this.B;
  }
  
  public String F()
  {
    return this.C;
  }
  
  public String G()
  {
    return this.D;
  }
  
  bx H()
  {
    return this.E;
  }
  
  public String I()
  {
    return this.F;
  }
  
  public String J()
  {
    return this.G;
  }
  
  public String K()
  {
    return this.H;
  }
  
  public String L()
  {
    return this.I;
  }
  
  bx M()
  {
    return this.J;
  }
  
  public double N()
  {
    return this.K;
  }
  
  bx O()
  {
    return this.L;
  }
  
  public double P()
  {
    return this.M;
  }
  
  public String Q()
  {
    return this.N;
  }
  
  bx R()
  {
    return this.O;
  }
  
  List S()
  {
    return this.P;
  }
  
  public String T()
  {
    return this.Q;
  }
  
  public String U()
  {
    return this.R;
  }
  
  public String V()
  {
    return this.S;
  }
  
  public String W()
  {
    return this.T;
  }
  
  bx X()
  {
    return this.U;
  }
  
  public String Y()
  {
    return this.V;
  }
  
  public String Z()
  {
    return this.W;
  }
  
  protected Object a(String paramString)
  {
    return null;
  }
  
  protected boolean a(ae.a parama)
  {
    return this.b.contains(Integer.valueOf(parama.g()));
  }
  
  public String aa()
  {
    return this.X;
  }
  
  bx ab()
  {
    return this.Y;
  }
  
  public String ac()
  {
    return this.Z;
  }
  
  public String ad()
  {
    return this.aa;
  }
  
  public String ae()
  {
    return this.ab;
  }
  
  public String af()
  {
    return this.ac;
  }
  
  public String ag()
  {
    return this.ad;
  }
  
  public String ah()
  {
    return this.ae;
  }
  
  public bx ai()
  {
    return this;
  }
  
  protected Object b(ae.a parama)
  {
    switch (parama.g())
    {
    case 35: 
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
    case 7: 
      return this.i;
    case 8: 
      return this.j;
    case 9: 
      return Integer.valueOf(this.k);
    case 10: 
      return this.l;
    case 11: 
      return this.m;
    case 12: 
      return this.n;
    case 13: 
      return this.o;
    case 14: 
      return this.p;
    case 15: 
      return this.q;
    case 16: 
      return this.r;
    case 17: 
      return this.s;
    case 18: 
      return this.t;
    case 19: 
      return this.u;
    case 20: 
      return this.v;
    case 21: 
      return this.w;
    case 22: 
      return this.x;
    case 23: 
      return this.y;
    case 24: 
      return this.z;
    case 25: 
      return this.A;
    case 26: 
      return this.B;
    case 27: 
      return this.C;
    case 28: 
      return this.D;
    case 29: 
      return this.E;
    case 30: 
      return this.F;
    case 31: 
      return this.G;
    case 32: 
      return this.H;
    case 33: 
      return this.I;
    case 34: 
      return this.J;
    case 36: 
      return Double.valueOf(this.K);
    case 37: 
      return this.L;
    case 38: 
      return Double.valueOf(this.M);
    case 39: 
      return this.N;
    case 40: 
      return this.O;
    case 41: 
      return this.P;
    case 42: 
      return this.Q;
    case 43: 
      return this.R;
    case 44: 
      return this.S;
    case 45: 
      return this.T;
    case 46: 
      return this.U;
    case 47: 
      return this.V;
    case 48: 
      return this.W;
    case 49: 
      return this.X;
    case 50: 
      return this.Y;
    case 51: 
      return this.Z;
    case 52: 
      return this.aa;
    case 53: 
      return this.ab;
    case 54: 
      return this.ac;
    case 55: 
      return this.ad;
    }
    return this.ae;
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
    if (!(paramObject instanceof bx)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    bx localbx = (bx)paramObject;
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      ae.a locala = (ae.a)localIterator.next();
      if (a(locala))
      {
        if (localbx.a(locala))
        {
          if (!b(locala).equals(localbx.b(locala))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (localbx.a(locala)) {
        return false;
      }
    }
    return true;
  }
  
  int f()
  {
    return this.c;
  }
  
  bx g()
  {
    return this.d;
  }
  
  public List h()
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
  
  bx i()
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
  
  List m()
  {
    return this.j;
  }
  
  public int n()
  {
    return this.k;
  }
  
  List o()
  {
    return this.l;
  }
  
  bx p()
  {
    return this.m;
  }
  
  List q()
  {
    return this.n;
  }
  
  public String r()
  {
    return this.o;
  }
  
  public String s()
  {
    return this.p;
  }
  
  bx t()
  {
    return this.q;
  }
  
  public String u()
  {
    return this.r;
  }
  
  public String v()
  {
    return this.s;
  }
  
  public String w()
  {
    return this.t;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bh.a(this, paramParcel, paramInt);
  }
  
  List x()
  {
    return this.u;
  }
  
  public String y()
  {
    return this.v;
  }
  
  public String z()
  {
    return this.w;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bx
 * JD-Core Version:    0.7.0.1
 */