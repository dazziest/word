package com.google.android.gms.internal;

import com.google.android.gms.common.data.d;
import com.google.android.gms.games.a.a;
import com.google.android.gms.games.a.b;

final class s
  extends q
{
  private final a b;
  
  public s(r paramr, a parama)
  {
    this.b = ((a)do.a(parama, "Listener must not be null"));
  }
  
  public void c(d paramd)
  {
    b localb = new b(paramd);
    this.a.a(new t(this.a, this.b, localb));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.s
 * JD-Core Version:    0.7.0.1
 */