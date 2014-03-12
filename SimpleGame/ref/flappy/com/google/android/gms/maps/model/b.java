package com.google.android.gms.maps.model;

public final class b
{
  private LatLng a;
  private float b;
  private float c;
  private float d;
  
  public CameraPosition a()
  {
    return new CameraPosition(this.a, this.b, this.c, this.d);
  }
  
  public b a(float paramFloat)
  {
    this.b = paramFloat;
    return this;
  }
  
  public b a(LatLng paramLatLng)
  {
    this.a = paramLatLng;
    return this;
  }
  
  public b b(float paramFloat)
  {
    this.c = paramFloat;
    return this;
  }
  
  public b c(float paramFloat)
  {
    this.d = paramFloat;
    return this;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.b
 * JD-Core Version:    0.7.0.1
 */