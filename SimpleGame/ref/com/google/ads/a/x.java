package com.google.ads.a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

public class x
{
  private final String a;
  private HashMap b;
  
  public x(Bundle paramBundle)
  {
    this.a = paramBundle.getString("action");
    this.b = a(paramBundle.getSerializable("params"));
  }
  
  public x(String paramString)
  {
    this.a = paramString;
  }
  
  public x(String paramString, HashMap paramHashMap)
  {
    this(paramString);
    this.b = paramHashMap;
  }
  
  private HashMap a(Serializable paramSerializable)
  {
    if ((paramSerializable instanceof HashMap)) {
      return (HashMap)paramSerializable;
    }
    return null;
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action", this.a);
    localBundle.putSerializable("params", this.b);
    return localBundle;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public HashMap c()
  {
    return this.b;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.x
 * JD-Core Version:    0.7.0.1
 */