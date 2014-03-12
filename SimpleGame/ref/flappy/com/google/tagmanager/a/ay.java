package com.google.tagmanager.a;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class ay
  extends ax
{
  ay(int paramInt)
  {
    super(paramInt, null);
  }
  
  public void a()
  {
    if (!b())
    {
      for (int i = 0; i < c(); i++)
      {
        Map.Entry localEntry2 = b(i);
        if (((s)localEntry2.getKey()).c()) {
          localEntry2.setValue(Collections.unmodifiableList((List)localEntry2.getValue()));
        }
      }
      Iterator localIterator = d().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator.next();
        if (((s)localEntry1.getKey()).c()) {
          localEntry1.setValue(Collections.unmodifiableList((List)localEntry1.getValue()));
        }
      }
    }
    super.a();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.ay
 * JD-Core Version:    0.7.0.1
 */