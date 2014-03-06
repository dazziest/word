package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.w;
import com.google.tagmanager.a.x;
import java.util.Collections;
import java.util.List;

public final class c
  extends x
  implements j
{
  public static aq a = new d();
  private static final c c;
  private static volatile ap t = null;
  private final com.google.tagmanager.a.h d;
  private int e;
  private h f;
  private Object g;
  private List h;
  private List i;
  private List j;
  private Object k;
  private Object l;
  private long m;
  private boolean n;
  private List o;
  private List p;
  private boolean q;
  private byte r = -1;
  private int s = -1;
  
  static
  {
    c = new c(true);
    c.J();
  }
  
  /* Error */
  private c(com.google.tagmanager.a.k paramk, com.google.tagmanager.a.o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 60	com/google/tagmanager/a/x:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 62	com/google/analytics/b/a/a/c:r	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 64	com/google/analytics/b/a/a/c:s	I
    //   14: aload_0
    //   15: invokespecial 54	com/google/analytics/b/a/a/c:J	()V
    //   18: iconst_0
    //   19: istore_3
    //   20: invokestatic 69	com/google/tagmanager/a/h:i	()Lcom/google/tagmanager/a/j;
    //   23: astore 4
    //   25: aload 4
    //   27: invokestatic 74	com/google/tagmanager/a/m:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/a/m;
    //   30: astore 5
    //   32: iconst_0
    //   33: istore 6
    //   35: iload 6
    //   37: ifne +1032 -> 1069
    //   40: aload_1
    //   41: invokevirtual 79	com/google/tagmanager/a/k:a	()I
    //   44: istore 14
    //   46: iload 14
    //   48: lookupswitch	default:+124->172, 0:+1260->1308, 8:+146->194, 18:+214->262, 26:+246->294, 34:+302->350, 42:+361->409, 50:+420->468, 58:+452->500, 64:+485->533, 72:+514->562, 80:+543->591, 82:+641->689, 90:+930->978, 96:+992->1040
    //   173: aload_1
    //   174: aload 5
    //   176: aload_2
    //   177: iload 14
    //   179: invokevirtual 82	com/google/analytics/b/a/a/c:a	(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/m;Lcom/google/tagmanager/a/o;I)Z
    //   182: ifne +877 -> 1059
    //   185: iconst_1
    //   186: istore 15
    //   188: iload_3
    //   189: istore 16
    //   191: goto +1107 -> 1298
    //   194: aload_1
    //   195: invokevirtual 84	com/google/tagmanager/a/k:n	()I
    //   198: istore 41
    //   200: iload 41
    //   202: invokestatic 89	com/google/analytics/b/a/a/h:a	(I)Lcom/google/analytics/b/a/a/h;
    //   205: astore 42
    //   207: aload 42
    //   209: ifnonnull +27 -> 236
    //   212: aload 5
    //   214: iload 14
    //   216: invokevirtual 92	com/google/tagmanager/a/m:d	(I)V
    //   219: aload 5
    //   221: iload 41
    //   223: invokevirtual 92	com/google/tagmanager/a/m:d	(I)V
    //   226: iload 6
    //   228: istore 15
    //   230: iload_3
    //   231: istore 16
    //   233: goto +1065 -> 1298
    //   236: aload_0
    //   237: iconst_1
    //   238: aload_0
    //   239: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   242: ior
    //   243: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   246: aload_0
    //   247: aload 42
    //   249: putfield 96	com/google/analytics/b/a/a/c:f	Lcom/google/analytics/b/a/a/h;
    //   252: iload 6
    //   254: istore 15
    //   256: iload_3
    //   257: istore 16
    //   259: goto +1039 -> 1298
    //   262: aload_1
    //   263: invokevirtual 99	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   266: astore 40
    //   268: aload_0
    //   269: iconst_2
    //   270: aload_0
    //   271: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   274: ior
    //   275: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   278: aload_0
    //   279: aload 40
    //   281: putfield 101	com/google/analytics/b/a/a/c:g	Ljava/lang/Object;
    //   284: iload 6
    //   286: istore 15
    //   288: iload_3
    //   289: istore 16
    //   291: goto +1007 -> 1298
    //   294: iload_3
    //   295: iconst_4
    //   296: iand
    //   297: iconst_4
    //   298: if_icmpeq +994 -> 1292
    //   301: aload_0
    //   302: new 103	java/util/ArrayList
    //   305: dup
    //   306: invokespecial 104	java/util/ArrayList:<init>	()V
    //   309: putfield 106	com/google/analytics/b/a/a/c:h	Ljava/util/List;
    //   312: iload_3
    //   313: iconst_4
    //   314: ior
    //   315: istore 17
    //   317: aload_0
    //   318: getfield 106	com/google/analytics/b/a/a/c:h	Ljava/util/List;
    //   321: aload_1
    //   322: getstatic 45	com/google/analytics/b/a/a/c:a	Lcom/google/tagmanager/a/aq;
    //   325: aload_2
    //   326: invokevirtual 109	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   329: invokeinterface 115 2 0
    //   334: pop
    //   335: iload 6
    //   337: istore 39
    //   339: iload 17
    //   341: istore 16
    //   343: iload 39
    //   345: istore 15
    //   347: goto +951 -> 1298
    //   350: iload_3
    //   351: bipush 8
    //   353: iand
    //   354: bipush 8
    //   356: if_icmpeq +930 -> 1286
    //   359: aload_0
    //   360: new 103	java/util/ArrayList
    //   363: dup
    //   364: invokespecial 104	java/util/ArrayList:<init>	()V
    //   367: putfield 117	com/google/analytics/b/a/a/c:i	Ljava/util/List;
    //   370: iload_3
    //   371: bipush 8
    //   373: ior
    //   374: istore 17
    //   376: aload_0
    //   377: getfield 117	com/google/analytics/b/a/a/c:i	Ljava/util/List;
    //   380: aload_1
    //   381: getstatic 45	com/google/analytics/b/a/a/c:a	Lcom/google/tagmanager/a/aq;
    //   384: aload_2
    //   385: invokevirtual 109	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   388: invokeinterface 115 2 0
    //   393: pop
    //   394: iload 6
    //   396: istore 37
    //   398: iload 17
    //   400: istore 16
    //   402: iload 37
    //   404: istore 15
    //   406: goto +892 -> 1298
    //   409: iload_3
    //   410: bipush 16
    //   412: iand
    //   413: bipush 16
    //   415: if_icmpeq +865 -> 1280
    //   418: aload_0
    //   419: new 103	java/util/ArrayList
    //   422: dup
    //   423: invokespecial 104	java/util/ArrayList:<init>	()V
    //   426: putfield 119	com/google/analytics/b/a/a/c:j	Ljava/util/List;
    //   429: iload_3
    //   430: bipush 16
    //   432: ior
    //   433: istore 17
    //   435: aload_0
    //   436: getfield 119	com/google/analytics/b/a/a/c:j	Ljava/util/List;
    //   439: aload_1
    //   440: getstatic 45	com/google/analytics/b/a/a/c:a	Lcom/google/tagmanager/a/aq;
    //   443: aload_2
    //   444: invokevirtual 109	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   447: invokeinterface 115 2 0
    //   452: pop
    //   453: iload 6
    //   455: istore 35
    //   457: iload 17
    //   459: istore 16
    //   461: iload 35
    //   463: istore 15
    //   465: goto +833 -> 1298
    //   468: aload_1
    //   469: invokevirtual 99	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   472: astore 33
    //   474: aload_0
    //   475: iconst_4
    //   476: aload_0
    //   477: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   480: ior
    //   481: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   484: aload_0
    //   485: aload 33
    //   487: putfield 121	com/google/analytics/b/a/a/c:k	Ljava/lang/Object;
    //   490: iload 6
    //   492: istore 15
    //   494: iload_3
    //   495: istore 16
    //   497: goto +801 -> 1298
    //   500: aload_1
    //   501: invokevirtual 99	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   504: astore 32
    //   506: aload_0
    //   507: bipush 8
    //   509: aload_0
    //   510: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   513: ior
    //   514: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   517: aload_0
    //   518: aload 32
    //   520: putfield 123	com/google/analytics/b/a/a/c:l	Ljava/lang/Object;
    //   523: iload 6
    //   525: istore 15
    //   527: iload_3
    //   528: istore 16
    //   530: goto +768 -> 1298
    //   533: aload_0
    //   534: bipush 16
    //   536: aload_0
    //   537: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   540: ior
    //   541: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   544: aload_0
    //   545: aload_1
    //   546: invokevirtual 126	com/google/tagmanager/a/k:e	()J
    //   549: putfield 128	com/google/analytics/b/a/a/c:m	J
    //   552: iload 6
    //   554: istore 15
    //   556: iload_3
    //   557: istore 16
    //   559: goto +739 -> 1298
    //   562: aload_0
    //   563: bipush 64
    //   565: aload_0
    //   566: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   569: ior
    //   570: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   573: aload_0
    //   574: aload_1
    //   575: invokevirtual 131	com/google/tagmanager/a/k:i	()Z
    //   578: putfield 133	com/google/analytics/b/a/a/c:q	Z
    //   581: iload 6
    //   583: istore 15
    //   585: iload_3
    //   586: istore 16
    //   588: goto +710 -> 1298
    //   591: aload_1
    //   592: invokevirtual 84	com/google/tagmanager/a/k:n	()I
    //   595: istore 28
    //   597: iload 28
    //   599: invokestatic 138	com/google/analytics/b/a/a/f:a	(I)Lcom/google/analytics/b/a/a/f;
    //   602: astore 29
    //   604: aload 29
    //   606: ifnonnull +27 -> 633
    //   609: aload 5
    //   611: iload 14
    //   613: invokevirtual 92	com/google/tagmanager/a/m:d	(I)V
    //   616: aload 5
    //   618: iload 28
    //   620: invokevirtual 92	com/google/tagmanager/a/m:d	(I)V
    //   623: iload 6
    //   625: istore 15
    //   627: iload_3
    //   628: istore 16
    //   630: goto +668 -> 1298
    //   633: iload_3
    //   634: sipush 1024
    //   637: iand
    //   638: sipush 1024
    //   641: if_icmpeq +633 -> 1274
    //   644: aload_0
    //   645: new 103	java/util/ArrayList
    //   648: dup
    //   649: invokespecial 104	java/util/ArrayList:<init>	()V
    //   652: putfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   655: iload_3
    //   656: sipush 1024
    //   659: ior
    //   660: istore 17
    //   662: aload_0
    //   663: getfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   666: aload 29
    //   668: invokeinterface 115 2 0
    //   673: pop
    //   674: iload 6
    //   676: istore 31
    //   678: iload 17
    //   680: istore 16
    //   682: iload 31
    //   684: istore 15
    //   686: goto +612 -> 1298
    //   689: aload_1
    //   690: aload_1
    //   691: invokevirtual 142	com/google/tagmanager/a/k:s	()I
    //   694: invokevirtual 145	com/google/tagmanager/a/k:c	(I)I
    //   697: istore 23
    //   699: iload_3
    //   700: istore 17
    //   702: aload_1
    //   703: invokevirtual 148	com/google/tagmanager/a/k:w	()I
    //   706: ifle +251 -> 957
    //   709: aload_1
    //   710: invokevirtual 84	com/google/tagmanager/a/k:n	()I
    //   713: istore 25
    //   715: iload 25
    //   717: invokestatic 138	com/google/analytics/b/a/a/f:a	(I)Lcom/google/analytics/b/a/a/f;
    //   720: astore 26
    //   722: aload 26
    //   724: ifnonnull +161 -> 885
    //   727: aload 5
    //   729: iload 14
    //   731: invokevirtual 92	com/google/tagmanager/a/m:d	(I)V
    //   734: aload 5
    //   736: iload 25
    //   738: invokevirtual 92	com/google/tagmanager/a/m:d	(I)V
    //   741: goto -39 -> 702
    //   744: astore 22
    //   746: iload 17
    //   748: istore_3
    //   749: aload 22
    //   751: astore 9
    //   753: aload 9
    //   755: aload_0
    //   756: invokevirtual 151	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   759: athrow
    //   760: astore 10
    //   762: iload_3
    //   763: iconst_4
    //   764: iand
    //   765: iconst_4
    //   766: if_icmpne +14 -> 780
    //   769: aload_0
    //   770: aload_0
    //   771: getfield 106	com/google/analytics/b/a/a/c:h	Ljava/util/List;
    //   774: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   777: putfield 106	com/google/analytics/b/a/a/c:h	Ljava/util/List;
    //   780: iload_3
    //   781: bipush 8
    //   783: iand
    //   784: bipush 8
    //   786: if_icmpne +14 -> 800
    //   789: aload_0
    //   790: aload_0
    //   791: getfield 117	com/google/analytics/b/a/a/c:i	Ljava/util/List;
    //   794: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   797: putfield 117	com/google/analytics/b/a/a/c:i	Ljava/util/List;
    //   800: iload_3
    //   801: bipush 16
    //   803: iand
    //   804: bipush 16
    //   806: if_icmpne +14 -> 820
    //   809: aload_0
    //   810: aload_0
    //   811: getfield 119	com/google/analytics/b/a/a/c:j	Ljava/util/List;
    //   814: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   817: putfield 119	com/google/analytics/b/a/a/c:j	Ljava/util/List;
    //   820: iload_3
    //   821: sipush 1024
    //   824: iand
    //   825: sipush 1024
    //   828: if_icmpne +14 -> 842
    //   831: aload_0
    //   832: aload_0
    //   833: getfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   836: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   839: putfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   842: iload_3
    //   843: sipush 512
    //   846: iand
    //   847: sipush 512
    //   850: if_icmpne +14 -> 864
    //   853: aload_0
    //   854: aload_0
    //   855: getfield 159	com/google/analytics/b/a/a/c:o	Ljava/util/List;
    //   858: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   861: putfield 159	com/google/analytics/b/a/a/c:o	Ljava/util/List;
    //   864: aload 5
    //   866: invokevirtual 161	com/google/tagmanager/a/m:a	()V
    //   869: aload_0
    //   870: aload 4
    //   872: invokevirtual 165	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   875: putfield 167	com/google/analytics/b/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   878: aload_0
    //   879: invokevirtual 170	com/google/analytics/b/a/a/c:R	()V
    //   882: aload 10
    //   884: athrow
    //   885: iload 17
    //   887: sipush 1024
    //   890: iand
    //   891: sipush 1024
    //   894: if_icmpeq +22 -> 916
    //   897: aload_0
    //   898: new 103	java/util/ArrayList
    //   901: dup
    //   902: invokespecial 104	java/util/ArrayList:<init>	()V
    //   905: putfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   908: iload 17
    //   910: sipush 1024
    //   913: ior
    //   914: istore 17
    //   916: aload_0
    //   917: getfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   920: aload 26
    //   922: invokeinterface 115 2 0
    //   927: pop
    //   928: goto -226 -> 702
    //   931: astore 21
    //   933: iload 17
    //   935: istore_3
    //   936: aload 21
    //   938: astore 13
    //   940: new 57	com/google/tagmanager/a/af
    //   943: dup
    //   944: aload 13
    //   946: invokevirtual 174	java/io/IOException:getMessage	()Ljava/lang/String;
    //   949: invokespecial 177	com/google/tagmanager/a/af:<init>	(Ljava/lang/String;)V
    //   952: aload_0
    //   953: invokevirtual 151	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   956: athrow
    //   957: aload_1
    //   958: iload 23
    //   960: invokevirtual 178	com/google/tagmanager/a/k:d	(I)V
    //   963: iload 6
    //   965: istore 24
    //   967: iload 17
    //   969: istore 16
    //   971: iload 24
    //   973: istore 15
    //   975: goto +323 -> 1298
    //   978: iload_3
    //   979: sipush 512
    //   982: iand
    //   983: sipush 512
    //   986: if_icmpeq +282 -> 1268
    //   989: aload_0
    //   990: new 103	java/util/ArrayList
    //   993: dup
    //   994: invokespecial 104	java/util/ArrayList:<init>	()V
    //   997: putfield 159	com/google/analytics/b/a/a/c:o	Ljava/util/List;
    //   1000: iload_3
    //   1001: sipush 512
    //   1004: ior
    //   1005: istore 17
    //   1007: aload_0
    //   1008: getfield 159	com/google/analytics/b/a/a/c:o	Ljava/util/List;
    //   1011: aload_1
    //   1012: getstatic 45	com/google/analytics/b/a/a/c:a	Lcom/google/tagmanager/a/aq;
    //   1015: aload_2
    //   1016: invokevirtual 109	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   1019: invokeinterface 115 2 0
    //   1024: pop
    //   1025: iload 6
    //   1027: istore 20
    //   1029: iload 17
    //   1031: istore 16
    //   1033: iload 20
    //   1035: istore 15
    //   1037: goto +261 -> 1298
    //   1040: aload_0
    //   1041: bipush 32
    //   1043: aload_0
    //   1044: getfield 94	com/google/analytics/b/a/a/c:e	I
    //   1047: ior
    //   1048: putfield 94	com/google/analytics/b/a/a/c:e	I
    //   1051: aload_0
    //   1052: aload_1
    //   1053: invokevirtual 131	com/google/tagmanager/a/k:i	()Z
    //   1056: putfield 180	com/google/analytics/b/a/a/c:n	Z
    //   1059: iload 6
    //   1061: istore 15
    //   1063: iload_3
    //   1064: istore 16
    //   1066: goto +232 -> 1298
    //   1069: iload_3
    //   1070: iconst_4
    //   1071: iand
    //   1072: iconst_4
    //   1073: if_icmpne +14 -> 1087
    //   1076: aload_0
    //   1077: aload_0
    //   1078: getfield 106	com/google/analytics/b/a/a/c:h	Ljava/util/List;
    //   1081: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1084: putfield 106	com/google/analytics/b/a/a/c:h	Ljava/util/List;
    //   1087: iload_3
    //   1088: bipush 8
    //   1090: iand
    //   1091: bipush 8
    //   1093: if_icmpne +14 -> 1107
    //   1096: aload_0
    //   1097: aload_0
    //   1098: getfield 117	com/google/analytics/b/a/a/c:i	Ljava/util/List;
    //   1101: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1104: putfield 117	com/google/analytics/b/a/a/c:i	Ljava/util/List;
    //   1107: iload_3
    //   1108: bipush 16
    //   1110: iand
    //   1111: bipush 16
    //   1113: if_icmpne +14 -> 1127
    //   1116: aload_0
    //   1117: aload_0
    //   1118: getfield 119	com/google/analytics/b/a/a/c:j	Ljava/util/List;
    //   1121: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1124: putfield 119	com/google/analytics/b/a/a/c:j	Ljava/util/List;
    //   1127: iload_3
    //   1128: sipush 1024
    //   1131: iand
    //   1132: sipush 1024
    //   1135: if_icmpne +14 -> 1149
    //   1138: aload_0
    //   1139: aload_0
    //   1140: getfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   1143: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1146: putfield 140	com/google/analytics/b/a/a/c:p	Ljava/util/List;
    //   1149: iload_3
    //   1150: sipush 512
    //   1153: iand
    //   1154: sipush 512
    //   1157: if_icmpne +14 -> 1171
    //   1160: aload_0
    //   1161: aload_0
    //   1162: getfield 159	com/google/analytics/b/a/a/c:o	Ljava/util/List;
    //   1165: invokestatic 157	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1168: putfield 159	com/google/analytics/b/a/a/c:o	Ljava/util/List;
    //   1171: aload 5
    //   1173: invokevirtual 161	com/google/tagmanager/a/m:a	()V
    //   1176: aload_0
    //   1177: aload 4
    //   1179: invokevirtual 165	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1182: putfield 167	com/google/analytics/b/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   1185: aload_0
    //   1186: invokevirtual 170	com/google/analytics/b/a/a/c:R	()V
    //   1189: return
    //   1190: astore 8
    //   1192: aload_0
    //   1193: aload 4
    //   1195: invokevirtual 165	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1198: putfield 167	com/google/analytics/b/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   1201: goto -16 -> 1185
    //   1204: astore 7
    //   1206: aload_0
    //   1207: aload 4
    //   1209: invokevirtual 165	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1212: putfield 167	com/google/analytics/b/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   1215: aload 7
    //   1217: athrow
    //   1218: astore 12
    //   1220: aload_0
    //   1221: aload 4
    //   1223: invokevirtual 165	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1226: putfield 167	com/google/analytics/b/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   1229: goto -351 -> 878
    //   1232: astore 11
    //   1234: aload_0
    //   1235: aload 4
    //   1237: invokevirtual 165	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1240: putfield 167	com/google/analytics/b/a/a/c:d	Lcom/google/tagmanager/a/h;
    //   1243: aload 11
    //   1245: athrow
    //   1246: astore 18
    //   1248: iload 17
    //   1250: istore_3
    //   1251: aload 18
    //   1253: astore 10
    //   1255: goto -493 -> 762
    //   1258: astore 13
    //   1260: goto -320 -> 940
    //   1263: astore 9
    //   1265: goto -512 -> 753
    //   1268: iload_3
    //   1269: istore 17
    //   1271: goto -264 -> 1007
    //   1274: iload_3
    //   1275: istore 17
    //   1277: goto -615 -> 662
    //   1280: iload_3
    //   1281: istore 17
    //   1283: goto -848 -> 435
    //   1286: iload_3
    //   1287: istore 17
    //   1289: goto -913 -> 376
    //   1292: iload_3
    //   1293: istore 17
    //   1295: goto -978 -> 317
    //   1298: iload 16
    //   1300: istore_3
    //   1301: iload 15
    //   1303: istore 6
    //   1305: goto -1270 -> 35
    //   1308: iconst_1
    //   1309: istore 15
    //   1311: iload_3
    //   1312: istore 16
    //   1314: goto -16 -> 1298
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1317	0	this	c
    //   0	1317	1	paramk	com.google.tagmanager.a.k
    //   0	1317	2	paramo	com.google.tagmanager.a.o
    //   19	1293	3	i1	int
    //   23	1213	4	localj	com.google.tagmanager.a.j
    //   30	1142	5	localm	com.google.tagmanager.a.m
    //   33	1271	6	i2	int
    //   1204	12	7	localObject1	Object
    //   1190	1	8	localIOException1	java.io.IOException
    //   751	3	9	localaf1	com.google.tagmanager.a.af
    //   1263	1	9	localaf2	com.google.tagmanager.a.af
    //   760	123	10	localObject2	Object
    //   1253	1	10	localObject3	Object
    //   1232	12	11	localObject4	Object
    //   1218	1	12	localIOException2	java.io.IOException
    //   938	7	13	localIOException3	java.io.IOException
    //   1258	1	13	localIOException4	java.io.IOException
    //   44	686	14	i3	int
    //   186	1124	15	i4	int
    //   189	1124	16	i5	int
    //   315	979	17	i6	int
    //   1246	6	18	localObject5	Object
    //   1027	7	20	i7	int
    //   931	6	21	localIOException5	java.io.IOException
    //   744	6	22	localaf3	com.google.tagmanager.a.af
    //   697	262	23	i8	int
    //   965	7	24	i9	int
    //   713	24	25	i10	int
    //   720	201	26	localf1	f
    //   595	24	28	i11	int
    //   602	65	29	localf2	f
    //   676	7	31	i12	int
    //   504	15	32	localh1	com.google.tagmanager.a.h
    //   472	14	33	localh2	com.google.tagmanager.a.h
    //   455	7	35	i13	int
    //   396	7	37	i14	int
    //   337	7	39	i15	int
    //   266	14	40	localh3	com.google.tagmanager.a.h
    //   198	24	41	i16	int
    //   205	43	42	localh	h
    // Exception table:
    //   from	to	target	type
    //   317	335	744	com/google/tagmanager/a/af
    //   376	394	744	com/google/tagmanager/a/af
    //   435	453	744	com/google/tagmanager/a/af
    //   662	674	744	com/google/tagmanager/a/af
    //   702	722	744	com/google/tagmanager/a/af
    //   727	741	744	com/google/tagmanager/a/af
    //   897	908	744	com/google/tagmanager/a/af
    //   916	928	744	com/google/tagmanager/a/af
    //   957	963	744	com/google/tagmanager/a/af
    //   1007	1025	744	com/google/tagmanager/a/af
    //   40	46	760	finally
    //   172	185	760	finally
    //   194	207	760	finally
    //   212	226	760	finally
    //   236	252	760	finally
    //   262	284	760	finally
    //   301	312	760	finally
    //   359	370	760	finally
    //   418	429	760	finally
    //   468	490	760	finally
    //   500	523	760	finally
    //   533	552	760	finally
    //   562	581	760	finally
    //   591	604	760	finally
    //   609	623	760	finally
    //   644	655	760	finally
    //   689	699	760	finally
    //   753	760	760	finally
    //   940	957	760	finally
    //   989	1000	760	finally
    //   1040	1059	760	finally
    //   317	335	931	java/io/IOException
    //   376	394	931	java/io/IOException
    //   435	453	931	java/io/IOException
    //   662	674	931	java/io/IOException
    //   702	722	931	java/io/IOException
    //   727	741	931	java/io/IOException
    //   897	908	931	java/io/IOException
    //   916	928	931	java/io/IOException
    //   957	963	931	java/io/IOException
    //   1007	1025	931	java/io/IOException
    //   1171	1176	1190	java/io/IOException
    //   1171	1176	1204	finally
    //   864	869	1218	java/io/IOException
    //   864	869	1232	finally
    //   317	335	1246	finally
    //   376	394	1246	finally
    //   435	453	1246	finally
    //   662	674	1246	finally
    //   702	722	1246	finally
    //   727	741	1246	finally
    //   897	908	1246	finally
    //   916	928	1246	finally
    //   957	963	1246	finally
    //   1007	1025	1246	finally
    //   40	46	1258	java/io/IOException
    //   172	185	1258	java/io/IOException
    //   194	207	1258	java/io/IOException
    //   212	226	1258	java/io/IOException
    //   236	252	1258	java/io/IOException
    //   262	284	1258	java/io/IOException
    //   301	312	1258	java/io/IOException
    //   359	370	1258	java/io/IOException
    //   418	429	1258	java/io/IOException
    //   468	490	1258	java/io/IOException
    //   500	523	1258	java/io/IOException
    //   533	552	1258	java/io/IOException
    //   562	581	1258	java/io/IOException
    //   591	604	1258	java/io/IOException
    //   609	623	1258	java/io/IOException
    //   644	655	1258	java/io/IOException
    //   689	699	1258	java/io/IOException
    //   989	1000	1258	java/io/IOException
    //   1040	1059	1258	java/io/IOException
    //   40	46	1263	com/google/tagmanager/a/af
    //   172	185	1263	com/google/tagmanager/a/af
    //   194	207	1263	com/google/tagmanager/a/af
    //   212	226	1263	com/google/tagmanager/a/af
    //   236	252	1263	com/google/tagmanager/a/af
    //   262	284	1263	com/google/tagmanager/a/af
    //   301	312	1263	com/google/tagmanager/a/af
    //   359	370	1263	com/google/tagmanager/a/af
    //   418	429	1263	com/google/tagmanager/a/af
    //   468	490	1263	com/google/tagmanager/a/af
    //   500	523	1263	com/google/tagmanager/a/af
    //   533	552	1263	com/google/tagmanager/a/af
    //   562	581	1263	com/google/tagmanager/a/af
    //   591	604	1263	com/google/tagmanager/a/af
    //   609	623	1263	com/google/tagmanager/a/af
    //   644	655	1263	com/google/tagmanager/a/af
    //   689	699	1263	com/google/tagmanager/a/af
    //   989	1000	1263	com/google/tagmanager/a/af
    //   1040	1059	1263	com/google/tagmanager/a/af
  }
  
  private c(w paramw)
  {
    super(paramw);
    this.d = paramw.r();
  }
  
  private c(boolean paramBoolean)
  {
    this.d = com.google.tagmanager.a.h.a;
  }
  
  public static e F()
  {
    return e.q();
  }
  
  private void J()
  {
    this.f = h.a;
    this.g = "";
    this.h = Collections.emptyList();
    this.i = Collections.emptyList();
    this.j = Collections.emptyList();
    this.k = "";
    this.l = "";
    this.m = 0L;
    this.n = false;
    this.o = Collections.emptyList();
    this.p = Collections.emptyList();
    this.q = false;
  }
  
  public static c a()
  {
    return c;
  }
  
  public static e a(c paramc)
  {
    return F().a(paramc);
  }
  
  public int A()
  {
    return this.o.size();
  }
  
  public List B()
  {
    return this.p;
  }
  
  public int C()
  {
    return this.p.size();
  }
  
  public boolean D()
  {
    return (0x40 & this.e) == 64;
  }
  
  public boolean E()
  {
    return this.q;
  }
  
  public e G()
  {
    return F();
  }
  
  public e H()
  {
    return a(this);
  }
  
  public c a(int paramInt)
  {
    return (c)this.h.get(paramInt);
  }
  
  public c b()
  {
    return c;
  }
  
  public c b(int paramInt)
  {
    return (c)this.i.get(paramInt);
  }
  
  public c c(int paramInt)
  {
    return (c)this.j.get(paramInt);
  }
  
  public aq c()
  {
    return a;
  }
  
  public c d(int paramInt)
  {
    return (c)this.o.get(paramInt);
  }
  
  public boolean d()
  {
    return (0x1 & this.e) == 1;
  }
  
  public h e()
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
    int i1;
    label38:
    label62:
    int i2;
    label80:
    label109:
    int i3;
    label133:
    int i4;
    label157:
    int i5;
    label181:
    int i6;
    label200:
    label229:
    int i7;
    label248:
    int i8;
    label277:
    label296:
    label323:
    int i9;
    label342:
    label368:
    int i10;
    label392:
    int i11;
    if (d() == localc.d())
    {
      i1 = 1;
      if (d())
      {
        if ((i1 == 0) || (e() != localc.e())) {
          break label465;
        }
        i1 = 1;
      }
      if ((i1 == 0) || (f() != localc.f())) {
        break label470;
      }
      i2 = 1;
      if (f())
      {
        if ((i2 == 0) || (!g().equals(localc.g()))) {
          break label476;
        }
        i2 = 1;
      }
      if ((i2 == 0) || (!h().equals(localc.h()))) {
        break label482;
      }
      i3 = 1;
      if ((i3 == 0) || (!k().equals(localc.k()))) {
        break label488;
      }
      i4 = 1;
      if ((i4 == 0) || (!m().equals(localc.m()))) {
        break label494;
      }
      i5 = 1;
      if ((i5 == 0) || (r() != localc.r())) {
        break label500;
      }
      i6 = 1;
      if (r())
      {
        if ((i6 == 0) || (!s().equals(localc.s()))) {
          break label506;
        }
        i6 = 1;
      }
      if ((i6 == 0) || (t() != localc.t())) {
        break label512;
      }
      i7 = 1;
      if (t())
      {
        if ((i7 == 0) || (!u().equals(localc.u()))) {
          break label518;
        }
        i7 = 1;
      }
      if ((i7 == 0) || (v() != localc.v())) {
        break label524;
      }
      i8 = 1;
      if (v())
      {
        if ((i8 == 0) || (w() != localc.w())) {
          break label530;
        }
        i8 = 1;
      }
      if ((i8 == 0) || (x() != localc.x())) {
        break label536;
      }
      i9 = 1;
      if (x())
      {
        if ((i9 == 0) || (y() != localc.y())) {
          break label542;
        }
        i9 = 1;
      }
      if ((i9 == 0) || (!z().equals(localc.z()))) {
        break label548;
      }
      i10 = 1;
      if ((i10 == 0) || (!B().equals(localc.B()))) {
        break label554;
      }
      i11 = 1;
      label416:
      if ((i11 == 0) || (D() != localc.D())) {
        break label560;
      }
    }
    label512:
    label518:
    label524:
    label530:
    label536:
    label542:
    label548:
    label554:
    label560:
    for (boolean bool = true;; bool = false)
    {
      if (!D()) {
        break label566;
      }
      if ((bool) && (E() == localc.E())) {
        break;
      }
      return false;
      i1 = 0;
      break label38;
      label465:
      i1 = 0;
      break label62;
      label470:
      i2 = 0;
      break label80;
      label476:
      i2 = 0;
      break label109;
      label482:
      i3 = 0;
      break label133;
      label488:
      i4 = 0;
      break label157;
      label494:
      i5 = 0;
      break label181;
      label500:
      i6 = 0;
      break label200;
      label506:
      i6 = 0;
      break label229;
      i7 = 0;
      break label248;
      i7 = 0;
      break label277;
      i8 = 0;
      break label296;
      i8 = 0;
      break label323;
      i9 = 0;
      break label342;
      i9 = 0;
      break label368;
      i10 = 0;
      break label392;
      i11 = 0;
      break label416;
    }
    label566:
    return bool;
  }
  
  public boolean f()
  {
    return (0x2 & this.e) == 2;
  }
  
  public String g()
  {
    Object localObject = this.g;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    com.google.tagmanager.a.h localh = (com.google.tagmanager.a.h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.g = str;
    }
    return str;
  }
  
  public List h()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    if (this.b != 0) {
      return this.b;
    }
    int i1 = 779 + c.class.hashCode();
    if (d()) {
      i1 = 53 * (1 + i1 * 37) + ac.a(e());
    }
    if (f()) {
      i1 = 53 * (2 + i1 * 37) + g().hashCode();
    }
    if (i() > 0) {
      i1 = 53 * (3 + i1 * 37) + h().hashCode();
    }
    if (l() > 0) {
      i1 = 53 * (4 + i1 * 37) + k().hashCode();
    }
    if (q() > 0) {
      i1 = 53 * (5 + i1 * 37) + m().hashCode();
    }
    if (r()) {
      i1 = 53 * (6 + i1 * 37) + s().hashCode();
    }
    if (t()) {
      i1 = 53 * (7 + i1 * 37) + u().hashCode();
    }
    if (v()) {
      i1 = 53 * (8 + i1 * 37) + ac.a(w());
    }
    if (x()) {
      i1 = 53 * (12 + i1 * 37) + ac.a(y());
    }
    if (A() > 0) {
      i1 = 53 * (11 + i1 * 37) + z().hashCode();
    }
    if (C() > 0) {
      i1 = 53 * (10 + i1 * 37) + ac.a(B());
    }
    if (D()) {
      i1 = 53 * (9 + i1 * 37) + ac.a(E());
    }
    int i2 = i1 * 29 + this.d.hashCode();
    this.b = i2;
    return i2;
  }
  
  public int i()
  {
    return this.h.size();
  }
  
  public final boolean j()
  {
    int i1 = 1;
    int i2 = this.r;
    if (i2 != -1)
    {
      if (i2 == i1) {}
      for (;;)
      {
        return i1;
        i1 = 0;
      }
    }
    if (!d())
    {
      this.r = 0;
      return false;
    }
    for (int i3 = 0; i3 < i(); i3++) {
      if (!a(i3).j())
      {
        this.r = 0;
        return false;
      }
    }
    for (int i4 = 0; i4 < l(); i4++) {
      if (!b(i4).j())
      {
        this.r = 0;
        return false;
      }
    }
    for (int i5 = 0; i5 < q(); i5++) {
      if (!c(i5).j())
      {
        this.r = 0;
        return false;
      }
    }
    for (int i6 = 0; i6 < A(); i6++) {
      if (!d(i6).j())
      {
        this.r = 0;
        return false;
      }
    }
    if (!I())
    {
      this.r = 0;
      return false;
    }
    this.r = i1;
    return i1;
  }
  
  public List k()
  {
    return this.i;
  }
  
  public int l()
  {
    return this.i.size();
  }
  
  public List m()
  {
    return this.j;
  }
  
  public int q()
  {
    return this.j.size();
  }
  
  public boolean r()
  {
    return (0x4 & this.e) == 4;
  }
  
  public String s()
  {
    Object localObject = this.k;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    com.google.tagmanager.a.h localh = (com.google.tagmanager.a.h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.k = str;
    }
    return str;
  }
  
  public boolean t()
  {
    return (0x8 & this.e) == 8;
  }
  
  public String u()
  {
    Object localObject = this.l;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    com.google.tagmanager.a.h localh = (com.google.tagmanager.a.h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.l = str;
    }
    return str;
  }
  
  public boolean v()
  {
    return (0x10 & this.e) == 16;
  }
  
  public long w()
  {
    return this.m;
  }
  
  public boolean x()
  {
    return (0x20 & this.e) == 32;
  }
  
  public boolean y()
  {
    return this.n;
  }
  
  public List z()
  {
    return this.o;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.b.a.a.c
 * JD-Core Version:    0.7.0.1
 */