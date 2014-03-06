package org.andengine.d.b.a;

public class c
  extends d
{
  private static final float[] a = new float[8];
  private static final float[] b = new float[8];
  private static final float[] c = new float[8];
  
  public static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, org.andengine.d.a.d.a parama, float[] paramArrayOfFloat)
  {
    float f1 = paramFloat1 + paramFloat3;
    float f2 = paramFloat2 + paramFloat4;
    paramArrayOfFloat[0] = paramFloat1;
    paramArrayOfFloat[1] = paramFloat2;
    paramArrayOfFloat[2] = f1;
    paramArrayOfFloat[3] = paramFloat2;
    paramArrayOfFloat[4] = f1;
    paramArrayOfFloat[5] = f2;
    paramArrayOfFloat[6] = paramFloat1;
    paramArrayOfFloat[7] = f2;
    parama.a(paramArrayOfFloat);
  }
  
  private static void a(org.andengine.b.a.a parama, float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] = parama.a();
    paramArrayOfFloat[1] = parama.c();
    paramArrayOfFloat[2] = parama.b();
    paramArrayOfFloat[3] = parama.c();
    paramArrayOfFloat[4] = parama.b();
    paramArrayOfFloat[5] = parama.d();
    paramArrayOfFloat[6] = parama.a();
    paramArrayOfFloat[7] = parama.d();
    org.andengine.d.g.a.a(paramArrayOfFloat, parama.k(), parama.g(), parama.h());
  }
  
  public static void a(org.andengine.c.c.c paramc, float[] paramArrayOfFloat)
  {
    a(0.0F, 0.0F, paramc.o(), paramc.p(), paramc.k(), paramArrayOfFloat);
  }
  
  public static boolean a(org.andengine.b.a.a parama, org.andengine.c.c.c paramc)
  {
    a(parama, b);
    a(paramc, c);
    return d.a(b, 4, c, 4);
  }
  
  public static boolean a(org.andengine.c.c.c paramc, float paramFloat1, float paramFloat2)
  {
    a(paramc, a);
    return d.a(a, 4, paramFloat1, paramFloat2);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.d.b.a.c
 * JD-Core Version:    0.7.0.1
 */