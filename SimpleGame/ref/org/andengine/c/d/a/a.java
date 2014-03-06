package org.andengine.c.d.a;

import org.andengine.opengl.d.a.c;
import org.andengine.opengl.d.e;

public class a
  extends org.andengine.opengl.d.b
  implements b
{
  public a(e parame, int paramInt, org.andengine.opengl.d.a parama, boolean paramBoolean, c paramc)
  {
    super(parame, paramInt, parama, paramBoolean, paramc);
  }
  
  public void a(org.andengine.c.d.a parama)
  {
    float[] arrayOfFloat = this.a;
    float f = parama.g().f();
    arrayOfFloat[2] = f;
    arrayOfFloat[7] = f;
    arrayOfFloat[12] = f;
    arrayOfFloat[17] = f;
    f();
  }
  
  public void a(org.andengine.c.d.a parama, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    float[] arrayOfFloat = this.a;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    arrayOfFloat[5] = paramFloat3;
    arrayOfFloat[6] = paramFloat4;
    arrayOfFloat[10] = paramFloat5;
    arrayOfFloat[11] = paramFloat6;
    arrayOfFloat[15] = paramFloat7;
    arrayOfFloat[16] = paramFloat8;
    f();
  }
  
  public void b(org.andengine.c.d.a parama)
  {
    float[] arrayOfFloat = this.a;
    float f1 = parama.o();
    float f2 = parama.p();
    arrayOfFloat[0] = 0.0F;
    arrayOfFloat[1] = 0.0F;
    arrayOfFloat[5] = 0.0F;
    arrayOfFloat[6] = f2;
    arrayOfFloat[10] = f1;
    arrayOfFloat[11] = 0.0F;
    arrayOfFloat[15] = f1;
    arrayOfFloat[16] = f2;
    f();
  }
  
  public void c(org.andengine.c.d.a parama)
  {
    float[] arrayOfFloat = this.a;
    org.andengine.opengl.c.c.b localb = parama.t();
    float f1;
    float f2;
    float f3;
    float f4;
    if (parama.v()) {
      if (parama.u())
      {
        f1 = localb.e();
        f2 = localb.d();
        f3 = localb.g();
        f4 = localb.f();
        if (!localb.h()) {
          break label228;
        }
        arrayOfFloat[3] = f2;
        arrayOfFloat[4] = f3;
        arrayOfFloat[8] = f1;
        arrayOfFloat[9] = f3;
        arrayOfFloat[13] = f2;
        arrayOfFloat[14] = f4;
        arrayOfFloat[18] = f1;
        arrayOfFloat[19] = f4;
      }
    }
    for (;;)
    {
      f();
      return;
      f1 = localb.d();
      f2 = localb.e();
      f3 = localb.g();
      f4 = localb.f();
      break;
      if (parama.u())
      {
        f1 = localb.e();
        f2 = localb.d();
        f3 = localb.f();
        f4 = localb.g();
        break;
      }
      f1 = localb.d();
      f2 = localb.e();
      f3 = localb.f();
      f4 = localb.g();
      break;
      label228:
      arrayOfFloat[3] = f1;
      arrayOfFloat[4] = f3;
      arrayOfFloat[8] = f1;
      arrayOfFloat[9] = f4;
      arrayOfFloat[13] = f2;
      arrayOfFloat[14] = f3;
      arrayOfFloat[18] = f2;
      arrayOfFloat[19] = f4;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     org.andengine.c.d.a.a
 * JD-Core Version:    0.7.0.1
 */