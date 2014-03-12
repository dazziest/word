package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.x;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class ca
  extends a
{
  ca(ViewPager paramViewPager) {}
  
  private boolean b()
  {
    return (ViewPager.a(this.b) != null) && (ViewPager.a(this.b).a() > 1);
  }
  
  public void a(View paramView, android.support.v4.view.a.a parama)
  {
    super.a(paramView, parama);
    parama.b(ViewPager.class.getName());
    parama.i(b());
    if (this.b.canScrollHorizontally(1)) {
      parama.a(4096);
    }
    if (this.b.canScrollHorizontally(-1)) {
      parama.a(8192);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 4096: 
      if (this.b.canScrollHorizontally(1))
      {
        this.b.setCurrentItem(1 + ViewPager.b(this.b));
        return true;
      }
      return false;
    }
    if (this.b.canScrollHorizontally(-1))
    {
      this.b.setCurrentItem(-1 + ViewPager.b(this.b));
      return true;
    }
    return false;
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    x localx = x.a();
    localx.a(b());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.a(this.b) != null))
    {
      localx.a(ViewPager.a(this.b).a());
      localx.b(ViewPager.b(this.b));
      localx.c(ViewPager.b(this.b));
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ca
 * JD-Core Version:    0.7.0.1
 */