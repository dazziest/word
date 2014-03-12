package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.v;
import java.util.Collections;
import java.util.List;

public final class q
  extends com.google.tagmanager.a.t
  implements t
{
  public static aq a = new r();
  private static final q c;
  private static volatile ap x = null;
  private final h d;
  private int e;
  private ai f;
  private List g;
  private List h;
  private List i;
  private List j;
  private List k;
  private List l;
  private Object m;
  private Object n;
  private Object o;
  private Object p;
  private c q;
  private float r;
  private boolean s;
  private ai t;
  private int u;
  private byte v = -1;
  private int w = -1;
  
  static
  {
    c = new q(true);
    c.S();
  }
  
  /* Error */
  private q(com.google.tagmanager.a.k paramk, com.google.tagmanager.a.o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 66	com/google/tagmanager/a/t:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 68	com/google/analytics/a/a/q:v	B
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 70	com/google/analytics/a/a/q:w	I
    //   14: aload_0
    //   15: invokespecial 60	com/google/analytics/a/a/q:S	()V
    //   18: iconst_0
    //   19: istore_3
    //   20: invokestatic 75	com/google/tagmanager/a/h:i	()Lcom/google/tagmanager/a/j;
    //   23: astore 4
    //   25: aload 4
    //   27: invokestatic 80	com/google/tagmanager/a/m:a	(Ljava/io/OutputStream;)Lcom/google/tagmanager/a/m;
    //   30: astore 5
    //   32: iconst_0
    //   33: istore 6
    //   35: iload 6
    //   37: ifne +943 -> 980
    //   40: aload_1
    //   41: invokevirtual 85	com/google/tagmanager/a/k:a	()I
    //   44: istore 14
    //   46: iload 14
    //   48: lookupswitch	default:+148->196, 0:+1486->1534, 10:+170->218, 18:+225->273, 26:+281->329, 34:+337->385, 42:+396->444, 50:+455->503, 58:+514->562, 74:+573->621, 82:+605->653, 98:+637->685, 106:+669->717, 114:+702->750, 125:+783->831, 130:+812->860, 136:+873->921, 144:+903->951
    //   197: aload_1
    //   198: aload 5
    //   200: aload_2
    //   201: iload 14
    //   203: invokevirtual 88	com/google/analytics/a/a/q:a	(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/m;Lcom/google/tagmanager/a/o;I)Z
    //   206: ifne +764 -> 970
    //   209: iconst_1
    //   210: istore 15
    //   212: iload_3
    //   213: istore 16
    //   215: goto +1309 -> 1524
    //   218: aload_1
    //   219: invokevirtual 91	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   222: astore 41
    //   224: iload_3
    //   225: iconst_1
    //   226: iand
    //   227: iconst_1
    //   228: if_icmpeq +1290 -> 1518
    //   231: aload_0
    //   232: new 93	com/google/tagmanager/a/ah
    //   235: dup
    //   236: invokespecial 94	com/google/tagmanager/a/ah:<init>	()V
    //   239: putfield 96	com/google/analytics/a/a/q:f	Lcom/google/tagmanager/a/ai;
    //   242: iload_3
    //   243: iconst_1
    //   244: ior
    //   245: istore 18
    //   247: aload_0
    //   248: getfield 96	com/google/analytics/a/a/q:f	Lcom/google/tagmanager/a/ai;
    //   251: aload 41
    //   253: invokeinterface 101 2 0
    //   258: iload 6
    //   260: istore 42
    //   262: iload 18
    //   264: istore 16
    //   266: iload 42
    //   268: istore 15
    //   270: goto +1254 -> 1524
    //   273: iload_3
    //   274: iconst_2
    //   275: iand
    //   276: iconst_2
    //   277: if_icmpeq +1235 -> 1512
    //   280: aload_0
    //   281: new 103	java/util/ArrayList
    //   284: dup
    //   285: invokespecial 104	java/util/ArrayList:<init>	()V
    //   288: putfield 106	com/google/analytics/a/a/q:g	Ljava/util/List;
    //   291: iload_3
    //   292: iconst_2
    //   293: ior
    //   294: istore 18
    //   296: aload_0
    //   297: getfield 106	com/google/analytics/a/a/q:g	Ljava/util/List;
    //   300: aload_1
    //   301: getstatic 109	com/google/analytics/b/a/a/c:a	Lcom/google/tagmanager/a/aq;
    //   304: aload_2
    //   305: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   308: invokeinterface 118 2 0
    //   313: pop
    //   314: iload 6
    //   316: istore 40
    //   318: iload 18
    //   320: istore 16
    //   322: iload 40
    //   324: istore 15
    //   326: goto +1198 -> 1524
    //   329: iload_3
    //   330: iconst_4
    //   331: iand
    //   332: iconst_4
    //   333: if_icmpeq +1173 -> 1506
    //   336: aload_0
    //   337: new 103	java/util/ArrayList
    //   340: dup
    //   341: invokespecial 104	java/util/ArrayList:<init>	()V
    //   344: putfield 120	com/google/analytics/a/a/q:h	Ljava/util/List;
    //   347: iload_3
    //   348: iconst_4
    //   349: ior
    //   350: istore 18
    //   352: aload_0
    //   353: getfield 120	com/google/analytics/a/a/q:h	Ljava/util/List;
    //   356: aload_1
    //   357: getstatic 123	com/google/analytics/a/a/m:a	Lcom/google/tagmanager/a/aq;
    //   360: aload_2
    //   361: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   364: invokeinterface 118 2 0
    //   369: pop
    //   370: iload 6
    //   372: istore 38
    //   374: iload 18
    //   376: istore 16
    //   378: iload 38
    //   380: istore 15
    //   382: goto +1142 -> 1524
    //   385: iload_3
    //   386: bipush 8
    //   388: iand
    //   389: bipush 8
    //   391: if_icmpeq +1109 -> 1500
    //   394: aload_0
    //   395: new 103	java/util/ArrayList
    //   398: dup
    //   399: invokespecial 104	java/util/ArrayList:<init>	()V
    //   402: putfield 125	com/google/analytics/a/a/q:i	Ljava/util/List;
    //   405: iload_3
    //   406: bipush 8
    //   408: ior
    //   409: istore 18
    //   411: aload_0
    //   412: getfield 125	com/google/analytics/a/a/q:i	Ljava/util/List;
    //   415: aload_1
    //   416: getstatic 128	com/google/analytics/a/a/i:a	Lcom/google/tagmanager/a/aq;
    //   419: aload_2
    //   420: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   423: invokeinterface 118 2 0
    //   428: pop
    //   429: iload 6
    //   431: istore 36
    //   433: iload 18
    //   435: istore 16
    //   437: iload 36
    //   439: istore 15
    //   441: goto +1083 -> 1524
    //   444: iload_3
    //   445: bipush 16
    //   447: iand
    //   448: bipush 16
    //   450: if_icmpeq +1044 -> 1494
    //   453: aload_0
    //   454: new 103	java/util/ArrayList
    //   457: dup
    //   458: invokespecial 104	java/util/ArrayList:<init>	()V
    //   461: putfield 130	com/google/analytics/a/a/q:j	Ljava/util/List;
    //   464: iload_3
    //   465: bipush 16
    //   467: ior
    //   468: istore 18
    //   470: aload_0
    //   471: getfield 130	com/google/analytics/a/a/q:j	Ljava/util/List;
    //   474: aload_1
    //   475: getstatic 128	com/google/analytics/a/a/i:a	Lcom/google/tagmanager/a/aq;
    //   478: aload_2
    //   479: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   482: invokeinterface 118 2 0
    //   487: pop
    //   488: iload 6
    //   490: istore 34
    //   492: iload 18
    //   494: istore 16
    //   496: iload 34
    //   498: istore 15
    //   500: goto +1024 -> 1524
    //   503: iload_3
    //   504: bipush 32
    //   506: iand
    //   507: bipush 32
    //   509: if_icmpeq +979 -> 1488
    //   512: aload_0
    //   513: new 103	java/util/ArrayList
    //   516: dup
    //   517: invokespecial 104	java/util/ArrayList:<init>	()V
    //   520: putfield 132	com/google/analytics/a/a/q:k	Ljava/util/List;
    //   523: iload_3
    //   524: bipush 32
    //   526: ior
    //   527: istore 18
    //   529: aload_0
    //   530: getfield 132	com/google/analytics/a/a/q:k	Ljava/util/List;
    //   533: aload_1
    //   534: getstatic 128	com/google/analytics/a/a/i:a	Lcom/google/tagmanager/a/aq;
    //   537: aload_2
    //   538: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   541: invokeinterface 118 2 0
    //   546: pop
    //   547: iload 6
    //   549: istore 32
    //   551: iload 18
    //   553: istore 16
    //   555: iload 32
    //   557: istore 15
    //   559: goto +965 -> 1524
    //   562: iload_3
    //   563: bipush 64
    //   565: iand
    //   566: bipush 64
    //   568: if_icmpeq +914 -> 1482
    //   571: aload_0
    //   572: new 103	java/util/ArrayList
    //   575: dup
    //   576: invokespecial 104	java/util/ArrayList:<init>	()V
    //   579: putfield 134	com/google/analytics/a/a/q:l	Ljava/util/List;
    //   582: iload_3
    //   583: bipush 64
    //   585: ior
    //   586: istore 18
    //   588: aload_0
    //   589: getfield 134	com/google/analytics/a/a/q:l	Ljava/util/List;
    //   592: aload_1
    //   593: getstatic 137	com/google/analytics/a/a/u:a	Lcom/google/tagmanager/a/aq;
    //   596: aload_2
    //   597: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   600: invokeinterface 118 2 0
    //   605: pop
    //   606: iload 6
    //   608: istore 30
    //   610: iload 18
    //   612: istore 16
    //   614: iload 30
    //   616: istore 15
    //   618: goto +906 -> 1524
    //   621: aload_1
    //   622: invokevirtual 91	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   625: astore 28
    //   627: aload_0
    //   628: iconst_1
    //   629: aload_0
    //   630: getfield 139	com/google/analytics/a/a/q:e	I
    //   633: ior
    //   634: putfield 139	com/google/analytics/a/a/q:e	I
    //   637: aload_0
    //   638: aload 28
    //   640: putfield 141	com/google/analytics/a/a/q:m	Ljava/lang/Object;
    //   643: iload 6
    //   645: istore 15
    //   647: iload_3
    //   648: istore 16
    //   650: goto +874 -> 1524
    //   653: aload_1
    //   654: invokevirtual 91	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   657: astore 27
    //   659: aload_0
    //   660: iconst_2
    //   661: aload_0
    //   662: getfield 139	com/google/analytics/a/a/q:e	I
    //   665: ior
    //   666: putfield 139	com/google/analytics/a/a/q:e	I
    //   669: aload_0
    //   670: aload 27
    //   672: putfield 143	com/google/analytics/a/a/q:n	Ljava/lang/Object;
    //   675: iload 6
    //   677: istore 15
    //   679: iload_3
    //   680: istore 16
    //   682: goto +842 -> 1524
    //   685: aload_1
    //   686: invokevirtual 91	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   689: astore 26
    //   691: aload_0
    //   692: iconst_4
    //   693: aload_0
    //   694: getfield 139	com/google/analytics/a/a/q:e	I
    //   697: ior
    //   698: putfield 139	com/google/analytics/a/a/q:e	I
    //   701: aload_0
    //   702: aload 26
    //   704: putfield 145	com/google/analytics/a/a/q:o	Ljava/lang/Object;
    //   707: iload 6
    //   709: istore 15
    //   711: iload_3
    //   712: istore 16
    //   714: goto +810 -> 1524
    //   717: aload_1
    //   718: invokevirtual 91	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   721: astore 25
    //   723: aload_0
    //   724: bipush 8
    //   726: aload_0
    //   727: getfield 139	com/google/analytics/a/a/q:e	I
    //   730: ior
    //   731: putfield 139	com/google/analytics/a/a/q:e	I
    //   734: aload_0
    //   735: aload 25
    //   737: putfield 147	com/google/analytics/a/a/q:p	Ljava/lang/Object;
    //   740: iload 6
    //   742: istore 15
    //   744: iload_3
    //   745: istore 16
    //   747: goto +777 -> 1524
    //   750: bipush 16
    //   752: aload_0
    //   753: getfield 139	com/google/analytics/a/a/q:e	I
    //   756: iand
    //   757: bipush 16
    //   759: if_icmpne +717 -> 1476
    //   762: aload_0
    //   763: getfield 149	com/google/analytics/a/a/q:q	Lcom/google/analytics/a/a/c;
    //   766: invokevirtual 154	com/google/analytics/a/a/c:m	()Lcom/google/analytics/a/a/e;
    //   769: astore 23
    //   771: aload_0
    //   772: aload_1
    //   773: getstatic 155	com/google/analytics/a/a/c:a	Lcom/google/tagmanager/a/aq;
    //   776: aload_2
    //   777: invokevirtual 112	com/google/tagmanager/a/k:a	(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    //   780: checkcast 151	com/google/analytics/a/a/c
    //   783: putfield 149	com/google/analytics/a/a/q:q	Lcom/google/analytics/a/a/c;
    //   786: aload 23
    //   788: ifnull +22 -> 810
    //   791: aload 23
    //   793: aload_0
    //   794: getfield 149	com/google/analytics/a/a/q:q	Lcom/google/analytics/a/a/c;
    //   797: invokevirtual 160	com/google/analytics/a/a/e:a	(Lcom/google/analytics/a/a/c;)Lcom/google/analytics/a/a/e;
    //   800: pop
    //   801: aload_0
    //   802: aload 23
    //   804: invokevirtual 163	com/google/analytics/a/a/e:d	()Lcom/google/analytics/a/a/c;
    //   807: putfield 149	com/google/analytics/a/a/q:q	Lcom/google/analytics/a/a/c;
    //   810: aload_0
    //   811: bipush 16
    //   813: aload_0
    //   814: getfield 139	com/google/analytics/a/a/q:e	I
    //   817: ior
    //   818: putfield 139	com/google/analytics/a/a/q:e	I
    //   821: iload 6
    //   823: istore 15
    //   825: iload_3
    //   826: istore 16
    //   828: goto +696 -> 1524
    //   831: aload_0
    //   832: bipush 32
    //   834: aload_0
    //   835: getfield 139	com/google/analytics/a/a/q:e	I
    //   838: ior
    //   839: putfield 139	com/google/analytics/a/a/q:e	I
    //   842: aload_0
    //   843: aload_1
    //   844: invokevirtual 166	com/google/tagmanager/a/k:c	()F
    //   847: putfield 168	com/google/analytics/a/a/q:r	F
    //   850: iload 6
    //   852: istore 15
    //   854: iload_3
    //   855: istore 16
    //   857: goto +667 -> 1524
    //   860: aload_1
    //   861: invokevirtual 91	com/google/tagmanager/a/k:l	()Lcom/google/tagmanager/a/h;
    //   864: astore 17
    //   866: iload_3
    //   867: sipush 16384
    //   870: iand
    //   871: sipush 16384
    //   874: if_icmpeq +596 -> 1470
    //   877: aload_0
    //   878: new 93	com/google/tagmanager/a/ah
    //   881: dup
    //   882: invokespecial 94	com/google/tagmanager/a/ah:<init>	()V
    //   885: putfield 170	com/google/analytics/a/a/q:t	Lcom/google/tagmanager/a/ai;
    //   888: iload_3
    //   889: sipush 16384
    //   892: ior
    //   893: istore 18
    //   895: aload_0
    //   896: getfield 170	com/google/analytics/a/a/q:t	Lcom/google/tagmanager/a/ai;
    //   899: aload 17
    //   901: invokeinterface 101 2 0
    //   906: iload 6
    //   908: istore 22
    //   910: iload 18
    //   912: istore 16
    //   914: iload 22
    //   916: istore 15
    //   918: goto +606 -> 1524
    //   921: aload_0
    //   922: sipush 128
    //   925: aload_0
    //   926: getfield 139	com/google/analytics/a/a/q:e	I
    //   929: ior
    //   930: putfield 139	com/google/analytics/a/a/q:e	I
    //   933: aload_0
    //   934: aload_1
    //   935: invokevirtual 172	com/google/tagmanager/a/k:f	()I
    //   938: putfield 174	com/google/analytics/a/a/q:u	I
    //   941: iload 6
    //   943: istore 15
    //   945: iload_3
    //   946: istore 16
    //   948: goto +576 -> 1524
    //   951: aload_0
    //   952: bipush 64
    //   954: aload_0
    //   955: getfield 139	com/google/analytics/a/a/q:e	I
    //   958: ior
    //   959: putfield 139	com/google/analytics/a/a/q:e	I
    //   962: aload_0
    //   963: aload_1
    //   964: invokevirtual 177	com/google/tagmanager/a/k:i	()Z
    //   967: putfield 179	com/google/analytics/a/a/q:s	Z
    //   970: iload 6
    //   972: istore 15
    //   974: iload_3
    //   975: istore 16
    //   977: goto +547 -> 1524
    //   980: iload_3
    //   981: iconst_1
    //   982: iand
    //   983: iconst_1
    //   984: if_icmpne +18 -> 1002
    //   987: aload_0
    //   988: new 181	com/google/tagmanager/a/bg
    //   991: dup
    //   992: aload_0
    //   993: getfield 96	com/google/analytics/a/a/q:f	Lcom/google/tagmanager/a/ai;
    //   996: invokespecial 184	com/google/tagmanager/a/bg:<init>	(Lcom/google/tagmanager/a/ai;)V
    //   999: putfield 96	com/google/analytics/a/a/q:f	Lcom/google/tagmanager/a/ai;
    //   1002: iload_3
    //   1003: iconst_2
    //   1004: iand
    //   1005: iconst_2
    //   1006: if_icmpne +14 -> 1020
    //   1009: aload_0
    //   1010: aload_0
    //   1011: getfield 106	com/google/analytics/a/a/q:g	Ljava/util/List;
    //   1014: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1017: putfield 106	com/google/analytics/a/a/q:g	Ljava/util/List;
    //   1020: iload_3
    //   1021: iconst_4
    //   1022: iand
    //   1023: iconst_4
    //   1024: if_icmpne +14 -> 1038
    //   1027: aload_0
    //   1028: aload_0
    //   1029: getfield 120	com/google/analytics/a/a/q:h	Ljava/util/List;
    //   1032: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1035: putfield 120	com/google/analytics/a/a/q:h	Ljava/util/List;
    //   1038: iload_3
    //   1039: bipush 8
    //   1041: iand
    //   1042: bipush 8
    //   1044: if_icmpne +14 -> 1058
    //   1047: aload_0
    //   1048: aload_0
    //   1049: getfield 125	com/google/analytics/a/a/q:i	Ljava/util/List;
    //   1052: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1055: putfield 125	com/google/analytics/a/a/q:i	Ljava/util/List;
    //   1058: iload_3
    //   1059: bipush 16
    //   1061: iand
    //   1062: bipush 16
    //   1064: if_icmpne +14 -> 1078
    //   1067: aload_0
    //   1068: aload_0
    //   1069: getfield 130	com/google/analytics/a/a/q:j	Ljava/util/List;
    //   1072: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1075: putfield 130	com/google/analytics/a/a/q:j	Ljava/util/List;
    //   1078: iload_3
    //   1079: bipush 32
    //   1081: iand
    //   1082: bipush 32
    //   1084: if_icmpne +14 -> 1098
    //   1087: aload_0
    //   1088: aload_0
    //   1089: getfield 132	com/google/analytics/a/a/q:k	Ljava/util/List;
    //   1092: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1095: putfield 132	com/google/analytics/a/a/q:k	Ljava/util/List;
    //   1098: iload_3
    //   1099: bipush 64
    //   1101: iand
    //   1102: bipush 64
    //   1104: if_icmpne +14 -> 1118
    //   1107: aload_0
    //   1108: aload_0
    //   1109: getfield 134	com/google/analytics/a/a/q:l	Ljava/util/List;
    //   1112: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1115: putfield 134	com/google/analytics/a/a/q:l	Ljava/util/List;
    //   1118: iload_3
    //   1119: sipush 16384
    //   1122: iand
    //   1123: sipush 16384
    //   1126: if_icmpne +18 -> 1144
    //   1129: aload_0
    //   1130: new 181	com/google/tagmanager/a/bg
    //   1133: dup
    //   1134: aload_0
    //   1135: getfield 170	com/google/analytics/a/a/q:t	Lcom/google/tagmanager/a/ai;
    //   1138: invokespecial 184	com/google/tagmanager/a/bg:<init>	(Lcom/google/tagmanager/a/ai;)V
    //   1141: putfield 170	com/google/analytics/a/a/q:t	Lcom/google/tagmanager/a/ai;
    //   1144: aload 5
    //   1146: invokevirtual 192	com/google/tagmanager/a/m:a	()V
    //   1149: aload_0
    //   1150: aload 4
    //   1152: invokevirtual 196	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1155: putfield 198	com/google/analytics/a/a/q:d	Lcom/google/tagmanager/a/h;
    //   1158: aload_0
    //   1159: invokevirtual 201	com/google/analytics/a/a/q:R	()V
    //   1162: return
    //   1163: astore 8
    //   1165: aload_0
    //   1166: aload 4
    //   1168: invokevirtual 196	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1171: putfield 198	com/google/analytics/a/a/q:d	Lcom/google/tagmanager/a/h;
    //   1174: goto -16 -> 1158
    //   1177: astore 7
    //   1179: aload_0
    //   1180: aload 4
    //   1182: invokevirtual 196	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1185: putfield 198	com/google/analytics/a/a/q:d	Lcom/google/tagmanager/a/h;
    //   1188: aload 7
    //   1190: athrow
    //   1191: astore 13
    //   1193: aload 13
    //   1195: aload_0
    //   1196: invokevirtual 204	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   1199: athrow
    //   1200: astore 10
    //   1202: iload_3
    //   1203: iconst_1
    //   1204: iand
    //   1205: iconst_1
    //   1206: if_icmpne +18 -> 1224
    //   1209: aload_0
    //   1210: new 181	com/google/tagmanager/a/bg
    //   1213: dup
    //   1214: aload_0
    //   1215: getfield 96	com/google/analytics/a/a/q:f	Lcom/google/tagmanager/a/ai;
    //   1218: invokespecial 184	com/google/tagmanager/a/bg:<init>	(Lcom/google/tagmanager/a/ai;)V
    //   1221: putfield 96	com/google/analytics/a/a/q:f	Lcom/google/tagmanager/a/ai;
    //   1224: iload_3
    //   1225: iconst_2
    //   1226: iand
    //   1227: iconst_2
    //   1228: if_icmpne +14 -> 1242
    //   1231: aload_0
    //   1232: aload_0
    //   1233: getfield 106	com/google/analytics/a/a/q:g	Ljava/util/List;
    //   1236: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1239: putfield 106	com/google/analytics/a/a/q:g	Ljava/util/List;
    //   1242: iload_3
    //   1243: iconst_4
    //   1244: iand
    //   1245: iconst_4
    //   1246: if_icmpne +14 -> 1260
    //   1249: aload_0
    //   1250: aload_0
    //   1251: getfield 120	com/google/analytics/a/a/q:h	Ljava/util/List;
    //   1254: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1257: putfield 120	com/google/analytics/a/a/q:h	Ljava/util/List;
    //   1260: iload_3
    //   1261: bipush 8
    //   1263: iand
    //   1264: bipush 8
    //   1266: if_icmpne +14 -> 1280
    //   1269: aload_0
    //   1270: aload_0
    //   1271: getfield 125	com/google/analytics/a/a/q:i	Ljava/util/List;
    //   1274: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1277: putfield 125	com/google/analytics/a/a/q:i	Ljava/util/List;
    //   1280: iload_3
    //   1281: bipush 16
    //   1283: iand
    //   1284: bipush 16
    //   1286: if_icmpne +14 -> 1300
    //   1289: aload_0
    //   1290: aload_0
    //   1291: getfield 130	com/google/analytics/a/a/q:j	Ljava/util/List;
    //   1294: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1297: putfield 130	com/google/analytics/a/a/q:j	Ljava/util/List;
    //   1300: iload_3
    //   1301: bipush 32
    //   1303: iand
    //   1304: bipush 32
    //   1306: if_icmpne +14 -> 1320
    //   1309: aload_0
    //   1310: aload_0
    //   1311: getfield 132	com/google/analytics/a/a/q:k	Ljava/util/List;
    //   1314: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1317: putfield 132	com/google/analytics/a/a/q:k	Ljava/util/List;
    //   1320: iload_3
    //   1321: bipush 64
    //   1323: iand
    //   1324: bipush 64
    //   1326: if_icmpne +14 -> 1340
    //   1329: aload_0
    //   1330: aload_0
    //   1331: getfield 134	com/google/analytics/a/a/q:l	Ljava/util/List;
    //   1334: invokestatic 190	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   1337: putfield 134	com/google/analytics/a/a/q:l	Ljava/util/List;
    //   1340: iload_3
    //   1341: sipush 16384
    //   1344: iand
    //   1345: sipush 16384
    //   1348: if_icmpne +18 -> 1366
    //   1351: aload_0
    //   1352: new 181	com/google/tagmanager/a/bg
    //   1355: dup
    //   1356: aload_0
    //   1357: getfield 170	com/google/analytics/a/a/q:t	Lcom/google/tagmanager/a/ai;
    //   1360: invokespecial 184	com/google/tagmanager/a/bg:<init>	(Lcom/google/tagmanager/a/ai;)V
    //   1363: putfield 170	com/google/analytics/a/a/q:t	Lcom/google/tagmanager/a/ai;
    //   1366: aload 5
    //   1368: invokevirtual 192	com/google/tagmanager/a/m:a	()V
    //   1371: aload_0
    //   1372: aload 4
    //   1374: invokevirtual 196	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1377: putfield 198	com/google/analytics/a/a/q:d	Lcom/google/tagmanager/a/h;
    //   1380: aload_0
    //   1381: invokevirtual 201	com/google/analytics/a/a/q:R	()V
    //   1384: aload 10
    //   1386: athrow
    //   1387: astore 9
    //   1389: new 63	com/google/tagmanager/a/af
    //   1392: dup
    //   1393: aload 9
    //   1395: invokevirtual 208	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1398: invokespecial 211	com/google/tagmanager/a/af:<init>	(Ljava/lang/String;)V
    //   1401: aload_0
    //   1402: invokevirtual 204	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   1405: athrow
    //   1406: astore 12
    //   1408: aload_0
    //   1409: aload 4
    //   1411: invokevirtual 196	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1414: putfield 198	com/google/analytics/a/a/q:d	Lcom/google/tagmanager/a/h;
    //   1417: goto -37 -> 1380
    //   1420: astore 11
    //   1422: aload_0
    //   1423: aload 4
    //   1425: invokevirtual 196	com/google/tagmanager/a/j:a	()Lcom/google/tagmanager/a/h;
    //   1428: putfield 198	com/google/analytics/a/a/q:d	Lcom/google/tagmanager/a/h;
    //   1431: aload 11
    //   1433: athrow
    //   1434: astore 21
    //   1436: iload 18
    //   1438: istore_3
    //   1439: aload 21
    //   1441: astore 10
    //   1443: goto -241 -> 1202
    //   1446: astore 20
    //   1448: iload 18
    //   1450: istore_3
    //   1451: aload 20
    //   1453: astore 9
    //   1455: goto -66 -> 1389
    //   1458: astore 19
    //   1460: iload 18
    //   1462: istore_3
    //   1463: aload 19
    //   1465: astore 13
    //   1467: goto -274 -> 1193
    //   1470: iload_3
    //   1471: istore 18
    //   1473: goto -578 -> 895
    //   1476: aconst_null
    //   1477: astore 23
    //   1479: goto -708 -> 771
    //   1482: iload_3
    //   1483: istore 18
    //   1485: goto -897 -> 588
    //   1488: iload_3
    //   1489: istore 18
    //   1491: goto -962 -> 529
    //   1494: iload_3
    //   1495: istore 18
    //   1497: goto -1027 -> 470
    //   1500: iload_3
    //   1501: istore 18
    //   1503: goto -1092 -> 411
    //   1506: iload_3
    //   1507: istore 18
    //   1509: goto -1157 -> 352
    //   1512: iload_3
    //   1513: istore 18
    //   1515: goto -1219 -> 296
    //   1518: iload_3
    //   1519: istore 18
    //   1521: goto -1274 -> 247
    //   1524: iload 16
    //   1526: istore_3
    //   1527: iload 15
    //   1529: istore 6
    //   1531: goto -1496 -> 35
    //   1534: iconst_1
    //   1535: istore 15
    //   1537: iload_3
    //   1538: istore 16
    //   1540: goto -16 -> 1524
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1543	0	this	q
    //   0	1543	1	paramk	com.google.tagmanager.a.k
    //   0	1543	2	paramo	com.google.tagmanager.a.o
    //   19	1519	3	i1	int
    //   23	1401	4	localj	com.google.tagmanager.a.j
    //   30	1337	5	localm	com.google.tagmanager.a.m
    //   33	1497	6	i2	int
    //   1177	12	7	localObject1	Object
    //   1163	1	8	localIOException1	java.io.IOException
    //   1387	7	9	localIOException2	java.io.IOException
    //   1453	1	9	localObject2	Object
    //   1200	185	10	localObject3	Object
    //   1441	1	10	localObject4	Object
    //   1420	12	11	localObject5	Object
    //   1406	1	12	localIOException3	java.io.IOException
    //   1191	3	13	localaf1	com.google.tagmanager.a.af
    //   1465	1	13	localObject6	Object
    //   44	158	14	i3	int
    //   210	1326	15	i4	int
    //   213	1326	16	i5	int
    //   864	36	17	localh1	h
    //   245	1275	18	i6	int
    //   1458	6	19	localaf2	com.google.tagmanager.a.af
    //   1446	6	20	localIOException4	java.io.IOException
    //   1434	6	21	localObject7	Object
    //   908	7	22	i7	int
    //   769	709	23	locale	e
    //   721	15	25	localh2	h
    //   689	14	26	localh3	h
    //   657	14	27	localh4	h
    //   625	14	28	localh5	h
    //   608	7	30	i8	int
    //   549	7	32	i9	int
    //   490	7	34	i10	int
    //   431	7	36	i11	int
    //   372	7	38	i12	int
    //   316	7	40	i13	int
    //   222	30	41	localh6	h
    //   260	7	42	i14	int
    // Exception table:
    //   from	to	target	type
    //   1144	1149	1163	java/io/IOException
    //   1144	1149	1177	finally
    //   40	46	1191	com/google/tagmanager/a/af
    //   196	209	1191	com/google/tagmanager/a/af
    //   218	224	1191	com/google/tagmanager/a/af
    //   231	242	1191	com/google/tagmanager/a/af
    //   280	291	1191	com/google/tagmanager/a/af
    //   336	347	1191	com/google/tagmanager/a/af
    //   394	405	1191	com/google/tagmanager/a/af
    //   453	464	1191	com/google/tagmanager/a/af
    //   512	523	1191	com/google/tagmanager/a/af
    //   571	582	1191	com/google/tagmanager/a/af
    //   621	643	1191	com/google/tagmanager/a/af
    //   653	675	1191	com/google/tagmanager/a/af
    //   685	707	1191	com/google/tagmanager/a/af
    //   717	740	1191	com/google/tagmanager/a/af
    //   750	771	1191	com/google/tagmanager/a/af
    //   771	786	1191	com/google/tagmanager/a/af
    //   791	810	1191	com/google/tagmanager/a/af
    //   810	821	1191	com/google/tagmanager/a/af
    //   831	850	1191	com/google/tagmanager/a/af
    //   860	866	1191	com/google/tagmanager/a/af
    //   877	888	1191	com/google/tagmanager/a/af
    //   921	941	1191	com/google/tagmanager/a/af
    //   951	970	1191	com/google/tagmanager/a/af
    //   40	46	1200	finally
    //   196	209	1200	finally
    //   218	224	1200	finally
    //   231	242	1200	finally
    //   280	291	1200	finally
    //   336	347	1200	finally
    //   394	405	1200	finally
    //   453	464	1200	finally
    //   512	523	1200	finally
    //   571	582	1200	finally
    //   621	643	1200	finally
    //   653	675	1200	finally
    //   685	707	1200	finally
    //   717	740	1200	finally
    //   750	771	1200	finally
    //   771	786	1200	finally
    //   791	810	1200	finally
    //   810	821	1200	finally
    //   831	850	1200	finally
    //   860	866	1200	finally
    //   877	888	1200	finally
    //   921	941	1200	finally
    //   951	970	1200	finally
    //   1193	1200	1200	finally
    //   1389	1406	1200	finally
    //   40	46	1387	java/io/IOException
    //   196	209	1387	java/io/IOException
    //   218	224	1387	java/io/IOException
    //   231	242	1387	java/io/IOException
    //   280	291	1387	java/io/IOException
    //   336	347	1387	java/io/IOException
    //   394	405	1387	java/io/IOException
    //   453	464	1387	java/io/IOException
    //   512	523	1387	java/io/IOException
    //   571	582	1387	java/io/IOException
    //   621	643	1387	java/io/IOException
    //   653	675	1387	java/io/IOException
    //   685	707	1387	java/io/IOException
    //   717	740	1387	java/io/IOException
    //   750	771	1387	java/io/IOException
    //   771	786	1387	java/io/IOException
    //   791	810	1387	java/io/IOException
    //   810	821	1387	java/io/IOException
    //   831	850	1387	java/io/IOException
    //   860	866	1387	java/io/IOException
    //   877	888	1387	java/io/IOException
    //   921	941	1387	java/io/IOException
    //   951	970	1387	java/io/IOException
    //   1366	1371	1406	java/io/IOException
    //   1366	1371	1420	finally
    //   247	258	1434	finally
    //   296	314	1434	finally
    //   352	370	1434	finally
    //   411	429	1434	finally
    //   470	488	1434	finally
    //   529	547	1434	finally
    //   588	606	1434	finally
    //   895	906	1434	finally
    //   247	258	1446	java/io/IOException
    //   296	314	1446	java/io/IOException
    //   352	370	1446	java/io/IOException
    //   411	429	1446	java/io/IOException
    //   470	488	1446	java/io/IOException
    //   529	547	1446	java/io/IOException
    //   588	606	1446	java/io/IOException
    //   895	906	1446	java/io/IOException
    //   247	258	1458	com/google/tagmanager/a/af
    //   296	314	1458	com/google/tagmanager/a/af
    //   352	370	1458	com/google/tagmanager/a/af
    //   411	429	1458	com/google/tagmanager/a/af
    //   470	488	1458	com/google/tagmanager/a/af
    //   529	547	1458	com/google/tagmanager/a/af
    //   588	606	1458	com/google/tagmanager/a/af
    //   895	906	1458	com/google/tagmanager/a/af
  }
  
  private q(v paramv)
  {
    super(paramv);
    this.d = paramv.r();
  }
  
  private q(boolean paramBoolean)
  {
    this.d = h.a;
  }
  
  public static s N()
  {
    return s.o();
  }
  
  private void S()
  {
    this.f = ah.a;
    this.g = Collections.emptyList();
    this.h = Collections.emptyList();
    this.i = Collections.emptyList();
    this.j = Collections.emptyList();
    this.k = Collections.emptyList();
    this.l = Collections.emptyList();
    this.m = "";
    this.n = "";
    this.o = "0";
    this.p = "";
    this.q = c.a();
    this.r = 0.0F;
    this.s = false;
    this.t = ah.a;
    this.u = 0;
  }
  
  public static q a()
  {
    return c;
  }
  
  public static s a(q paramq)
  {
    return N().a(paramq);
  }
  
  public String A()
  {
    Object localObject = this.o;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    h localh = (h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.o = str;
    }
    return str;
  }
  
  public boolean B()
  {
    return (0x8 & this.e) == 8;
  }
  
  public String C()
  {
    Object localObject = this.p;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    h localh = (h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.p = str;
    }
    return str;
  }
  
  public boolean D()
  {
    return (0x10 & this.e) == 16;
  }
  
  public c E()
  {
    return this.q;
  }
  
  public boolean F()
  {
    return (0x20 & this.e) == 32;
  }
  
  public float G()
  {
    return this.r;
  }
  
  public boolean H()
  {
    return (0x40 & this.e) == 64;
  }
  
  public boolean I()
  {
    return this.s;
  }
  
  public List J()
  {
    return this.t;
  }
  
  public int K()
  {
    return this.t.size();
  }
  
  public boolean L()
  {
    return (0x80 & this.e) == 128;
  }
  
  public int M()
  {
    return this.u;
  }
  
  public s O()
  {
    return N();
  }
  
  public s P()
  {
    return a(this);
  }
  
  public com.google.analytics.b.a.a.c a(int paramInt)
  {
    return (com.google.analytics.b.a.a.c)this.g.get(paramInt);
  }
  
  public m b(int paramInt)
  {
    return (m)this.h.get(paramInt);
  }
  
  public q b()
  {
    return c;
  }
  
  public i c(int paramInt)
  {
    return (i)this.i.get(paramInt);
  }
  
  public aq c()
  {
    return a;
  }
  
  public i d(int paramInt)
  {
    return (i)this.j.get(paramInt);
  }
  
  public List d()
  {
    return this.f;
  }
  
  public int e()
  {
    return this.f.size();
  }
  
  public i e(int paramInt)
  {
    return (i)this.k.get(paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof q)) {
      return super.equals(paramObject);
    }
    q localq = (q)paramObject;
    int i1;
    label43:
    int i2;
    label66:
    int i3;
    label90:
    int i4;
    label114:
    int i5;
    label138:
    int i6;
    label162:
    int i7;
    label186:
    int i8;
    label205:
    label234:
    int i9;
    label253:
    int i10;
    label282:
    label301:
    label330:
    int i11;
    label349:
    label378:
    int i12;
    label397:
    label426:
    int i13;
    label445:
    label477:
    int i14;
    label496:
    int i15;
    if (d().equals(localq.d()))
    {
      i1 = 1;
      if ((i1 == 0) || (!f().equals(localq.f()))) {
        break label595;
      }
      i2 = 1;
      if ((i2 == 0) || (!h().equals(localq.h()))) {
        break label601;
      }
      i3 = 1;
      if ((i3 == 0) || (!k().equals(localq.k()))) {
        break label607;
      }
      i4 = 1;
      if ((i4 == 0) || (!m().equals(localq.m()))) {
        break label613;
      }
      i5 = 1;
      if ((i5 == 0) || (!r().equals(localq.r()))) {
        break label619;
      }
      i6 = 1;
      if ((i6 == 0) || (!t().equals(localq.t()))) {
        break label625;
      }
      i7 = 1;
      if ((i7 == 0) || (v() != localq.v())) {
        break label631;
      }
      i8 = 1;
      if (v())
      {
        if ((i8 == 0) || (!w().equals(localq.w()))) {
          break label637;
        }
        i8 = 1;
      }
      if ((i8 == 0) || (x() != localq.x())) {
        break label643;
      }
      i9 = 1;
      if (x())
      {
        if ((i9 == 0) || (!y().equals(localq.y()))) {
          break label649;
        }
        i9 = 1;
      }
      if ((i9 == 0) || (z() != localq.z())) {
        break label655;
      }
      i10 = 1;
      if (z())
      {
        if ((i10 == 0) || (!A().equals(localq.A()))) {
          break label661;
        }
        i10 = 1;
      }
      if ((i10 == 0) || (B() != localq.B())) {
        break label667;
      }
      i11 = 1;
      if (B())
      {
        if ((i11 == 0) || (!C().equals(localq.C()))) {
          break label673;
        }
        i11 = 1;
      }
      if ((i11 == 0) || (D() != localq.D())) {
        break label679;
      }
      i12 = 1;
      if (D())
      {
        if ((i12 == 0) || (!E().equals(localq.E()))) {
          break label685;
        }
        i12 = 1;
      }
      if ((i12 == 0) || (F() != localq.F())) {
        break label691;
      }
      i13 = 1;
      if (F())
      {
        if ((i13 == 0) || (Float.floatToIntBits(G()) != Float.floatToIntBits(localq.G()))) {
          break label697;
        }
        i13 = 1;
      }
      if ((i13 == 0) || (H() != localq.H())) {
        break label703;
      }
      i14 = 1;
      if (H())
      {
        if ((i14 == 0) || (I() != localq.I())) {
          break label709;
        }
        i14 = 1;
      }
      label522:
      if ((i14 == 0) || (!J().equals(localq.J()))) {
        break label715;
      }
      i15 = 1;
      label546:
      if ((i15 == 0) || (L() != localq.L())) {
        break label721;
      }
    }
    label643:
    label649:
    label655:
    label661:
    label667:
    label673:
    label679:
    label685:
    label691:
    label697:
    label703:
    label709:
    label715:
    label721:
    for (boolean bool = true;; bool = false)
    {
      if (!L()) {
        break label727;
      }
      if ((bool) && (M() == localq.M())) {
        break;
      }
      return false;
      i1 = 0;
      break label43;
      label595:
      i2 = 0;
      break label66;
      label601:
      i3 = 0;
      break label90;
      label607:
      i4 = 0;
      break label114;
      label613:
      i5 = 0;
      break label138;
      label619:
      i6 = 0;
      break label162;
      label625:
      i7 = 0;
      break label186;
      label631:
      i8 = 0;
      break label205;
      label637:
      i8 = 0;
      break label234;
      i9 = 0;
      break label253;
      i9 = 0;
      break label282;
      i10 = 0;
      break label301;
      i10 = 0;
      break label330;
      i11 = 0;
      break label349;
      i11 = 0;
      break label378;
      i12 = 0;
      break label397;
      i12 = 0;
      break label426;
      i13 = 0;
      break label445;
      i13 = 0;
      break label477;
      i14 = 0;
      break label496;
      i14 = 0;
      break label522;
      i15 = 0;
      break label546;
    }
    label727:
    return bool;
  }
  
  public List f()
  {
    return this.g;
  }
  
  public int g()
  {
    return this.g.size();
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
    int i1 = 779 + q.class.hashCode();
    if (e() > 0) {
      i1 = 53 * (1 + i1 * 37) + d().hashCode();
    }
    if (g() > 0) {
      i1 = 53 * (2 + i1 * 37) + f().hashCode();
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
    if (s() > 0) {
      i1 = 53 * (6 + i1 * 37) + r().hashCode();
    }
    if (u() > 0) {
      i1 = 53 * (7 + i1 * 37) + t().hashCode();
    }
    if (v()) {
      i1 = 53 * (9 + i1 * 37) + w().hashCode();
    }
    if (x()) {
      i1 = 53 * (10 + i1 * 37) + y().hashCode();
    }
    if (z()) {
      i1 = 53 * (12 + i1 * 37) + A().hashCode();
    }
    if (B()) {
      i1 = 53 * (13 + i1 * 37) + C().hashCode();
    }
    if (D()) {
      i1 = 53 * (14 + i1 * 37) + E().hashCode();
    }
    if (F()) {
      i1 = 53 * (15 + i1 * 37) + Float.floatToIntBits(G());
    }
    if (H()) {
      i1 = 53 * (18 + i1 * 37) + ac.a(I());
    }
    if (K() > 0) {
      i1 = 53 * (16 + i1 * 37) + J().hashCode();
    }
    if (L()) {
      i1 = 53 * (17 + i1 * 37) + M();
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
    int i2 = this.v;
    if (i2 != -1)
    {
      if (i2 == i1) {}
      for (;;)
      {
        return i1;
        i1 = 0;
      }
    }
    for (int i3 = 0; i3 < g(); i3++) {
      if (!a(i3).j())
      {
        this.v = 0;
        return false;
      }
    }
    for (int i4 = 0; i4 < i(); i4++) {
      if (!b(i4).j())
      {
        this.v = 0;
        return false;
      }
    }
    for (int i5 = 0; i5 < l(); i5++) {
      if (!c(i5).j())
      {
        this.v = 0;
        return false;
      }
    }
    for (int i6 = 0; i6 < q(); i6++) {
      if (!d(i6).j())
      {
        this.v = 0;
        return false;
      }
    }
    for (int i7 = 0; i7 < s(); i7++) {
      if (!e(i7).j())
      {
        this.v = 0;
        return false;
      }
    }
    this.v = i1;
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
  
  public List r()
  {
    return this.k;
  }
  
  public int s()
  {
    return this.k.size();
  }
  
  public List t()
  {
    return this.l;
  }
  
  public int u()
  {
    return this.l.size();
  }
  
  public boolean v()
  {
    return (0x1 & this.e) == 1;
  }
  
  public String w()
  {
    Object localObject = this.m;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    h localh = (h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.m = str;
    }
    return str;
  }
  
  public boolean x()
  {
    return (0x2 & this.e) == 2;
  }
  
  public String y()
  {
    Object localObject = this.n;
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    h localh = (h)localObject;
    String str = localh.f();
    if (localh.g()) {
      this.n = str;
    }
    return str;
  }
  
  public boolean z()
  {
    return (0x4 & this.e) == 4;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.analytics.a.a.q
 * JD-Core Version:    0.7.0.1
 */