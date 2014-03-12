package com.google.ads.util;

public final class ae
  extends ac
{
  private boolean e = false;
  
  public ae(aa paramaa, String paramString)
  {
    super(paramaa, paramString, null);
  }
  
  public ae(aa paramaa, String paramString, Object paramObject)
  {
    super(paramaa, paramString, paramObject, null);
  }
  
  public Object a()
  {
    try
    {
      Object localObject2 = this.a;
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      throw localObject1;
    }
  }
  
  public void a(Object paramObject)
  {
    try
    {
      g.d("State changed - " + this.d.toString() + "." + this.b + ": '" + paramObject + "' <-- '" + this.a + "'.");
      this.a = paramObject;
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(super.toString());
    if (this.e) {}
    for (String str = " (*)";; str = "") {
      return str;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.ae
 * JD-Core Version:    0.7.0.1
 */