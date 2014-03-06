package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  static final y a = new z();
  private int b = -858993460;
  private int c;
  private Drawable d;
  private final int e;
  private boolean f;
  private View g;
  private float h;
  private float i;
  private int j;
  private boolean k;
  private int l;
  private float m;
  private float n;
  private w o;
  private final ac p;
  private boolean q;
  private boolean r = true;
  private final Rect s = new Rect();
  private final ArrayList t = new ArrayList();
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 17)
    {
      a = new ab();
      return;
    }
    if (i1 >= 16)
    {
      a = new aa();
      return;
    }
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.e = ((int)(0.5F + 32.0F * f1));
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    at.a(this, new t(this));
    at.b(this, 1);
    this.p = ac.a(this, 0.5F, new v(this, null));
    this.p.a(1);
    this.p.a(f1 * 400.0F);
  }
  
  private void a(float paramFloat)
  {
    int i1 = 0;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    int i2;
    label36:
    View localView;
    if ((localLayoutParams.c) && (localLayoutParams.leftMargin <= 0))
    {
      i2 = 1;
      int i3 = getChildCount();
      if (i1 >= i3) {
        return;
      }
      localView = getChildAt(i1);
      if (localView != this.g) {
        break label70;
      }
    }
    for (;;)
    {
      i1++;
      break label36;
      i2 = 0;
      break;
      label70:
      int i4 = (int)((1.0F - this.i) * this.l);
      this.i = paramFloat;
      localView.offsetLeftAndRight(i4 - (int)((1.0F - paramFloat) * this.l));
      if (i2 != 0) {
        a(localView, 1.0F - this.i, this.c);
      }
    }
  }
  
  private void a(int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    this.h = ((paramInt - (getPaddingLeft() + localLayoutParams.leftMargin)) / this.j);
    if (this.l != 0) {
      a(this.h);
    }
    if (localLayoutParams.c) {
      a(this.g, this.h, this.b);
    }
    a(this.g);
  }
  
  private void a(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i1 = (int)(paramFloat * ((0xFF000000 & paramInt) >>> 24)) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.d == null) {
        localLayoutParams.d = new Paint();
      }
      localLayoutParams.d.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_OVER));
      if (at.d(paramView) != 2) {
        at.a(paramView, 2, localLayoutParams.d);
      }
      g(paramView);
    }
    while (at.d(paramView) == 0)
    {
      int i1;
      return;
    }
    if (localLayoutParams.d != null) {
      localLayoutParams.d.setColorFilter(null);
    }
    u localu = new u(this, paramView);
    this.t.add(localu);
    at.a(this, localu);
  }
  
  private boolean a(View paramView, int paramInt)
  {
    boolean bool1;
    if (!this.r)
    {
      boolean bool2 = a(0.0F, paramInt);
      bool1 = false;
      if (!bool2) {}
    }
    else
    {
      this.q = false;
      bool1 = true;
    }
    return bool1;
  }
  
  private boolean b(View paramView, int paramInt)
  {
    if ((this.r) || (a(1.0F, paramInt)))
    {
      this.q = true;
      return true;
    }
    return false;
  }
  
  private static boolean f(View paramView)
  {
    if (at.g(paramView)) {}
    Drawable localDrawable;
    do
    {
      return true;
      if (Build.VERSION.SDK_INT >= 18) {
        return false;
      }
      localDrawable = paramView.getBackground();
      if (localDrawable == null) {
        break;
      }
    } while (localDrawable.getOpacity() == -1);
    return false;
    return false;
  }
  
  private void g(View paramView)
  {
    a.a(this, paramView);
  }
  
  void a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
    }
  }
  
  void a(View paramView)
  {
    if (this.o != null) {
      this.o.a(paramView, this.h);
    }
  }
  
  boolean a(float paramFloat, int paramInt)
  {
    if (!this.f) {
      return false;
    }
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    int i1 = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.j);
    if (this.p.a(this.g, i1, this.g.getTop()))
    {
      a();
      at.b(this);
      return true;
    }
    return false;
  }
  
  void b(View paramView)
  {
    if (this.o != null) {
      this.o.a(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  public boolean b()
  {
    return b(this.g, 0);
  }
  
  void c(View paramView)
  {
    if (this.o != null) {
      this.o.b(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  public boolean c()
  {
    return a(this.g, 0);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    if (this.p.a(true))
    {
      if (!this.f) {
        this.p.f();
      }
    }
    else {
      return;
    }
    at.b(this);
  }
  
  void d(View paramView)
  {
    int i1 = getPaddingLeft();
    int i2 = getWidth() - getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = getHeight() - getPaddingBottom();
    int i8;
    int i7;
    int i6;
    int i5;
    if ((paramView != null) && (f(paramView)))
    {
      i8 = paramView.getLeft();
      i7 = paramView.getRight();
      i6 = paramView.getTop();
      i5 = paramView.getBottom();
    }
    int i10;
    View localView;
    for (;;)
    {
      int i9 = getChildCount();
      i10 = 0;
      if (i10 < i9)
      {
        localView = getChildAt(i10);
        if (localView != paramView) {
          break;
        }
      }
      return;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
    }
    int i11 = Math.max(i1, localView.getLeft());
    int i12 = Math.max(i3, localView.getTop());
    int i13 = Math.min(i2, localView.getRight());
    int i14 = Math.min(i4, localView.getBottom());
    if ((i11 >= i8) && (i12 >= i6) && (i13 <= i7) && (i14 <= i5)) {}
    for (int i15 = 4;; i15 = 0)
    {
      localView.setVisibility(i15);
      i10++;
      break;
    }
  }
  
  public boolean d()
  {
    return (!this.f) || (this.h == 1.0F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (getChildCount() > 1) {}
    for (View localView = getChildAt(1); (localView == null) || (this.d == null); localView = null) {
      return;
    }
    int i1 = this.d.getIntrinsicWidth();
    int i2 = localView.getLeft();
    int i3 = localView.getTop();
    int i4 = localView.getBottom();
    int i5 = i2 - i1;
    this.d.setBounds(i5, i3, i2, i4);
    this.d.draw(paramCanvas);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i1 = paramCanvas.save(2);
    if ((this.f) && (!localLayoutParams.b) && (this.g != null))
    {
      paramCanvas.getClipBounds(this.s);
      this.s.right = Math.min(this.s.right, this.g.getLeft());
      paramCanvas.clipRect(this.s);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = super.drawChild(paramCanvas, paramView, paramLong);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(i1);
      return bool;
      if ((localLayoutParams.c) && (this.h > 0.0F))
      {
        if (!paramView.isDrawingCacheEnabled()) {
          paramView.setDrawingCacheEnabled(true);
        }
        Bitmap localBitmap = paramView.getDrawingCache();
        if (localBitmap != null)
        {
          paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.d);
          bool = false;
        }
        else
        {
          Log.e("SlidingPaneLayout", "drawChild: child view " + paramView + " returned null drawing cache");
          bool = super.drawChild(paramCanvas, paramView, paramLong);
        }
      }
      else
      {
        if (paramView.isDrawingCacheEnabled()) {
          paramView.setDrawingCacheEnabled(false);
        }
        bool = super.drawChild(paramCanvas, paramView, paramLong);
      }
    }
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  boolean e(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((this.f) && (localLayoutParams.c) && (this.h > 0.0F)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }
  
  public int getCoveredFadeColor()
  {
    return this.c;
  }
  
  public int getParallaxDistance()
  {
    return this.l;
  }
  
  public int getSliderFadeColor()
  {
    return this.b;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.r = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.r = true;
    int i1 = this.t.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((u)this.t.get(i2)).run();
    }
    this.t.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = android.support.v4.view.z.a(paramMotionEvent);
    if ((!this.f) && (i1 == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        if (this.p.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
          break label100;
        }
      }
    }
    boolean bool1;
    label100:
    for (boolean bool2 = true;; bool2 = false)
    {
      this.q = bool2;
      if ((this.f) && ((!this.k) || (i1 == 0))) {
        break;
      }
      this.p.e();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i1 == 3) || (i1 == 1))
    {
      this.p.e();
      return false;
    }
    switch (i1)
    {
    }
    label152:
    float f3;
    float f4;
    do
    {
      for (int i2 = 0;; i2 = 1)
      {
        if (!this.p.a(paramMotionEvent))
        {
          bool1 = false;
          if (i2 == 0) {
            break;
          }
        }
        return true;
        this.k = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.m = f5;
        this.n = f6;
        if ((!this.p.b(this.g, (int)f5, (int)f6)) || (!e(this.g))) {
          break label152;
        }
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.m);
      f4 = Math.abs(f2 - this.n);
    } while ((f3 <= this.p.d()) || (f4 <= f3));
    this.p.e();
    this.k = true;
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt3 - paramInt1;
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    int i4 = getPaddingTop();
    int i5 = getChildCount();
    if (this.r) {
      if ((!this.f) || (!this.q)) {
        break label106;
      }
    }
    int i7;
    View localView;
    int i10;
    label106:
    for (float f1 = 1.0F;; f1 = 0.0F)
    {
      this.h = f1;
      int i6 = 0;
      for (i7 = i2;; i7 = i10)
      {
        if (i6 >= i5) {
          break label330;
        }
        localView = getChildAt(i6);
        if (localView.getVisibility() != 8) {
          break;
        }
        i10 = i7;
        i6++;
      }
    }
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
    int i9 = localView.getMeasuredWidth();
    boolean bool;
    label206:
    int i11;
    if (localLayoutParams.b)
    {
      int i13 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i14 = Math.min(i2, i1 - i3 - this.e) - i7 - i13;
      this.j = i14;
      if (i14 + (i7 + localLayoutParams.leftMargin) + i9 / 2 > i1 - i3)
      {
        bool = true;
        localLayoutParams.c = bool;
        i10 = i7 + ((int)(i14 * this.h) + localLayoutParams.leftMargin);
        i11 = 0;
      }
    }
    for (;;)
    {
      int i12 = i10 - i11;
      localView.layout(i12, i4, i12 + i9, i4 + localView.getMeasuredHeight());
      i2 += localView.getWidth();
      break;
      bool = false;
      break label206;
      if ((this.f) && (this.l != 0))
      {
        i11 = (int)((1.0F - this.h) * this.l);
        i10 = i2;
      }
      else
      {
        i10 = i2;
        i11 = 0;
      }
    }
    label330:
    if (this.r)
    {
      if (!this.f) {
        break label405;
      }
      if (this.l != 0) {
        a(this.h);
      }
      if (((SlidingPaneLayout.LayoutParams)this.g.getLayoutParams()).c) {
        a(this.g, this.h, this.b);
      }
    }
    for (;;)
    {
      d(this.g);
      this.r = false;
      return;
      label405:
      for (int i8 = 0; i8 < i5; i8++) {
        a(getChildAt(i8), 0.0F, this.b);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    int i7;
    if (i1 != 1073741824) {
      if (isInEditMode()) {
        if (i1 == -2147483648)
        {
          i5 = i3;
          i6 = i2;
          i7 = i4;
        }
      }
    }
    for (;;)
    {
      int i9;
      int i8;
      label90:
      boolean bool1;
      int i10;
      int i11;
      int i12;
      int i13;
      float f1;
      label144:
      View localView2;
      SlidingPaneLayout.LayoutParams localLayoutParams2;
      int i29;
      float f3;
      int i30;
      switch (i5)
      {
      default: 
        i9 = 0;
        i8 = -1;
        bool1 = false;
        i10 = i6 - getPaddingLeft() - getPaddingRight();
        i11 = getChildCount();
        if (i11 > 2) {
          Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.g = null;
        i12 = 0;
        i13 = i9;
        f1 = 0.0F;
        if (i12 >= i11) {
          break label641;
        }
        localView2 = getChildAt(i12);
        localLayoutParams2 = (SlidingPaneLayout.LayoutParams)localView2.getLayoutParams();
        if (localView2.getVisibility() == 8)
        {
          localLayoutParams2.c = false;
          i29 = i10;
          f3 = f1;
          i30 = i13;
        }
        break;
      }
      for (boolean bool4 = bool1;; bool4 = bool1)
      {
        i12++;
        bool1 = bool4;
        i13 = i30;
        f1 = f3;
        i10 = i29;
        break label144;
        if (i1 != 0) {
          break label1116;
        }
        i5 = i3;
        i6 = 300;
        i7 = i4;
        break;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i3 != 0) {
          break label1116;
        }
        if (isInEditMode())
        {
          if (i3 != 0) {
            break label1116;
          }
          i5 = -2147483648;
          i6 = i2;
          i7 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i9 = i7 - getPaddingTop() - getPaddingBottom();
        i8 = i9;
        break label90;
        i8 = i7 - getPaddingTop() - getPaddingBottom();
        i9 = 0;
        break label90;
        if (localLayoutParams2.a <= 0.0F) {
          break label387;
        }
        f1 += localLayoutParams2.a;
        if (localLayoutParams2.width != 0) {
          break label387;
        }
        i29 = i10;
        f3 = f1;
        i30 = i13;
      }
      label387:
      int i23 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
      int i24;
      label423:
      int i25;
      label443:
      int i28;
      if (localLayoutParams2.width == -2)
      {
        i24 = View.MeasureSpec.makeMeasureSpec(i6 - i23, -2147483648);
        if (localLayoutParams2.height != -2) {
          break label597;
        }
        i25 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
        localView2.measure(i24, i25);
        int i26 = localView2.getMeasuredWidth();
        int i27 = localView2.getMeasuredHeight();
        if ((i5 == -2147483648) && (i27 > i13)) {
          i13 = Math.min(i27, i8);
        }
        i28 = i10 - i26;
        if (i28 >= 0) {
          break label635;
        }
      }
      label597:
      label635:
      for (boolean bool2 = true;; bool2 = false)
      {
        localLayoutParams2.b = bool2;
        boolean bool3 = bool2 | bool1;
        if (localLayoutParams2.b) {
          this.g = localView2;
        }
        i29 = i28;
        i30 = i13;
        float f2 = f1;
        bool4 = bool3;
        f3 = f2;
        break;
        if (localLayoutParams2.width == -1)
        {
          i24 = View.MeasureSpec.makeMeasureSpec(i6 - i23, 1073741824);
          break label423;
        }
        i24 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
        break label423;
        if (localLayoutParams2.height == -1)
        {
          i25 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
          break label443;
        }
        i25 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
        break label443;
      }
      label641:
      if ((bool1) || (f1 > 0.0F))
      {
        int i14 = i6 - this.e;
        int i15 = 0;
        if (i15 < i11)
        {
          View localView1 = getChildAt(i15);
          if (localView1.getVisibility() == 8) {}
          for (;;)
          {
            i15++;
            break;
            SlidingPaneLayout.LayoutParams localLayoutParams1 = (SlidingPaneLayout.LayoutParams)localView1.getLayoutParams();
            if (localView1.getVisibility() != 8)
            {
              int i16;
              label737:
              int i17;
              label745:
              int i22;
              if ((localLayoutParams1.width == 0) && (localLayoutParams1.a > 0.0F))
              {
                i16 = 1;
                if (i16 == 0) {
                  break label833;
                }
                i17 = 0;
                if ((!bool1) || (localView1 == this.g)) {
                  break label897;
                }
                if ((localLayoutParams1.width >= 0) || ((i17 <= i14) && (localLayoutParams1.a <= 0.0F))) {
                  continue;
                }
                if (i16 == 0) {
                  break label881;
                }
                if (localLayoutParams1.height != -2) {
                  break label843;
                }
                i22 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
              }
              for (;;)
              {
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i22);
                break;
                i16 = 0;
                break label737;
                label833:
                i17 = localView1.getMeasuredWidth();
                break label745;
                label843:
                if (localLayoutParams1.height == -1)
                {
                  i22 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                }
                else
                {
                  i22 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                  continue;
                  label881:
                  i22 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                }
              }
              label897:
              if (localLayoutParams1.a > 0.0F)
              {
                int i18;
                if (localLayoutParams1.width == 0) {
                  if (localLayoutParams1.height == -2) {
                    i18 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                  }
                }
                for (;;)
                {
                  if (!bool1) {
                    break label1039;
                  }
                  int i20 = i6 - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                  int i21 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                  if (i17 == i20) {
                    break;
                  }
                  localView1.measure(i21, i18);
                  break;
                  if (localLayoutParams1.height == -1)
                  {
                    i18 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                  }
                  else
                  {
                    i18 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                    continue;
                    i18 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                  }
                }
                label1039:
                int i19 = Math.max(0, i10);
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i17 + (int)(localLayoutParams1.a * i19 / f1), 1073741824), i18);
              }
            }
          }
        }
      }
      setMeasuredDimension(i6, i13);
      this.f = bool1;
      if ((this.p.a() != 0) && (!bool1)) {
        this.p.f();
      }
      return;
      label1116:
      i5 = i3;
      i6 = i2;
      i7 = i4;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a) {
      b();
    }
    for (;;)
    {
      this.q = localSavedState.a;
      return;
      c();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    if (e()) {}
    for (boolean bool = d();; bool = this.q)
    {
      localSavedState.a = bool;
      return localSavedState;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      this.r = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (!this.f) {
      bool = super.onTouchEvent(paramMotionEvent);
    }
    float f1;
    float f2;
    float f3;
    float f4;
    int i2;
    do
    {
      do
      {
        return bool;
        this.p.b(paramMotionEvent);
        int i1 = paramMotionEvent.getAction();
        bool = true;
        switch (i1 & 0xFF)
        {
        default: 
          return bool;
        case 0: 
          float f5 = paramMotionEvent.getX();
          float f6 = paramMotionEvent.getY();
          this.m = f5;
          this.n = f6;
          return bool;
        }
      } while (!e(this.g));
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      f3 = f1 - this.m;
      f4 = f2 - this.n;
      i2 = this.p.d();
    } while ((f3 * f3 + f4 * f4 >= i2 * i2) || (!this.p.b(this.g, (int)f1, (int)f2)));
    a(this.g, 0);
    return bool;
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.f)) {
      if (paramView1 != this.g) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      this.q = bool;
      return;
    }
  }
  
  public void setCoveredFadeColor(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void setPanelSlideListener(w paramw)
  {
    this.o = paramw;
  }
  
  public void setParallaxDistance(int paramInt)
  {
    this.l = paramInt;
    requestLayout();
  }
  
  public void setShadowDrawable(Drawable paramDrawable)
  {
    this.d = paramDrawable;
  }
  
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setSliderFadeColor(int paramInt)
  {
    this.b = paramInt;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.7.0.1
 */