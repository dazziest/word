package org.andengine.opengl.a;

import org.andengine.d.d.a;

public class b
{
  private static final int a = a.C;
  private static String b = "";
  
  public static void a()
  {
    a("");
  }
  
  public static void a(String paramString)
  {
    if ((paramString.endsWith("/")) || (paramString.length() == 0))
    {
      b = paramString;
      return;
    }
    throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.a.b
 * JD-Core Version:    0.7.0.1
 */