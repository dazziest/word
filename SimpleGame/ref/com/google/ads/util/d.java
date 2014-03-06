package com.google.ads.util;

import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.google.ads.bt;

public class d
  extends r
{
  public d(bt parambt)
  {
    super(parambt);
  }
  
  public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    paramCustomViewCallback.onCustomViewHidden();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.d
 * JD-Core Version:    0.7.0.1
 */