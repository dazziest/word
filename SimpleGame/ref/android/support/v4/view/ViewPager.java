package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.widget.h;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager
  extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private static final cg af = new cg();
  private static final Comparator c = new bv();
  private static final Interpolator d = new bw();
  private boolean A;
  private boolean B;
  private int C;
  private int D;
  private int E;
  private float F;
  private float G;
  private float H;
  private float I;
  private int J = -1;
  private VelocityTracker K;
  private int L;
  private int M;
  private int N;
  private int O;
  private boolean P;
  private h Q;
  private h R;
  private boolean S = true;
  private boolean T = false;
  private boolean U;
  private int V;
  private cc W;
  private cc Z;
  private cb aa;
  private cd ab;
  private Method ac;
  private int ad;
  private ArrayList ae;
  private final Runnable ag = new bx(this);
  private int ah = 0;
  private int b;
  private final ArrayList e = new ArrayList();
  private final bz f = new bz();
  private final Rect g = new Rect();
  private ae h;
  private int i;
  private int j = -1;
  private Parcelable k = null;
  private ClassLoader l = null;
  private Scroller m;
  private ce n;
  private int o;
  private Drawable p;
  private int q;
  private int r;
  private float s = -3.402824E+038F;
  private float t = 3.4028235E+38F;
  private int u;
  private int v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z = 1;
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.N) && (Math.abs(paramInt2) > this.L))
    {
      if (paramInt2 > 0) {}
      for (;;)
      {
        if (this.e.size() > 0)
        {
          bz localbz1 = (bz)this.e.get(0);
          bz localbz2 = (bz)this.e.get(-1 + this.e.size());
          paramInt1 = Math.max(localbz1.b, Math.min(paramInt1, localbz2.b));
        }
        return paramInt1;
        paramInt1++;
      }
    }
    if (paramInt1 >= this.i) {}
    for (float f1 = 0.4F;; f1 = 0.6F)
    {
      paramInt1 = (int)(f1 + (paramFloat + paramInt1));
      break;
    }
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null) {}
    for (Rect localRect = new Rect();; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.e.isEmpty()))
    {
      int i2 = paramInt3 + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int i3 = paramInt4 + (paramInt2 - getPaddingLeft() - getPaddingRight());
      int i4 = (int)(getScrollX() / i3 * i2);
      scrollTo(i4, getScrollY());
      if (!this.m.isFinished())
      {
        int i5 = this.m.getDuration() - this.m.timePassed();
        bz localbz2 = b(this.i);
        this.m.startScroll(i4, 0, (int)(localbz2.e * paramInt1), 0, i5);
      }
      return;
    }
    bz localbz1 = b(this.i);
    if (localbz1 != null) {}
    for (float f1 = Math.min(localbz1.e, this.t);; f1 = 0.0F)
    {
      int i1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (i1 == getScrollX()) {
        break;
      }
      a(false);
      scrollTo(i1, getScrollY());
      return;
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    bz localbz = b(paramInt1);
    if (localbz != null) {}
    for (int i1 = (int)(getClientWidth() * Math.max(this.s, Math.min(localbz.e, this.t)));; i1 = 0)
    {
      if (paramBoolean1)
      {
        a(i1, 0, paramInt2);
        if ((paramBoolean2) && (this.W != null)) {
          this.W.a(paramInt1);
        }
        if ((paramBoolean2) && (this.Z != null)) {
          this.Z.a(paramInt1);
        }
        return;
      }
      if ((paramBoolean2) && (this.W != null)) {
        this.W.a(paramInt1);
      }
      if ((paramBoolean2) && (this.Z != null)) {
        this.Z.a(paramInt1);
      }
      a(false);
      scrollTo(i1, 0);
      d(i1);
      return;
    }
  }
  
  private void a(bz parambz1, int paramInt, bz parambz2)
  {
    int i1 = this.h.a();
    int i2 = getClientWidth();
    float f1;
    int i12;
    float f9;
    int i15;
    int i16;
    if (i2 > 0)
    {
      f1 = this.o / i2;
      if (parambz2 == null) {
        break label371;
      }
      i12 = parambz2.b;
      if (i12 < parambz1.b)
      {
        f9 = f1 + (parambz2.e + parambz2.d);
        i15 = i12 + 1;
        i16 = 0;
      }
    }
    else
    {
      for (;;)
      {
        if ((i15 > parambz1.b) || (i16 >= this.e.size())) {
          break label371;
        }
        bz localbz4 = (bz)this.e.get(i16);
        for (;;)
        {
          if ((i15 > localbz4.b) && (i16 < -1 + this.e.size()))
          {
            i16++;
            localbz4 = (bz)this.e.get(i16);
            continue;
            f1 = 0.0F;
            break;
          }
        }
        while (i15 < localbz4.b)
        {
          f9 += f1 + this.h.b(i15);
          i15++;
        }
        localbz4.e = f9;
        f9 += f1 + localbz4.d;
        i15++;
      }
    }
    if (i12 > parambz1.b)
    {
      int i13 = -1 + this.e.size();
      float f8 = parambz2.e;
      for (int i14 = i12 - 1; (i14 >= parambz1.b) && (i13 >= 0); i14--)
      {
        for (bz localbz3 = (bz)this.e.get(i13); (i14 < localbz3.b) && (i13 > 0); localbz3 = (bz)this.e.get(i13)) {
          i13--;
        }
        while (i14 > localbz3.b)
        {
          f8 -= f1 + this.h.b(i14);
          i14--;
        }
        f8 -= f1 + localbz3.d;
        localbz3.e = f8;
      }
    }
    label371:
    int i3 = this.e.size();
    float f2 = parambz1.e;
    int i4 = -1 + parambz1.b;
    float f3;
    float f4;
    if (parambz1.b == 0)
    {
      f3 = parambz1.e;
      this.s = f3;
      if (parambz1.b != i1 - 1) {
        break label522;
      }
      f4 = parambz1.e + parambz1.d - 1.0F;
      label437:
      this.t = f4;
    }
    label522:
    int i10;
    for (int i5 = paramInt - 1;; i5 = i10)
    {
      if (i5 < 0) {
        break label579;
      }
      bz localbz2 = (bz)this.e.get(i5);
      float f7 = f2;
      for (;;)
      {
        if (i4 > localbz2.b)
        {
          ae localae2 = this.h;
          int i11 = i4 - 1;
          f7 -= f1 + localae2.b(i4);
          i4 = i11;
          continue;
          f3 = -3.402824E+038F;
          break;
          f4 = 3.4028235E+38F;
          break label437;
        }
      }
      f2 = f7 - (f1 + localbz2.d);
      localbz2.e = f2;
      if (localbz2.b == 0) {
        this.s = f2;
      }
      i10 = i5 - 1;
      i4--;
    }
    label579:
    float f5 = f1 + (parambz1.e + parambz1.d);
    int i6 = 1 + parambz1.b;
    int i8;
    for (int i7 = paramInt + 1; i7 < i3; i7 = i8)
    {
      bz localbz1 = (bz)this.e.get(i7);
      float f6 = f5;
      while (i6 < localbz1.b)
      {
        ae localae1 = this.h;
        int i9 = i6 + 1;
        f6 += f1 + localae1.b(i6);
        i6 = i9;
      }
      if (localbz1.b == i1 - 1) {
        this.t = (f6 + localbz1.d - 1.0F);
      }
      localbz1.e = f6;
      f5 = f6 + (f1 + localbz1.d);
      i8 = i7 + 1;
      i6++;
    }
    this.T = false;
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = z.b(paramMotionEvent);
    if (z.b(paramMotionEvent, i1) == this.J) {
      if (i1 != 0) {
        break label56;
      }
    }
    label56:
    for (int i2 = 1;; i2 = 0)
    {
      this.F = z.c(paramMotionEvent, i2);
      this.J = z.b(paramMotionEvent, i2);
      if (this.K != null) {
        this.K.clear();
      }
      return;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.ah == 2) {}
    int i3;
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        setScrollingCacheEnabled(false);
        this.m.abortAnimation();
        int i4 = getScrollX();
        int i5 = getScrollY();
        int i6 = this.m.getCurrX();
        int i7 = this.m.getCurrY();
        if ((i4 != i6) || (i5 != i7)) {
          scrollTo(i6, i7);
        }
      }
      this.y = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.e.size())
      {
        bz localbz = (bz)this.e.get(i2);
        if (localbz.c)
        {
          localbz.c = false;
          i3 = 1;
        }
        i2++;
      }
    }
    if (i3 != 0)
    {
      if (paramBoolean) {
        at.a(this, this.ag);
      }
    }
    else {
      return;
    }
    this.ag.run();
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    return ((paramFloat1 < this.D) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.D) && (paramFloat2 < 0.0F));
  }
  
  private void b(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      if (paramBoolean) {}
      for (int i3 = 2;; i3 = 0)
      {
        at.a(getChildAt(i2), i3, null);
        i2++;
        break;
      }
    }
  }
  
  private boolean b(float paramFloat)
  {
    int i1 = 1;
    float f1 = this.F - paramFloat;
    this.F = paramFloat;
    float f2 = f1 + getScrollX();
    int i2 = getClientWidth();
    float f3 = i2 * this.s;
    float f4 = i2 * this.t;
    bz localbz1 = (bz)this.e.get(0);
    bz localbz2 = (bz)this.e.get(-1 + this.e.size());
    if (localbz1.b != 0) {
      f3 = localbz1.e * i2;
    }
    for (int i3 = 0;; i3 = i1)
    {
      float f5;
      if (localbz2.b != -1 + this.h.a())
      {
        f5 = localbz2.e * i2;
        i1 = 0;
      }
      for (;;)
      {
        boolean bool;
        if (f2 < f3)
        {
          bool = false;
          if (i3 != 0)
          {
            float f6 = f3 - f2;
            bool = this.Q.a(Math.abs(f6) / i2);
          }
        }
        for (;;)
        {
          this.F += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          d((int)f3);
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i1 != 0)
            {
              float f7 = f2 - f5;
              bool = this.R.a(Math.abs(f7) / i2);
            }
            f3 = f5;
          }
          else
          {
            f3 = f2;
            bool = false;
          }
        }
        f5 = f4;
      }
    }
  }
  
  private void c(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private boolean d(int paramInt)
  {
    boolean bool1;
    if (this.e.size() == 0)
    {
      this.U = false;
      a(0, 0.0F, 0);
      boolean bool2 = this.U;
      bool1 = false;
      if (!bool2) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
    }
    else
    {
      bz localbz = i();
      int i1 = getClientWidth();
      int i2 = i1 + this.o;
      float f1 = this.o / i1;
      int i3 = localbz.b;
      float f2 = (paramInt / i1 - localbz.e) / (f1 + localbz.d);
      int i4 = (int)(f2 * i2);
      this.U = false;
      a(i3, f2, i4);
      if (!this.U) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      bool1 = true;
    }
    return bool1;
  }
  
  private void g()
  {
    for (int i1 = 0; i1 < getChildCount(); i1++) {
      if (!((ViewPager.LayoutParams)getChildAt(i1).getLayoutParams()).a)
      {
        removeViewAt(i1);
        i1--;
      }
    }
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void h()
  {
    if (this.ad != 0)
    {
      if (this.ae == null) {
        this.ae = new ArrayList();
      }
      for (;;)
      {
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView = getChildAt(i2);
          this.ae.add(localView);
        }
        this.ae.clear();
      }
      Collections.sort(this.ae, af);
    }
  }
  
  private bz i()
  {
    int i1 = getClientWidth();
    float f1;
    float f2;
    label31:
    float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label49:
    bz localbz1;
    bz localbz3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0) {
        break label210;
      }
      f2 = this.o / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.e.size())
      {
        localbz1 = (bz)this.e.get(i3);
        if ((i4 != 0) || (localbz1.b == i2 + 1)) {
          break label261;
        }
        localbz3 = this.f;
        localbz3.e = (f2 + (f3 + f4));
        localbz3.b = (i2 + 1);
        localbz3.d = this.h.b(localbz3.b);
        i5 = i3 - 1;
      }
    }
    for (bz localbz2 = localbz3;; localbz2 = localbz1)
    {
      float f5 = localbz2.e;
      float f6 = f2 + (f5 + localbz2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.e.size())) {
          localObject = localbz2;
        }
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label210:
        f2 = 0.0F;
        break label31;
      }
      int i6 = localbz2.b;
      float f7 = localbz2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localbz2;
      i3 = i7;
      i4 = 0;
      break label49;
      label261:
      i5 = i3;
    }
  }
  
  private void j()
  {
    this.A = false;
    this.B = false;
    if (this.K != null)
    {
      this.K.recycle();
      this.K = null;
    }
  }
  
  private void setScrollState(int paramInt)
  {
    if (this.ah == paramInt) {
      return;
    }
    this.ah = paramInt;
    if (this.ab != null) {
      if (paramInt == 0) {
        break label50;
      }
    }
    label50:
    for (boolean bool = true;; bool = false)
    {
      b(bool);
      if (this.W == null) {
        break;
      }
      this.W.b(paramInt);
      return;
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.x != paramBoolean) {
      this.x = paramBoolean;
    }
  }
  
  float a(float paramFloat)
  {
    return (float)Math.sin((float)(0.47123891676382D * (paramFloat - 0.5F)));
  }
  
  bz a(int paramInt1, int paramInt2)
  {
    bz localbz = new bz();
    localbz.b = paramInt1;
    localbz.a = this.h.a(this, paramInt1);
    localbz.d = this.h.b(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 >= this.e.size()))
    {
      this.e.add(localbz);
      return localbz;
    }
    this.e.add(paramInt2, localbz);
    return localbz;
  }
  
  bz a(View paramView)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      bz localbz = (bz)this.e.get(i1);
      if (this.h.a(paramView, localbz.a)) {
        return localbz;
      }
    }
    return null;
  }
  
  cc a(cc paramcc)
  {
    cc localcc = this.Z;
    this.Z = paramcc;
    return localcc;
  }
  
  void a()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.m = new Scroller(localContext, d);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.E = bj.a(localViewConfiguration);
    this.L = ((int)(400.0F * f1));
    this.M = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.Q = new h(localContext);
    this.R = new h(localContext);
    this.N = ((int)(25.0F * f1));
    this.O = ((int)(2.0F * f1));
    this.C = ((int)(16.0F * f1));
    at.a(this, new ca(this));
    if (at.c(this) == 0) {
      at.b(this, 1);
    }
  }
  
  void a(int paramInt)
  {
    int i21;
    bz localbz1;
    int i1;
    if (this.i != paramInt) {
      if (this.i < paramInt)
      {
        i21 = 66;
        bz localbz13 = b(this.i);
        this.i = paramInt;
        localbz1 = localbz13;
        i1 = i21;
      }
    }
    for (;;)
    {
      if (this.h == null) {
        h();
      }
      do
      {
        return;
        i21 = 17;
        break;
        if (this.y)
        {
          h();
          return;
        }
      } while (getWindowToken() == null);
      this.h.a(this);
      int i2 = this.z;
      int i3 = Math.max(0, this.i - i2);
      int i4 = this.h.a();
      int i5 = Math.min(i4 - 1, i2 + this.i);
      if (i4 != this.b)
      {
        try
        {
          String str2 = getResources().getResourceName(getId());
          str1 = str2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            String str1 = Integer.toHexString(getId());
          }
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + i4 + " Pager id: " + str1 + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
      }
      int i6 = 0;
      bz localbz2;
      if (i6 < this.e.size())
      {
        localbz2 = (bz)this.e.get(i6);
        if (localbz2.b >= this.i) {
          if (localbz2.b != this.i) {
            break label1294;
          }
        }
      }
      for (;;)
      {
        if ((localbz2 == null) && (i4 > 0)) {}
        for (bz localbz3 = a(this.i, i6);; localbz3 = localbz2)
        {
          bz localbz7;
          label358:
          int i12;
          float f1;
          label372:
          float f2;
          int i14;
          int i15;
          int i16;
          float f3;
          int i17;
          bz localbz8;
          if (localbz3 != null)
          {
            int i11 = i6 - 1;
            if (i11 < 0) {
              break label676;
            }
            localbz7 = (bz)this.e.get(i11);
            i12 = getClientWidth();
            if (i12 > 0) {
              break label682;
            }
            f1 = 0.0F;
            int i13 = -1 + this.i;
            f2 = 0.0F;
            i14 = i13;
            i15 = i6;
            i16 = i11;
            if (i14 >= 0)
            {
              if ((f2 < f1) || (i14 >= i3)) {
                break label784;
              }
              if (localbz7 != null) {
                break label704;
              }
            }
            f3 = localbz3.d;
            i17 = i15 + 1;
            if (f3 < 2.0F)
            {
              if (i17 >= this.e.size()) {
                break label889;
              }
              localbz8 = (bz)this.e.get(i17);
              label466:
              if (i12 > 0) {
                break label895;
              }
            }
          }
          Object localObject2;
          int i19;
          int i20;
          label494:
          Object localObject1;
          label554:
          label704:
          label889:
          label895:
          for (float f4 = 0.0F;; f4 = 2.0F + getPaddingRight() / i12)
          {
            int i18 = 1 + this.i;
            localObject2 = localbz8;
            i19 = i17;
            i20 = i18;
            if (i20 < i4)
            {
              if ((f3 < f4) || (i20 <= i5)) {
                break label1016;
              }
              if (localObject2 != null) {
                break label911;
              }
            }
            a(localbz3, i15, localbz1);
            ae localae = this.h;
            int i7 = this.i;
            if (localbz3 == null) {
              break label1153;
            }
            localObject1 = localbz3.a;
            localae.b(this, i7, localObject1);
            this.h.b(this);
            int i8 = getChildCount();
            for (int i9 = 0; i9 < i8; i9++)
            {
              View localView3 = getChildAt(i9);
              ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView3.getLayoutParams();
              localLayoutParams.f = i9;
              if ((!localLayoutParams.a) && (localLayoutParams.c == 0.0F))
              {
                bz localbz6 = a(localView3);
                if (localbz6 != null)
                {
                  localLayoutParams.c = localbz6.d;
                  localLayoutParams.e = localbz6.b;
                }
              }
            }
            i6++;
            break;
            localbz7 = null;
            break label358;
            f1 = 2.0F - localbz3.d + getPaddingLeft() / i12;
            break label372;
            if ((i14 == localbz7.b) && (!localbz7.c))
            {
              this.e.remove(i16);
              this.h.a(this, i14, localbz7.a);
              i16--;
              i15--;
              if (i16 < 0) {
                break label778;
              }
              localbz7 = (bz)this.e.get(i16);
            }
            for (;;)
            {
              i14--;
              break;
              localbz7 = null;
              continue;
              if ((localbz7 != null) && (i14 == localbz7.b))
              {
                f2 += localbz7.d;
                i16--;
                if (i16 >= 0) {
                  localbz7 = (bz)this.e.get(i16);
                } else {
                  localbz7 = null;
                }
              }
              else
              {
                f2 += a(i14, i16 + 1).d;
                i15++;
                if (i16 >= 0) {
                  localbz7 = (bz)this.e.get(i16);
                } else {
                  localbz7 = null;
                }
              }
            }
            localbz8 = null;
            break label466;
          }
          label676:
          label682:
          bz localbz12;
          label778:
          label784:
          label980:
          Object localObject3;
          label911:
          float f6;
          if ((i20 == ((bz)localObject2).b) && (!((bz)localObject2).c))
          {
            this.e.remove(i19);
            this.h.a(this, i20, ((bz)localObject2).a);
            if (i19 < this.e.size())
            {
              localbz12 = (bz)this.e.get(i19);
              float f10 = f3;
              localObject3 = localbz12;
              f6 = f10;
            }
          }
          for (;;)
          {
            i20++;
            float f7 = f6;
            localObject2 = localObject3;
            f3 = f7;
            break label494;
            localbz12 = null;
            break label980;
            label1016:
            if ((localObject2 != null) && (i20 == ((bz)localObject2).b))
            {
              float f8 = f3 + ((bz)localObject2).d;
              i19++;
              if (i19 < this.e.size()) {}
              for (bz localbz11 = (bz)this.e.get(i19);; localbz11 = null)
              {
                localObject3 = localbz11;
                f6 = f8;
                break;
              }
            }
            bz localbz9 = a(i20, i19);
            i19++;
            float f5 = f3 + localbz9.d;
            if (i19 < this.e.size()) {}
            for (bz localbz10 = (bz)this.e.get(i19);; localbz10 = null)
            {
              localObject3 = localbz10;
              f6 = f5;
              break;
            }
            label1153:
            localObject1 = null;
            break label554;
            h();
            if (!hasFocus()) {
              break;
            }
            View localView1 = findFocus();
            if (localView1 != null) {}
            for (bz localbz4 = b(localView1);; localbz4 = null)
            {
              if ((localbz4 != null) && (localbz4.b == this.i)) {
                break label1270;
              }
              for (int i10 = 0;; i10++)
              {
                if (i10 >= getChildCount()) {
                  break label1264;
                }
                View localView2 = getChildAt(i10);
                bz localbz5 = a(localView2);
                if ((localbz5 != null) && (localbz5.b == this.i) && (localView2.requestFocus(i1))) {
                  break;
                }
              }
              label1264:
              break;
            }
            label1270:
            break;
            float f9 = f3;
            localObject3 = localObject2;
            f6 = f9;
          }
        }
        label1294:
        localbz2 = null;
      }
      i1 = 2;
      localbz1 = null;
    }
  }
  
  protected void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.V > 0)
    {
      int i4 = getScrollX();
      int i5 = getPaddingLeft();
      int i6 = getPaddingRight();
      int i7 = getWidth();
      int i8 = getChildCount();
      int i9 = 0;
      while (i9 < i8)
      {
        View localView2 = getChildAt(i9);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView2.getLayoutParams();
        int i12;
        int i13;
        if (!localLayoutParams.a)
        {
          int i20 = i6;
          i12 = i5;
          i13 = i20;
          i9++;
          int i15 = i13;
          i5 = i12;
          i6 = i15;
        }
        else
        {
          int i10;
          switch (0x7 & localLayoutParams.b)
          {
          case 2: 
          case 4: 
          default: 
            i10 = i5;
            int i19 = i6;
            i12 = i5;
            i13 = i19;
          }
          for (;;)
          {
            int i14 = i10 + i4 - localView2.getLeft();
            if (i14 == 0) {
              break;
            }
            localView2.offsetLeftAndRight(i14);
            break;
            int i17 = i5 + localView2.getWidth();
            int i18 = i5;
            i13 = i6;
            i12 = i17;
            i10 = i18;
            continue;
            i10 = Math.max((i7 - localView2.getMeasuredWidth()) / 2, i5);
            int i16 = i6;
            i12 = i5;
            i13 = i16;
            continue;
            i10 = i7 - i6 - localView2.getMeasuredWidth();
            int i11 = i6 + localView2.getMeasuredWidth();
            i12 = i5;
            i13 = i11;
          }
        }
      }
    }
    if (this.W != null) {
      this.W.a(paramInt1, paramFloat, paramInt2);
    }
    if (this.Z != null) {
      this.Z.a(paramInt1, paramFloat, paramInt2);
    }
    if (this.ab != null)
    {
      int i1 = getScrollX();
      int i2 = getChildCount();
      int i3 = 0;
      if (i3 < i2)
      {
        View localView1 = getChildAt(i3);
        if (((ViewPager.LayoutParams)localView1.getLayoutParams()).a) {}
        for (;;)
        {
          i3++;
          break;
          float f1 = (localView1.getLeft() - i1) / getClientWidth();
          this.ab.a(localView1, f1);
        }
      }
    }
    this.U = true;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i1 = getScrollX();
    int i2 = getScrollY();
    int i3 = paramInt1 - i1;
    int i4 = paramInt2 - i2;
    if ((i3 == 0) && (i4 == 0))
    {
      a(false);
      c();
      setScrollState(0);
      return;
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    int i5 = getClientWidth();
    int i6 = i5 / 2;
    float f1 = Math.min(1.0F, 1.0F * Math.abs(i3) / i5);
    float f2 = i6 + i6 * a(f1);
    int i7 = Math.abs(paramInt3);
    if (i7 > 0) {}
    float f3;
    for (int i8 = 4 * Math.round(1000.0F * Math.abs(f2 / i7));; i8 = (int)(100.0F * (1.0F + Math.abs(i3) / (f3 + this.o))))
    {
      int i9 = Math.min(i8, 600);
      this.m.startScroll(i1, i2, i3, i4, i9);
      at.b(this);
      return;
      f3 = i5 * this.h.b(this.i);
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.y = false;
    a(paramInt, paramBoolean, false);
  }
  
  void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.h == null) || (this.h.a() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.i == paramInt1) && (this.e.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    for (;;)
    {
      int i1 = this.z;
      if ((paramInt1 <= i1 + this.i) && (paramInt1 >= this.i - i1)) {
        break;
      }
      for (int i2 = 0; i2 < this.e.size(); i2++) {
        ((bz)this.e.get(i2)).c = true;
      }
      if (paramInt1 >= this.h.a()) {
        paramInt1 = -1 + this.h.a();
      }
    }
    int i3 = this.i;
    boolean bool = false;
    if (i3 != paramInt1) {
      bool = true;
    }
    if (this.S)
    {
      this.i = paramInt1;
      if ((bool) && (this.W != null)) {
        this.W.a(paramInt1);
      }
      if ((bool) && (this.Z != null)) {
        this.Z.a(paramInt1);
      }
      requestLayout();
      return;
    }
    a(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0) {
      switch (paramKeyEvent.getKeyCode())
      {
      }
    }
    do
    {
      do
      {
        return false;
        return c(17);
        return c(66);
      } while (Build.VERSION.SDK_INT < 11);
      if (s.a(paramKeyEvent)) {
        return c(2);
      }
    } while (!s.a(paramKeyEvent, 1));
    return c(1);
  }
  
  protected boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      i3 = -1 + localViewGroup.getChildCount();
      if (i3 >= 0)
      {
        localView = localViewGroup.getChildAt(i3);
        if ((paramInt2 + i1 < localView.getLeft()) || (paramInt2 + i1 >= localView.getRight()) || (paramInt3 + i2 < localView.getTop()) || (paramInt3 + i2 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i1 - localView.getLeft(), paramInt3 + i2 - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (at.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i3--;
      break;
    }
    return false;
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216) {
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() == 0)
        {
          bz localbz = a(localView);
          if ((localbz != null) && (localbz.b == this.i)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if (((i2 == 262144) && (i1 != paramArrayList.size())) || (!isFocusable())) {}
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null)) {
      return;
    }
    paramArrayList.add(this);
  }
  
  public void addTouchables(ArrayList paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        bz localbz = a(localView);
        if ((localbz != null) && (localbz.b == this.i)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {}
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams);; localLayoutParams = paramLayoutParams)
    {
      ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localLayoutParams;
      localLayoutParams1.a |= paramView instanceof by;
      if (this.w)
      {
        if ((localLayoutParams1 != null) && (localLayoutParams1.a)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localLayoutParams1.d = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }
  
  bz b(int paramInt)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      bz localbz = (bz)this.e.get(i1);
      if (localbz.b == paramInt) {
        return localbz;
      }
    }
    return null;
  }
  
  bz b(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        return null;
      }
      paramView = (View)localViewParent;
    }
    return a(paramView);
  }
  
  void b()
  {
    int i1 = this.h.a();
    this.b = i1;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    label61:
    bz localbz;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    if ((this.e.size() < 1 + 2 * this.z) && (this.e.size() < i1))
    {
      i2 = 1;
      int i3 = this.i;
      i4 = 0;
      i5 = i3;
      i6 = i2;
      i7 = 0;
      if (i7 >= this.e.size()) {
        break label307;
      }
      localbz = (bz)this.e.get(i7);
      i10 = this.h.a(localbz.a);
      if (i10 != -1) {
        break label153;
      }
      i11 = i7;
      i12 = i4;
      i13 = i5;
      i14 = i6;
    }
    for (;;)
    {
      int i15 = i11 + 1;
      i6 = i14;
      i5 = i13;
      i4 = i12;
      i7 = i15;
      break label61;
      i2 = 0;
      break;
      label153:
      int i16;
      if (i10 == -2)
      {
        this.e.remove(i7);
        i16 = i7 - 1;
        if (i4 == 0)
        {
          this.h.a(this);
          i4 = 1;
        }
        this.h.a(this, localbz.b, localbz.a);
        if (this.i == localbz.b)
        {
          int i17 = Math.max(0, Math.min(this.i, i1 - 1));
          i11 = i16;
          i12 = i4;
          i13 = i17;
          i14 = 1;
        }
      }
      else
      {
        if (localbz.b != i10)
        {
          if (localbz.b == this.i) {
            i5 = i10;
          }
          localbz.b = i10;
          i11 = i7;
          i12 = i4;
          i13 = i5;
          i14 = 1;
          continue;
          label307:
          if (i4 != 0) {
            this.h.b(this);
          }
          Collections.sort(this.e, c);
          if (i6 != 0)
          {
            int i8 = getChildCount();
            for (int i9 = 0; i9 < i8; i9++)
            {
              ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)getChildAt(i9).getLayoutParams();
              if (!localLayoutParams.a) {
                localLayoutParams.c = 0.0F;
              }
            }
            a(i5, false, true);
            requestLayout();
          }
          return;
        }
        i11 = i7;
        i12 = i4;
        i13 = i5;
        i14 = i6;
        continue;
      }
      i11 = i16;
      i12 = i4;
      i13 = i5;
      i14 = 1;
    }
  }
  
  void c()
  {
    a(this.i);
  }
  
  public boolean c(int paramInt)
  {
    View localView1 = findFocus();
    View localView2;
    View localView3;
    boolean bool;
    label86:
    ViewParent localViewParent1;
    if (localView1 == this)
    {
      localView2 = null;
      localView3 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
      if ((localView3 == null) || (localView3 == localView2)) {
        break label325;
      }
      if (paramInt != 17) {
        break label260;
      }
      int i3 = a(this.g, localView3).left;
      int i4 = a(this.g, localView2).left;
      if ((localView2 != null) && (i3 >= i4))
      {
        bool = d();
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        return bool;
      }
    }
    else
    {
      if (localView1 == null) {
        break label371;
      }
      localViewParent1 = localView1.getParent();
      if (!(localViewParent1 instanceof ViewGroup)) {
        break label376;
      }
      if (localViewParent1 != this) {}
    }
    label260:
    label325:
    label371:
    label376:
    for (int i5 = 1;; i5 = 0)
    {
      if (i5 == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView1.getClass().getSimpleName());
        ViewParent localViewParent2 = localView1.getParent();
        for (;;)
        {
          if ((localViewParent2 instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localViewParent2.getClass().getSimpleName());
            localViewParent2 = localViewParent2.getParent();
            continue;
            localViewParent1 = localViewParent1.getParent();
            break;
          }
        }
        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + localStringBuilder.toString());
        localView2 = null;
        break;
        bool = localView3.requestFocus();
        break label86;
        if (paramInt == 66)
        {
          int i1 = a(this.g, localView3).left;
          int i2 = a(this.g, localView2).left;
          if ((localView2 != null) && (i1 <= i2))
          {
            bool = e();
            break label86;
          }
          bool = localView3.requestFocus();
          break label86;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = d();
            break label86;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = e();
            break label86;
          }
        }
        bool = false;
        break label86;
      }
      localView2 = localView1;
      break;
    }
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool = true;
    if (this.h == null) {}
    int i1;
    int i2;
    do
    {
      return false;
      i1 = getClientWidth();
      i2 = getScrollX();
      if (paramInt < 0)
      {
        if (i2 > (int)(i1 * this.s)) {}
        for (;;)
        {
          return bool;
          bool = false;
        }
      }
    } while (paramInt <= 0);
    if (i2 < (int)(i1 * this.t)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof ViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    if ((!this.m.isFinished()) && (this.m.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.m.getCurrX();
      int i4 = this.m.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!d(i3))
        {
          this.m.abortAnimation();
          scrollTo(0, i4);
        }
      }
      at.b(this);
      return;
    }
    a(true);
  }
  
  boolean d()
  {
    if (this.i > 0)
    {
      a(-1 + this.i, true);
      return true;
    }
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (a(paramKeyEvent));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool;
    }
    int i1 = getChildCount();
    for (int i2 = 0;; i2++)
    {
      bool = false;
      if (i2 >= i1) {
        break;
      }
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 0)
      {
        bz localbz = a(localView);
        if ((localbz != null) && (localbz.b == this.i) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = at.a(this);
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.h != null) && (this.h.a() > 1)))
    {
      boolean bool1 = this.Q.a();
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.s * i7);
        this.Q.a(i6, i7);
        bool2 = false | this.Q.a(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.R.a())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.t) * i3);
        this.R.a(i4, i3);
        bool2 |= this.R.a(paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    for (;;)
    {
      if (bool2) {
        at.b(this);
      }
      return;
      this.Q.b();
      this.R.b();
      bool2 = false;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.p;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  boolean e()
  {
    if ((this.h != null) && (this.i < -1 + this.h.a()))
    {
      a(1 + this.i, true);
      return true;
    }
    return false;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewPager.LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewPager.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  public ae getAdapter()
  {
    return this.h;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ad == 2) {
      paramInt2 = paramInt1 - 1 - paramInt2;
    }
    return ((ViewPager.LayoutParams)((View)this.ae.get(paramInt2)).getLayoutParams()).f;
  }
  
  public int getCurrentItem()
  {
    return this.i;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.z;
  }
  
  public int getPageMargin()
  {
    return this.o;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.S = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.ag);
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1;
    int i2;
    float f1;
    bz localbz;
    float f2;
    int i3;
    int i4;
    int i5;
    int i6;
    if ((this.o > 0) && (this.p != null) && (this.e.size() > 0) && (this.h != null))
    {
      i1 = getScrollX();
      i2 = getWidth();
      f1 = this.o / i2;
      localbz = (bz)this.e.get(0);
      f2 = localbz.e;
      i3 = this.e.size();
      i4 = localbz.b;
      i5 = ((bz)this.e.get(i3 - 1)).b;
      i6 = 0;
    }
    for (int i7 = i4;; i7++)
    {
      float f4;
      if (i7 < i5)
      {
        while ((i7 > localbz.b) && (i6 < i3))
        {
          ArrayList localArrayList = this.e;
          i6++;
          localbz = (bz)localArrayList.get(i6);
        }
        if (i7 != localbz.b) {
          break label272;
        }
        f4 = (localbz.e + localbz.d) * i2;
      }
      label272:
      float f3;
      for (f2 = f1 + (localbz.e + localbz.d);; f2 += f3 + f1)
      {
        if (f4 + this.o > i1)
        {
          this.p.setBounds((int)f4, this.q, (int)(0.5F + (f4 + this.o)), this.r);
          this.p.draw(paramCanvas);
        }
        if (f4 <= i1 + i2) {
          break;
        }
        return;
        f3 = this.h.b(i7);
        f4 = (f2 + f3) * i2;
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.A = false;
      this.B = false;
      this.J = -1;
      if (this.K != null)
      {
        this.K.recycle();
        this.K = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0) {
        break;
      }
      if (this.A) {
        return true;
      }
    } while (this.B);
    switch (i1)
    {
    }
    for (;;)
    {
      if (this.K == null) {
        this.K = VelocityTracker.obtain();
      }
      this.K.addMovement(paramMotionEvent);
      return this.A;
      int i2 = this.J;
      if (i2 != -1)
      {
        int i3 = z.a(paramMotionEvent, i2);
        float f3 = z.c(paramMotionEvent, i3);
        float f4 = f3 - this.F;
        float f5 = Math.abs(f4);
        float f6 = z.d(paramMotionEvent, i3);
        float f7 = Math.abs(f6 - this.I);
        if ((f4 != 0.0F) && (!a(this.F, f4)) && (a(this, false, (int)f4, (int)f3, (int)f6)))
        {
          this.F = f3;
          this.G = f6;
          this.B = true;
          return false;
        }
        float f8;
        if ((f5 > this.E) && (0.5F * f5 > f7))
        {
          this.A = true;
          c(true);
          setScrollState(1);
          if (f4 > 0.0F)
          {
            f8 = this.H + this.E;
            label317:
            this.F = f8;
            this.G = f6;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.A) && (b(f3)))
        {
          at.b(this);
          break;
          f8 = this.H - this.E;
          break label317;
          if (f7 > this.E) {
            this.B = true;
          }
        }
        float f1 = paramMotionEvent.getX();
        this.H = f1;
        this.F = f1;
        float f2 = paramMotionEvent.getY();
        this.I = f2;
        this.G = f2;
        this.J = z.b(paramMotionEvent, 0);
        this.B = false;
        this.m.computeScrollOffset();
        if ((this.ah == 2) && (Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O))
        {
          this.m.abortAnimation();
          this.y = false;
          c();
          this.A = true;
          c(true);
          setScrollState(1);
        }
        else
        {
          a(false);
          this.A = false;
          continue;
          a(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView2;
    int i21;
    label156:
    int i22;
    int i24;
    int i25;
    label208:
    int i14;
    int i15;
    int i16;
    if (i10 < i1)
    {
      localView2 = getChildAt(i10);
      if (localView2.getVisibility() == 8) {
        break label659;
      }
      ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
      if (!localLayoutParams2.a) {
        break label659;
      }
      int i18 = 0x7 & localLayoutParams2.b;
      int i19 = 0x70 & localLayoutParams2.b;
      switch (i18)
      {
      case 2: 
      case 4: 
      default: 
        i21 = i4;
        switch (i19)
        {
        default: 
          i22 = i5;
          int i30 = i7;
          i24 = i5;
          i25 = i30;
          int i26 = i21 + i8;
          localView2.layout(i26, i22, i26 + localView2.getMeasuredWidth(), i22 + localView2.getMeasuredHeight());
          i14 = i9 + 1;
          i15 = i24;
          i7 = i25;
          i16 = i6;
        }
        break;
      }
    }
    for (int i17 = i4;; i17 = i4)
    {
      i10++;
      i4 = i17;
      i6 = i16;
      i5 = i15;
      i9 = i14;
      break;
      int i31 = i4 + localView2.getMeasuredWidth();
      i21 = i4;
      i4 = i31;
      break label156;
      i21 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, i4);
      break label156;
      int i20 = i2 - i6 - localView2.getMeasuredWidth();
      i6 += localView2.getMeasuredWidth();
      i21 = i20;
      break label156;
      int i28 = i5 + localView2.getMeasuredHeight();
      int i29 = i5;
      i25 = i7;
      i24 = i28;
      i22 = i29;
      break label208;
      i22 = Math.max((i3 - localView2.getMeasuredHeight()) / 2, i5);
      int i27 = i7;
      i24 = i5;
      i25 = i27;
      break label208;
      i22 = i3 - i7 - localView2.getMeasuredHeight();
      int i23 = i7 + localView2.getMeasuredHeight();
      i24 = i5;
      i25 = i23;
      break label208;
      int i11 = i2 - i4 - i6;
      for (int i12 = 0; i12 < i1; i12++)
      {
        View localView1 = getChildAt(i12);
        if (localView1.getVisibility() != 8)
        {
          ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
          if (!localLayoutParams1.a)
          {
            bz localbz = a(localView1);
            if (localbz != null)
            {
              int i13 = i4 + (int)(i11 * localbz.e);
              if (localLayoutParams1.d)
              {
                localLayoutParams1.d = false;
                localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i11 * localLayoutParams1.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - i5 - i7, 1073741824));
              }
              localView1.layout(i13, i5, i13 + localView1.getMeasuredWidth(), i5 + localView1.getMeasuredHeight());
            }
          }
        }
      }
      this.q = i5;
      this.r = (i3 - i7);
      this.V = i9;
      if (this.S) {
        a(this.i, false, 0, false);
      }
      this.S = false;
      return;
      label659:
      i14 = i9;
      i15 = i5;
      i16 = i6;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i1 = getMeasuredWidth();
    this.D = Math.min(i1 / 10, this.C);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int i5 = 0;
    View localView2;
    ViewPager.LayoutParams localLayoutParams2;
    int i10;
    int i11;
    int i12;
    label167:
    int i13;
    label182:
    label192:
    int i14;
    int i15;
    if (i5 < i4)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() != 8)
      {
        localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if ((localLayoutParams2 != null) && (localLayoutParams2.a))
        {
          int i8 = 0x7 & localLayoutParams2.b;
          int i9 = 0x70 & localLayoutParams2.b;
          i10 = -2147483648;
          i11 = -2147483648;
          if ((i9 != 48) && (i9 != 80)) {
            break label294;
          }
          i12 = 1;
          if ((i8 != 3) && (i8 != 5)) {
            break label300;
          }
          i13 = 1;
          if (i12 == 0) {
            break label306;
          }
          i10 = 1073741824;
          if (localLayoutParams2.width == -2) {
            break label478;
          }
          i14 = 1073741824;
          if (localLayoutParams2.width == -1) {
            break label471;
          }
          i15 = localLayoutParams2.width;
        }
      }
    }
    for (;;)
    {
      if (localLayoutParams2.height != -2)
      {
        i11 = 1073741824;
        if (localLayoutParams2.height == -1) {}
      }
      for (int i16 = localLayoutParams2.height;; i16 = i3)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i11));
        if (i12 != 0) {
          i3 -= localView2.getMeasuredHeight();
        }
        for (;;)
        {
          i5++;
          break;
          label294:
          i12 = 0;
          break label167;
          label300:
          i13 = 0;
          break label182;
          label306:
          if (i13 == 0) {
            break label192;
          }
          i11 = 1073741824;
          break label192;
          if (i13 != 0) {
            i2 -= localView2.getMeasuredWidth();
          }
        }
        this.u = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.v = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.w = true;
        c();
        this.w = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() != 8)
          {
            ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
            if ((localLayoutParams1 == null) || (!localLayoutParams1.a)) {
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localLayoutParams1.c), 1073741824), this.v);
            }
          }
        }
        return;
      }
      label471:
      i15 = i2;
      continue;
      label478:
      i14 = i10;
      i15 = i2;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = -1;
    int i2 = getChildCount();
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = 1;
      i3 = 0;
    }
    while (i3 != i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 0)
      {
        bz localbz = a(localView);
        if ((localbz != null) && (localbz.b == this.i) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i3 = i2 - 1;
          i2 = i1;
          continue;
        }
      }
      i3 += i1;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    ViewPager.SavedState localSavedState = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.h != null)
    {
      this.h.a(localSavedState.b, localSavedState.c);
      a(localSavedState.a, false, true);
      return;
    }
    this.j = localSavedState.a;
    this.k = localSavedState.b;
    this.l = localSavedState.c;
  }
  
  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.i;
    if (this.h != null) {
      localSavedState.b = this.h.b();
    }
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      a(paramInt1, paramInt3, this.o, this.o);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.P) {
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if ((this.h == null) || (this.h.a() == 0)) {
      return false;
    }
    if (this.K == null) {
      this.K = VelocityTracker.obtain();
    }
    this.K.addMovement(paramMotionEvent);
    int i1 = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i1)
    {
    }
    for (;;)
    {
      if (bool1) {
        at.b(this);
      }
      return true;
      this.m.abortAnimation();
      this.y = false;
      c();
      float f6 = paramMotionEvent.getX();
      this.H = f6;
      this.F = f6;
      float f7 = paramMotionEvent.getY();
      this.I = f7;
      this.G = f7;
      this.J = z.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      float f3;
      if (!this.A)
      {
        int i6 = z.a(paramMotionEvent, this.J);
        float f1 = z.c(paramMotionEvent, i6);
        float f2 = Math.abs(f1 - this.F);
        f3 = z.d(paramMotionEvent, i6);
        float f4 = Math.abs(f3 - this.G);
        if ((f2 > this.E) && (f2 > f4))
        {
          this.A = true;
          c(true);
          if (f1 - this.H <= 0.0F) {
            break label382;
          }
        }
      }
      label382:
      for (float f5 = this.H + this.E;; f5 = this.H - this.E)
      {
        this.F = f5;
        this.G = f3;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        ViewParent localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        boolean bool4 = this.A;
        bool1 = false;
        if (!bool4) {
          break;
        }
        bool1 = false | b(z.c(paramMotionEvent, z.a(paramMotionEvent, this.J)));
        break;
      }
      boolean bool3 = this.A;
      bool1 = false;
      if (bool3)
      {
        VelocityTracker localVelocityTracker = this.K;
        localVelocityTracker.computeCurrentVelocity(1000, this.M);
        int i3 = (int)ao.a(localVelocityTracker, this.J);
        this.y = true;
        int i4 = getClientWidth();
        int i5 = getScrollX();
        bz localbz = i();
        a(a(localbz.b, (i5 / i4 - localbz.e) / localbz.d, i3, (int)(z.c(paramMotionEvent, z.a(paramMotionEvent, this.J)) - this.H)), true, true, i3);
        this.J = -1;
        j();
        bool1 = this.Q.c() | this.R.c();
        continue;
        boolean bool2 = this.A;
        bool1 = false;
        if (bool2)
        {
          a(this.i, true, 0, false);
          this.J = -1;
          j();
          bool1 = this.Q.c() | this.R.c();
          continue;
          int i2 = z.b(paramMotionEvent);
          this.F = z.c(paramMotionEvent, i2);
          this.J = z.b(paramMotionEvent, i2);
          bool1 = false;
          continue;
          a(paramMotionEvent);
          this.F = z.c(paramMotionEvent, z.a(paramMotionEvent, this.J));
          bool1 = false;
        }
      }
    }
  }
  
  public void removeView(View paramView)
  {
    if (this.w)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdapter(ae paramae)
  {
    if (this.h != null)
    {
      this.h.b(this.n);
      this.h.a(this);
      for (int i1 = 0; i1 < this.e.size(); i1++)
      {
        bz localbz = (bz)this.e.get(i1);
        this.h.a(this, localbz.b, localbz.a);
      }
      this.h.b(this);
      this.e.clear();
      g();
      this.i = 0;
      scrollTo(0, 0);
    }
    ae localae = this.h;
    this.h = paramae;
    this.b = 0;
    boolean bool;
    if (this.h != null)
    {
      if (this.n == null) {
        this.n = new ce(this, null);
      }
      this.h.a(this.n);
      this.y = false;
      bool = this.S;
      this.S = true;
      this.b = this.h.a();
      if (this.j < 0) {
        break label259;
      }
      this.h.a(this.k, this.l);
      a(this.j, false, true);
      this.j = -1;
      this.k = null;
      this.l = null;
    }
    for (;;)
    {
      if ((this.aa != null) && (localae != paramae)) {
        this.aa.a(localae, paramae);
      }
      return;
      label259:
      if (!bool) {
        c();
      } else {
        requestLayout();
      }
    }
  }
  
  void setChildrenDrawingOrderEnabledCompat(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT < 7) || (this.ac == null)) {}
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      this.ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          Method localMethod = this.ac;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(paramBoolean);
          localMethod.invoke(this, arrayOfObject);
          return;
        }
        catch (Exception localException)
        {
          Log.e("ViewPager", "Error changing children drawing order", localException);
        }
        localNoSuchMethodException = localNoSuchMethodException;
        Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", localNoSuchMethodException);
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.y = false;
    if (!this.S) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    if (paramInt < 1)
    {
      Log.w("ViewPager", "Requested offscreen page limit " + paramInt + " too small; defaulting to " + 1);
      paramInt = 1;
    }
    if (paramInt != this.z)
    {
      this.z = paramInt;
      c();
    }
  }
  
  void setOnAdapterChangeListener(cb paramcb)
  {
    this.aa = paramcb;
  }
  
  public void setOnPageChangeListener(cc paramcc)
  {
    this.W = paramcc;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i1 = this.o;
    this.o = paramInt;
    int i2 = getWidth();
    a(i2, i2, paramInt, i1);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(getContext().getResources().getDrawable(paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.p = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    if (paramDrawable == null) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.p);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.7.0.1
 */