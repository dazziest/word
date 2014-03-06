package android.support.v4.view.a;

import android.os.Build.VERSION;

public class x
{
  private static final aa a = new ac();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ab();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new z();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new y();
      return;
    }
  }
  
  public x(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public static x a()
  {
    return new x(a.a());
  }
  
  public void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }
  
  public void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }
  
  public void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public void c(int paramInt)
  {
    a.c(this.b, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    x localx;
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        localx = (x)paramObject;
        if (this.b != null) {
          break;
        }
      } while (localx.b == null);
      return false;
    } while (this.b.equals(localx.b));
    return false;
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.x
 * JD-Core Version:    0.7.0.1
 */