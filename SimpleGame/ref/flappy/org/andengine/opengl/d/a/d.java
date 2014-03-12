package org.andengine.opengl.d.a;

public class d
{
  private static final boolean a = org.andengine.d.i.a.a(8);
  private int b;
  private final a[] c;
  private int d;
  
  public d(int paramInt)
  {
    this.c = new a[paramInt];
  }
  
  public c a()
  {
    if (this.b != this.c.length) {
      throw new org.andengine.d.f.a("Not enough " + a.class.getSimpleName() + "s added to this " + getClass().getSimpleName() + ".");
    }
    return new c(this.d, this.c);
  }
  
  public d a(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (a) {
      this.c[this.b] = new b(paramInt1, paramString, paramInt2, paramInt3, paramBoolean, this.d);
    }
    for (;;)
    {
      switch (paramInt3)
      {
      default: 
        throw new IllegalArgumentException("Unexpected pType: '" + paramInt3 + "'.");
        this.c[this.b] = new a(paramInt1, paramString, paramInt2, paramInt3, paramBoolean, this.d);
      }
    }
    for (this.d += paramInt2 * 4;; this.d += paramInt2 * 1)
    {
      this.b = (1 + this.b);
      return this;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.a.d
 * JD-Core Version:    0.7.0.1
 */