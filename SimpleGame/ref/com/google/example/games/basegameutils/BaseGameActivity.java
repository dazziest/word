package com.google.example.games.basegameutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public abstract class BaseGameActivity
  extends FragmentActivity
  implements b
{
  protected a n = new a(this);
  protected int o = 1;
  protected String p = "BaseGameActivity";
  protected boolean q = false;
  private String[] r;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.n.a(paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.n = new a(this);
    if (this.q) {
      this.n.a(this.q, this.p);
    }
    this.n.a(this, this.o, this.r);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.n.a(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    this.n.d();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.example.games.basegameutils.BaseGameActivity
 * JD-Core Version:    0.7.0.1
 */