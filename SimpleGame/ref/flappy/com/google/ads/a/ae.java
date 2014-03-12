package com.google.ads.a;

import android.content.Context;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ae
  implements Runnable
{
  private String a;
  private Context b;
  
  public ae(String paramString, Context paramContext)
  {
    this.a = paramString;
    this.b = paramContext;
  }
  
  protected BufferedOutputStream a(HttpURLConnection paramHttpURLConnection)
  {
    return new BufferedOutputStream(paramHttpURLConnection.getOutputStream());
  }
  
  protected HttpURLConnection a(URL paramURL)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setDoOutput(true);
    localHttpURLConnection.setInstanceFollowRedirects(true);
    AdUtil.a(localHttpURLConnection, this.b);
    localHttpURLConnection.setRequestProperty("Accept", "application/json");
    localHttpURLConnection.setRequestProperty("Content-Type", "application/json");
    return localHttpURLConnection;
  }
  
  public void run()
  {
    String str = (String)((bs)br.a().b.a()).h.a();
    try
    {
      HttpURLConnection localHttpURLConnection = a(new URL(str));
      byte[] arrayOfByte = new af(this.a).a().toString().getBytes();
      localHttpURLConnection.setFixedLengthStreamingMode(arrayOfByte.length);
      try
      {
        BufferedOutputStream localBufferedOutputStream = a(localHttpURLConnection);
        localBufferedOutputStream.write(arrayOfByte);
        localBufferedOutputStream.close();
        if (localHttpURLConnection.getResponseCode() != 200) {
          g.b("Got error response from BadAd backend: " + localHttpURLConnection.getResponseMessage());
        }
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
      return;
    }
    catch (IOException localIOException)
    {
      g.b("Error reporting bad ad.", localIOException);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.ae
 * JD-Core Version:    0.7.0.1
 */