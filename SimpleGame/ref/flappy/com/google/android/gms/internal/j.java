package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class j
  implements SafeParcelable
{
  private static final Object a = new Object();
  private static ClassLoader b = null;
  private static Integer c = null;
  private boolean d = false;
  
  private static boolean a(Class paramClass)
  {
    try
    {
      boolean bool = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}
    return false;
  }
  
  protected static boolean b(String paramString)
  {
    ClassLoader localClassLoader = t();
    if (localClassLoader == null) {
      return true;
    }
    try
    {
      boolean bool = a(localClassLoader.loadClass(paramString));
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected static ClassLoader t()
  {
    synchronized (a)
    {
      ClassLoader localClassLoader = b;
      return localClassLoader;
    }
  }
  
  protected static Integer u()
  {
    synchronized (a)
    {
      Integer localInteger = c;
      return localInteger;
    }
  }
  
  protected boolean v()
  {
    return this.d;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.j
 * JD-Core Version:    0.7.0.1
 */