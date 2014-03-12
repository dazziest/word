package com.google.ads.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.at;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bd;
import com.google.ads.bh;
import com.google.ads.bi;
import com.google.ads.bk;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bt;
import com.google.ads.c;
import com.google.ads.d;
import com.google.ads.doubleclick.SwipeableDfpAdView;
import com.google.ads.h;
import com.google.ads.i;
import com.google.ads.j;
import com.google.ads.o;
import com.google.ads.p;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ae;
import com.google.ads.util.af;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class w
{
  private static final Object a = new Object();
  private String A = null;
  private String B = null;
  private final bt b;
  private n c;
  private d d;
  private ab e;
  private e f;
  private ad g;
  private boolean h = false;
  private long i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private SharedPreferences o;
  private long p;
  private p q;
  private boolean r;
  private LinkedList s;
  private LinkedList t;
  private LinkedList u;
  private int v = -1;
  private Boolean w;
  private bc x;
  private bd y;
  private bh z;
  
  public w(com.google.ads.a parama, Activity paramActivity, com.google.ads.g paramg, String paramString, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this.r = paramBoolean;
    this.e = new ab();
    this.c = null;
    this.d = null;
    this.k = false;
    this.p = 60000L;
    this.l = false;
    this.n = false;
    this.m = true;
    ac localac;
    br localbr2;
    AdView localAdView2;
    if (paramg == null)
    {
      localac = ac.a;
      if ((parama instanceof SwipeableDfpAdView)) {
        localac.a(true);
      }
      if (paramActivity != null) {
        break label188;
      }
      localbr2 = br.a();
      if (!(parama instanceof AdView)) {
        break label176;
      }
      localAdView2 = (AdView)parama;
      label122:
      if (!(parama instanceof i)) {
        break label182;
      }
    }
    label176:
    label182:
    for (i locali2 = (i)parama;; locali2 = null)
    {
      this.b = new bt(localbr2, parama, localAdView2, locali2, paramString, null, null, paramViewGroup, localac, this);
      return;
      localac = ac.a(paramg, paramActivity.getApplicationContext());
      break;
      localAdView2 = null;
      break label122;
    }
    for (;;)
    {
      synchronized (a)
      {
        label188:
        this.o = paramActivity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
        if (paramBoolean)
        {
          long l1 = this.o.getLong("Timeout" + paramString, -1L);
          if (l1 < 0L)
          {
            this.i = 5000L;
            br localbr1 = br.a();
            if (!(parama instanceof AdView)) {
              break label453;
            }
            localAdView1 = (AdView)parama;
            if (!(parama instanceof i)) {
              break label459;
            }
            locali1 = (i)parama;
            this.b = new bt(localbr1, parama, localAdView1, locali1, paramString, paramActivity, paramActivity.getApplicationContext(), paramViewGroup, localac, this);
            this.q = new p(this);
            this.s = new LinkedList();
            this.t = new LinkedList();
            this.u = new LinkedList();
            a();
            AdUtil.h((Context)this.b.f.a());
            this.x = new bc();
            this.y = new bd(this);
            this.w = null;
            this.z = null;
            return;
          }
          this.i = l1;
        }
      }
      this.i = 60000L;
      continue;
      label453:
      AdView localAdView1 = null;
      continue;
      label459:
      i locali1 = null;
    }
  }
  
  private void a(bh parambh, Boolean paramBoolean)
  {
    Object localObject = parambh.d();
    if (localObject == null)
    {
      localObject = new ArrayList();
      ((List)localObject).add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
    }
    String str = parambh.b();
    a((List)localObject, parambh.a(), str, parambh.c(), paramBoolean, this.e.d(), this.e.e());
  }
  
  private void a(List paramList, String paramString)
  {
    Object localObject;
    if (paramList == null)
    {
      localObject = new ArrayList();
      ((List)localObject).add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
    }
    for (;;)
    {
      a((List)localObject, null, null, paramString, null, this.e.d(), this.e.e());
      return;
      localObject = paramList;
    }
  }
  
  private void a(List paramList, String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, String paramString5)
  {
    String str1 = AdUtil.a((Context)this.b.f.a());
    az localaz = az.a();
    String str2 = localaz.b().toString();
    String str3 = localaz.c().toString();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      new Thread(new o(bi.a((String)localIterator.next(), (String)this.b.h.a(), paramBoolean, str1, paramString1, paramString2, paramString3, str2, str3, paramString4, paramString5), (Context)this.b.f.a())).start();
    }
    this.e.b();
  }
  
  public LinkedList A()
  {
    return this.t;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   6: getfield 293	com/google/ads/bt:g	Lcom/google/ads/util/ad;
    //   9: invokevirtual 185	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   12: checkcast 91	com/google/ads/a/ac
    //   15: invokevirtual 296	com/google/ads/a/ac:c	()Lcom/google/ads/g;
    //   18: astore_2
    //   19: getstatic 298	com/google/ads/util/AdUtil:a	I
    //   22: bipush 14
    //   24: if_icmplt +139 -> 163
    //   27: new 300	com/google/ads/util/c
    //   30: dup
    //   31: aload_0
    //   32: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   35: aload_2
    //   36: invokespecial 303	com/google/ads/util/c:<init>	(Lcom/google/ads/bt;Lcom/google/ads/g;)V
    //   39: astore_3
    //   40: aload_0
    //   41: aload_3
    //   42: putfield 305	com/google/ads/a/w:f	Lcom/google/ads/a/e;
    //   45: aload_0
    //   46: getfield 305	com/google/ads/a/w:f	Lcom/google/ads/a/e;
    //   49: bipush 8
    //   51: invokevirtual 311	com/google/ads/a/e:setVisibility	(I)V
    //   54: aload_0
    //   55: aload_0
    //   56: getstatic 316	com/google/ads/a/h:d	Ljava/util/Map;
    //   59: iconst_1
    //   60: aload_0
    //   61: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   64: invokevirtual 318	com/google/ads/bt:b	()Z
    //   67: invokestatic 323	com/google/ads/a/ad:a	(Lcom/google/ads/a/w;Ljava/util/Map;ZZ)Lcom/google/ads/a/ad;
    //   70: putfield 325	com/google/ads/a/w:g	Lcom/google/ads/a/ad;
    //   73: aload_0
    //   74: getfield 305	com/google/ads/a/w:f	Lcom/google/ads/a/e;
    //   77: aload_0
    //   78: getfield 325	com/google/ads/a/w:g	Lcom/google/ads/a/ad;
    //   81: invokevirtual 329	com/google/ads/a/e:setWebViewClient	(Landroid/webkit/WebViewClient;)V
    //   84: aload_0
    //   85: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   88: getfield 331	com/google/ads/bt:d	Lcom/google/ads/util/ad;
    //   91: invokevirtual 185	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   94: checkcast 101	com/google/ads/br
    //   97: getfield 333	com/google/ads/br:b	Lcom/google/ads/util/ad;
    //   100: invokevirtual 185	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   103: checkcast 335	com/google/ads/bs
    //   106: astore 4
    //   108: getstatic 298	com/google/ads/util/AdUtil:a	I
    //   111: aload 4
    //   113: getfield 338	com/google/ads/bs:b	Lcom/google/ads/util/ae;
    //   116: invokevirtual 341	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   119: checkcast 343	java/lang/Integer
    //   122: invokevirtual 347	java/lang/Integer:intValue	()I
    //   125: if_icmpge +35 -> 160
    //   128: aload_0
    //   129: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   132: getfield 293	com/google/ads/bt:g	Lcom/google/ads/util/ad;
    //   135: invokevirtual 185	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   138: checkcast 91	com/google/ads/a/ac
    //   141: invokevirtual 349	com/google/ads/a/ac:a	()Z
    //   144: ifne +16 -> 160
    //   147: ldc_w 351
    //   150: invokestatic 356	com/google/ads/util/g:a	(Ljava/lang/String;)V
    //   153: aload_0
    //   154: getfield 305	com/google/ads/a/w:f	Lcom/google/ads/a/e;
    //   157: invokevirtual 358	com/google/ads/a/e:g	()V
    //   160: aload_0
    //   161: monitorexit
    //   162: return
    //   163: new 307	com/google/ads/a/e
    //   166: dup
    //   167: aload_0
    //   168: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   171: aload_2
    //   172: invokespecial 359	com/google/ads/a/e:<init>	(Lcom/google/ads/bt;Lcom/google/ads/g;)V
    //   175: astore_3
    //   176: goto -136 -> 40
    //   179: astore_1
    //   180: aload_0
    //   181: monitorexit
    //   182: aload_1
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	w
    //   179	4	1	localObject1	Object
    //   18	154	2	localg	com.google.ads.g
    //   39	137	3	localObject2	Object
    //   106	6	4	localbs	com.google.ads.bs
    // Exception table:
    //   from	to	target	type
    //   2	40	179	finally
    //   40	160	179	finally
    //   163	176	179	finally
  }
  
  public void a(float paramFloat)
  {
    try
    {
      long l1 = this.p;
      this.p = ((1000.0F * paramFloat));
      if ((r()) && (this.p != l1))
      {
        e();
        f();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.v = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = (a)this.b.e.a();
    Context localContext1 = (Context)this.b.f.a();
    int i1;
    FrameLayout.LayoutParams localLayoutParams;
    int i3;
    if (paramInt3 < 0)
    {
      i1 = ((ac)this.b.g.a()).c().a();
      int i2 = AdUtil.a(localContext1, i1);
      Context localContext2 = (Context)this.b.f.a();
      if (paramInt4 < 0) {
        paramInt4 = ((ac)this.b.g.a()).c().b();
      }
      localLayoutParams = new FrameLayout.LayoutParams(i2, AdUtil.a(localContext2, paramInt4));
      if (paramInt3 >= 0) {
        break label279;
      }
      i3 = 0;
    }
    for (int i4 = 0;; i4 = paramInt1)
    {
      if (i4 < 0) {}
      for (int i5 = ((a)this.b.e.a()).d();; i5 = i4)
      {
        if (i3 < 0) {
          i3 = ((a)this.b.e.a()).c();
        }
        ((a)this.b.e.a()).setXPosition(i5);
        ((a)this.b.e.a()).setYPosition(i3);
        localLayoutParams.setMargins(AdUtil.a((Context)this.b.f.a(), i5), AdUtil.a((Context)this.b.f.a(), i3), 0, 0);
        locala.setLayoutParams(localLayoutParams);
        return;
        i1 = paramInt3;
        break;
      }
      label279:
      i3 = paramInt2;
    }
  }
  
  public void a(long paramLong)
  {
    synchronized (a)
    {
      SharedPreferences.Editor localEditor = this.o.edit();
      localEditor.putLong("Timeout" + this.b.h, paramLong);
      localEditor.commit();
      if (this.r) {
        this.i = paramLong;
      }
      return;
    }
  }
  
  public void a(View paramView)
  {
    ((ViewGroup)this.b.i.a()).setVisibility(0);
    ((ViewGroup)this.b.i.a()).removeAllViews();
    ((ViewGroup)this.b.i.a()).addView(paramView);
    if (((ac)this.b.g.a()).b())
    {
      ((w)this.b.b.a()).a((bq)this.b.l.a(), false, -1, -1, -1, -1);
      if (((a)this.b.e.a()).a()) {
        ((ViewGroup)this.b.i.a()).addView((View)this.b.e.a(), AdUtil.a((Context)this.b.f.a(), ((ac)this.b.g.a()).c().a()), AdUtil.a((Context)this.b.f.a(), ((ac)this.b.g.a()).c().b()));
      }
    }
  }
  
  public void a(View paramView, bk parambk, bh parambh, boolean paramBoolean)
  {
    try
    {
      com.google.ads.util.g.a("AdManager.onReceiveGWhirlAd() called.");
      this.k = true;
      this.z = parambh;
      if (this.b.a())
      {
        a(paramView);
        a(parambh, Boolean.valueOf(paramBoolean));
      }
      this.y.a(parambk);
      c localc = (c)this.b.o.a();
      if (localc != null) {
        localc.a((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void a(ba paramba)
  {
    try
    {
      this.c = null;
      this.y.a(paramba, this.d);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(bq parambq, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = (a)this.b.e.a();
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      locala.setOverlayActivated(bool);
      a(paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.b.q.a() != null)
      {
        if (!paramBoolean) {
          break;
        }
        ((j)this.b.q.a()).a((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    ((j)this.b.q.a()).b((com.google.ads.a)this.b.a.a());
  }
  
  public void a(d paramd)
  {
    for (;;)
    {
      try
      {
        com.google.ads.util.g.d("v6.4.1 RC00");
        if (this.h)
        {
          com.google.ads.util.g.e("loadAd called after ad was destroyed.");
          return;
        }
        if (p())
        {
          com.google.ads.util.g.e("loadAd called while the ad is already loading, so aborting.");
          continue;
        }
        if (!AdActivity.b()) {
          break label60;
        }
      }
      finally {}
      com.google.ads.util.g.e("loadAd called while an interstitial or landing page is displayed, so aborting");
      continue;
      label60:
      if ((AdUtil.c((Context)this.b.f.a())) && (AdUtil.b((Context)this.b.f.a())))
      {
        long l1 = this.o.getLong("GoogleAdMobDoritosLife", 60000L);
        if (at.a((Context)this.b.f.a(), l1)) {
          at.a((Activity)this.b.c.a());
        }
        this.k = false;
        this.s.clear();
        this.t.clear();
        this.d = paramd;
        if (this.x.a())
        {
          this.y.a(this.x.b(), paramd);
        }
        else
        {
          bq localbq = new bq(this.b);
          this.b.m.a(localbq);
          this.c = ((n)localbq.b.a());
          this.c.a(paramd);
        }
      }
    }
  }
  
  /* Error */
  public void a(com.google.ads.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield 75	com/google/ads/a/w:c	Lcom/google/ads/a/n;
    //   7: aload_1
    //   8: getstatic 556	com/google/ads/e:c	Lcom/google/ads/e;
    //   11: if_acmpne +21 -> 32
    //   14: aload_0
    //   15: ldc_w 557
    //   18: invokevirtual 559	com/google/ads/a/w:a	(F)V
    //   21: aload_0
    //   22: invokevirtual 363	com/google/ads/a/w:r	()Z
    //   25: ifne +7 -> 32
    //   28: aload_0
    //   29: invokevirtual 560	com/google/ads/a/w:g	()V
    //   32: aload_0
    //   33: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   36: invokevirtual 318	com/google/ads/bt:b	()Z
    //   39: ifeq +17 -> 56
    //   42: aload_1
    //   43: getstatic 562	com/google/ads/e:b	Lcom/google/ads/e;
    //   46: if_acmpne +80 -> 126
    //   49: aload_0
    //   50: getfield 73	com/google/ads/a/w:e	Lcom/google/ads/a/ab;
    //   53: invokevirtual 564	com/google/ads/a/ab:B	()V
    //   56: new 136	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   63: ldc_w 566
    //   66: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_1
    //   70: invokevirtual 411	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: ldc_w 568
    //   76: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 570	com/google/ads/util/g:c	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   89: getfield 466	com/google/ads/bt:o	Lcom/google/ads/util/ae;
    //   92: invokevirtual 341	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   95: checkcast 468	com/google/ads/c
    //   98: astore_3
    //   99: aload_3
    //   100: ifnull +23 -> 123
    //   103: aload_3
    //   104: aload_0
    //   105: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   108: getfield 470	com/google/ads/bt:a	Lcom/google/ads/util/ad;
    //   111: invokevirtual 185	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   114: checkcast 472	com/google/ads/a
    //   117: aload_1
    //   118: invokeinterface 573 3 0
    //   123: aload_0
    //   124: monitorexit
    //   125: return
    //   126: aload_1
    //   127: getstatic 556	com/google/ads/e:c	Lcom/google/ads/e;
    //   130: if_acmpne -74 -> 56
    //   133: aload_0
    //   134: getfield 73	com/google/ads/a/w:e	Lcom/google/ads/a/ab;
    //   137: invokevirtual 575	com/google/ads/a/ab:z	()V
    //   140: goto -84 -> 56
    //   143: astore_2
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_2
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	w
    //   0	148	1	parame	com.google.ads.e
    //   143	4	2	localObject	Object
    //   98	6	3	localc	c
    // Exception table:
    //   from	to	target	type
    //   2	32	143	finally
    //   32	56	143	finally
    //   56	99	143	finally
    //   103	123	143	finally
    //   126	140	143	finally
  }
  
  public void a(String paramString)
  {
    this.B = paramString;
    Uri localUri = new Uri.Builder().encodedQuery(paramString).build();
    StringBuilder localStringBuilder = new StringBuilder();
    HashMap localHashMap = AdUtil.b(localUri);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append(str).append(" = ").append((String)localHashMap.get(str)).append("\n");
    }
    this.A = localStringBuilder.toString().trim();
    if (TextUtils.isEmpty(this.A)) {
      this.A = null;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      h localh = (h)this.b.p.a();
      if (localh != null) {
        localh.a((com.google.ads.a)this.b.a.a(), paramString1, paramString2);
      }
      return;
    }
    finally {}
  }
  
  protected void a(LinkedList paramLinkedList)
  {
    try
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        com.google.ads.util.g.a("Adding a click tracking URL: " + str);
      }
      this.u = paramLinkedList;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String b()
  {
    return this.A;
  }
  
  public void b(long paramLong)
  {
    if (paramLong > 0L) {}
    try
    {
      this.o.edit().putLong("GoogleAdMobDoritosLife", paramLong).commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b(ba paramba)
  {
    try
    {
      com.google.ads.util.g.a("AdManager.onGWhirlNoFill() called.");
      a(paramba.i(), paramba.c());
      c localc = (c)this.b.o.a();
      if (localc != null) {
        localc.a((com.google.ads.a)this.b.a.a(), com.google.ads.e.b);
      }
      return;
    }
    finally {}
  }
  
  protected void b(String paramString)
  {
    try
    {
      com.google.ads.util.g.a("Adding a tracking URL: " + paramString);
      this.s.add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.w = Boolean.valueOf(paramBoolean);
  }
  
  public String c()
  {
    return this.B;
  }
  
  protected void c(String paramString)
  {
    try
    {
      com.google.ads.util.g.a("Adding a manual tracking URL: " + paramString);
      A().add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void d()
  {
    try
    {
      this.m = false;
      com.google.ads.util.g.a("Refreshing is no longer allowed on this AdView.");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 85	com/google/ads/a/w:l	Z
    //   6: ifeq +36 -> 42
    //   9: ldc_w 649
    //   12: invokestatic 356	com/google/ads/util/g:a	(Ljava/lang/String;)V
    //   15: invokestatic 104	com/google/ads/br:a	()Lcom/google/ads/br;
    //   18: getfield 651	com/google/ads/br:c	Lcom/google/ads/util/ad;
    //   21: invokevirtual 185	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   24: checkcast 653	android/os/Handler
    //   27: aload_0
    //   28: getfield 166	com/google/ads/a/w:q	Lcom/google/ads/p;
    //   31: invokevirtual 656	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 85	com/google/ads/a/w:l	Z
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: ldc_w 658
    //   45: invokestatic 356	com/google/ads/util/g:a	(Ljava/lang/String;)V
    //   48: goto -9 -> 39
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	w
    //   51	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	39	51	finally
    //   42	48	51	finally
  }
  
  public void f()
  {
    for (;;)
    {
      try
      {
        this.n = false;
        if (!this.b.a()) {
          break label118;
        }
        if (this.m)
        {
          if (!this.l)
          {
            com.google.ads.util.g.a("Enabling refreshing every " + this.p + " milliseconds.");
            ((Handler)br.a().c.a()).postDelayed(this.q, this.p);
            this.l = true;
            return;
          }
          com.google.ads.util.g.a("Refreshing is already enabled.");
          continue;
        }
        com.google.ads.util.g.a("Refreshing disabled on this AdView");
      }
      finally {}
      continue;
      label118:
      com.google.ads.util.g.a("Tried to enable refreshing on something other than an AdView.");
    }
  }
  
  public void g()
  {
    f();
    this.n = true;
  }
  
  public bt h()
  {
    return this.b;
  }
  
  public bc i()
  {
    try
    {
      bc localbc = this.x;
      return localbc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public n j()
  {
    try
    {
      n localn = this.c;
      return localn;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public e k()
  {
    try
    {
      e locale = this.f;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public ad l()
  {
    try
    {
      ad localad = this.g;
      return localad;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public ab m()
  {
    return this.e;
  }
  
  public int n()
  {
    try
    {
      int i1 = this.v;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public long o()
  {
    return this.i;
  }
  
  /* Error */
  public boolean p()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	com/google/ads/a/w:c	Lcom/google/ads/a/n;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	w
    //   22	4	1	localObject	Object
    //   6	2	2	localn	n
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public boolean q()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean r()
  {
    try
    {
      boolean bool = this.l;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void s()
  {
    try
    {
      this.e.C();
      com.google.ads.util.g.c("onDismissScreen()");
      c localc = (c)this.b.o.a();
      if (localc != null) {
        localc.c((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void t()
  {
    try
    {
      com.google.ads.util.g.c("onPresentScreen()");
      c localc = (c)this.b.o.a();
      if (localc != null) {
        localc.b((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void u()
  {
    try
    {
      com.google.ads.util.g.c("onLeaveApplication()");
      c localc = (c)this.b.o.a();
      if (localc != null) {
        localc.d((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void v()
  {
    this.e.f();
    y();
  }
  
  /* Error */
  public void w()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   6: getfield 524	com/google/ads/bt:c	Lcom/google/ads/util/af;
    //   9: invokevirtual 527	com/google/ads/util/af:a	()Ljava/lang/Object;
    //   12: checkcast 117	android/app/Activity
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 701
    //   23: invokestatic 500	com/google/ads/util/g:e	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 171	com/google/ads/a/w:s	Ljava/util/LinkedList;
    //   33: invokevirtual 625	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   36: astore_3
    //   37: aload_3
    //   38: invokeinterface 263 1 0
    //   43: ifeq -17 -> 26
    //   46: new 265	java/lang/Thread
    //   49: dup
    //   50: new 267	com/google/ads/o
    //   53: dup
    //   54: aload_3
    //   55: invokeinterface 270 1 0
    //   60: checkcast 272	java/lang/String
    //   63: aload_2
    //   64: invokevirtual 121	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   67: invokespecial 282	com/google/ads/o:<init>	(Ljava/lang/String;Landroid/content/Context;)V
    //   70: invokespecial 285	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 288	java/lang/Thread:start	()V
    //   76: goto -39 -> 37
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	w
    //   79	4	1	localObject	Object
    //   15	49	2	localActivity	Activity
    //   36	19	3	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	16	79	finally
    //   20	26	79	finally
    //   29	37	79	finally
    //   37	76	79	finally
  }
  
  public void x()
  {
    for (;;)
    {
      try
      {
        boolean bool = this.h;
        if (bool) {
          return;
        }
        if (this.d == null) {
          break label134;
        }
        if (!this.b.a()) {
          break label125;
        }
        if ((((AdView)this.b.j.a()).isShown()) && (AdUtil.d()))
        {
          com.google.ads.util.g.c("Refreshing ad.");
          a(this.d);
          if (!this.n) {
            break label98;
          }
          e();
          continue;
        }
        com.google.ads.util.g.a("Not refreshing because the ad is not visible.");
      }
      finally {}
      continue;
      label98:
      ((Handler)br.a().c.a()).postDelayed(this.q, this.p);
      continue;
      label125:
      com.google.ads.util.g.a("Tried to refresh an ad that wasn't an AdView.");
      continue;
      label134:
      com.google.ads.util.g.a("Tried to refresh before calling loadAd().");
    }
  }
  
  /* Error */
  protected void y()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 115	com/google/ads/a/w:b	Lcom/google/ads/bt;
    //   6: getfield 524	com/google/ads/bt:c	Lcom/google/ads/util/af;
    //   9: invokevirtual 527	com/google/ads/util/af:a	()Ljava/lang/Object;
    //   12: checkcast 117	android/app/Activity
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 719
    //   23: invokestatic 500	com/google/ads/util/g:e	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 175	com/google/ads/a/w:u	Ljava/util/LinkedList;
    //   33: invokevirtual 625	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   36: astore_3
    //   37: aload_3
    //   38: invokeinterface 263 1 0
    //   43: ifeq -17 -> 26
    //   46: new 265	java/lang/Thread
    //   49: dup
    //   50: new 267	com/google/ads/o
    //   53: dup
    //   54: aload_3
    //   55: invokeinterface 270 1 0
    //   60: checkcast 272	java/lang/String
    //   63: aload_2
    //   64: invokevirtual 121	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   67: invokespecial 282	com/google/ads/o:<init>	(Ljava/lang/String;Landroid/content/Context;)V
    //   70: invokespecial 285	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 288	java/lang/Thread:start	()V
    //   76: goto -39 -> 37
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	w
    //   79	4	1	localObject	Object
    //   15	49	2	localActivity	Activity
    //   36	19	3	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	16	79	finally
    //   20	26	79	finally
    //   29	37	79	finally
    //   37	76	79	finally
  }
  
  protected void z()
  {
    try
    {
      this.c = null;
      this.k = true;
      this.f.setVisibility(0);
      if (this.b.a()) {
        a(this.f);
      }
      this.e.g();
      if (this.b.a()) {
        w();
      }
      com.google.ads.util.g.c("onReceiveAd()");
      c localc = (c)this.b.o.a();
      if (localc != null) {
        localc.a((com.google.ads.a)this.b.a.a());
      }
      this.b.l.a(this.b.m.a());
      this.b.m.a(null);
      return;
    }
    finally {}
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.w
 * JD-Core Version:    0.7.0.1
 */