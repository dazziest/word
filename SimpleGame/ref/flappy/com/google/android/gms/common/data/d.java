package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.do;
import java.util.HashMap;

public final class d
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  private static final HashMap e = (HashMap)null;
  private static final Object f = new Object();
  private static final e l = new c(new String[0], null);
  Bundle a;
  int[] b;
  int c;
  boolean d = false;
  private final int g;
  private final String[] h;
  private final CursorWindow[] i;
  private final int j;
  private final Bundle k;
  
  d(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.g = paramInt1;
    this.h = paramArrayOfString;
    this.i = paramArrayOfCursorWindow;
    this.j = paramInt2;
    this.k = paramBundle;
  }
  
  private void a(String paramString, int paramInt)
  {
    if ((this.a == null) || (!this.a.containsKey(paramString))) {
      throw new IllegalArgumentException("No such column: " + paramString);
    }
    if (h()) {
      throw new IllegalArgumentException("Buffer is closed.");
    }
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new CursorIndexOutOfBoundsException(paramInt, this.c);
    }
  }
  
  public int a(int paramInt)
  {
    int m = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.c))
    {
      bool = true;
      do.a(bool);
    }
    for (;;)
    {
      if (m < this.b.length)
      {
        if (paramInt < this.b[m]) {
          m--;
        }
      }
      else
      {
        if (m == this.b.length) {
          m--;
        }
        return m;
        bool = false;
        break;
      }
      m++;
    }
  }
  
  public long a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.i[paramInt2].getLong(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  public void a()
  {
    int m = 0;
    this.a = new Bundle();
    for (int n = 0; n < this.h.length; n++) {
      this.a.putInt(this.h[n], n);
    }
    this.b = new int[this.i.length];
    int i1 = 0;
    while (m < this.i.length)
    {
      this.b[m] = i1;
      i1 += this.i[m].getNumRows();
      m++;
    }
    this.c = i1;
  }
  
  int b()
  {
    return this.g;
  }
  
  public int b(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.i[paramInt2].getInt(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  public String c(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.i[paramInt2].getString(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  String[] c()
  {
    return this.h;
  }
  
  public boolean d(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return Long.valueOf(this.i[paramInt2].getLong(paramInt1 - this.b[paramInt2], this.a.getInt(paramString))).longValue() == 1L;
  }
  
  CursorWindow[] d()
  {
    return this.i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int e()
  {
    return this.j;
  }
  
  public Uri e(String paramString, int paramInt1, int paramInt2)
  {
    String str = c(paramString, paramInt1, paramInt2);
    if (str == null) {
      return null;
    }
    return Uri.parse(str);
  }
  
  public Bundle f()
  {
    return this.k;
  }
  
  public boolean f(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.i[paramInt2].isNull(paramInt1 - this.b[paramInt2], this.a.getInt(paramString));
  }
  
  public int g()
  {
    return this.c;
  }
  
  public boolean h()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally {}
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.d
 * JD-Core Version:    0.7.0.1
 */