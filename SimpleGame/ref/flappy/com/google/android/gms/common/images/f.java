package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.dl;

public final class f
{
  public final Uri a;
  
  public f(Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof f)) {
      bool = false;
    }
    while ((this == paramObject) || (((f)paramObject).hashCode() == hashCode())) {
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return dl.a(arrayOfObject);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.f
 * JD-Core Version:    0.7.0.1
 */