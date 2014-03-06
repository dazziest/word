package android.support.v4.a;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class a
{
  public static Parcelable.Creator a(c paramc)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      e.a(paramc);
    }
    return new b(paramc);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a
 * JD-Core Version:    0.7.0.1
 */