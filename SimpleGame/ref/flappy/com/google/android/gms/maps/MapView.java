package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.model.k;

public class MapView
  extends FrameLayout
{
  private final d a;
  private a b;
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new d(this, paramContext, GoogleMapOptions.a(paramContext, paramAttributeSet));
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new d(this, paramContext, GoogleMapOptions.a(paramContext, paramAttributeSet));
  }
  
  public final a getMap()
  {
    if (this.b != null) {
      return this.b;
    }
    this.a.b();
    if (this.a.a() == null) {
      return null;
    }
    try
    {
      this.b = new a(((c)this.a.a()).a().a());
      return this.b;
    }
    catch (RemoteException localRemoteException)
    {
      throw new k(localRemoteException);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapView
 * JD-Core Version:    0.7.0.1
 */