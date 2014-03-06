package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.p;
import java.lang.ref.WeakReference;

public final class e
{
  final f a;
  int b;
  private int c;
  private int d;
  private WeakReference e;
  private WeakReference f;
  private WeakReference g;
  private int h;
  private boolean i;
  private boolean j;
  
  private ch a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null) {
      if (!(paramDrawable1 instanceof ch)) {}
    }
    for (paramDrawable1 = ((ch)paramDrawable1).b();; paramDrawable1 = null) {
      return new ch(paramDrawable1, paramDrawable2);
    }
  }
  
  private void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    switch (this.b)
    {
    }
    TextView localTextView;
    do
    {
      ImageView localImageView;
      do
      {
        a locala;
        do
        {
          do
          {
            return;
          } while (paramBoolean2);
          locala = (a)this.e.get();
        } while (locala == null);
        locala.a(this.a.a, paramDrawable);
        return;
        localImageView = (ImageView)this.f.get();
      } while (localImageView == null);
      a(localImageView, paramDrawable, paramBoolean1, paramBoolean2, paramBoolean3);
      return;
      localTextView = (TextView)this.g.get();
    } while (localTextView == null);
    a(localTextView, this.h, paramDrawable, paramBoolean1, paramBoolean2);
  }
  
  private void a(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((!paramBoolean2) && (!paramBoolean3)) {}
    for (int k = 1; (k != 0) && ((paramImageView instanceof cm)); k = 0)
    {
      int n = ((cm)paramImageView).a();
      if ((this.c == 0) || (n != this.c)) {
        break;
      }
      return;
    }
    boolean bool = a(paramBoolean1, paramBoolean2);
    if (bool) {}
    for (Object localObject = a(paramImageView.getDrawable(), paramDrawable);; localObject = paramDrawable)
    {
      paramImageView.setImageDrawable((Drawable)localObject);
      cm localcm;
      Uri localUri;
      if ((paramImageView instanceof cm))
      {
        localcm = (cm)paramImageView;
        if (!paramBoolean3) {
          break label157;
        }
        localUri = this.a.a;
        label115:
        localcm.a(localUri);
        if (k == 0) {
          break label163;
        }
      }
      label157:
      label163:
      for (int m = this.c;; m = 0)
      {
        localcm.a(m);
        if (!bool) {
          break;
        }
        ((ch)localObject).a(250);
        return;
        localUri = null;
        break label115;
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = a(paramBoolean1, paramBoolean2);
    Drawable[] arrayOfDrawable;
    Drawable localDrawable;
    if (p.e())
    {
      arrayOfDrawable = paramTextView.getCompoundDrawablesRelative();
      localDrawable = arrayOfDrawable[paramInt];
      if (!bool) {
        break label172;
      }
    }
    label130:
    label139:
    label148:
    label157:
    label172:
    for (Object localObject1 = a(localDrawable, paramDrawable);; localObject1 = paramDrawable)
    {
      Object localObject2;
      label50:
      Object localObject3;
      label59:
      Object localObject4;
      label68:
      Object localObject5;
      if (paramInt == 0)
      {
        localObject2 = localObject1;
        if (paramInt != 1) {
          break label130;
        }
        localObject3 = localObject1;
        if (paramInt != 2) {
          break label139;
        }
        localObject4 = localObject1;
        if (paramInt != 3) {
          break label148;
        }
        localObject5 = localObject1;
        label77:
        if (!p.e()) {
          break label157;
        }
        paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
      }
      for (;;)
      {
        if (bool) {
          ((ch)localObject1).a(250);
        }
        return;
        arrayOfDrawable = paramTextView.getCompoundDrawables();
        break;
        localObject2 = arrayOfDrawable[0];
        break label50;
        localObject3 = arrayOfDrawable[1];
        break label59;
        localObject4 = arrayOfDrawable[2];
        break label68;
        localObject5 = arrayOfDrawable[3];
        break label77;
        paramTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject3, (Drawable)localObject4, (Drawable)localObject5);
      }
    }
  }
  
  private boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.i) && (!paramBoolean2) && ((!paramBoolean1) || (this.j));
  }
  
  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    cn.a(paramBitmap);
    a(new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }
  
  void a(Context paramContext, boolean paramBoolean)
  {
    int k = this.c;
    Drawable localDrawable = null;
    if (k != 0) {
      localDrawable = paramContext.getResources().getDrawable(this.c);
    }
    a(localDrawable, paramBoolean, false, false);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (!(paramObject instanceof e)) {
      bool = false;
    }
    while ((this == paramObject) || (((e)paramObject).hashCode() == hashCode())) {
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.d;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.e
 * JD-Core Version:    0.7.0.1
 */