package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.j;
import com.google.android.gms.maps.model.a.m;

public abstract interface d
  extends IInterface
{
  public abstract CameraPosition a();
  
  public abstract a a(PolylineOptions paramPolylineOptions);
  
  public abstract com.google.android.gms.maps.model.a.g a(CircleOptions paramCircleOptions);
  
  public abstract j a(GroundOverlayOptions paramGroundOverlayOptions);
  
  public abstract m a(MarkerOptions paramMarkerOptions);
  
  public abstract com.google.android.gms.maps.model.a.p a(PolygonOptions paramPolygonOptions);
  
  public abstract com.google.android.gms.maps.model.a.s a(TileOverlayOptions paramTileOverlayOptions);
  
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void a(e parame);
  
  public abstract void a(e parame, int paramInt, w paramw);
  
  public abstract void a(e parame, w paramw);
  
  public abstract void a(ac paramac);
  
  public abstract void a(af paramaf);
  
  public abstract void a(ai paramai);
  
  public abstract void a(ao paramao);
  
  public abstract void a(ar paramar);
  
  public abstract void a(au paramau);
  
  public abstract void a(ax paramax);
  
  public abstract void a(ba paramba);
  
  public abstract void a(bd parambd);
  
  public abstract void a(bg parambg, e parame);
  
  public abstract void a(g paramg);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract float b();
  
  public abstract void b(e parame);
  
  public abstract boolean b(boolean paramBoolean);
  
  public abstract float c();
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract int f();
  
  public abstract boolean g();
  
  public abstract boolean h();
  
  public abstract boolean i();
  
  public abstract Location j();
  
  public abstract s k();
  
  public abstract p l();
  
  public abstract e m();
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.a.d
 * JD-Core Version:    0.7.0.1
 */