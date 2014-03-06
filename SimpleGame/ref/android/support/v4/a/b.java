package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class b
  implements Parcelable.Creator
{
  final c a;
  
  public b(c paramc)
  {
    this.a = paramc;
  }
  
  public Object createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }
  
  public Object[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.b
 * JD-Core Version:    0.7.0.1
 */