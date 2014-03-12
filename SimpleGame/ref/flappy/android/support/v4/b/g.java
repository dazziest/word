package android.support.v4.b;

import java.util.Iterator;

final class g
  implements Iterator
{
  final int a;
  int b;
  int c;
  boolean d = false;
  
  g(f paramf, int paramInt)
  {
    this.a = paramInt;
    this.b = paramf.a();
  }
  
  public boolean hasNext()
  {
    return this.c < this.b;
  }
  
  public Object next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c = (1 + this.c);
    this.d = true;
    return localObject;
  }
  
  public void remove()
  {
    if (!this.d) {
      throw new IllegalStateException();
    }
    this.c = (-1 + this.c);
    this.b = (-1 + this.b);
    this.d = false;
    this.e.a(this.c);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.b.g
 * JD-Core Version:    0.7.0.1
 */