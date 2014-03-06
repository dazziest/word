package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class d
  implements View.OnClickListener, e
{
  private final e b;
  
  public d(PlusOneButton paramPlusOneButton, e parame)
  {
    this.b = parame;
  }
  
  public void a(Intent paramIntent)
  {
    Context localContext = this.a.getContext();
    if (((localContext instanceof Activity)) && (paramIntent != null)) {
      ((Activity)localContext).startActivityForResult(paramIntent, PlusOneButton.b(this.a));
    }
  }
  
  public void onClick(View paramView)
  {
    Intent localIntent = (Intent)PlusOneButton.a(this.a).getTag();
    if (this.b != null)
    {
      this.b.a(localIntent);
      return;
    }
    a(localIntent);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.d
 * JD-Core Version:    0.7.0.1
 */