package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class x
  implements Parcelable.Creator
{
  public SlidingPaneLayout.SavedState a(Parcel paramParcel)
  {
    return new SlidingPaneLayout.SavedState(paramParcel, null);
  }
  
  public SlidingPaneLayout.SavedState[] a(int paramInt)
  {
    return new SlidingPaneLayout.SavedState[paramInt];
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.x
 * JD-Core Version:    0.7.0.1
 */