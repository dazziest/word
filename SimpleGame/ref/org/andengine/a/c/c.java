package org.andengine.a.c;

import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.util.SparseArray;
import org.andengine.a.b;

public class c
  extends b
  implements SoundPool.OnLoadCompleteListener
{
  private final SoundPool c;
  private final SparseArray d = new SparseArray();
  
  public c()
  {
    this(5);
  }
  
  public c(int paramInt)
  {
    this.c = new SoundPool(paramInt, 3, 0);
    this.c.setOnLoadCompleteListener(this);
  }
  
  public void a(a parama)
  {
    super.a(parama);
    this.d.put(parama.h(), parama);
  }
  
  public void b()
  {
    super.b();
    this.c.release();
  }
  
  public boolean b(a parama)
  {
    boolean bool = super.b(parama);
    if (bool) {
      this.d.remove(parama.h());
    }
    return bool;
  }
  
  SoundPool c()
  {
    return this.c;
  }
  
  public void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      a locala;
      try
      {
        locala = (a)this.d.get(paramInt1);
        if (locala == null) {
          throw new org.andengine.a.c.a.a("Unexpected soundID: '" + paramInt1 + "'.");
        }
      }
      finally {}
      locala.a(true);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.a.c.c
 * JD-Core Version:    0.7.0.1
 */