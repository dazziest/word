package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.e;
import com.google.android.gms.b.h;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;

public final class dp
  extends j
{
  private static final dp a = new dp();
  
  private dp()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a.b(paramContext, paramInt1, paramInt2);
  }
  
  private View b(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      e locale = h.a(paramContext);
      View localView = (View)h.a(((di)a(paramContext)).a(locale, paramInt1, paramInt2));
      return localView;
    }
    catch (Exception localException)
    {
      throw new k("Could not get button with size " + paramInt1 + " and color " + paramInt2, localException);
    }
  }
  
  public di b(IBinder paramIBinder)
  {
    return dj.a(paramIBinder);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dp
 * JD-Core Version:    0.7.0.1
 */