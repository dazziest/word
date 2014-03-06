package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.h;

public final class be
{
  private static Context a;
  private static at b;
  
  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    if (paramString == null) {
      try
      {
        throw new NullPointerException();
      }
      catch (Exception localException)
      {
        return new com.google.android.gms.plus.f(paramContext, paramInt1);
      }
    }
    View localView = (View)h.a(a(paramContext).a(h.a(paramContext), paramInt1, paramInt2, paramString, paramInt3));
    return localView;
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      try
      {
        throw new NullPointerException();
      }
      catch (Exception localException)
      {
        return new com.google.android.gms.plus.f(paramContext, paramInt1);
      }
    }
    View localView = (View)h.a(a(paramContext).a(h.a(paramContext), paramInt1, paramInt2, paramString1, paramString2));
    return localView;
  }
  
  private static at a(Context paramContext)
  {
    do.a(paramContext);
    ClassLoader localClassLoader;
    if (b == null)
    {
      if (a == null)
      {
        a = com.google.android.gms.common.f.b(paramContext);
        if (a == null) {
          throw new bf("Could not get remote context.");
        }
      }
      localClassLoader = a.getClassLoader();
    }
    try
    {
      b = au.a((IBinder)localClassLoader.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
      return b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new bf("Could not load creator class.");
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new bf("Could not instantiate creator.");
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new bf("Could not access creator.");
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.be
 * JD-Core Version:    0.7.0.1
 */