package com.google.tagmanager.a;

public abstract class c
  implements ap
{
  protected int a = -1;
  private boolean b = true;
  
  public ap a()
  {
    throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
  }
  
  bf b()
  {
    return new bf(this);
  }
  
  public an n()
  {
    throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
  }
  
  public an o()
  {
    throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.c
 * JD-Core Version:    0.7.0.1
 */