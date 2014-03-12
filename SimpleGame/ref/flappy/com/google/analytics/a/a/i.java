package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.util.Collections;
import java.util.List;

public final class i
  extends t
  implements l
{
  public static aq a = new j();
  private static final i c;
  private static volatile ap m = null;
  private final h d;
  private int e;
  private List f;
  private int g;
  private int h;
  private boolean i;
  private boolean j;
  private byte k = -1;
  private int l = -1;
  
  static
  {
    c = new i(true);
    c.u();
  }
  
  /* Error */
  private i(com.google.tagmanager.a.k paramk, com.google.tagmanager.a.o paramo)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: invokespecial 51	com/google/tagmanager/a/t:<init>	()V
    //   6: aload_0
    //   7: iconst_m1
    //   8: putfield 53	com/google/analytics/a/a/i:k	B
    //   11: aload_0
    //   12: iconst_m1
    //   13: putfield 55	com/google/analytics/a/a/i:l	I
    //   16: aload_0
    //   17: invokespecial 45	com/google/analytics/a/a/i:u	()V
    //   20: invokestatic 60	com/google/tagmanager/a/h:i	()Lcom/google/tagmanager/a/j;
    //   23: astore 4
    //   25: aload 4
    //   27: invokestatic 65	com/google/tagmanager/a/m:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/a/m;
    //   30: astore 5
    //   32: iconst_0
    //   33: istore 6
    //   35: iload_3
    //   36: ifne +372 -> 408
    //   39: aload_1
    //   40: invokevirtual 70	com/google/tagmanager/a/k:a	()I
    //   43: istore 14
    //   45: iload 14
    //   47: lookupswitch	default:+65->112, 0:+455->502, 8:+83->130, 16:+156->203, 24:+196->243, 26:+241->288, 32:+319->366, 48:+340->387
    //   113: aload_1
    //   114: aload 5
    //   116: aload_2
    //   117: iload 14
    //   119: invokevirtual 73	com/google/analytics/a/a/i:a	(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/m;Lcom/google/tagmanager/a/o;I)Z
    //   122: ifne -87 -> 35
    //   125: iconst_1
    //   126: istore_3
    //   127: goto -92 -> 35
    //   130: aload_0
    //   131: bipush 8
    //   133: aload_0
    //   134: getfield 75	com/google/analytics/a/a/i:e	I
    //   137: ior
    //   138: putfield 75	com/google/analytics/a/a/i:e	I
    //   141: aload_0
    //   142: aload_1
    //   143: invokevirtual 78	com/google/tagmanager/a/k:i	()Z
    //   146: putfield 80	com/google/analytics/a/a/i:j	Z
    //   149: goto -114 -> 35
    //   152: astore 13
    //   154: aload 13
    //   156: aload_0
    //   157: invokevirtual 83	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   160: athrow
    //   161: astore 10
    //   163: iload 6
    //   165: iconst_1
    //   166: iand
    //   167: iconst_1
    //   168: if_icmpne +14 -> 182
    //   171: aload_0
    //   172: aload_0
    //   173: getfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   176: invokestatic 91	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   179: putfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   182: aload 5
    //   184: invokevirtual 93	com/google/tagmanager/a/m:a	()V
    //   187: aload_0
    //   188: aload 4
    //   190: invokevirtual 98	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   193: putfield 100	com/google/analytics/a/a/i:d	Lcom/google/tagmanager/a/h;
    //   196: aload_0
    //   197: invokevirtual 103	com/google/analytics/a/a/i:R	()V
    //   200: aload 10
    //   202: athrow
    //   203: aload_0
    //   204: iconst_1
    //   205: aload_0
    //   206: getfield 75	com/google/analytics/a/a/i:e	I
    //   209: ior
    //   210: putfield 75	com/google/analytics/a/a/i:e	I
    //   213: aload_0
    //   214: aload_1
    //   215: invokevirtual 105	com/google/tagmanager/a/k:f	()I
    //   218: putfield 107	com/google/analytics/a/a/i:g	I
    //   221: goto -186 -> 35
    //   224: astore 9
    //   226: new 48	com/google/tagmanager/a/af
    //   229: dup
    //   230: aload 9
    //   232: invokevirtual 111	java/io/IOException:getMessage	()Ljava/lang/String;
    //   235: invokespecial 114	com/google/tagmanager/a/af:<init>	(Ljava/lang/String;)V
    //   238: aload_0
    //   239: invokevirtual 83	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   242: athrow
    //   243: iload 6
    //   245: iconst_1
    //   246: iand
    //   247: iconst_1
    //   248: if_icmpeq +20 -> 268
    //   251: aload_0
    //   252: new 116	java/util/ArrayList
    //   255: dup
    //   256: invokespecial 117	java/util/ArrayList:<init>	()V
    //   259: putfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   262: iload 6
    //   264: iconst_1
    //   265: ior
    //   266: istore 6
    //   268: aload_0
    //   269: getfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   272: aload_1
    //   273: invokevirtual 105	com/google/tagmanager/a/k:f	()I
    //   276: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   279: invokeinterface 129 2 0
    //   284: pop
    //   285: goto -250 -> 35
    //   288: aload_1
    //   289: aload_1
    //   290: invokevirtual 132	com/google/tagmanager/a/k:s	()I
    //   293: invokevirtual 135	com/google/tagmanager/a/k:c	(I)I
    //   296: istore 15
    //   298: iload 6
    //   300: iconst_1
    //   301: iand
    //   302: iconst_1
    //   303: if_icmpeq +27 -> 330
    //   306: aload_1
    //   307: invokevirtual 138	com/google/tagmanager/a/k:w	()I
    //   310: ifle +20 -> 330
    //   313: aload_0
    //   314: new 116	java/util/ArrayList
    //   317: dup
    //   318: invokespecial 117	java/util/ArrayList:<init>	()V
    //   321: putfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   324: iload 6
    //   326: iconst_1
    //   327: ior
    //   328: istore 6
    //   330: aload_1
    //   331: invokevirtual 138	com/google/tagmanager/a/k:w	()I
    //   334: ifle +23 -> 357
    //   337: aload_0
    //   338: getfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   341: aload_1
    //   342: invokevirtual 105	com/google/tagmanager/a/k:f	()I
    //   345: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   348: invokeinterface 129 2 0
    //   353: pop
    //   354: goto -24 -> 330
    //   357: aload_1
    //   358: iload 15
    //   360: invokevirtual 141	com/google/tagmanager/a/k:d	(I)V
    //   363: goto -328 -> 35
    //   366: aload_0
    //   367: iconst_2
    //   368: aload_0
    //   369: getfield 75	com/google/analytics/a/a/i:e	I
    //   372: ior
    //   373: putfield 75	com/google/analytics/a/a/i:e	I
    //   376: aload_0
    //   377: aload_1
    //   378: invokevirtual 105	com/google/tagmanager/a/k:f	()I
    //   381: putfield 143	com/google/analytics/a/a/i:h	I
    //   384: goto -349 -> 35
    //   387: aload_0
    //   388: iconst_4
    //   389: aload_0
    //   390: getfield 75	com/google/analytics/a/a/i:e	I
    //   393: ior
    //   394: putfield 75	com/google/analytics/a/a/i:e	I
    //   397: aload_0
    //   398: aload_1
    //   399: invokevirtual 78	com/google/tagmanager/a/k:i	()Z
    //   402: putfield 145	com/google/analytics/a/a/i:i	Z
    //   405: goto -370 -> 35
    //   408: iload 6
    //   410: iconst_1
    //   411: iand
    //   412: iconst_1
    //   413: if_icmpne +14 -> 427
    //   416: aload_0
    //   417: aload_0
    //   418: getfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   421: invokestatic 91	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   424: putfield 85	com/google/analytics/a/a/i:f	Ljava/util/List;
    //   427: aload 5
    //   429: invokevirtual 93	com/google/tagmanager/a/m:a	()V
    //   432: aload_0
    //   433: aload 4
    //   435: invokevirtual 98	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   438: putfield 100	com/google/analytics/a/a/i:d	Lcom/google/tagmanager/a/h;
    //   441: aload_0
    //   442: invokevirtual 103	com/google/analytics/a/a/i:R	()V
    //   445: return
    //   446: astore 8
    //   448: aload_0
    //   449: aload 4
    //   451: invokevirtual 98	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   454: putfield 100	com/google/analytics/a/a/i:d	Lcom/google/tagmanager/a/h;
    //   457: goto -16 -> 441
    //   460: astore 7
    //   462: aload_0
    //   463: aload 4
    //   465: invokevirtual 98	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   468: putfield 100	com/google/analytics/a/a/i:d	Lcom/google/tagmanager/a/h;
    //   471: aload 7
    //   473: athrow
    //   474: astore 12
    //   476: aload_0
    //   477: aload 4
    //   479: invokevirtual 98	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   482: putfield 100	com/google/analytics/a/a/i:d	Lcom/google/tagmanager/a/h;
    //   485: goto -289 -> 196
    //   488: astore 11
    //   490: aload_0
    //   491: aload 4
    //   493: invokevirtual 98	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   496: putfield 100	com/google/analytics/a/a/i:d	Lcom/google/tagmanager/a/h;
    //   499: aload 11
    //   501: athrow
    //   502: iconst_1
    //   503: istore_3
    //   504: goto -469 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	507	0	this	i
    //   0	507	1	paramk	com.google.tagmanager.a.k
    //   0	507	2	paramo	com.google.tagmanager.a.o
    //   1	503	3	n	int
    //   23	469	4	localj	com.google.tagmanager.a.j
    //   30	398	5	localm	com.google.tagmanager.a.m
    //   33	379	6	i1	int
    //   460	12	7	localObject1	Object
    //   446	1	8	localIOException1	java.io.IOException
    //   224	7	9	localIOException2	java.io.IOException
    //   161	40	10	localObject2	Object
    //   488	12	11	localObject3	Object
    //   474	1	12	localIOException3	java.io.IOException
    //   152	3	13	localaf	com.google.tagmanager.a.af
    //   43	75	14	i2	int
    //   296	63	15	i3	int
    // Exception table:
    //   from	to	target	type
    //   39	45	152	com/google/tagmanager/a/af
    //   112	125	152	com/google/tagmanager/a/af
    //   130	149	152	com/google/tagmanager/a/af
    //   203	221	152	com/google/tagmanager/a/af
    //   251	262	152	com/google/tagmanager/a/af
    //   268	285	152	com/google/tagmanager/a/af
    //   288	298	152	com/google/tagmanager/a/af
    //   306	324	152	com/google/tagmanager/a/af
    //   330	354	152	com/google/tagmanager/a/af
    //   357	363	152	com/google/tagmanager/a/af
    //   366	384	152	com/google/tagmanager/a/af
    //   387	405	152	com/google/tagmanager/a/af
    //   39	45	161	finally
    //   112	125	161	finally
    //   130	149	161	finally
    //   154	161	161	finally
    //   203	221	161	finally
    //   226	243	161	finally
    //   251	262	161	finally
    //   268	285	161	finally
    //   288	298	161	finally
    //   306	324	161	finally
    //   330	354	161	finally
    //   357	363	161	finally
    //   366	384	161	finally
    //   387	405	161	finally
    //   39	45	224	java/io/IOException
    //   112	125	224	java/io/IOException
    //   130	149	224	java/io/IOException
    //   203	221	224	java/io/IOException
    //   251	262	224	java/io/IOException
    //   268	285	224	java/io/IOException
    //   288	298	224	java/io/IOException
    //   306	324	224	java/io/IOException
    //   330	354	224	java/io/IOException
    //   357	363	224	java/io/IOException
    //   366	384	224	java/io/IOException
    //   387	405	224	java/io/IOException
    //   427	432	446	java/io/IOException
    //   427	432	460	finally
    //   182	187	474	java/io/IOException
    //   182	187	488	finally
  }
  
  private i(v paramv)
  {
    super(paramv);
    this.d = paramv.r();
  }
  
  private i(boolean paramBoolean)
  {
    this.d = h.a;
  }
  
  public static i a()
  {
    return c;
  }
  
  public static k a(i parami)
  {
    return r().a(parami);
  }
  
  public static k r()
  {
    return k.k();
  }
  
  private void u()
  {
    this.f = Collections.emptyList();
    this.g = 0;
    this.h = 0;
    this.i = false;
    this.j = false;
  }
  
  public i b()
  {
    return c;
  }
  
  public aq c()
  {
    return a;
  }
  
  public List d()
  {
    return this.f;
  }
  
  public int e()
  {
    return this.f.size();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof i)) {
      return super.equals(paramObject);
    }
    i locali = (i)paramObject;
    int n;
    label43:
    int i1;
    label61:
    label87:
    int i2;
    label106:
    int i3;
    if (d().equals(locali.d()))
    {
      n = 1;
      if ((n == 0) || (f() != locali.f())) {
        break label226;
      }
      i1 = 1;
      if (f())
      {
        if ((i1 == 0) || (g() != locali.g())) {
          break label232;
        }
        i1 = 1;
      }
      if ((i1 == 0) || (h() != locali.h())) {
        break label238;
      }
      i2 = 1;
      if (h())
      {
        if ((i2 == 0) || (i() != locali.i())) {
          break label244;
        }
        i2 = 1;
      }
      label132:
      if ((i2 == 0) || (k() != locali.k())) {
        break label250;
      }
      i3 = 1;
      label151:
      if (k())
      {
        if ((i3 == 0) || (l() != locali.l())) {
          break label256;
        }
        i3 = 1;
      }
      label177:
      if ((i3 == 0) || (m() != locali.m())) {
        break label262;
      }
    }
    label256:
    label262:
    for (boolean bool = true;; bool = false)
    {
      if (!m()) {
        break label268;
      }
      if ((bool) && (q() == locali.q())) {
        break;
      }
      return false;
      n = 0;
      break label43;
      label226:
      i1 = 0;
      break label61;
      label232:
      i1 = 0;
      break label87;
      label238:
      i2 = 0;
      break label106;
      label244:
      i2 = 0;
      break label132;
      label250:
      i3 = 0;
      break label151;
      i3 = 0;
      break label177;
    }
    label268:
    return bool;
  }
  
  public boolean f()
  {
    return (0x1 & this.e) == 1;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return (0x2 & this.e) == 2;
  }
  
  public int hashCode()
  {
    if (this.b != 0) {
      return this.b;
    }
    int n = 779 + i.class.hashCode();
    if (e() > 0) {
      n = 53 * (3 + n * 37) + d().hashCode();
    }
    if (f()) {
      n = 53 * (2 + n * 37) + g();
    }
    if (h()) {
      n = 53 * (4 + n * 37) + i();
    }
    if (k()) {
      n = 53 * (6 + n * 37) + ac.a(l());
    }
    if (m()) {
      n = 53 * (1 + n * 37) + ac.a(q());
    }
    int i1 = n * 29 + this.d.hashCode();
    this.b = i1;
    return i1;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public final boolean j()
  {
    int n = this.k;
    if (n != -1) {
      return n == 1;
    }
    if (!f())
    {
      this.k = 0;
      return false;
    }
    this.k = 1;
    return true;
  }
  
  public boolean k()
  {
    return (0x4 & this.e) == 4;
  }
  
  public boolean l()
  {
    return this.i;
  }
  
  public boolean m()
  {
    return (0x8 & this.e) == 8;
  }
  
  public boolean q()
  {
    return this.j;
  }
  
  public k s()
  {
    return r();
  }
  
  public k t()
  {
    return a(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.i
 * JD-Core Version:    0.7.0.1
 */