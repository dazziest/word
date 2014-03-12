package org.andengine.a.b;

public class a
{
  private static String a = "";
  
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
 * Qualified Name:     org.andengine.a.b.a
 * JD-Core Version:    0.7.0.1
 */