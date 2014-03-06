package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.do;

public abstract class j
{
  private final String a;
  private Object b;
  
  protected j(String paramString)
  {
    this.a = paramString;
  }
  
  protected final Object a(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.b == null)
    {
      do.a(paramContext);
      Context localContext = f.b(paramContext);
      if (localContext == null) {
        throw new k("Could not get remote context.");
      }
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.b = a((IBinder)localClassLoader.loadClass(this.a).newInstance());
      return this.b;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new k("Could not load creator class.");
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new k("Could not instantiate creator.");
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new k("Could not access creator.");
    }
  }
  
  protected abstract Object a(IBinder paramIBinder);
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.b.j
 * JD-Core Version:    0.7.0.1
 */