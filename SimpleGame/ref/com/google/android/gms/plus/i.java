package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class i
  implements k
{
  private Context a;
  
  private i(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public Drawable a(int paramInt)
  {
    for (;;)
    {
      try
      {
        Resources localResources = this.a.createPackageContext("com.google.android.gms", 4).getResources();
        switch (paramInt)
        {
        case 2: 
          return localResources.getDrawable(localResources.getIdentifier(str, "drawable", "com.google.android.gms"));
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        return null;
      }
      String str = "ic_plusone_tall";
      continue;
      str = "ic_plusone_standard";
      continue;
      str = "ic_plusone_small";
      continue;
      str = "ic_plusone_medium";
    }
  }
  
  public boolean a()
  {
    try
    {
      this.a.createPackageContext("com.google.android.gms", 4).getResources();
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.i
 * JD-Core Version:    0.7.0.1
 */