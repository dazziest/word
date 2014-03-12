package org.andengine.opengl.c.a.a;

import android.content.Context;
import android.content.res.AssetManager;
import org.andengine.opengl.c.c.c;
import org.andengine.opengl.c.c.d;

public class b
{
  private static String a = "";
  
  public static c a(a parama, Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    return a(parama, paramContext.getAssets(), paramString, paramInt1, paramInt2);
  }
  
  public static c a(a parama, AssetManager paramAssetManager, String paramString, int paramInt1, int paramInt2)
  {
    return a(parama, org.andengine.opengl.c.a.a.a.a.a(paramAssetManager, a + paramString), paramInt1, paramInt2);
  }
  
  public static c a(a parama, org.andengine.opengl.c.a.a.a.b paramb, int paramInt1, int paramInt2)
  {
    return d.a(parama, paramb, paramInt1, paramInt2);
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
    throw new IllegalArgumentException("pAssetBasePath must end with '/' or be lenght zero.");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.a.a.b
 * JD-Core Version:    0.7.0.1
 */