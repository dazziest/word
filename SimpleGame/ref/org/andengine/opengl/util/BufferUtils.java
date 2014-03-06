package org.andengine.opengl.util;

import java.nio.ByteBuffer;

public class BufferUtils
{
  private static final boolean a;
  private static final boolean b = false;
  private static final boolean c;
  
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
        continue;
        c = false;
      }
      label57:
      b = false;
      return;
    }
    a = bool;
    if (a) {
      if (org.andengine.d.i.a.a(11, 13))
      {
        c = true;
        if (!org.andengine.d.i.a.a(8)) {
          break label57;
        }
        b = true;
      }
    }
    c = false;
    if (org.andengine.d.i.a.a(11, 13)) {
      org.andengine.d.e.a.c("Creating a " + ByteBuffer.class.getSimpleName() + " will actually allocate 4x the memory than requested!");
    }
  }
  
  public static ByteBuffer a(int paramInt)
  {
    if (c) {
      return jniAllocateDirect(paramInt);
    }
    return ByteBuffer.allocateDirect(paramInt);
  }
  
  public static void a(ByteBuffer paramByteBuffer)
  {
    if (c) {
      jniFreeDirect(paramByteBuffer);
    }
  }
  
  public static void a(ByteBuffer paramByteBuffer, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if (b) {
      jniPut(paramByteBuffer, paramArrayOfFloat, paramInt1, paramInt2);
    }
    for (;;)
    {
      paramByteBuffer.position(0);
      paramByteBuffer.limit(paramInt1 << 2);
      return;
      for (int i = paramInt2; i < paramInt2 + paramInt1; i++) {
        paramByteBuffer.putFloat(paramArrayOfFloat[i]);
      }
    }
  }
  
  private static native ByteBuffer jniAllocateDirect(int paramInt);
  
  private static native void jniFreeDirect(ByteBuffer paramByteBuffer);
  
  private static native void jniPut(ByteBuffer paramByteBuffer, float[] paramArrayOfFloat, int paramInt1, int paramInt2);
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.util.BufferUtils
 * JD-Core Version:    0.7.0.1
 */