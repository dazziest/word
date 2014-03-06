package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class d
  implements Parcelable.ClassLoaderCreator
{
  private final c a;
  
  public d(c paramc)
  {
    this.a = paramc;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.a.a(paramParcel, paramClassLoader);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.d
 * JD-Core Version:    0.7.0.1
 */