package com.google.ads.a;

import com.google.ads.util.g;
import org.json.JSONException;
import org.json.JSONObject;

public class af
{
  private final String a;
  
  public af(String paramString)
  {
    this.a = paramString;
  }
  
  public JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("debugHeader", this.a);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      g.b("Could not build ReportAdJson from inputs.", localJSONException);
    }
    return localJSONObject;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.af
 * JD-Core Version:    0.7.0.1
 */