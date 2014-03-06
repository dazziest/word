package com.google.tagmanager.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class ac
{
  public static final byte[] a = new byte[0];
  public static final ByteBuffer b = ByteBuffer.wrap(a);
  
  public static int a(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static int a(ad paramad)
  {
    return paramad.a();
  }
  
  public static int a(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    ad localad;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + a(localad)) {
      localad = (ad)localIterator.next();
    }
    return i;
  }
  
  public static int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return bj.a(paramArrayOfByte);
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    try
    {
      String str = new String(paramArrayOfByte, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("UTF-8 not supported?", localUnsupportedEncodingException);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.ac
 * JD-Core Version:    0.7.0.1
 */