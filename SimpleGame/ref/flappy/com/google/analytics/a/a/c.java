package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;

public final class c
  extends t
  implements h
{
  public static aq a = new d();
  private static final c c;
  private static volatile ap k = null;
  private final com.google.tagmanager.a.h d;
  private int e;
  private f f;
  private int g;
  private int h;
  private byte i = -1;
  private int j = -1;
  
  static
  {
    c = new c(true);
    c.q();
  }
  
  /* Error */
  private c(com.google.tagmanager.a.k paramk, com.google.tagmanager.a.o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 48	com/google/tagmanager/a/t:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 50	com/google/analytics/a/a/c:i	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 52	com/google/analytics/a/a/c:j	I
    //   14: aload_0
    //   15: invokespecial 42	com/google/analytics/a/a/c:q	()V
    //   18: invokestatic 57	com/google/tagmanager/a/h:i	()Lcom/google/tagmanager/a/j;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 62	com/google/tagmanager/a/m:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/a/m;
    //   26: astore 4
    //   28: iconst_0
    //   29: istore 5
    //   31: iload 5
    //   33: ifne +220 -> 253
    //   36: aload_1
    //   37: invokevirtual 67	com/google/tagmanager/a/k:a	()I
    //   40: istore 13
    //   42: iload 13
    //   44: lookupswitch	default:+44->88, 0:+279->323, 8:+63->107, 16:+167->211, 24:+188->232
    //   89: aload_1
    //   90: aload 4
    //   92: aload_2
    //   93: iload 13
    //   95: invokevirtual 70	com/google/analytics/a/a/c:a	(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/m;Lcom/google/tagmanager/a/o;I)Z
    //   98: ifne -67 -> 31
    //   101: iconst_1
    //   102: istore 5
    //   104: goto -73 -> 31
    //   107: aload_1
    //   108: invokevirtual 73	com/google/tagmanager/a/k:n	()I
    //   111: istore 14
    //   113: iload 14
    //   115: invokestatic 78	com/google/analytics/a/a/f:a	(I)Lcom/google/analytics/a/a/f;
    //   118: astore 15
    //   120: aload 15
    //   122: ifnonnull +51 -> 173
    //   125: aload 4
    //   127: iload 13
    //   129: invokevirtual 81	com/google/tagmanager/a/m:d	(I)V
    //   132: aload 4
    //   134: iload 14
    //   136: invokevirtual 81	com/google/tagmanager/a/m:d	(I)V
    //   139: goto -108 -> 31
    //   142: astore 12
    //   144: aload 12
    //   146: aload_0
    //   147: invokevirtual 84	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   150: athrow
    //   151: astore 9
    //   153: aload 4
    //   155: invokevirtual 86	com/google/tagmanager/a/m:a	()V
    //   158: aload_0
    //   159: aload_3
    //   160: invokevirtual 91	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   163: putfield 93	com/google/analytics/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   166: aload_0
    //   167: invokevirtual 96	com/google/analytics/a/a/c:R	()V
    //   170: aload 9
    //   172: athrow
    //   173: aload_0
    //   174: iconst_1
    //   175: aload_0
    //   176: getfield 98	com/google/analytics/a/a/c:e	I
    //   179: ior
    //   180: putfield 98	com/google/analytics/a/a/c:e	I
    //   183: aload_0
    //   184: aload 15
    //   186: putfield 100	com/google/analytics/a/a/c:f	Lcom/google/analytics/a/a/f;
    //   189: goto -158 -> 31
    //   192: astore 8
    //   194: new 45	com/google/tagmanager/a/af
    //   197: dup
    //   198: aload 8
    //   200: invokevirtual 104	java/io/IOException:getMessage	()Ljava/lang/String;
    //   203: invokespecial 107	com/google/tagmanager/a/af:<init>	(Ljava/lang/String;)V
    //   206: aload_0
    //   207: invokevirtual 84	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   210: athrow
    //   211: aload_0
    //   212: iconst_2
    //   213: aload_0
    //   214: getfield 98	com/google/analytics/a/a/c:e	I
    //   217: ior
    //   218: putfield 98	com/google/analytics/a/a/c:e	I
    //   221: aload_0
    //   222: aload_1
    //   223: invokevirtual 109	com/google/tagmanager/a/k:f	()I
    //   226: putfield 111	com/google/analytics/a/a/c:g	I
    //   229: goto -198 -> 31
    //   232: aload_0
    //   233: iconst_4
    //   234: aload_0
    //   235: getfield 98	com/google/analytics/a/a/c:e	I
    //   238: ior
    //   239: putfield 98	com/google/analytics/a/a/c:e	I
    //   242: aload_0
    //   243: aload_1
    //   244: invokevirtual 109	com/google/tagmanager/a/k:f	()I
    //   247: putfield 113	com/google/analytics/a/a/c:h	I
    //   250: goto -219 -> 31
    //   253: aload 4
    //   255: invokevirtual 86	com/google/tagmanager/a/m:a	()V
    //   258: aload_0
    //   259: aload_3
    //   260: invokevirtual 91	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   263: putfield 93	com/google/analytics/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   266: aload_0
    //   267: invokevirtual 96	com/google/analytics/a/a/c:R	()V
    //   270: return
    //   271: astore 7
    //   273: aload_0
    //   274: aload_3
    //   275: invokevirtual 91	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   278: putfield 93	com/google/analytics/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   281: goto -15 -> 266
    //   284: astore 6
    //   286: aload_0
    //   287: aload_3
    //   288: invokevirtual 91	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   291: putfield 93	com/google/analytics/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   294: aload 6
    //   296: athrow
    //   297: astore 11
    //   299: aload_0
    //   300: aload_3
    //   301: invokevirtual 91	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   304: putfield 93	com/google/analytics/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   307: goto -141 -> 166
    //   310: astore 10
    //   312: aload_0
    //   313: aload_3
    //   314: invokevirtual 91	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   317: putfield 93	com/google/analytics/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   320: aload 10
    //   322: athrow
    //   323: iconst_1
    //   324: istore 5
    //   326: goto -295 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	this	c
    //   0	329	1	paramk	com.google.tagmanager.a.k
    //   0	329	2	paramo	com.google.tagmanager.a.o
    //   21	293	3	localj	com.google.tagmanager.a.j
    //   26	228	4	localm	com.google.tagmanager.a.m
    //   29	296	5	m	int
    //   284	11	6	localObject1	Object
    //   271	1	7	localIOException1	java.io.IOException
    //   192	7	8	localIOException2	java.io.IOException
    //   151	20	9	localObject2	Object
    //   310	11	10	localObject3	Object
    //   297	1	11	localIOException3	java.io.IOException
    //   142	3	12	localaf	com.google.tagmanager.a.af
    //   40	88	13	n	int
    //   111	24	14	i1	int
    //   118	67	15	localf	f
    // Exception table:
    //   from	to	target	type
    //   36	42	142	com/google/tagmanager/a/af
    //   88	101	142	com/google/tagmanager/a/af
    //   107	120	142	com/google/tagmanager/a/af
    //   125	139	142	com/google/tagmanager/a/af
    //   173	189	142	com/google/tagmanager/a/af
    //   211	229	142	com/google/tagmanager/a/af
    //   232	250	142	com/google/tagmanager/a/af
    //   36	42	151	finally
    //   88	101	151	finally
    //   107	120	151	finally
    //   125	139	151	finally
    //   144	151	151	finally
    //   173	189	151	finally
    //   194	211	151	finally
    //   211	229	151	finally
    //   232	250	151	finally
    //   36	42	192	java/io/IOException
    //   88	101	192	java/io/IOException
    //   107	120	192	java/io/IOException
    //   125	139	192	java/io/IOException
    //   173	189	192	java/io/IOException
    //   211	229	192	java/io/IOException
    //   232	250	192	java/io/IOException
    //   253	258	271	java/io/IOException
    //   253	258	284	finally
    //   153	158	297	java/io/IOException
    //   153	158	310	finally
  }
  
  private c(v paramv)
  {
    super(paramv);
    this.d = paramv.r();
  }
  
  private c(boolean paramBoolean)
  {
    this.d = com.google.tagmanager.a.h.a;
  }
  
  public static c a()
  {
    return c;
  }
  
  public static e a(c paramc)
  {
    return k().a(paramc);
  }
  
  public static e k()
  {
    return e.i();
  }
  
  private void q()
  {
    this.f = f.a;
    this.g = 0;
    this.h = 0;
  }
  
  public c b()
  {
    return c;
  }
  
  public aq c()
  {
    return a;
  }
  
  public boolean d()
  {
    return (0x1 & this.e) == 1;
  }
  
  public f e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return super.equals(paramObject);
    }
    c localc = (c)paramObject;
    int m;
    label38:
    label62:
    int n;
    if (d() == localc.d())
    {
      m = 1;
      if (d())
      {
        if ((m == 0) || (e() != localc.e())) {
          break label155;
        }
        m = 1;
      }
      if ((m == 0) || (f() != localc.f())) {
        break label160;
      }
      n = 1;
      label80:
      if (f())
      {
        if ((n == 0) || (g() != localc.g())) {
          break label166;
        }
        n = 1;
      }
      label106:
      if ((n == 0) || (h() != localc.h())) {
        break label172;
      }
    }
    label155:
    label160:
    label166:
    label172:
    for (boolean bool = true;; bool = false)
    {
      if (!h()) {
        break label178;
      }
      if ((bool) && (i() == localc.i())) {
        break;
      }
      return false;
      m = 0;
      break label38;
      m = 0;
      break label62;
      n = 0;
      break label80;
      n = 0;
      break label106;
    }
    label178:
    return bool;
  }
  
  public boolean f()
  {
    return (0x2 & this.e) == 2;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return (0x4 & this.e) == 4;
  }
  
  public int hashCode()
  {
    if (this.b != 0) {
      return this.b;
    }
    int m = 779 + c.class.hashCode();
    if (d()) {
      m = 53 * (1 + m * 37) + ac.a(e());
    }
    if (f()) {
      m = 53 * (2 + m * 37) + g();
    }
    if (h()) {
      m = 53 * (3 + m * 37) + i();
    }
    int n = m * 29 + this.d.hashCode();
    this.b = n;
    return n;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public final boolean j()
  {
    int m = this.i;
    if (m != -1) {
      return m == 1;
    }
    this.i = 1;
    return true;
  }
  
  public e l()
  {
    return k();
  }
  
  public e m()
  {
    return a(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.c
 * JD-Core Version:    0.7.0.1
 */