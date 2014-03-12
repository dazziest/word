package org.andengine.opengl.c.a.a.a;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.IOException;
import java.io.InputStream;
import org.andengine.d.d;

public class a
  extends org.andengine.opengl.c.a.b.a
  implements b
{
  private final AssetManager e;
  private final String f;
  
  a(AssetManager paramAssetManager, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.e = paramAssetManager;
    this.f = paramString;
  }
  
  public static a a(AssetManager paramAssetManager, String paramString)
  {
    return a(paramAssetManager, paramString, 0, 0);
  }
  
  public static a a(AssetManager paramAssetManager, String paramString, int paramInt1, int paramInt2)
  {
    localInputStream = null;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    try
    {
      localInputStream = paramAssetManager.open(paramString);
      BitmapFactory.decodeStream(localInputStream, null, localOptions);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        org.andengine.d.e.a.b("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + paramString, localIOException);
        d.a(localInputStream);
      }
    }
    finally
    {
      d.a(localInputStream);
    }
    return new a(paramAssetManager, paramString, paramInt1, paramInt2, localOptions.outWidth, localOptions.outHeight);
  }
  
  /* Error */
  public android.graphics.Bitmap a(android.graphics.Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: new 28	android/graphics/BitmapFactory$Options
    //   3: dup
    //   4: invokespecial 31	android/graphics/BitmapFactory$Options:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: aload_1
    //   10: putfield 87	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   13: aload_0
    //   14: getfield 17	org/andengine/opengl/c/a/a/a/a:e	Landroid/content/res/AssetManager;
    //   17: aload_0
    //   18: getfield 19	org/andengine/opengl/c/a/a/a/a:f	Ljava/lang/String;
    //   21: invokevirtual 41	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   24: astore 7
    //   26: aload 7
    //   28: astore 4
    //   30: aload 4
    //   32: aconst_null
    //   33: aload_2
    //   34: invokestatic 47	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   37: astore 8
    //   39: aload 4
    //   41: invokestatic 52	org/andengine/d/d:a	(Ljava/io/Closeable;)V
    //   44: aload 8
    //   46: areturn
    //   47: astore 6
    //   49: aconst_null
    //   50: astore 4
    //   52: new 63	java/lang/StringBuilder
    //   55: dup
    //   56: ldc 89
    //   58: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: invokevirtual 95	java/lang/Object:getClass	()Ljava/lang/Class;
    //   65: invokevirtual 100	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   68: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc 102
    //   73: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_0
    //   77: getfield 19	org/andengine/opengl/c/a/a/a/a:f	Ljava/lang/String;
    //   80: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: aload 6
    //   88: invokestatic 82	org/andengine/d/e/a:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   91: aload 4
    //   93: invokestatic 52	org/andengine/d/d:a	(Ljava/io/Closeable;)V
    //   96: aconst_null
    //   97: areturn
    //   98: astore_3
    //   99: aconst_null
    //   100: astore 4
    //   102: aload_3
    //   103: astore 5
    //   105: aload 4
    //   107: invokestatic 52	org/andengine/d/d:a	(Ljava/io/Closeable;)V
    //   110: aload 5
    //   112: athrow
    //   113: astore 5
    //   115: goto -10 -> 105
    //   118: astore 6
    //   120: goto -68 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	a
    //   0	123	1	paramConfig	android.graphics.Bitmap.Config
    //   7	27	2	localOptions	BitmapFactory.Options
    //   98	5	3	localObject1	Object
    //   28	78	4	localInputStream1	InputStream
    //   103	8	5	localObject2	Object
    //   113	1	5	localObject3	Object
    //   47	40	6	localIOException1	IOException
    //   118	1	6	localIOException2	IOException
    //   24	3	7	localInputStream2	InputStream
    //   37	8	8	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   0	26	47	java/io/IOException
    //   0	26	98	finally
    //   30	39	113	finally
    //   52	91	113	finally
    //   30	39	118	java/io/IOException
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "(" + this.f + ")";
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.opengl.c.a.a.a.a
 * JD-Core Version:    0.7.0.1
 */