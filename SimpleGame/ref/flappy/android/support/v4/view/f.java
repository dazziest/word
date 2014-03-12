package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class f
  implements m
{
  f(e parame, a parama) {}
  
  public Object a(View paramView)
  {
    k localk = this.a.a(paramView);
    if (localk != null) {
      return localk.a();
    }
    return null;
  }
  
  public void a(View paramView, int paramInt)
  {
    this.a.a(paramView, paramInt);
  }
  
  public void a(View paramView, Object paramObject)
  {
    this.a.a(paramView, new android.support.v4.view.a.a(paramObject));
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.a.a(paramView, paramInt, paramBundle);
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.b(paramView, paramAccessibilityEvent);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.d(paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.c(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.a(paramView, paramAccessibilityEvent);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.f
 * JD-Core Version:    0.7.0.1
 */