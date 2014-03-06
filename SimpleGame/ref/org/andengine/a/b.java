package org.andengine.a;

import java.util.ArrayList;

public abstract class b
  implements d
{
  protected final ArrayList a = new ArrayList();
  protected float b = 1.0F;
  
  public float a()
  {
    return this.b;
  }
  
  public void a(c paramc)
  {
    this.a.add(paramc);
  }
  
  public void b()
  {
    ArrayList localArrayList = this.a;
    for (int i = -1 + localArrayList.size();; i--)
    {
      if (i < 0) {
        return;
      }
      c localc = (c)localArrayList.get(i);
      localc.e();
      localc.f();
    }
  }
  
  public boolean b(c paramc)
  {
    return this.a.remove(paramc);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.a.b
 * JD-Core Version:    0.7.0.1
 */