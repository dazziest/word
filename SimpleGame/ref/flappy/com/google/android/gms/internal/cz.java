package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

public class cz
  implements ServiceConnection
{
  public cz(cy paramcy) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (cx.a(this.a.a))
    {
      cy.a(this.a, paramIBinder);
      cy.a(this.a, paramComponentName);
      Iterator localIterator = cy.a(this.a).iterator();
      if (localIterator.hasNext()) {
        ((cv)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    cy.a(this.a, 1);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (cx.a(this.a.a))
    {
      cy.a(this.a, null);
      cy.a(this.a, paramComponentName);
      Iterator localIterator = cy.a(this.a).iterator();
      if (localIterator.hasNext()) {
        ((cv)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    cy.a(this.a, 2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cz
 * JD-Core Version:    0.7.0.1
 */