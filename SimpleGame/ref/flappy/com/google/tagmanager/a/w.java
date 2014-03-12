package com.google.tagmanager.a;

public abstract class w
  extends v
  implements y
{
  private q a = q.b();
  private boolean b;
  
  private void a()
  {
    if (!this.b)
    {
      this.a = this.a.d();
      this.b = true;
    }
  }
  
  private q b()
  {
    this.a.c();
    this.b = false;
    return this.a;
  }
  
  protected final void a(x paramx)
  {
    a();
    this.a.a(x.a(paramx));
  }
  
  public w o()
  {
    throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
  }
  
  protected boolean s()
  {
    return this.a.e();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.w
 * JD-Core Version:    0.7.0.1
 */