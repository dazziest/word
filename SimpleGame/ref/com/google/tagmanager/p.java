package com.google.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

class p
{
  @SuppressLint({"CommitPrefEdits"})
  static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
    localEditor.putString(paramString2, paramString3);
    a(localEditor);
  }
  
  static void a(SharedPreferences.Editor paramEditor)
  {
    if (Build.VERSION.SDK_INT >= 9)
    {
      paramEditor.apply();
      return;
    }
    new Thread(new q(paramEditor)).start();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.tagmanager.p
 * JD-Core Version:    0.7.0.1
 */