package com.google.ads.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ai;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.d;
import com.google.ads.util.p;
import com.google.ads.util.r;
import com.google.ads.util.z;
import java.lang.ref.WeakReference;

public class e
  extends WebView
{
  protected final bt a;
  private WeakReference b;
  private com.google.ads.g c;
  private boolean d;
  private boolean e;
  private boolean f;
  
  public e(bt parambt, com.google.ads.g paramg)
  {
    super((Context)parambt.f.a());
    this.a = parambt;
    this.c = paramg;
    this.b = null;
    this.d = false;
    this.e = false;
    this.f = false;
    setBackgroundColor(0);
    AdUtil.a(this);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportMultipleWindows(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    setDownloadListener(new f(this));
    if (AdUtil.a >= 17) {
      z.a(localWebSettings, parambt);
    }
    do
    {
      for (;;)
      {
        setScrollBarStyle(33554432);
        if (AdUtil.a < 14) {
          break;
        }
        setWebChromeClient(new d(parambt));
        return;
        if (AdUtil.a >= 11) {
          p.a(localWebSettings, parambt);
        }
      }
    } while (AdUtil.a < 11);
    setWebChromeClient(new r(parambt));
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      setOnTouchListener(new g(this));
      return;
    }
    setOnTouchListener(null);
  }
  
  public void destroy()
  {
    try
    {
      super.destroy();
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        try
        {
          setWebViewClient(new WebViewClient());
          return;
        }
        catch (Throwable localThrowable2) {}
        localThrowable1 = localThrowable1;
        com.google.ads.util.g.d("An error occurred while destroying an AdWebView:", localThrowable1);
      }
    }
  }
  
  public void f()
  {
    AdActivity localAdActivity = i();
    if (localAdActivity != null) {
      localAdActivity.finish();
    }
  }
  
  public void g()
  {
    if (AdUtil.a >= 11) {
      p.a(this);
    }
    this.e = true;
  }
  
  public void h()
  {
    if ((this.e) && (AdUtil.a >= 11)) {
      p.b(this);
    }
    this.e = false;
  }
  
  public AdActivity i()
  {
    if (this.b != null) {
      return (AdActivity)this.b.get();
    }
    return null;
  }
  
  public boolean j()
  {
    return this.f;
  }
  
  public boolean k()
  {
    return this.e;
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.ads.util.g.d("An error occurred while loading data in AdWebView:", localThrowable);
    }
  }
  
  public void loadUrl(String paramString)
  {
    try
    {
      super.loadUrl(paramString);
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.ads.util.g.d("An error occurred while loading a URL in AdWebView:", localThrowable);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    try
    {
      if (isInEditMode()) {
        super.onMeasure(paramInt1, paramInt2);
      }
      for (;;)
      {
        return;
        if ((this.c != null) && (!this.d)) {
          break;
        }
        super.onMeasure(paramInt1, paramInt2);
      }
      j = View.MeasureSpec.getMode(paramInt1);
    }
    finally {}
    int j;
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    float f1 = getContext().getResources().getDisplayMetrics().density;
    int i1 = (int)(f1 * this.c.a());
    int i2 = (int)(f1 * this.c.b());
    if (j != -2147483648) {
      if (j == 1073741824) {
        break label227;
      }
    }
    for (;;)
    {
      label135:
      com.google.ads.util.g.b("Not enough space to show ad! Wants: <" + i1 + ", " + i2 + ">, Has: <" + k + ", " + n + ">");
      setVisibility(8);
      setMeasuredDimension(k, n);
      break;
      label227:
      label231:
      do
      {
        setMeasuredDimension(i1, i2);
        break;
        int i3 = i;
        break label231;
        i3 = k;
        if ((m == -2147483648) || (m == 1073741824)) {
          i = n;
        }
        if (i1 - f1 * 6.0F > i3) {
          break label135;
        }
      } while (i2 <= i);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    ai localai = (ai)this.a.r.a();
    if (localai != null) {
      localai.a(paramMotionEvent);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAdActivity(AdActivity paramAdActivity)
  {
    this.b = new WeakReference(paramAdActivity);
  }
  
  public void setAdSize(com.google.ads.g paramg)
  {
    try
    {
      this.c = paramg;
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void setCustomClose(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (this.b != null)
    {
      AdActivity localAdActivity = (AdActivity)this.b.get();
      if (localAdActivity != null) {
        localAdActivity.a(paramBoolean);
      }
    }
  }
  
  public void setIsExpandedMraid(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void stopLoading()
  {
    try
    {
      super.stopLoading();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.ads.util.g.d("An error occurred while stopping loading in AdWebView:", localThrowable);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.a.e
 * JD-Core Version:    0.7.0.1
 */