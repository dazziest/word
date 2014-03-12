package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import java.lang.ref.WeakReference;

final class am
  extends ai
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
{
  private WeakReference c;
  private boolean d = false;
  
  protected am(r paramr, int paramInt)
  {
    super(paramr, paramInt, null);
  }
  
  private void b(View paramView)
  {
    int i = -1;
    if (p.e())
    {
      Display localDisplay = paramView.getDisplay();
      if (localDisplay != null) {
        i = localDisplay.getDisplayId();
      }
    }
    IBinder localIBinder = paramView.getWindowToken();
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    int j = paramView.getWidth();
    int k = paramView.getHeight();
    this.b.c = i;
    this.b.a = localIBinder;
    this.b.d = arrayOfInt[0];
    this.b.e = arrayOfInt[1];
    this.b.f = (j + arrayOfInt[0]);
    this.b.g = (k + arrayOfInt[1]);
    if (this.d)
    {
      a();
      this.d = false;
    }
  }
  
  public void a()
  {
    if (this.b.a != null)
    {
      super.a();
      return;
    }
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      return;
    }
  }
  
  protected void a(int paramInt)
  {
    this.b = new al(paramInt, null, null);
  }
  
  public void a(View paramView)
  {
    this.a.g();
    ViewTreeObserver localViewTreeObserver;
    if (this.c != null)
    {
      View localView2 = (View)this.c.get();
      Context localContext2 = this.a.j();
      if ((localView2 == null) && ((localContext2 instanceof Activity))) {
        localView2 = ((Activity)localContext2).getWindow().getDecorView();
      }
      if (localView2 != null)
      {
        localView2.removeOnAttachStateChangeListener(this);
        localViewTreeObserver = localView2.getViewTreeObserver();
        if (!p.d()) {
          break label184;
        }
        localViewTreeObserver.removeOnGlobalLayoutListener(this);
      }
    }
    for (;;)
    {
      this.c = null;
      Context localContext1 = this.a.j();
      if ((paramView == null) && ((localContext1 instanceof Activity)))
      {
        View localView1 = ((Activity)localContext1).findViewById(16908290);
        if (localView1 == null) {
          localView1 = ((Activity)localContext1).getWindow().getDecorView();
        }
        w.a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
        paramView = localView1;
      }
      if (paramView == null) {
        break;
      }
      b(paramView);
      this.c = new WeakReference(paramView);
      paramView.addOnAttachStateChangeListener(this);
      paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
      return;
      label184:
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
    }
    w.b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
  }
  
  public void onGlobalLayout()
  {
    if (this.c == null) {}
    View localView;
    do
    {
      return;
      localView = (View)this.c.get();
    } while (localView == null);
    b(localView);
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    b(paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.a.g();
    paramView.removeOnAttachStateChangeListener(this);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.am
 * JD-Core Version:    0.7.0.1
 */