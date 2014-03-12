package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.b.d;
import android.support.v4.b.e;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

final class o
  extends m
{
  static final Interpolator A = new DecelerateInterpolator(1.5F);
  static final Interpolator B = new AccelerateInterpolator(2.5F);
  static final Interpolator C = new AccelerateInterpolator(1.5F);
  static boolean a = false;
  static final boolean b;
  static final Interpolator z;
  ArrayList c;
  Runnable[] d;
  boolean e;
  ArrayList f;
  ArrayList g;
  ArrayList h;
  ArrayList i;
  ArrayList j;
  ArrayList k;
  ArrayList l;
  ArrayList m;
  int n = 0;
  FragmentActivity o;
  l p;
  Fragment q;
  boolean r;
  boolean s;
  boolean t;
  String u;
  boolean v;
  Bundle w = null;
  SparseArray x = null;
  Runnable y = new p(this);
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i1 >= 11) {
      bool = true;
    }
    b = bool;
    z = new DecelerateInterpolator(2.5F);
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(A);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  static Animation a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(z);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(A);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
    if (this.o != null) {}
    for (;;)
    {
      try
      {
        this.o.dump("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
        continue;
      }
      try
      {
        a("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    }
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 4097: 
      if (paramBoolean) {
        return 1;
      }
      return 2;
    case 8194: 
      if (paramBoolean) {
        return 3;
      }
      return 4;
    }
    if (paramBoolean) {
      return 5;
    }
    return 6;
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void t()
  {
    if (this.s) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.u != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.u);
    }
  }
  
  public int a(b paramb)
  {
    try
    {
      if ((this.l == null) || (this.l.size() <= 0))
      {
        if (this.k == null) {
          this.k = new ArrayList();
        }
        int i1 = this.k.size();
        if (a) {
          Log.v("FragmentManager", "Setting back stack index " + i1 + " to " + paramb);
        }
        this.k.add(paramb);
        return i1;
      }
      int i2 = ((Integer)this.l.remove(-1 + this.l.size())).intValue();
      if (a) {
        Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + paramb);
      }
      this.k.set(i2, paramb);
      return i2;
    }
    finally {}
  }
  
  public Fragment a(int paramInt)
  {
    Fragment localFragment;
    if (this.g != null) {
      for (int i2 = -1 + this.g.size(); i2 >= 0; i2--)
      {
        localFragment = (Fragment)this.g.get(i2);
        if ((localFragment != null) && (localFragment.w == paramInt)) {
          return localFragment;
        }
      }
    }
    if (this.f != null) {
      for (int i1 = -1 + this.f.size();; i1--)
      {
        if (i1 < 0) {
          break label107;
        }
        localFragment = (Fragment)this.f.get(i1);
        if ((localFragment != null) && (localFragment.w == paramInt)) {
          break;
        }
      }
    }
    label107:
    return null;
  }
  
  public Fragment a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    Fragment localFragment;
    if (i1 == -1) {
      localFragment = null;
    }
    do
    {
      return localFragment;
      if (i1 >= this.f.size()) {
        a(new IllegalStateException("Fragement no longer exists for key " + paramString + ": index " + i1));
      }
      localFragment = (Fragment)this.f.get(i1);
    } while (localFragment != null);
    a(new IllegalStateException("Fragement no longer exists for key " + paramString + ": index " + i1));
    return localFragment;
  }
  
  public Fragment a(String paramString)
  {
    Fragment localFragment;
    if ((this.g != null) && (paramString != null)) {
      for (int i2 = -1 + this.g.size(); i2 >= 0; i2--)
      {
        localFragment = (Fragment)this.g.get(i2);
        if ((localFragment != null) && (paramString.equals(localFragment.y))) {
          return localFragment;
        }
      }
    }
    if ((this.f != null) && (paramString != null)) {
      for (int i1 = -1 + this.f.size();; i1--)
      {
        if (i1 < 0) {
          break label121;
        }
        localFragment = (Fragment)this.f.get(i1);
        if ((localFragment != null) && (paramString.equals(localFragment.y))) {
          break;
        }
      }
    }
    label121:
    return null;
  }
  
  public w a()
  {
    return new b(this);
  }
  
  Animation a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramFragment.a(paramInt1, paramBoolean, paramFragment.G);
    if (localAnimation != null) {}
    do
    {
      return localAnimation;
      if (paramFragment.G == 0) {
        break;
      }
      localAnimation = AnimationUtils.loadAnimation(this.o, paramFragment.G);
    } while (localAnimation != null);
    if (paramInt1 == 0) {
      return null;
    }
    int i1 = b(paramInt1, paramBoolean);
    if (i1 < 0) {
      return null;
    }
    switch (i1)
    {
    default: 
      if ((paramInt2 == 0) && (this.o.getWindow() != null)) {
        paramInt2 = this.o.getWindow().getAttributes().windowAnimations;
      }
      if (paramInt2 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(this.o, 1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(this.o, 1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(this.o, 0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(this.o, 1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return a(this.o, 0.0F, 1.0F);
    case 6: 
      return a(this.o, 1.0F, 0.0F);
    }
    return null;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.o == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (this.n == paramInt1)) {}
    do
    {
      return;
      this.n = paramInt1;
    } while (this.f == null);
    int i1 = 0;
    boolean bool1 = false;
    label54:
    Fragment localFragment;
    if (i1 < this.f.size())
    {
      localFragment = (Fragment)this.f.get(i1);
      if (localFragment == null) {
        break label170;
      }
      a(localFragment, paramInt1, paramInt2, paramInt3, false);
      if (localFragment.M == null) {
        break label170;
      }
    }
    label170:
    for (boolean bool2 = bool1 | localFragment.M.a();; bool2 = bool1)
    {
      i1++;
      bool1 = bool2;
      break label54;
      if (!bool1) {
        d();
      }
      if ((!this.r) || (this.o == null) || (this.n != 5)) {
        break;
      }
      this.o.c();
      this.r = false;
      return;
    }
  }
  
  /* Error */
  public void a(int paramInt, b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 205	android/support/v4/app/o:k	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 199	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 206	java/util/ArrayList:<init>	()V
    //   17: putfield 205	android/support/v4/app/o:k	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 205	android/support/v4/app/o:k	Ljava/util/ArrayList;
    //   24: invokevirtual 203	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload_1
    //   30: iload 4
    //   32: if_icmpge +56 -> 88
    //   35: getstatic 49	android/support/v4/app/o:a	Z
    //   38: ifeq +37 -> 75
    //   41: ldc 129
    //   43: new 184	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   50: ldc 208
    //   52: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: iload_1
    //   56: invokevirtual 211	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   59: ldc 213
    //   61: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: aload_2
    //   65: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokestatic 218	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   74: pop
    //   75: aload_0
    //   76: getfield 205	android/support/v4/app/o:k	Ljava/util/ArrayList;
    //   79: iload_1
    //   80: aload_2
    //   81: invokevirtual 239	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   84: pop
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: iload 4
    //   90: iload_1
    //   91: if_icmpge +82 -> 173
    //   94: aload_0
    //   95: getfield 205	android/support/v4/app/o:k	Ljava/util/ArrayList;
    //   98: aconst_null
    //   99: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_0
    //   104: getfield 197	android/support/v4/app/o:l	Ljava/util/ArrayList;
    //   107: ifnonnull +14 -> 121
    //   110: aload_0
    //   111: new 199	java/util/ArrayList
    //   114: dup
    //   115: invokespecial 206	java/util/ArrayList:<init>	()V
    //   118: putfield 197	android/support/v4/app/o:l	Ljava/util/ArrayList;
    //   121: getstatic 49	android/support/v4/app/o:a	Z
    //   124: ifeq +30 -> 154
    //   127: ldc 129
    //   129: new 184	java/lang/StringBuilder
    //   132: dup
    //   133: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   136: ldc_w 335
    //   139: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: iload 4
    //   144: invokevirtual 211	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   147: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: invokestatic 218	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   153: pop
    //   154: aload_0
    //   155: getfield 197	android/support/v4/app/o:l	Ljava/util/ArrayList;
    //   158: iload 4
    //   160: invokestatic 339	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   163: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   166: pop
    //   167: iinc 4 1
    //   170: goto -82 -> 88
    //   173: getstatic 49	android/support/v4/app/o:a	Z
    //   176: ifeq +37 -> 213
    //   179: ldc 129
    //   181: new 184	java/lang/StringBuilder
    //   184: dup
    //   185: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   188: ldc 233
    //   190: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: iload_1
    //   194: invokevirtual 211	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   197: ldc 235
    //   199: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload_2
    //   203: invokevirtual 216	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokestatic 218	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   212: pop
    //   213: aload_0
    //   214: getfield 205	android/support/v4/app/o:k	Ljava/util/ArrayList;
    //   217: aload_2
    //   218: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   221: pop
    //   222: goto -137 -> 85
    //   225: astore_3
    //   226: aload_0
    //   227: monitorexit
    //   228: aload_3
    //   229: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	o
    //   0	230	1	paramInt	int
    //   0	230	2	paramb	b
    //   225	4	3	localObject	Object
    //   27	141	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	20	225	finally
    //   20	29	225	finally
    //   35	75	225	finally
    //   75	85	225	finally
    //   85	87	225	finally
    //   94	121	225	finally
    //   121	154	225	finally
    //   154	167	225	finally
    //   173	213	225	finally
    //   213	222	225	finally
    //   226	228	225	finally
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, 0, 0, paramBoolean);
  }
  
  public void a(Configuration paramConfiguration)
  {
    if (this.g != null) {
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.a(paramConfiguration);
        }
      }
    }
  }
  
  public void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.f < 0) {
      a(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    paramBundle.putInt(paramString, paramFragment.f);
  }
  
  void a(Parcelable paramParcelable, ArrayList paramArrayList)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
      if (localFragmentManagerState.a != null)
      {
        if (paramArrayList != null) {
          for (int i5 = 0; i5 < paramArrayList.size(); i5++)
          {
            Fragment localFragment4 = (Fragment)paramArrayList.get(i5);
            if (a) {
              Log.v("FragmentManager", "restoreAllState: re-attaching retained " + localFragment4);
            }
            FragmentState localFragmentState2 = localFragmentManagerState.a[localFragment4.f];
            localFragmentState2.k = localFragment4;
            localFragment4.e = null;
            localFragment4.r = 0;
            localFragment4.p = false;
            localFragment4.l = false;
            localFragment4.i = null;
            if (localFragmentState2.j != null)
            {
              localFragmentState2.j.setClassLoader(this.o.getClassLoader());
              localFragment4.e = localFragmentState2.j.getSparseParcelableArray("android:view_state");
            }
          }
        }
        this.f = new ArrayList(localFragmentManagerState.a.length);
        if (this.h != null) {
          this.h.clear();
        }
        int i1 = 0;
        if (i1 < localFragmentManagerState.a.length)
        {
          FragmentState localFragmentState1 = localFragmentManagerState.a[i1];
          if (localFragmentState1 != null)
          {
            Fragment localFragment3 = localFragmentState1.a(this.o, this.q);
            if (a) {
              Log.v("FragmentManager", "restoreAllState: active #" + i1 + ": " + localFragment3);
            }
            this.f.add(localFragment3);
            localFragmentState1.k = null;
          }
          for (;;)
          {
            i1++;
            break;
            this.f.add(null);
            if (this.h == null) {
              this.h = new ArrayList();
            }
            if (a) {
              Log.v("FragmentManager", "restoreAllState: avail #" + i1);
            }
            this.h.add(Integer.valueOf(i1));
          }
        }
        if (paramArrayList != null)
        {
          int i4 = 0;
          if (i4 < paramArrayList.size())
          {
            Fragment localFragment2 = (Fragment)paramArrayList.get(i4);
            if (localFragment2.j >= 0) {
              if (localFragment2.j >= this.f.size()) {
                break label461;
              }
            }
            for (localFragment2.i = ((Fragment)this.f.get(localFragment2.j));; localFragment2.i = null)
            {
              i4++;
              break;
              label461:
              Log.w("FragmentManager", "Re-attaching retained fragment " + localFragment2 + " target no longer exists: " + localFragment2.j);
            }
          }
        }
        if (localFragmentManagerState.b != null)
        {
          this.g = new ArrayList(localFragmentManagerState.b.length);
          for (int i3 = 0; i3 < localFragmentManagerState.b.length; i3++)
          {
            Fragment localFragment1 = (Fragment)this.f.get(localFragmentManagerState.b[i3]);
            if (localFragment1 == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + localFragmentManagerState.b[i3]));
            }
            localFragment1.l = true;
            if (a) {
              Log.v("FragmentManager", "restoreAllState: added #" + i3 + ": " + localFragment1);
            }
            if (this.g.contains(localFragment1)) {
              throw new IllegalStateException("Already added!");
            }
            this.g.add(localFragment1);
          }
        }
        this.g = null;
        if (localFragmentManagerState.c == null) {
          break;
        }
        this.i = new ArrayList(localFragmentManagerState.c.length);
        for (int i2 = 0; i2 < localFragmentManagerState.c.length; i2++)
        {
          b localb = localFragmentManagerState.c[i2].a(this);
          if (a)
          {
            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + localb.o + "): " + localb);
            localb.a("  ", new PrintWriter(new e("FragmentManager")), false);
          }
          this.i.add(localb);
          if (localb.o >= 0) {
            a(localb.o, localb);
          }
        }
      }
    }
    this.i = null;
  }
  
  public void a(Fragment paramFragment)
  {
    if (paramFragment.K)
    {
      if (this.e) {
        this.v = true;
      }
    }
    else {
      return;
    }
    paramFragment.K = false;
    a(paramFragment, this.n, 0, 0, false);
  }
  
  public void a(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "remove: " + paramFragment + " nesting=" + paramFragment.r);
    }
    int i1;
    if (!paramFragment.a())
    {
      i1 = 1;
      if ((!paramFragment.A) || (i1 != 0))
      {
        if (this.g != null) {
          this.g.remove(paramFragment);
        }
        if ((paramFragment.D) && (paramFragment.E)) {
          this.r = true;
        }
        paramFragment.l = false;
        paramFragment.m = true;
        if (i1 == 0) {
          break label137;
        }
      }
    }
    label137:
    for (int i2 = 0;; i2 = 1)
    {
      a(paramFragment, i2, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
    }
  }
  
  void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (((!paramFragment.l) || (paramFragment.A)) && (paramInt1 > 1)) {
      paramInt1 = 1;
    }
    if ((paramFragment.m) && (paramInt1 > paramFragment.a)) {
      paramInt1 = paramFragment.a;
    }
    if ((paramFragment.K) && (paramFragment.a < 4) && (paramInt1 > 3)) {
      paramInt1 = 3;
    }
    label499:
    ViewGroup localViewGroup;
    if (paramFragment.a < paramInt1)
    {
      if ((paramFragment.o) && (!paramFragment.p)) {
        return;
      }
      if (paramFragment.b != null)
      {
        paramFragment.b = null;
        a(paramFragment, paramFragment.c, 0, 0, true);
      }
      switch (paramFragment.a)
      {
      default: 
        paramFragment.a = paramInt1;
        return;
      case 0: 
        if (a) {
          Log.v("FragmentManager", "moveto CREATED: " + paramFragment);
        }
        if (paramFragment.d != null)
        {
          paramFragment.e = paramFragment.d.getSparseParcelableArray("android:view_state");
          paramFragment.i = a(paramFragment.d, "android:target_state");
          if (paramFragment.i != null) {
            paramFragment.k = paramFragment.d.getInt("android:target_req_state", 0);
          }
          paramFragment.L = paramFragment.d.getBoolean("android:user_visible_hint", true);
          if (!paramFragment.L)
          {
            paramFragment.K = true;
            if (paramInt1 > 3) {
              paramInt1 = 3;
            }
          }
        }
        paramFragment.t = this.o;
        paramFragment.v = this.q;
        if (this.q != null) {}
        for (o localo = this.q.u;; localo = this.o.b)
        {
          paramFragment.s = localo;
          paramFragment.F = false;
          paramFragment.a(this.o);
          if (paramFragment.F) {
            break;
          }
          throw new ac("Fragment " + paramFragment + " did not call through to super.onAttach()");
        }
        if (paramFragment.v == null) {
          this.o.a(paramFragment);
        }
        if (!paramFragment.C) {
          paramFragment.g(paramFragment.d);
        }
        paramFragment.C = false;
        if (paramFragment.o)
        {
          paramFragment.I = paramFragment.b(paramFragment.b(paramFragment.d), null, paramFragment.d);
          if (paramFragment.I == null) {
            break label896;
          }
          paramFragment.J = paramFragment.I;
          paramFragment.I = ab.a(paramFragment.I);
          if (paramFragment.z) {
            paramFragment.I.setVisibility(8);
          }
          paramFragment.a(paramFragment.I, paramFragment.d);
        }
      case 1: 
        if (paramInt1 > 1)
        {
          if (a) {
            Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + paramFragment);
          }
          if (!paramFragment.o)
          {
            if (paramFragment.x == 0) {
              break label1454;
            }
            localViewGroup = (ViewGroup)this.p.a(paramFragment.x);
            if ((localViewGroup == null) && (!paramFragment.q)) {
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.x) + " (" + paramFragment.c().getResourceName(paramFragment.x) + ") for fragment " + paramFragment));
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      paramFragment.H = localViewGroup;
      paramFragment.I = paramFragment.b(paramFragment.b(paramFragment.d), localViewGroup, paramFragment.d);
      if (paramFragment.I != null)
      {
        paramFragment.J = paramFragment.I;
        paramFragment.I = ab.a(paramFragment.I);
        if (localViewGroup != null)
        {
          Animation localAnimation2 = a(paramFragment, paramInt2, true, paramInt3);
          if (localAnimation2 != null) {
            paramFragment.I.startAnimation(localAnimation2);
          }
          localViewGroup.addView(paramFragment.I);
        }
        if (paramFragment.z) {
          paramFragment.I.setVisibility(8);
        }
        paramFragment.a(paramFragment.I, paramFragment.d);
      }
      for (;;)
      {
        paramFragment.h(paramFragment.d);
        if (paramFragment.I != null) {
          paramFragment.a(paramFragment.d);
        }
        paramFragment.d = null;
        if (paramInt1 > 3)
        {
          if (a) {
            Log.v("FragmentManager", "moveto STARTED: " + paramFragment);
          }
          paramFragment.o();
        }
        if (paramInt1 <= 4) {
          break;
        }
        if (a) {
          Log.v("FragmentManager", "moveto RESUMED: " + paramFragment);
        }
        paramFragment.n = true;
        paramFragment.p();
        paramFragment.d = null;
        paramFragment.e = null;
        break;
        label896:
        paramFragment.J = null;
        break label499;
        paramFragment.J = null;
      }
      if (paramFragment.a <= paramInt1) {
        break;
      }
      switch (paramFragment.a)
      {
      default: 
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        label963:
        do
        {
          if (paramInt1 >= 1) {
            break;
          }
          if ((this.t) && (paramFragment.b != null))
          {
            View localView = paramFragment.b;
            paramFragment.b = null;
            localView.clearAnimation();
          }
          if (paramFragment.b == null) {
            break label1322;
          }
          paramFragment.c = paramInt1;
          paramInt1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom RESUMED: " + paramFragment);
            }
            paramFragment.r();
            paramFragment.n = false;
          }
          if (paramInt1 < 4)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STARTED: " + paramFragment);
            }
            paramFragment.s();
          }
          if (paramInt1 < 3)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STOPPED: " + paramFragment);
            }
            paramFragment.t();
          }
        } while (paramInt1 >= 2);
        if (a) {
          Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + paramFragment);
        }
        if ((paramFragment.I != null) && (!this.o.isFinishing()) && (paramFragment.e == null)) {
          e(paramFragment);
        }
        paramFragment.u();
        if ((paramFragment.I != null) && (paramFragment.H != null)) {
          if ((this.n <= 0) || (this.t)) {
            break label1448;
          }
        }
        label1448:
        for (Animation localAnimation1 = a(paramFragment, paramInt2, false, paramInt3);; localAnimation1 = null)
        {
          if (localAnimation1 != null)
          {
            paramFragment.b = paramFragment.I;
            paramFragment.c = paramInt1;
            localAnimation1.setAnimationListener(new q(this, paramFragment));
            paramFragment.I.startAnimation(localAnimation1);
          }
          paramFragment.H.removeView(paramFragment.I);
          paramFragment.H = null;
          paramFragment.I = null;
          paramFragment.J = null;
          break label963;
          label1322:
          if (a) {
            Log.v("FragmentManager", "movefrom CREATED: " + paramFragment);
          }
          if (!paramFragment.C) {
            paramFragment.v();
          }
          paramFragment.F = false;
          paramFragment.l();
          if (!paramFragment.F) {
            throw new ac("Fragment " + paramFragment + " did not call through to super.onDetach()");
          }
          if (paramBoolean) {
            break;
          }
          if (!paramFragment.C)
          {
            d(paramFragment);
            break;
          }
          paramFragment.t = null;
          paramFragment.s = null;
          break;
        }
        label1454:
        localViewGroup = null;
      }
    }
  }
  
  public void a(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    if (a) {
      Log.v("FragmentManager", "add: " + paramFragment);
    }
    c(paramFragment);
    if (!paramFragment.A)
    {
      if (this.g.contains(paramFragment)) {
        throw new IllegalStateException("Fragment already added: " + paramFragment);
      }
      this.g.add(paramFragment);
      paramFragment.l = true;
      paramFragment.m = false;
      if ((paramFragment.D) && (paramFragment.E)) {
        this.r = true;
      }
      if (paramBoolean) {
        b(paramFragment);
      }
    }
  }
  
  public void a(FragmentActivity paramFragmentActivity, l paraml, Fragment paramFragment)
  {
    if (this.o != null) {
      throw new IllegalStateException("Already attached");
    }
    this.o = paramFragmentActivity;
    this.p = paraml;
    this.q = paramFragment;
  }
  
  /* Error */
  public void a(Runnable paramRunnable, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_2
    //   1: ifne +7 -> 8
    //   4: aload_0
    //   5: invokespecial 694	android/support/v4/app/o:t	()V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 632	android/support/v4/app/o:t	Z
    //   14: ifne +10 -> 24
    //   17: aload_0
    //   18: getfield 154	android/support/v4/app/o:o	Landroid/support/v4/app/FragmentActivity;
    //   21: ifnonnull +19 -> 40
    //   24: new 177	java/lang/IllegalStateException
    //   27: dup
    //   28: ldc_w 696
    //   31: invokespecial 180	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   34: athrow
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    //   40: aload_0
    //   41: getfield 698	android/support/v4/app/o:c	Ljava/util/ArrayList;
    //   44: ifnonnull +14 -> 58
    //   47: aload_0
    //   48: new 199	java/util/ArrayList
    //   51: dup
    //   52: invokespecial 206	java/util/ArrayList:<init>	()V
    //   55: putfield 698	android/support/v4/app/o:c	Ljava/util/ArrayList;
    //   58: aload_0
    //   59: getfield 698	android/support/v4/app/o:c	Ljava/util/ArrayList;
    //   62: aload_1
    //   63: invokevirtual 222	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload_0
    //   68: getfield 698	android/support/v4/app/o:c	Ljava/util/ArrayList;
    //   71: invokevirtual 203	java/util/ArrayList:size	()I
    //   74: iconst_1
    //   75: if_icmpne +32 -> 107
    //   78: aload_0
    //   79: getfield 154	android/support/v4/app/o:o	Landroid/support/v4/app/FragmentActivity;
    //   82: getfield 701	android/support/v4/app/FragmentActivity:a	Landroid/os/Handler;
    //   85: aload_0
    //   86: getfield 90	android/support/v4/app/o:y	Ljava/lang/Runnable;
    //   89: invokevirtual 707	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   92: aload_0
    //   93: getfield 154	android/support/v4/app/o:o	Landroid/support/v4/app/FragmentActivity;
    //   96: getfield 701	android/support/v4/app/FragmentActivity:a	Landroid/os/Handler;
    //   99: aload_0
    //   100: getfield 90	android/support/v4/app/o:y	Ljava/lang/Runnable;
    //   103: invokevirtual 711	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   106: pop
    //   107: aload_0
    //   108: monitorexit
    //   109: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	o
    //   0	110	1	paramRunnable	Runnable
    //   0	110	2	paramBoolean	boolean
    //   35	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	24	35	finally
    //   24	35	35	finally
    //   36	38	35	finally
    //   40	58	35	finally
    //   58	107	35	finally
    //   107	109	35	finally
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i1 = 0;
    String str = paramString + "    ";
    if (this.f != null)
    {
      int i11 = this.f.size();
      if (i11 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i12 = 0; i12 < i11; i12++)
        {
          Fragment localFragment3 = (Fragment)this.f.get(i12);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i12);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment3);
          if (localFragment3 != null) {
            localFragment3.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    if (this.g != null)
    {
      int i9 = this.g.size();
      if (i9 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (int i10 = 0; i10 < i9; i10++)
        {
          Fragment localFragment2 = (Fragment)this.g.get(i10);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i10);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment2.toString());
        }
      }
    }
    if (this.j != null)
    {
      int i7 = this.j.size();
      if (i7 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (int i8 = 0; i8 < i7; i8++)
        {
          Fragment localFragment1 = (Fragment)this.j.get(i8);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i8);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment1.toString());
        }
      }
    }
    if (this.i != null)
    {
      int i5 = this.i.size();
      if (i5 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i6 = 0; i6 < i5; i6++)
        {
          b localb2 = (b)this.i.get(i6);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i6);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localb2.toString());
          localb2.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    try
    {
      if (this.k != null)
      {
        int i3 = this.k.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int i4 = 0; i4 < i3; i4++)
          {
            b localb1 = (b)this.k.get(i4);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i4);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localb1);
          }
        }
      }
      if ((this.l != null) && (this.l.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.l.toArray()));
      }
      if (this.c != null)
      {
        int i2 = this.c.size();
        if (i2 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          while (i1 < i2)
          {
            Runnable localRunnable = (Runnable)this.c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localRunnable);
            i1++;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mActivity=");
    paramPrintWriter.println(this.o);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.p);
    if (this.q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.q);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.s);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.t);
    if (this.r)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.r);
    }
    if (this.u != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.u);
    }
    if ((this.h != null) && (this.h.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.h.toArray()));
    }
  }
  
  boolean a(Handler paramHandler, String paramString, int paramInt1, int paramInt2)
  {
    if (this.i == null) {
      break label119;
    }
    label7:
    int i6;
    do
    {
      return false;
      if ((paramString != null) || (paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
        break;
      }
      i6 = -1 + this.i.size();
    } while (i6 < 0);
    ((b)this.i.remove(i6)).b(true);
    f();
    for (;;)
    {
      return true;
      int i1 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        for (int i2 = -1 + this.i.size();; i2--)
        {
          b localb3;
          if (i2 >= 0)
          {
            localb3 = (b)this.i.get(i2);
            if ((paramString == null) || (!paramString.equals(localb3.b()))) {}
          }
          else
          {
            label119:
            if (i2 < 0) {
              break label7;
            }
            if ((paramInt2 & 0x1) == 0) {
              break label207;
            }
            i2--;
            while (i2 >= 0)
            {
              b localb2 = (b)this.i.get(i2);
              if (((paramString == null) || (!paramString.equals(localb2.b()))) && ((paramInt1 < 0) || (paramInt1 != localb2.o))) {
                break;
              }
              i2--;
            }
          }
          if ((paramInt1 >= 0) && (paramInt1 == localb3.o)) {
            break;
          }
        }
        label207:
        i1 = i2;
      }
      if (i1 == -1 + this.i.size()) {
        break label7;
      }
      ArrayList localArrayList = new ArrayList();
      for (int i3 = -1 + this.i.size(); i3 > i1; i3--) {
        localArrayList.add(this.i.remove(i3));
      }
      int i4 = -1 + localArrayList.size();
      int i5 = 0;
      if (i5 <= i4)
      {
        if (a) {
          Log.v("FragmentManager", "Popping back stack state: " + localArrayList.get(i5));
        }
        b localb1 = (b)localArrayList.get(i5);
        if (i5 == i4) {}
        for (boolean bool = true;; bool = false)
        {
          localb1.b(bool);
          i5++;
          break;
        }
      }
      f();
    }
  }
  
  public boolean a(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      bool = false;
      while (i1 < this.g.size())
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (localFragment.c(paramMenu))) {
          bool = true;
        }
        i1++;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    ArrayList localArrayList1 = null;
    if (this.g != null)
    {
      int i2 = 0;
      boolean bool2;
      for (bool1 = false; i2 < this.g.size(); bool1 = bool2)
      {
        Fragment localFragment2 = (Fragment)this.g.get(i2);
        if ((localFragment2 != null) && (localFragment2.b(paramMenu, paramMenuInflater)))
        {
          bool1 = true;
          if (localArrayList1 == null) {
            localArrayList1 = new ArrayList();
          }
          localArrayList1.add(localFragment2);
        }
        bool2 = bool1;
        i2++;
      }
    }
    boolean bool1 = false;
    ArrayList localArrayList2 = this.j;
    int i1 = 0;
    if (localArrayList2 != null) {
      while (i1 < this.j.size())
      {
        Fragment localFragment1 = (Fragment)this.j.get(i1);
        if ((localArrayList1 == null) || (!localArrayList1.contains(localFragment1))) {
          localFragment1.m();
        }
        i1++;
      }
    }
    this.j = localArrayList1;
    return bool1;
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.g;
    boolean bool = false;
    if (localArrayList != null) {}
    for (int i1 = 0;; i1++)
    {
      int i2 = this.g.size();
      bool = false;
      if (i1 < i2)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (localFragment.c(paramMenuItem))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public void b(int paramInt)
  {
    try
    {
      this.k.set(paramInt, null);
      if (this.l == null) {
        this.l = new ArrayList();
      }
      if (a) {
        Log.v("FragmentManager", "Freeing back stack index " + paramInt);
      }
      this.l.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  void b(Fragment paramFragment)
  {
    a(paramFragment, this.n, 0, 0, false);
  }
  
  public void b(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "hide: " + paramFragment);
    }
    if (!paramFragment.z)
    {
      paramFragment.z = true;
      if (paramFragment.I != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, false, paramInt2);
        if (localAnimation != null) {
          paramFragment.I.startAnimation(localAnimation);
        }
        paramFragment.I.setVisibility(8);
      }
      if ((paramFragment.l) && (paramFragment.D) && (paramFragment.E)) {
        this.r = true;
      }
      paramFragment.a(true);
    }
  }
  
  void b(b paramb)
  {
    if (this.i == null) {
      this.i = new ArrayList();
    }
    this.i.add(paramb);
    f();
  }
  
  public void b(Menu paramMenu)
  {
    if (this.g != null) {
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.d(paramMenu);
        }
      }
    }
  }
  
  public boolean b()
  {
    return e();
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.g;
    boolean bool = false;
    if (localArrayList != null) {}
    for (int i1 = 0;; i1++)
    {
      int i2 = this.g.size();
      bool = false;
      if (i1 < i2)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if ((localFragment != null) && (localFragment.d(paramMenuItem))) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  void c(Fragment paramFragment)
  {
    if (paramFragment.f >= 0) {}
    for (;;)
    {
      return;
      if ((this.h == null) || (this.h.size() <= 0))
      {
        if (this.f == null) {
          this.f = new ArrayList();
        }
        paramFragment.a(this.f.size(), this.q);
        this.f.add(paramFragment);
      }
      while (a)
      {
        Log.v("FragmentManager", "Allocated fragment index " + paramFragment);
        return;
        paramFragment.a(((Integer)this.h.remove(-1 + this.h.size())).intValue(), this.q);
        this.f.set(paramFragment.f, paramFragment);
      }
    }
  }
  
  public void c(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "show: " + paramFragment);
    }
    if (paramFragment.z)
    {
      paramFragment.z = false;
      if (paramFragment.I != null)
      {
        Animation localAnimation = a(paramFragment, paramInt1, true, paramInt2);
        if (localAnimation != null) {
          paramFragment.I.startAnimation(localAnimation);
        }
        paramFragment.I.setVisibility(0);
      }
      if ((paramFragment.l) && (paramFragment.D) && (paramFragment.E)) {
        this.r = true;
      }
      paramFragment.a(false);
    }
  }
  
  public boolean c()
  {
    t();
    b();
    return a(this.o.a, null, -1, 0);
  }
  
  void d()
  {
    if (this.f == null) {}
    for (;;)
    {
      return;
      for (int i1 = 0; i1 < this.f.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        if (localFragment != null) {
          a(localFragment);
        }
      }
    }
  }
  
  void d(Fragment paramFragment)
  {
    if (paramFragment.f < 0) {
      return;
    }
    if (a) {
      Log.v("FragmentManager", "Freeing fragment index " + paramFragment);
    }
    this.f.set(paramFragment.f, null);
    if (this.h == null) {
      this.h = new ArrayList();
    }
    this.h.add(Integer.valueOf(paramFragment.f));
    this.o.a(paramFragment.g);
    paramFragment.k();
  }
  
  public void d(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "detach: " + paramFragment);
    }
    if (!paramFragment.A)
    {
      paramFragment.A = true;
      if (paramFragment.l)
      {
        if (this.g != null)
        {
          if (a) {
            Log.v("FragmentManager", "remove from detach: " + paramFragment);
          }
          this.g.remove(paramFragment);
        }
        if ((paramFragment.D) && (paramFragment.E)) {
          this.r = true;
        }
        paramFragment.l = false;
        a(paramFragment, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  void e(Fragment paramFragment)
  {
    if (paramFragment.J == null) {
      return;
    }
    if (this.x == null) {
      this.x = new SparseArray();
    }
    for (;;)
    {
      paramFragment.J.saveHierarchyState(this.x);
      if (this.x.size() <= 0) {
        break;
      }
      paramFragment.e = this.x;
      this.x = null;
      return;
      this.x.clear();
    }
  }
  
  public void e(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    if (a) {
      Log.v("FragmentManager", "attach: " + paramFragment);
    }
    if (paramFragment.A)
    {
      paramFragment.A = false;
      if (!paramFragment.l)
      {
        if (this.g == null) {
          this.g = new ArrayList();
        }
        if (this.g.contains(paramFragment)) {
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        }
        if (a) {
          Log.v("FragmentManager", "add from attach: " + paramFragment);
        }
        this.g.add(paramFragment);
        paramFragment.l = true;
        if ((paramFragment.D) && (paramFragment.E)) {
          this.r = true;
        }
        a(paramFragment, this.n, paramInt1, paramInt2, false);
      }
    }
  }
  
  public boolean e()
  {
    if (this.e) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.o.a.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    boolean bool2;
    for (boolean bool1 = false;; bool1 = true) {
      try
      {
        if ((this.c == null) || (this.c.size() == 0))
        {
          if (!this.v) {
            return bool1;
          }
          int i1 = 0;
          bool2 = false;
          while (i1 < this.f.size())
          {
            Fragment localFragment = (Fragment)this.f.get(i1);
            if ((localFragment != null) && (localFragment.M != null)) {
              bool2 |= localFragment.M.a();
            }
            i1++;
          }
        }
        int i2 = this.c.size();
        if ((this.d == null) || (this.d.length < i2)) {
          this.d = new Runnable[i2];
        }
        this.c.toArray(this.d);
        this.c.clear();
        this.o.a.removeCallbacks(this.y);
        this.e = true;
        for (int i3 = 0; i3 < i2; i3++)
        {
          this.d[i3].run();
          this.d[i3] = null;
        }
        this.e = false;
      }
      finally {}
    }
    if (!bool2)
    {
      this.v = false;
      d();
    }
    return bool1;
  }
  
  Bundle f(Fragment paramFragment)
  {
    if (this.w == null) {
      this.w = new Bundle();
    }
    paramFragment.i(this.w);
    Bundle localBundle;
    if (!this.w.isEmpty())
    {
      localBundle = this.w;
      this.w = null;
    }
    for (;;)
    {
      if (paramFragment.I != null) {
        e(paramFragment);
      }
      if (paramFragment.e != null)
      {
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putSparseParcelableArray("android:view_state", paramFragment.e);
      }
      if (!paramFragment.L)
      {
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putBoolean("android:user_visible_hint", paramFragment.L);
      }
      return localBundle;
      localBundle = null;
    }
  }
  
  void f()
  {
    if (this.m != null) {
      for (int i1 = 0; i1 < this.m.size(); i1++) {
        ((n)this.m.get(i1)).a();
      }
    }
  }
  
  ArrayList g()
  {
    ArrayList localArrayList1 = this.f;
    ArrayList localArrayList2 = null;
    if (localArrayList1 != null)
    {
      int i1 = 0;
      if (i1 < this.f.size())
      {
        Fragment localFragment = (Fragment)this.f.get(i1);
        if ((localFragment != null) && (localFragment.B))
        {
          if (localArrayList2 == null) {
            localArrayList2 = new ArrayList();
          }
          localArrayList2.add(localFragment);
          localFragment.C = true;
          if (localFragment.i == null) {
            break label139;
          }
        }
        label139:
        for (int i2 = localFragment.i.f;; i2 = -1)
        {
          localFragment.j = i2;
          if (a) {
            Log.v("FragmentManager", "retainNonConfig: keeping retained " + localFragment);
          }
          i1++;
          break;
        }
      }
    }
    return localArrayList2;
  }
  
  Parcelable h()
  {
    e();
    if (b) {
      this.s = true;
    }
    if ((this.f == null) || (this.f.size() <= 0)) {
      return null;
    }
    int i1 = this.f.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i1];
    int i2 = 0;
    int i3 = 0;
    label54:
    Fragment localFragment;
    FragmentState localFragmentState;
    if (i2 < i1)
    {
      localFragment = (Fragment)this.f.get(i2);
      if (localFragment == null) {
        break label738;
      }
      if (localFragment.f < 0) {
        a(new IllegalStateException("Failure saving state: active " + localFragment + " has cleared index: " + localFragment.f));
      }
      localFragmentState = new FragmentState(localFragment);
      arrayOfFragmentState[i2] = localFragmentState;
      if ((localFragment.a > 0) && (localFragmentState.j == null))
      {
        localFragmentState.j = f(localFragment);
        if (localFragment.i != null)
        {
          if (localFragment.i.f < 0) {
            a(new IllegalStateException("Failure saving state: " + localFragment + " has target not in fragment manager: " + localFragment.i));
          }
          if (localFragmentState.j == null) {
            localFragmentState.j = new Bundle();
          }
          a(localFragmentState.j, "android:target_state", localFragment.i);
          if (localFragment.k != 0) {
            localFragmentState.j.putInt("android:target_req_state", localFragment.k);
          }
        }
        label303:
        if (a) {
          Log.v("FragmentManager", "Saved state of " + localFragment + ": " + localFragmentState.j);
        }
      }
    }
    label738:
    for (int i8 = 1;; i8 = i3)
    {
      i2++;
      i3 = i8;
      break label54;
      localFragmentState.j = localFragment.d;
      break label303;
      if (i3 == 0)
      {
        if (!a) {
          break;
        }
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return null;
      }
      if (this.g != null)
      {
        int i6 = this.g.size();
        if (i6 > 0)
        {
          arrayOfInt = new int[i6];
          for (int i7 = 0; i7 < i6; i7++)
          {
            arrayOfInt[i7] = ((Fragment)this.g.get(i7)).f;
            if (arrayOfInt[i7] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.g.get(i7) + " has cleared index: " + arrayOfInt[i7]));
            }
            if (a) {
              Log.v("FragmentManager", "saveAllState: adding fragment #" + i7 + ": " + this.g.get(i7));
            }
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.i;
      BackStackState[] arrayOfBackStackState = null;
      if (localArrayList != null)
      {
        int i4 = this.i.size();
        arrayOfBackStackState = null;
        if (i4 > 0)
        {
          arrayOfBackStackState = new BackStackState[i4];
          for (int i5 = 0; i5 < i4; i5++)
          {
            arrayOfBackStackState[i5] = new BackStackState(this, (b)this.i.get(i5));
            if (a) {
              Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.i.get(i5));
            }
          }
        }
      }
      FragmentManagerState localFragmentManagerState = new FragmentManagerState();
      localFragmentManagerState.a = arrayOfFragmentState;
      localFragmentManagerState.b = arrayOfInt;
      localFragmentManagerState.c = arrayOfBackStackState;
      return localFragmentManagerState;
    }
  }
  
  public void i()
  {
    this.s = false;
  }
  
  public void j()
  {
    this.s = false;
    a(1, false);
  }
  
  public void k()
  {
    this.s = false;
    a(2, false);
  }
  
  public void l()
  {
    this.s = false;
    a(4, false);
  }
  
  public void m()
  {
    this.s = false;
    a(5, false);
  }
  
  public void n()
  {
    a(4, false);
  }
  
  public void o()
  {
    this.s = true;
    a(3, false);
  }
  
  public void p()
  {
    a(2, false);
  }
  
  public void q()
  {
    a(1, false);
  }
  
  public void r()
  {
    this.t = true;
    e();
    a(0, false);
    this.o = null;
    this.p = null;
    this.q = null;
  }
  
  public void s()
  {
    if (this.g != null) {
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        Fragment localFragment = (Fragment)this.g.get(i1);
        if (localFragment != null) {
          localFragment.q();
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.q != null) {
      d.a(this.q, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      d.a(this.o, localStringBuilder);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.o
 * JD-Core Version:    0.7.0.1
 */