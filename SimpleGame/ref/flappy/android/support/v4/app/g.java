package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g
  implements Parcelable.Creator
{
  public Fragment.SavedState a(Parcel paramParcel)
  {
    return new Fragment.SavedState(paramParcel, null);
  }
  
  public Fragment.SavedState[] a(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.g
 * JD-Core Version:    0.7.0.1
 */