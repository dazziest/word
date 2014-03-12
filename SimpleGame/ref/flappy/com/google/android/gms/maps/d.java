package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.b.b;
import com.google.android.gms.b.h;
import com.google.android.gms.b.i;
import com.google.android.gms.common.e;
import com.google.android.gms.maps.a.bj;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.a.z;
import com.google.android.gms.maps.model.k;

class d
  extends b
{
  protected i a;
  private final ViewGroup b;
  private final Context c;
  private final GoogleMapOptions d;
  
  d(ViewGroup paramViewGroup, Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    this.b = paramViewGroup;
    this.c = paramContext;
    this.d = paramGoogleMapOptions;
  }
  
  public void b()
  {
    if ((this.a != null) && (a() == null)) {}
    try
    {
      m localm = bj.a(this.c).a(h.a(this.c), this.d);
      this.a.a(new c(this.b, localm));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new k(localRemoteException);
    }
    catch (e locale) {}
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.d
 * JD-Core Version:    0.7.0.1
 */