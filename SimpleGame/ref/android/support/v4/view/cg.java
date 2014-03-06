package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

class cg
  implements Comparator
{
  public int a(View paramView1, View paramView2)
  {
    ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
    ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
    if (localLayoutParams1.a != localLayoutParams2.a)
    {
      if (localLayoutParams1.a) {
        return 1;
      }
      return -1;
    }
    return localLayoutParams1.e - localLayoutParams2.e;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.cg
 * JD-Core Version:    0.7.0.1
 */