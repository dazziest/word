package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

class c
  extends android.support.v4.view.a
{
  private final Rect c = new Rect();
  
  c(DrawerLayout paramDrawerLayout) {}
  
  private void a(android.support.v4.view.a.a parama1, android.support.v4.view.a.a parama2)
  {
    Rect localRect = this.c;
    parama2.a(localRect);
    parama1.b(localRect);
    parama2.c(localRect);
    parama1.d(localRect);
    parama1.c(parama2.h());
    parama1.a(parama2.p());
    parama1.b(parama2.q());
    parama1.c(parama2.s());
    parama1.h(parama2.m());
    parama1.f(parama2.k());
    parama1.a(parama2.f());
    parama1.b(parama2.g());
    parama1.d(parama2.i());
    parama1.e(parama2.j());
    parama1.g(parama2.l());
    parama1.a(parama2.b());
  }
  
  private void a(android.support.v4.view.a.a parama, ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = paramViewGroup.getChildAt(j);
      if (b(localView)) {}
      for (;;)
      {
        j++;
        break;
        switch (at.c(localView))
        {
        case 4: 
        case 3: 
        default: 
          break;
        case 0: 
          at.b(localView, 1);
        case 1: 
          parama.b(localView);
          break;
        case 2: 
          if ((localView instanceof ViewGroup)) {
            a(parama, (ViewGroup)localView);
          }
          break;
        }
      }
    }
  }
  
  public void a(View paramView, android.support.v4.view.a.a parama)
  {
    android.support.v4.view.a.a locala = android.support.v4.view.a.a.a(parama);
    super.a(paramView, locala);
    parama.a(paramView);
    ViewParent localViewParent = at.f(paramView);
    if ((localViewParent instanceof View)) {
      parama.c((View)localViewParent);
    }
    a(parama, locala);
    locala.t();
    a(parama, (ViewGroup)paramView);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!b(paramView)) {
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    return false;
  }
  
  public boolean b(View paramView)
  {
    View localView = this.b.a();
    return (localView != null) && (localView != paramView);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.7.0.1
 */