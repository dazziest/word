package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class k
{
  private static final l a = new q();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new o();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new m();
      return;
    }
  }
  
  public k()
  {
    this.b = a.a(this);
  }
  
  public k(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public a a(int paramInt)
  {
    return null;
  }
  
  public Object a()
  {
    return this.b;
  }
  
  public List a(String paramString, int paramInt)
  {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  public a b(int paramInt)
  {
    return null;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.k
 * JD-Core Version:    0.7.0.1
 */