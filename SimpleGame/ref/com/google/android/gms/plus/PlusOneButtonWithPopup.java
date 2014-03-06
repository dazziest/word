package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.be;

public final class PlusOneButtonWithPopup
  extends ViewGroup
{
  private View a;
  private int b;
  private int c;
  private View.OnClickListener d;
  private String e;
  private String f;
  
  public PlusOneButtonWithPopup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = PlusOneButton.a(paramContext, paramAttributeSet);
    this.c = PlusOneButton.b(paramContext, paramAttributeSet);
    this.a = new f(paramContext, this.b);
    addView(this.a);
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    switch (i)
    {
    default: 
      return paramInt1;
    }
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2, i);
  }
  
  private void a()
  {
    if (this.a != null) {
      removeView(this.a);
    }
    this.a = be.a(getContext(), this.b, this.c, this.e, this.f);
    if (this.d != null) {
      setOnClickListener(this.d);
    }
    addView(this.a);
  }
  
  private ax b()
  {
    ax localax = ay.a((IBinder)this.a.getTag());
    if (localax == null)
    {
      if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
        Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
      }
      throw new RemoteException();
    }
    return localax;
  }
  
  public PendingIntent getResolution()
  {
    if (this.a != null) {
      try
      {
        PendingIntent localPendingIntent = b().a();
        return localPendingIntent;
      }
      catch (RemoteException localRemoteException) {}
    }
    return null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.layout(getPaddingLeft(), getPaddingTop(), paramInt3 - paramInt1 - getPaddingRight(), paramInt4 - paramInt2 - getPaddingBottom());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft() + getPaddingRight();
    int j = getPaddingTop() + getPaddingBottom();
    this.a.measure(a(paramInt1, i), a(paramInt2, j));
    setMeasuredDimension(i + this.a.getMeasuredWidth(), j + this.a.getMeasuredHeight());
  }
  
  public void setAnnotation(int paramInt)
  {
    this.c = paramInt;
    a();
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d = paramOnClickListener;
    this.a.setOnClickListener(paramOnClickListener);
  }
  
  public void setSize(int paramInt)
  {
    this.b = paramInt;
    a();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusOneButtonWithPopup
 * JD-Core Version:    0.7.0.1
 */