package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.Button;
import com.google.android.gms.b;
import com.google.android.gms.c;
import com.google.android.gms.d;

public final class u
  extends Button
{
  public u(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public u(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 16842824);
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalStateException("Unknown color scheme: " + paramInt1);
    case 1: 
      paramInt2 = paramInt3;
    }
    return paramInt2;
  }
  
  private void a(Resources paramResources)
  {
    setTypeface(Typeface.DEFAULT_BOLD);
    setTextSize(14.0F);
    float f = paramResources.getDisplayMetrics().density;
    setMinHeight((int)(0.5F + f * 48.0F));
    setMinWidth((int)(0.5F + f * 48.0F));
  }
  
  private void b(Resources paramResources, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalStateException("Unknown button size: " + paramInt1);
    }
    for (int i = a(paramInt2, c.common_signin_btn_text_dark, c.common_signin_btn_text_light); i == -1; i = a(paramInt2, c.common_signin_btn_icon_dark, c.common_signin_btn_icon_light)) {
      throw new IllegalStateException("Could not find background resource!");
    }
    setBackgroundDrawable(paramResources.getDrawable(i));
  }
  
  private void c(Resources paramResources, int paramInt1, int paramInt2)
  {
    setTextColor(paramResources.getColorStateList(a(paramInt2, b.common_signin_btn_text_dark, b.common_signin_btn_text_light)));
    switch (paramInt1)
    {
    default: 
      throw new IllegalStateException("Unknown button size: " + paramInt1);
    case 0: 
      setText(paramResources.getString(d.common_signin_button_text));
      return;
    case 1: 
      setText(paramResources.getString(d.common_signin_button_text_long));
      return;
    }
    setText(null);
  }
  
  public void a(Resources paramResources, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool2 = bool1;
      do.a(bool2, "Unknown button size " + paramInt1);
      if ((paramInt2 < 0) || (paramInt2 >= 2)) {
        break label99;
      }
    }
    for (;;)
    {
      do.a(bool1, "Unknown color scheme " + paramInt2);
      a(paramResources);
      b(paramResources, paramInt1, paramInt2);
      c(paramResources, paramInt1, paramInt2);
      return;
      bool2 = false;
      break;
      label99:
      bool1 = false;
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u
 * JD-Core Version:    0.7.0.1
 */