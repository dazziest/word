package org.andengine.d;

import java.io.Closeable;
import java.io.IOException;

public final class d
{
  public static final void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.d
 * JD-Core Version:    0.7.0.1
 */