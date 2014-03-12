package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.b.h;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.model.k;

public class bj
{
  private static Context a;
  private static z b;
  
  public static z a(Context paramContext)
  {
    do.a(paramContext);
    b(paramContext);
    if (b == null) {
      d(paramContext);
    }
    if (b != null) {
      return b;
    }
    b = aa.a((IBinder)a(e(paramContext).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    c(paramContext);
    return b;
  }
  
  private static Class a()
  {
    try
    {
      Class localClass = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  private static Object a(Class paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException("Unable to instantiate the dynamic class " + paramClass.getName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalStateException("Unable to call the default constructor of " + paramClass.getName());
    }
  }
  
  private static Object a(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      Object localObject = a(((ClassLoader)do.a(paramClassLoader)).loadClass(paramString));
      return localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new IllegalStateException("Unable to find dynamic class " + paramString);
    }
  }
  
  public static void b(Context paramContext)
  {
    int i = f.a(paramContext);
    if (i != 0) {
      throw new e(i);
    }
  }
  
  private static void c(Context paramContext)
  {
    try
    {
      b.a(h.a(e(paramContext).getResources()), 3265100);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new k(localRemoteException);
    }
  }
  
  private static void d(Context paramContext)
  {
    Class localClass = a();
    if (localClass != null)
    {
      Log.i(bj.class.getSimpleName(), "Making Creator statically");
      b = (z)a(localClass);
      c(paramContext);
    }
  }
  
  private static Context e(Context paramContext)
  {
    if (a == null) {
      if (a() == null) {
        break label20;
      }
    }
    label20:
    for (a = paramContext;; a = f.b(paramContext)) {
      return a;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.bj
 * JD-Core Version:    0.7.0.1
 */