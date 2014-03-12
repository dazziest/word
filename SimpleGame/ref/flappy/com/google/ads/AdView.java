package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.a.ac;
import com.google.ads.a.ag;
import com.google.ads.a.e;
import com.google.ads.a.m;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.o;
import java.util.HashSet;
import java.util.Set;

public class AdView
  extends RelativeLayout
  implements a
{
  private static final com.google.ads.a.h b = (com.google.ads.a.h)com.google.ads.a.h.a.b();
  protected w a;
  
  public AdView(Activity paramActivity, g paramg, String paramString)
  {
    super(paramActivity.getApplicationContext());
    try
    {
      a(paramActivity, paramg, null);
      b(paramActivity, paramg, null);
      a(paramActivity, paramg, paramString);
      return;
    }
    catch (m localm)
    {
      a(paramActivity, localm.c("Could not initialize AdView"), paramg, null);
      localm.a("Could not initialize AdView");
    }
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private void a(Activity paramActivity, g paramg, String paramString)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramActivity);
    localFrameLayout.setFocusable(false);
    this.a = new w(this, paramActivity, paramg, paramString, localFrameLayout, false);
    setGravity(17);
    try
    {
      ViewGroup localViewGroup = ag.a(paramActivity, this.a);
      if (localViewGroup != null)
      {
        localViewGroup.addView(localFrameLayout, -2, -2);
        addView(localViewGroup, -2, -2);
        return;
      }
      addView(localFrameLayout, -2, -2);
      return;
    }
    catch (VerifyError localVerifyError)
    {
      com.google.ads.util.g.a("Gestures disabled: Not supported on this version of Android.", localVerifyError);
      addView(localFrameLayout, -2, -2);
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    try
    {
      String str2 = b("adSize", paramContext, paramAttributeSet, true);
      arrayOfg2 = a(str2);
      if (arrayOfg2 != null) {}
      try
      {
        if (arrayOfg2.length != 0) {
          break label132;
        }
        throw new m("Attribute \"adSize\" invalid: " + str2, true);
      }
      catch (m localm2)
      {
        localObject = localm2;
        arrayOfg1 = arrayOfg2;
      }
    }
    catch (m localm1)
    {
      for (;;)
      {
        g[] arrayOfg2;
        String str1;
        g localg;
        Object localObject = localm1;
        g[] arrayOfg1 = null;
      }
    }
    str1 = ((m)localObject).c("Could not initialize AdView");
    if ((arrayOfg1 != null) && (arrayOfg1.length > 0)) {}
    for (localg = arrayOfg1[0];; localg = g.b)
    {
      a(paramContext, str1, localg, paramAttributeSet);
      ((m)localObject).a("Could not initialize AdView");
      if (isInEditMode()) {
        break;
      }
      ((m)localObject).b("Could not initialize AdView");
      return;
      label132:
      if (!a("adUnitId", paramAttributeSet)) {
        throw new m("Required XML attribute \"adUnitId\" missing", true);
      }
      if (isInEditMode())
      {
        a(paramContext, "Ads by Google", -1, arrayOfg2[0], paramAttributeSet);
        return;
      }
      String str3 = b("adUnitId", paramContext, paramAttributeSet, true);
      boolean bool = a("loadAdOnCreate", paramContext, paramAttributeSet, false);
      if ((paramContext instanceof Activity))
      {
        Activity localActivity = (Activity)paramContext;
        a(localActivity, arrayOfg2[0], paramAttributeSet);
        b(localActivity, arrayOfg2[0], paramAttributeSet);
        if (arrayOfg2.length == 1) {
          a(localActivity, arrayOfg2[0], str3);
        }
        while (bool)
        {
          Set localSet = c("testDevices", paramContext, paramAttributeSet, false);
          if (localSet.contains("TEST_EMULATOR"))
          {
            localSet.remove("TEST_EMULATOR");
            localSet.add(d.a);
          }
          a(new d().b(localSet).a(c("keywords", paramContext, paramAttributeSet, false)));
          return;
          a(localActivity, new g(0, 0), str3);
          a(arrayOfg2);
        }
        break;
      }
      throw new m("AdView was initialized with a Context that wasn't an Activity.", true);
    }
  }
  
  private void a(Context paramContext, String paramString, g paramg, AttributeSet paramAttributeSet)
  {
    com.google.ads.util.g.b(paramString);
    a(paramContext, paramString, -65536, paramg, paramAttributeSet);
  }
  
  private void a(g... paramVarArgs)
  {
    g[] arrayOfg = new g[paramVarArgs.length];
    for (int i = 0; i < paramVarArgs.length; i++) {
      arrayOfg[i] = g.a(paramVarArgs[i], getContext());
    }
    this.a.h().n.a(arrayOfg);
  }
  
  private boolean a(Context paramContext, g paramg, AttributeSet paramAttributeSet)
  {
    if (!AdUtil.c(paramContext))
    {
      a(paramContext, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", paramg, paramAttributeSet);
      return false;
    }
    return true;
  }
  
  private boolean a(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    String str1 = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    boolean bool = paramAttributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", paramString, paramBoolean);
    if (str1 != null)
    {
      String str2 = paramContext.getPackageName();
      if (str1.matches("^@([^:]+)\\:(.*)$"))
      {
        str2 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
        str1 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
      }
      if (str1.startsWith("@bool/"))
      {
        String str3 = str1.substring("@bool/".length());
        TypedValue localTypedValue = new TypedValue();
        try
        {
          getResources().getValue(str2 + ":bool/" + str3, localTypedValue, true);
          if (localTypedValue.type != 18) {
            break label204;
          }
          if (localTypedValue.data != 0) {
            return true;
          }
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw new m("Could not find resource for " + paramString + ": " + str1, true, localNotFoundException);
        }
        return false;
        label204:
        throw new m("Resource " + paramString + " was not a boolean: " + localTypedValue, true);
      }
    }
    return bool;
  }
  
  private boolean a(String paramString, AttributeSet paramAttributeSet)
  {
    return paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString) != null;
  }
  
  private String b(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    String str1 = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    String str2;
    String str3;
    TypedValue localTypedValue;
    if (str1 != null)
    {
      str2 = paramContext.getPackageName();
      if (str1.matches("^@([^:]+)\\:(.*)$"))
      {
        str2 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
        str1 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
      }
      if (str1.startsWith("@string/"))
      {
        str3 = str1.substring("@string/".length());
        localTypedValue = new TypedValue();
      }
    }
    try
    {
      getResources().getValue(str2 + ":string/" + str3, localTypedValue, true);
      if (localTypedValue.string != null)
      {
        str1 = localTypedValue.string.toString();
        if ((!paramBoolean) || (str1 != null)) {
          break label272;
        }
        throw new m("Required XML attribute \"" + paramString + "\" missing", true);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      throw new m("Could not find resource for " + paramString + ": " + str1, true, localNotFoundException);
    }
    throw new m("Resource " + paramString + " was not a string: " + localTypedValue, true);
    label272:
    return str1;
  }
  
  private boolean b(Context paramContext, g paramg, AttributeSet paramAttributeSet)
  {
    if (!AdUtil.b(paramContext))
    {
      a(paramContext, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", paramg, paramAttributeSet);
      return false;
    }
    return true;
  }
  
  private Set c(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    String str1 = b(paramString, paramContext, paramAttributeSet, paramBoolean);
    HashSet localHashSet = new HashSet();
    if (str1 != null)
    {
      String[] arrayOfString = str1.split(",");
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str2 = arrayOfString[j].trim();
        if (str2.length() != 0) {
          localHashSet.add(str2);
        }
      }
    }
    return localHashSet;
  }
  
  void a(Context paramContext, String paramString, int paramInt, g paramg, AttributeSet paramAttributeSet)
  {
    if (paramg == null) {
      paramg = g.b;
    }
    g localg = g.a(paramg, paramContext.getApplicationContext());
    TextView localTextView;
    LinearLayout localLinearLayout1;
    if (getChildCount() == 0)
    {
      if (paramAttributeSet != null) {
        break label175;
      }
      localTextView = new TextView(paramContext);
      localTextView.setGravity(17);
      localTextView.setText(paramString);
      localTextView.setTextColor(paramInt);
      localTextView.setBackgroundColor(-16777216);
      if (paramAttributeSet != null) {
        break label190;
      }
      localLinearLayout1 = new LinearLayout(paramContext);
      label85:
      localLinearLayout1.setGravity(17);
      if (paramAttributeSet != null) {
        break label205;
      }
    }
    label175:
    label190:
    label205:
    for (LinearLayout localLinearLayout2 = new LinearLayout(paramContext);; localLinearLayout2 = new LinearLayout(paramContext, paramAttributeSet))
    {
      localLinearLayout2.setGravity(17);
      localLinearLayout2.setBackgroundColor(paramInt);
      int i = AdUtil.a(paramContext, localg.a());
      int j = AdUtil.a(paramContext, localg.b());
      localLinearLayout1.addView(localTextView, i - 2, j - 2);
      localLinearLayout2.addView(localLinearLayout1);
      addView(localLinearLayout2, i, j);
      return;
      localTextView = new TextView(paramContext, paramAttributeSet);
      break;
      localLinearLayout1 = new LinearLayout(paramContext, paramAttributeSet);
      break label85;
    }
  }
  
  public void a(d paramd)
  {
    if (this.a != null)
    {
      if (a()) {
        this.a.e();
      }
      this.a.a(paramd);
    }
  }
  
  public boolean a()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.r();
  }
  
  g[] a(String paramString)
  {
    String[] arrayOfString1 = paramString.split(",");
    g[] arrayOfg = new g[arrayOfString1.length];
    int i = 0;
    for (;;)
    {
      String str;
      String[] arrayOfString2;
      if (i < arrayOfString1.length)
      {
        str = arrayOfString1[i].trim();
        if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
        {
          arrayOfString2 = str.split("[xX]");
          arrayOfString2[0] = arrayOfString2[0].trim();
          arrayOfString2[1] = arrayOfString2[1].trim();
        }
      }
      try
      {
        int j;
        int m;
        label113:
        g localg;
        if ("FULL_WIDTH".equals(arrayOfString2[0]))
        {
          j = -1;
          boolean bool = "AUTO_HEIGHT".equals(arrayOfString2[1]);
          if (!bool) {
            break label145;
          }
          m = -2;
          localg = new g(j, m);
        }
        for (;;)
        {
          if (localg != null) {
            break label281;
          }
          return null;
          j = Integer.parseInt(arrayOfString2[0]);
          break;
          label145:
          int k = Integer.parseInt(arrayOfString2[1]);
          m = k;
          break label113;
          if ("BANNER".equals(str)) {
            localg = g.b;
          } else if ("SMART_BANNER".equals(str)) {
            localg = g.a;
          } else if ("IAB_MRECT".equals(str)) {
            localg = g.c;
          } else if ("IAB_BANNER".equals(str)) {
            localg = g.d;
          } else if ("IAB_LEADERBOARD".equals(str)) {
            localg = g.e;
          } else if ("IAB_WIDE_SKYSCRAPER".equals(str)) {
            localg = g.f;
          } else {
            localg = null;
          }
        }
        label281:
        arrayOfg[i] = localg;
        i++;
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
    return arrayOfg;
    return null;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!isInEditMode())
    {
      e locale = this.a.k();
      if (locale != null) {
        locale.setVisibility(0);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    if (isInEditMode()) {}
    while ((!((ac)this.a.h().g.a()).b()) || (paramInt == 0) || (this.a.h().l.a() == null) || (this.a.h().e.a() == null)) {
      return;
    }
    if ((AdActivity.b()) && (!AdActivity.c()))
    {
      b.a((WebView)this.a.h().e.a(), "onopeninapp", null);
      return;
    }
    b.a((WebView)this.a.h().e.a(), "onleaveapp", null);
  }
  
  public void setAdListener(c paramc)
  {
    this.a.h().o.a(paramc);
  }
  
  protected void setAppEventListener(h paramh)
  {
    this.a.h().p.a(paramh);
  }
  
  protected void setSupportedAdSizes(g... paramVarArgs)
  {
    if (this.a.h().n.a() == null)
    {
      com.google.ads.util.g.e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
      return;
    }
    a(paramVarArgs);
  }
  
  protected void setSwipeableEventListener(j paramj)
  {
    this.a.h().q.a(paramj);
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.AdView
 * JD-Core Version:    0.7.0.1
 */