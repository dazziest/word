package com.google.ads.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.google.ads.a.ad;
import com.google.ads.a.w;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class y
  extends ad
{
  public y(w paramw, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramw, paramMap, paramBoolean1, paramBoolean2);
  }
  
  private static WebResourceResponse a(String paramString, Context paramContext)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
    try
    {
      AdUtil.a(localHttpURLConnection, paramContext.getApplicationContext());
      localHttpURLConnection.connect();
      WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(AdUtil.a(new InputStreamReader(localHttpURLConnection.getInputStream())).getBytes("UTF-8")));
      return localWebResourceResponse;
    }
    finally
    {
      localHttpURLConnection.disconnect();
    }
  }
  
  /* Error */
  public WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, String paramString)
  {
    // Byte code:
    //   0: ldc 79
    //   2: new 81	java/io/File
    //   5: dup
    //   6: aload_2
    //   7: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 86	java/io/File:getName	()Ljava/lang/String;
    //   13: invokevirtual 90	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   16: ifeq +141 -> 157
    //   19: aload_0
    //   20: getfield 93	com/google/ads/util/y:a	Lcom/google/ads/a/w;
    //   23: invokevirtual 99	com/google/ads/a/w:j	()Lcom/google/ads/a/n;
    //   26: astore 5
    //   28: aload 5
    //   30: ifnull +107 -> 137
    //   33: aload 5
    //   35: iconst_1
    //   36: invokevirtual 105	com/google/ads/a/n:c	(Z)V
    //   39: aload_0
    //   40: getfield 93	com/google/ads/util/y:a	Lcom/google/ads/a/w;
    //   43: invokevirtual 109	com/google/ads/a/w:h	()Lcom/google/ads/bt;
    //   46: getfield 115	com/google/ads/bt:d	Lcom/google/ads/util/ad;
    //   49: invokevirtual 120	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   52: checkcast 122	com/google/ads/br
    //   55: getfield 125	com/google/ads/br:b	Lcom/google/ads/util/ad;
    //   58: invokevirtual 120	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   61: checkcast 127	com/google/ads/bs
    //   64: astore 6
    //   66: aload_0
    //   67: getfield 93	com/google/ads/util/y:a	Lcom/google/ads/a/w;
    //   70: invokevirtual 109	com/google/ads/a/w:h	()Lcom/google/ads/bt;
    //   73: invokevirtual 130	com/google/ads/bt:b	()Z
    //   76: ifne +139 -> 215
    //   79: aload_0
    //   80: getfield 133	com/google/ads/util/y:b	Z
    //   83: ifeq +81 -> 164
    //   86: aload 6
    //   88: getfield 137	com/google/ads/bs:f	Lcom/google/ads/util/ae;
    //   91: invokevirtual 140	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   94: checkcast 58	java/lang/String
    //   97: astore 10
    //   99: new 142	java/lang/StringBuilder
    //   102: dup
    //   103: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   106: ldc 146
    //   108: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: aload 10
    //   113: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: ldc 152
    //   118: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 159	com/google/ads/util/g:a	(Ljava/lang/String;)V
    //   127: aload 10
    //   129: aload_1
    //   130: invokevirtual 164	android/webkit/WebView:getContext	()Landroid/content/Context;
    //   133: invokestatic 166	com/google/ads/util/y:a	(Ljava/lang/String;Landroid/content/Context;)Landroid/webkit/WebResourceResponse;
    //   136: areturn
    //   137: aload_0
    //   138: getfield 93	com/google/ads/util/y:a	Lcom/google/ads/a/w;
    //   141: iconst_1
    //   142: invokevirtual 168	com/google/ads/a/w:a	(Z)V
    //   145: goto -106 -> 39
    //   148: astore 4
    //   150: ldc 170
    //   152: aload 4
    //   154: invokestatic 173	com/google/ads/util/g:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   157: aload_0
    //   158: aload_1
    //   159: aload_2
    //   160: invokespecial 175	com/google/ads/a/ad:shouldInterceptRequest	(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //   163: areturn
    //   164: aload 6
    //   166: getfield 178	com/google/ads/bs:e	Lcom/google/ads/util/ae;
    //   169: invokevirtual 140	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   172: checkcast 58	java/lang/String
    //   175: astore 9
    //   177: new 142	java/lang/StringBuilder
    //   180: dup
    //   181: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   184: ldc 146
    //   186: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: aload 9
    //   191: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc 152
    //   196: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: invokestatic 159	com/google/ads/util/g:a	(Ljava/lang/String;)V
    //   205: aload 9
    //   207: aload_1
    //   208: invokevirtual 164	android/webkit/WebView:getContext	()Landroid/content/Context;
    //   211: invokestatic 166	com/google/ads/util/y:a	(Ljava/lang/String;Landroid/content/Context;)Landroid/webkit/WebResourceResponse;
    //   214: areturn
    //   215: aload 6
    //   217: getfield 181	com/google/ads/bs:g	Lcom/google/ads/util/ae;
    //   220: invokevirtual 140	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   223: checkcast 58	java/lang/String
    //   226: astore 7
    //   228: new 142	java/lang/StringBuilder
    //   231: dup
    //   232: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   235: ldc 146
    //   237: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: aload 7
    //   242: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: ldc 152
    //   247: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: invokestatic 159	com/google/ads/util/g:a	(Ljava/lang/String;)V
    //   256: aload 7
    //   258: aload_1
    //   259: invokevirtual 164	android/webkit/WebView:getContext	()Landroid/content/Context;
    //   262: invokestatic 166	com/google/ads/util/y:a	(Ljava/lang/String;Landroid/content/Context;)Landroid/webkit/WebResourceResponse;
    //   265: astore 8
    //   267: aload 8
    //   269: areturn
    //   270: astore_3
    //   271: ldc 183
    //   273: aload_3
    //   274: invokestatic 173	com/google/ads/util/g:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: goto -120 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	280	0	this	y
    //   0	280	1	paramWebView	android.webkit.WebView
    //   0	280	2	paramString	String
    //   270	4	3	localThrowable	java.lang.Throwable
    //   148	5	4	localIOException	java.io.IOException
    //   26	8	5	localn	com.google.ads.a.n
    //   64	152	6	localbs	com.google.ads.bs
    //   226	31	7	str1	String
    //   265	3	8	localWebResourceResponse	WebResourceResponse
    //   175	31	9	str2	String
    //   97	31	10	str3	String
    // Exception table:
    //   from	to	target	type
    //   0	28	148	java/io/IOException
    //   33	39	148	java/io/IOException
    //   39	137	148	java/io/IOException
    //   137	145	148	java/io/IOException
    //   164	215	148	java/io/IOException
    //   215	267	148	java/io/IOException
    //   0	28	270	java/lang/Throwable
    //   33	39	270	java/lang/Throwable
    //   39	137	270	java/lang/Throwable
    //   137	145	270	java/lang/Throwable
    //   164	215	270	java/lang/Throwable
    //   215	267	270	java/lang/Throwable
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.y
 * JD-Core Version:    0.7.0.1
 */