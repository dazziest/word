package com.google.tagmanager.a;

public abstract class d
  implements aq
{
  private static final o a = ;
  
  private bf a(am paramam)
  {
    if ((paramam instanceof a)) {
      return ((a)paramam).Q();
    }
    if ((paramam instanceof c)) {
      return ((c)paramam).b();
    }
    return new bf(paramam);
  }
  
  private am b(am paramam)
  {
    if ((paramam != null) && (!paramam.j())) {
      throw a(paramam).a().a(paramam);
    }
    return paramam;
  }
  
  /* Error */
  public am a(h paramh, o paramo)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 63	com/google/tagmanager/a/h:h	()Lcom/google/tagmanager/a/k;
    //   4: astore 5
    //   6: aload_0
    //   7: aload 5
    //   9: aload_2
    //   10: invokevirtual 66	com/google/tagmanager/a/d:b	(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/o;)Ljava/lang/Object;
    //   13: checkcast 40	com/google/tagmanager/a/am
    //   16: astore 6
    //   18: aload 5
    //   20: iconst_0
    //   21: invokevirtual 71	com/google/tagmanager/a/k:a	(I)V
    //   24: aload 6
    //   26: areturn
    //   27: astore 7
    //   29: aload 7
    //   31: aload 6
    //   33: invokevirtual 54	com/google/tagmanager/a/af:a	(Lcom/google/tagmanager/a/am;)Lcom/google/tagmanager/a/af;
    //   36: athrow
    //   37: astore 4
    //   39: aload 4
    //   41: athrow
    //   42: astore_3
    //   43: new 73	java/lang/RuntimeException
    //   46: dup
    //   47: ldc 75
    //   49: aload_3
    //   50: invokespecial 78	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	d
    //   0	54	1	paramh	h
    //   0	54	2	paramo	o
    //   42	8	3	localIOException	java.io.IOException
    //   37	3	4	localaf1	af
    //   4	15	5	localk	k
    //   16	16	6	localam	am
    //   27	3	7	localaf2	af
    // Exception table:
    //   from	to	target	type
    //   18	24	27	com/google/tagmanager/a/af
    //   0	18	37	com/google/tagmanager/a/af
    //   29	37	37	com/google/tagmanager/a/af
    //   0	18	42	java/io/IOException
    //   18	24	42	java/io/IOException
    //   29	37	42	java/io/IOException
  }
  
  public am b(h paramh, o paramo)
  {
    return b(a(paramh, paramo));
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.a.d
 * JD-Core Version:    0.7.0.1
 */