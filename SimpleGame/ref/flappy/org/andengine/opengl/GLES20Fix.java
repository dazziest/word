package org.andengine.opengl;

public class GLES20Fix
{
  private static boolean a;
  private static final boolean b = false;
  
  static
  {
    try
    {
      System.loadLibrary("andengine");
      bool = true;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    a = bool;
    if (org.andengine.d.i.a.a(8))
    {
      if (bool)
      {
        b = true;
        return;
      }
      throw new org.andengine.d.f.a("Inherently incompatible device detected.");
    }
  }
  
  public static native void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5);
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.GLES20Fix
 * JD-Core Version:    0.7.0.1
 */