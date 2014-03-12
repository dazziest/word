package org.andengine.d.b.b;

import java.util.Comparator;
import java.util.List;

public class a
  extends b
{
  public void a(List paramList, int paramInt1, int paramInt2, Comparator paramComparator)
  {
    int i = paramInt1 + 1;
    if (i >= paramInt2) {
      return;
    }
    Object localObject1 = paramList.get(i);
    Object localObject2 = paramList.get(i - 1);
    Object localObject3;
    if (paramComparator.compare(localObject1, localObject2) < 0) {
      localObject3 = localObject2;
    }
    int k;
    for (int j = i;; j = k)
    {
      k = j - 1;
      paramList.set(j, localObject3);
      Object localObject4;
      if (k > paramInt1)
      {
        localObject4 = paramList.get(k - 1);
        if (paramComparator.compare(localObject1, localObject4) < 0) {}
      }
      else
      {
        paramList.set(k, localObject1);
        i++;
        break;
      }
      localObject3 = localObject4;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.b.b.a
 * JD-Core Version:    0.7.0.1
 */