package org.andengine.opengl.util;

import android.graphics.Bitmap;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.andengine.opengl.c.c;

public class a
{
  public static Buffer a(Bitmap paramBitmap, c paramc, ByteOrder paramByteOrder)
  {
    int[] arrayOfInt = a(paramBitmap);
    switch (a()[paramc.ordinal()])
    {
    case 3: 
    default: 
      throw new IllegalArgumentException("Unexpected " + c.class.getSimpleName() + ": '" + paramc + "'.");
    case 5: 
      return ShortBuffer.wrap(b(arrayOfInt, paramByteOrder));
    case 4: 
      if (paramByteOrder == ByteOrder.LITTLE_ENDIAN) {}
      for (ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;; localByteOrder = ByteOrder.LITTLE_ENDIAN) {
        return IntBuffer.wrap(a(arrayOfInt, localByteOrder));
      }
    case 2: 
      return ShortBuffer.wrap(c(arrayOfInt, paramByteOrder));
    }
    return ByteBuffer.wrap(a(arrayOfInt));
  }
  
  public static byte[] a(int[] paramArrayOfInt)
  {
    byte[] arrayOfByte = new byte[paramArrayOfInt.length];
    for (int i = -1 + paramArrayOfInt.length;; i--)
    {
      if (i < 0) {
        return arrayOfByte;
      }
      arrayOfByte[i] = ((byte)(0xFF & paramArrayOfInt[i] >> 24));
    }
  }
  
  public static int[] a(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramBitmap.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
    return arrayOfInt;
  }
  
  public static int[] a(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    int k;
    if (paramByteOrder == ByteOrder.LITTLE_ENDIAN)
    {
      k = -1 + paramArrayOfInt.length;
      if (k >= 0) {}
    }
    for (;;)
    {
      return paramArrayOfInt;
      int m = paramArrayOfInt[k];
      paramArrayOfInt[k] = (0xFF00FF00 & m | 0xFF0000 & m << 16 | 0xFF & m >> 16);
      k--;
      break;
      for (int i = -1 + paramArrayOfInt.length; i >= 0; i--)
      {
        int j = paramArrayOfInt[i];
        paramArrayOfInt[i] = (0xFFFFFF00 & j << 8 | 0xFF & j >> 24);
      }
    }
  }
  
  public static short[] b(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    short[] arrayOfShort = new short[paramArrayOfInt.length];
    int k;
    if (paramByteOrder == ByteOrder.LITTLE_ENDIAN)
    {
      k = -1 + paramArrayOfInt.length;
      if (k >= 0) {}
    }
    for (;;)
    {
      return arrayOfShort;
      int m = paramArrayOfInt[k];
      arrayOfShort[k] = ((short)(0xF8 & m >> 16 | 0x7 & m >> 13 | 0xE000 & m << 3 | 0x1F00 & m << 5));
      k--;
      break;
      for (int i = -1 + paramArrayOfInt.length; i >= 0; i--)
      {
        int j = paramArrayOfInt[i];
        arrayOfShort[i] = ((short)(0xF800 & j >> 8 | 0x7E0 & j >> 5 | 0x1F & j >> 3));
      }
    }
  }
  
  public static short[] c(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    short[] arrayOfShort = new short[paramArrayOfInt.length];
    int k;
    if (paramByteOrder == ByteOrder.LITTLE_ENDIAN)
    {
      k = -1 + paramArrayOfInt.length;
      if (k >= 0) {}
    }
    for (;;)
    {
      return arrayOfShort;
      int m = paramArrayOfInt[k];
      arrayOfShort[k] = ((short)(0xF0 & m >> 16 | 0xF & m >> 12 | 0xF000 & m << 8 | 0xF00 & m >> 20));
      k--;
      break;
      for (int i = -1 + paramArrayOfInt.length; i >= 0; i--)
      {
        int j = paramArrayOfInt[i];
        arrayOfShort[i] = ((short)(0xF000 & j >> 8 | 0xF00 & j >> 4 | j & 0xF0 | 0xF & j >> 28));
      }
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.util.a
 * JD-Core Version:    0.7.0.1
 */