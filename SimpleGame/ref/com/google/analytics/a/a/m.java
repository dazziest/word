package com.google.analytics.a.a;

import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;

public final class m
  extends t
  implements p
{
  public static aq a = new n();
  private static final m c;
  private static volatile ap j = null;
  private final h d;
  private int e;
  private int f;
  private int g;
  private byte h = -1;
  private int i = -1;
  
  static
  {
    c = new m(true);
    c.l();
  }
  
  /* Error */
  private m(com.google.tagmanager.a.k paramk, com.google.tagmanager.a.o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 46	com/google/tagmanager/a/t:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 48	com/google/analytics/a/a/m:h	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 50	com/google/analytics/a/a/m:i	I
    //   14: aload_0
    //   15: invokespecial 40	com/google/analytics/a/a/m:l	()V
    //   18: invokestatic 55	com/google/tagmanager/a/h:i	()Lcom/google/tagmanager/a/j;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 60	com/google/tagmanager/a/m:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/a/m;
    //   26: astore 4
    //   28: iconst_0
    //   29: istore 5
    //   31: iload 5
    //   33: ifne +158 -> 191
    //   36: aload_1
    //   37: invokevirtual 65	com/google/tagmanager/a/k:a	()I
    //   40: istore 13
    //   42: iload 13
    //   44: lookupswitch	default:+36->80, 0:+217->261, 8:+55->99, 16:+107->151
    //   81: aload_1
    //   82: aload 4
    //   84: aload_2
    //   85: iload 13
    //   87: invokevirtual 68	com/google/analytics/a/a/m:a	(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/m;Lcom/google/tagmanager/a/o;I)Z
    //   90: ifne -59 -> 31
    //   93: iconst_1
    //   94: istore 5
    //   96: goto -65 -> 31
    //   99: aload_0
    //   100: iconst_1
    //   101: aload_0
    //   102: getfield 70	com/google/analytics/a/a/m:e	I
    //   105: ior
    //   106: putfield 70	com/google/analytics/a/a/m:e	I
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 72	com/google/tagmanager/a/k:f	()I
    //   114: putfield 74	com/google/analytics/a/a/m:f	I
    //   117: goto -86 -> 31
    //   120: astore 12
    //   122: aload 12
    //   124: aload_0
    //   125: invokevirtual 77	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   128: athrow
    //   129: astore 9
    //   131: aload 4
    //   133: invokevirtual 79	com/google/tagmanager/a/m:a	()V
    //   136: aload_0
    //   137: aload_3
    //   138: invokevirtual 84	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   141: putfield 86	com/google/analytics/a/a/m:d	Lcom/google/tagmanager/a/h;
    //   144: aload_0
    //   145: invokevirtual 89	com/google/analytics/a/a/m:R	()V
    //   148: aload 9
    //   150: athrow
    //   151: aload_0
    //   152: iconst_2
    //   153: aload_0
    //   154: getfield 70	com/google/analytics/a/a/m:e	I
    //   157: ior
    //   158: putfield 70	com/google/analytics/a/a/m:e	I
    //   161: aload_0
    //   162: aload_1
    //   163: invokevirtual 72	com/google/tagmanager/a/k:f	()I
    //   166: putfield 91	com/google/analytics/a/a/m:g	I
    //   169: goto -138 -> 31
    //   172: astore 8
    //   174: new 43	com/google/tagmanager/a/af
    //   177: dup
    //   178: aload 8
    //   180: invokevirtual 95	java/io/IOException:getMessage	()Ljava/lang/String;
    //   183: invokespecial 98	com/google/tagmanager/a/af:<init>	(Ljava/lang/String;)V
    //   186: aload_0
    //   187: invokevirtual 77	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   190: athrow
    //   191: aload 4
    //   193: invokevirtual 79	com/google/tagmanager/a/m:a	()V
    //   196: aload_0
    //   197: aload_3
    //   198: invokevirtual 84	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   201: putfield 86	com/google/analytics/a/a/m:d	Lcom/google/tagmanager/a/h;
    //   204: aload_0
    //   205: invokevirtual 89	com/google/analytics/a/a/m:R	()V
    //   208: return
    //   209: astore 7
    //   211: aload_0
    //   212: aload_3
    //   213: invokevirtual 84	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   216: putfield 86	com/google/analytics/a/a/m:d	Lcom/google/tagmanager/a/h;
    //   219: goto -15 -> 204
    //   222: astore 6
    //   224: aload_0
    //   225: aload_3
    //   226: invokevirtual 84	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   229: putfield 86	com/google/analytics/a/a/m:d	Lcom/google/tagmanager/a/h;
    //   232: aload 6
    //   234: athrow
    //   235: astore 11
    //   237: aload_0
    //   238: aload_3
    //   239: invokevirtual 84	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   242: putfield 86	com/google/analytics/a/a/m:d	Lcom/google/tagmanager/a/h;
    //   245: goto -101 -> 144
    //   248: astore 10
    //   250: aload_0
    //   251: aload_3
    //   252: invokevirtual 84	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   255: putfield 86	com/google/analytics/a/a/m:d	Lcom/google/tagmanager/a/h;
    //   258: aload 10
    //   260: athrow
    //   261: iconst_1
    //   262: istore 5
    //   264: goto -233 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	this	m
    //   0	267	1	paramk	com.google.tagmanager.a.k
    //   0	267	2	paramo	com.google.tagmanager.a.o
    //   21	231	3	localj	com.google.tagmanager.a.j
    //   26	166	4	localm	com.google.tagmanager.a.m
    //   29	234	5	k	int
    //   222	11	6	localObject1	Object
    //   209	1	7	localIOException1	java.io.IOException
    //   172	7	8	localIOException2	java.io.IOException
    //   129	20	9	localObject2	Object
    //   248	11	10	localObject3	Object
    //   235	1	11	localIOException3	java.io.IOException
    //   120	3	12	localaf	com.google.tagmanager.a.af
    //   40	46	13	m	int
    // Exception table:
    //   from	to	target	type
    //   36	42	120	com/google/tagmanager/a/af
    //   80	93	120	com/google/tagmanager/a/af
    //   99	117	120	com/google/tagmanager/a/af
    //   151	169	120	com/google/tagmanager/a/af
    //   36	42	129	finally
    //   80	93	129	finally
    //   99	117	129	finally
    //   122	129	129	finally
    //   151	169	129	finally
    //   174	191	129	finally
    //   36	42	172	java/io/IOException
    //   80	93	172	java/io/IOException
    //   99	117	172	java/io/IOException
    //   151	169	172	java/io/IOException
    //   191	196	209	java/io/IOException
    //   191	196	222	finally
    //   131	136	235	java/io/IOException
    //   131	136	248	finally
  }
  
  private m(v paramv)
  {
    super(paramv);
    this.d = paramv.r();
  }
  
  private m(boolean paramBoolean)
  {
    this.d = h.a;
  }
  
  public static m a()
  {
    return c;
  }
  
  public static o a(m paramm)
  {
    return h().a(paramm);
  }
  
  public static o h()
  {
    return o.l();
  }
  
  private void l()
  {
    this.f = 0;
    this.g = 0;
  }
  
  public m b()
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
  
  public int e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof m)) {
      return super.equals(paramObject);
    }
    m localm = (m)paramObject;
    int k;
    if (d() == localm.d())
    {
      k = 1;
      label38:
      if (d())
      {
        if ((k == 0) || (e() != localm.e())) {
          break label110;
        }
        k = 1;
      }
      label62:
      if ((k == 0) || (f() != localm.f())) {
        break label115;
      }
    }
    label110:
    label115:
    for (boolean bool = true;; bool = false)
    {
      if (!f()) {
        break label121;
      }
      if ((bool) && (g() == localm.g())) {
        break;
      }
      return false;
      k = 0;
      break label38;
      k = 0;
      break label62;
    }
    label121:
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
  
  public int hashCode()
  {
    if (this.b != 0) {
      return this.b;
    }
    int k = 779 + m.class.hashCode();
    if (d()) {
      k = 53 * (1 + k * 37) + e();
    }
    if (f()) {
      k = 53 * (2 + k * 37) + g();
    }
    int m = k * 29 + this.d.hashCode();
    this.b = m;
    return m;
  }
  
  public o i()
  {
    return h();
  }
  
  public final boolean j()
  {
    int k = this.h;
    if (k != -1) {
      return k == 1;
    }
    if (!d())
    {
      this.h = 0;
      return false;
    }
    if (!f())
    {
      this.h = 0;
      return false;
    }
    this.h = 1;
    return true;
  }
  
  public o k()
  {
    return a(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.m
 * JD-Core Version:    0.7.0.1
 */