package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.b.k;
import com.google.android.gms.internal.do;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.u;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  private int a;
  private int b;
  private View c;
  private View.OnClickListener d = null;
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(0, 0);
  }
  
  private static Button a(Context paramContext, int paramInt1, int paramInt2)
  {
    u localu = new u(paramContext);
    localu.a(paramContext.getResources(), paramInt1, paramInt2);
    return localu;
  }
  
  private void a(Context paramContext)
  {
    if (this.c != null) {
      removeView(this.c);
    }
    try
    {
      this.c = dp.a(paramContext, this.a, this.b);
      addView(this.c);
      this.c.setEnabled(isEnabled());
      this.c.setOnClickListener(this);
      return;
    }
    catch (k localk)
    {
      for (;;)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        this.c = a(paramContext, this.a, this.b);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool2 = bool1;
      do.a(bool2, "Unknown button size " + paramInt1);
      if ((paramInt2 < 0) || (paramInt2 >= 2)) {
        break label95;
      }
    }
    for (;;)
    {
      do.a(bool1, "Unknown color scheme " + paramInt2);
      this.a = paramInt1;
      this.b = paramInt2;
      a(getContext());
      return;
      bool2 = false;
      break;
      label95:
      bool1 = false;
    }
  }
  
  public void onClick(View paramView)
  {
    if ((this.d != null) && (paramView == this.c)) {
      this.d.onClick(this);
    }
  }
  
  public void setColorScheme(int paramInt)
  {
    a(this.a, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d = paramOnClickListener;
    if (this.c != null) {
      this.c.setOnClickListener(this);
    }
  }
  
  public void setSize(int paramInt)
  {
    a(paramInt, this.b);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.7.0.1
 */