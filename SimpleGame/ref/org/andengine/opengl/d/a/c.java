package org.andengine.opengl.d.a;

public class c
{
  private final int a;
  private final a[] b;
  
  public c(int paramInt, a... paramVarArgs)
  {
    this.b = paramVarArgs;
    this.a = paramInt;
  }
  
  public void a()
  {
    a[] arrayOfa = this.b;
    int i = this.a;
    int j = arrayOfa.length;
    for (int k = 0;; k++)
    {
      if (k >= j) {
        return;
      }
      arrayOfa[k].a(i);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.d.a.c
 * JD-Core Version:    0.7.0.1
 */