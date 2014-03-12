package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class j
  implements k
{
  private Context a;
  
  private j(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public Drawable a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "ic_plusone_standard_off_client";
    }
    for (;;)
    {
      int i = this.a.getResources().getIdentifier(str, "drawable", this.a.getPackageName());
      return this.a.getResources().getDrawable(i);
      str = "ic_plusone_small_off_client";
      continue;
      str = "ic_plusone_medium_off_client";
      continue;
      str = "ic_plusone_tall_off_client";
    }
  }
  
  public boolean a()
  {
    int i = this.a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.a.getPackageName());
    int j = this.a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.a.getPackageName());
    int k = this.a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.a.getPackageName());
    int m = this.a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.a.getPackageName());
    return (i != 0) && (j != 0) && (k != 0) && (m != 0);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.j
 * JD-Core Version:    0.7.0.1
 */