package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private final ArrayList a = new ArrayList();
  private Context b;
  private m c;
  private int d;
  private TabHost.OnTabChangeListener e;
  private v f;
  private boolean g;
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  private w a(String paramString, w paramw)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < this.a.size())
    {
      localObject2 = (v)this.a.get(i);
      if (!v.b((v)localObject2).equals(paramString)) {
        break label202;
      }
    }
    for (;;)
    {
      i++;
      localObject1 = localObject2;
      break;
      if (localObject1 == null) {
        throw new IllegalStateException("No tab known for tag " + paramString);
      }
      if (this.f != localObject1)
      {
        if (paramw == null) {
          paramw = this.c.a();
        }
        if ((this.f != null) && (v.a(this.f) != null)) {
          paramw.a(v.a(this.f));
        }
        if (localObject1 != null)
        {
          if (v.a(localObject1) != null) {
            break label190;
          }
          v.a(localObject1, Fragment.a(this.b, v.c(localObject1).getName(), v.d(localObject1)));
          paramw.a(this.d, v.a(localObject1), v.b(localObject1));
        }
      }
      for (;;)
      {
        this.f = localObject1;
        return paramw;
        label190:
        paramw.b(v.a(localObject1));
      }
      label202:
      localObject2 = localObject1;
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.d = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    w localw1 = null;
    int i = 0;
    if (i < this.a.size())
    {
      v localv = (v)this.a.get(i);
      v.a(localv, this.c.a(v.b(localv)));
      if ((v.a(localv) != null) && (!v.a(localv).d()))
      {
        if (!v.b(localv).equals(str)) {
          break label98;
        }
        this.f = localv;
      }
      for (;;)
      {
        i++;
        break;
        label98:
        if (localw1 == null) {
          localw1 = this.c.a();
        }
        localw1.a(v.a(localv));
      }
    }
    this.g = true;
    w localw2 = a(str, localw1);
    if (localw2 != null)
    {
      localw2.a();
      this.c.b();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.g = false;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    FragmentTabHost.SavedState localSavedState = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setCurrentTabByTag(localSavedState.a);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.a = getCurrentTabTag();
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    if (this.g)
    {
      w localw = a(paramString, null);
      if (localw != null) {
        localw.a();
      }
    }
    if (this.e != null) {
      this.e.onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.e = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.7.0.1
 */