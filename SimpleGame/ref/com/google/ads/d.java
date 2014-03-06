package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.b.j;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d
{
  public static final String a;
  private static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
  private static Method c = null;
  private static Method d = null;
  private f e = null;
  private Date f = null;
  private Set g = null;
  private Map h = null;
  private final Map i = new HashMap();
  private Location j = null;
  private boolean k = false;
  private boolean l = false;
  private Set m = null;
  
  static
  {
    for (;;)
    {
      int i1;
      try
      {
        Method[] arrayOfMethod = Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods();
        int n = arrayOfMethod.length;
        i1 = 0;
        if (i1 < n)
        {
          Method localMethod = arrayOfMethod[i1];
          if ((localMethod.getName().equals("getInstance")) && (localMethod.getParameterTypes().length == 0)) {
            c = localMethod;
          } else if ((localMethod.getName().equals("getJoinIds")) && (localMethod.getParameterTypes().length == 0)) {
            d = localMethod;
          }
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        g.a("No Google Analytics: Library Not Found.");
        a = AdUtil.b("emulator");
        return;
        if ((c != null) && (d != null)) {
          continue;
        }
        c = null;
        d = null;
        g.e("No Google Analytics: Library Incompatible.");
        continue;
      }
      catch (Throwable localThrowable)
      {
        g.a("No Google Analytics: Error Loading Library");
        continue;
      }
      i1++;
    }
  }
  
  public d a(j paramj)
  {
    if (paramj != null) {
      this.i.put(paramj.getClass(), paramj);
    }
    return this;
  }
  
  public d a(Set paramSet)
  {
    this.g = paramSet;
    return this;
  }
  
  public Object a(Class paramClass)
  {
    return this.i.get(paramClass);
  }
  
  public Map a(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    if (this.g != null) {
      localHashMap.put("kw", this.g);
    }
    if (this.e != null) {
      localHashMap.put("cust_gender", Integer.valueOf(this.e.ordinal()));
    }
    if (this.f != null) {
      localHashMap.put("cust_age", b.format(this.f));
    }
    if (this.j != null) {
      localHashMap.put("uule", AdUtil.a(this.j));
    }
    if (this.k) {
      localHashMap.put("testing", Integer.valueOf(1));
    }
    com.google.ads.b.a.a locala;
    com.google.ads.doubleclick.a locala1;
    if (b(paramContext))
    {
      localHashMap.put("adtest", "on");
      locala = (com.google.ads.b.a.a)a(com.google.ads.b.a.a.class);
      locala1 = (com.google.ads.doubleclick.a)a(com.google.ads.doubleclick.a.class);
      if ((locala1 == null) || (locala1.d() == null) || (locala1.d().isEmpty())) {
        break label401;
      }
      localHashMap.put("extras", locala1.d());
    }
    for (;;)
    {
      if (locala1 != null)
      {
        String str2 = locala1.a();
        if (!TextUtils.isEmpty(str2)) {
          localHashMap.put("ppid", str2);
        }
      }
      if (this.h != null) {
        localHashMap.put("mediation_extras", this.h);
      }
      try
      {
        if (c != null)
        {
          Object localObject = c.invoke(null, new Object[0]);
          Map localMap = (Map)d.invoke(localObject, new Object[0]);
          if ((localMap != null) && (localMap.size() > 0)) {
            localHashMap.put("analytics_join_id", localMap);
          }
        }
        return localHashMap;
      }
      catch (Throwable localThrowable)
      {
        String str1;
        g.c("Internal Analytics Error:", localThrowable);
      }
      if (this.l) {
        break;
      }
      if (AdUtil.c()) {}
      for (str1 = "AdRequest.TEST_EMULATOR";; str1 = "\"" + AdUtil.a(paramContext) + "\"")
      {
        g.c("To get test ads on this device, call adRequest.addTestDevice(" + str1 + ");");
        this.l = true;
        break;
      }
      label401:
      if ((locala != null) && (locala.d() != null) && (!locala.d().isEmpty())) {
        localHashMap.put("extras", locala.d());
      }
    }
    return localHashMap;
  }
  
  public d b(Set paramSet)
  {
    this.m = paramSet;
    return this;
  }
  
  public boolean b(Context paramContext)
  {
    String str;
    if (this.m != null)
    {
      str = AdUtil.a(paramContext);
      if (str != null) {
        break label18;
      }
    }
    label18:
    while (!this.m.contains(str)) {
      return false;
    }
    return true;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.d
 * JD-Core Version:    0.7.0.1
 */