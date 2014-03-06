package org.andengine.a.c;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.SoundPool;

public class b
{
  private static String a = "";
  
  public static a a(c paramc, Context paramContext, String paramString)
  {
    try
    {
      a locala = new a(paramc, paramc.c().load(paramContext.getAssets().openFd(a + paramString), 1));
      paramc.a(locala);
      return locala;
    }
    finally {}
  }
  
  public static void a()
  {
    a("");
  }
  
  public static void a(String paramString)
  {
    if ((paramString.endsWith("/")) || (paramString.length() == 0))
    {
      a = paramString;
      return;
    }
    throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.a.c.b
 * JD-Core Version:    0.7.0.1
 */