package org.andengine.c;

import java.util.Comparator;
import java.util.List;
import org.andengine.d.b.b.a;

public class d
  extends a
{
  private static d a;
  private final Comparator b = new e(this);
  
  public static d a()
  {
    if (a == null) {
      a = new d();
    }
    return a;
  }
  
  public void a(List paramList)
  {
    a(paramList, this.b);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.d
 * JD-Core Version:    0.7.0.1
 */