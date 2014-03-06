package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.dq;

public final class PlusOneButton
  extends FrameLayout
{
  private View a;
  private int b;
  private int c;
  private String d;
  private int e;
  private e f;
  
  public PlusOneButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = a(paramContext, paramAttributeSet);
    this.c = b(paramContext, paramAttributeSet);
    this.e = -1;
    a(getContext());
    if (isInEditMode()) {}
  }
  
  protected static int a(Context paramContext, AttributeSet paramAttributeSet)
  {
    String str = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    if ("SMALL".equalsIgnoreCase(str)) {
      return 0;
    }
    if ("MEDIUM".equalsIgnoreCase(str)) {
      return 1;
    }
    if ("TALL".equalsIgnoreCase(str)) {
      return 2;
    }
    return 3;
  }
  
  private void a(Context paramContext)
  {
    if (this.a != null) {
      removeView(this.a);
    }
    this.a = be.a(paramContext, this.b, this.c, this.d, this.e);
    setOnPlusOneClickListener(this.f);
    addView(this.a);
  }
  
  protected static int b(Context paramContext, AttributeSet paramAttributeSet)
  {
    String str = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    int i;
    if ("INLINE".equalsIgnoreCase(str)) {
      i = 2;
    }
    boolean bool;
    do
    {
      return i;
      bool = "NONE".equalsIgnoreCase(str);
      i = 0;
    } while (bool);
    return 1;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.a;
    measureChild(localView, paramInt1, paramInt2);
    setMeasuredDimension(localView.getMeasuredWidth(), localView.getMeasuredHeight());
  }
  
  public void setAnnotation(int paramInt)
  {
    this.c = paramInt;
    a(getContext());
  }
  
  public void setOnPlusOneClickListener(e parame)
  {
    this.f = parame;
    this.a.setOnClickListener(new d(this, parame));
  }
  
  public void setSize(int paramInt)
  {
    this.b = paramInt;
    a(getContext());
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusOneButton
 * JD-Core Version:    0.7.0.1
 */