package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.d;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.p;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

public final class f
{
  static final byte[][] a;
  static final byte[][] b;
  static final byte[][] c;
  static final byte[][] d;
  static final byte[][] e;
  public static boolean f = false;
  public static boolean g = false;
  static boolean h = false;
  private static final byte[][] i;
  private static final byte[][] j;
  private static int k = -1;
  private static final Object l = new Object();
  
  static
  {
    byte[][] arrayOfByte1 = new byte[2][];
    arrayOfByte1[0] = a("");
    arrayOfByte1[1] = a("");
    a = arrayOfByte1;
    byte[][] arrayOfByte2 = new byte[2][];
    arrayOfByte2[0] = a("");
    arrayOfByte2[1] = a("");
    b = arrayOfByte2;
    byte[][] arrayOfByte3 = new byte[1][];
    arrayOfByte3[0] = a("");
    c = arrayOfByte3;
    byte[][] arrayOfByte4 = new byte[2][];
    arrayOfByte4[0] = a("");
    arrayOfByte4[1] = a("");
    d = arrayOfByte4;
    byte[][][] arrayOfByte = new byte[4][][];
    arrayOfByte[0] = a;
    arrayOfByte[1] = b;
    arrayOfByte[2] = c;
    arrayOfByte[3] = d;
    i = a(arrayOfByte);
    byte[][] arrayOfByte5 = new byte[3][];
    arrayOfByte5[0] = a[0];
    arrayOfByte5[1] = b[0];
    arrayOfByte5[2] = d[0];
    j = arrayOfByte5;
    byte[][] arrayOfByte6 = new byte[1][];
    arrayOfByte6[0] = a("");
    e = arrayOfByte6;
  }
  
  public static int a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    byte[] arrayOfByte;
    try
    {
      paramContext.getResources().getString(d.common_google_play_services_unknown_issue);
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        try
        {
          PackageInfo localPackageInfo1 = localPackageManager.getPackageInfo("com.android.vending", 64);
          arrayOfByte = a(localPackageInfo1, a);
          if (arrayOfByte != null) {
            break;
          }
          Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
          return 9;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
          return 9;
        }
        localThrowable = localThrowable;
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
      }
    }
    PackageInfo localPackageInfo2;
    try
    {
      localPackageInfo2 = localPackageManager.getPackageInfo("com.google.android.gms", 64);
      if (a(localPackageInfo2, new byte[][] { arrayOfByte }) == null)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
      return 1;
    }
    if (localPackageInfo2.versionCode < 3265100)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 3265100 but found " + localPackageInfo2.versionCode);
      return 2;
    }
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      if (!localApplicationInfo.enabled) {
        return 3;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException3)
    {
      Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
      localNameNotFoundException3.printStackTrace();
      return 1;
    }
    return 0;
  }
  
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramInt1, paramActivity, paramInt2, paramOnCancelListener, -1);
  }
  
  public static Dialog a(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener, int paramInt3)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity).setMessage(b(paramActivity, paramInt1, paramInt3));
    if (paramOnCancelListener != null) {
      localBuilder.setOnCancelListener(paramOnCancelListener);
    }
    cp localcp = new cp(paramActivity, a(paramActivity, paramInt1, paramInt3), paramInt2);
    String str = a(paramActivity, paramInt1);
    if (str != null) {
      localBuilder.setPositiveButton(str, localcp);
    }
    switch (paramInt1)
    {
    default: 
      Log.e("GooglePlayServicesUtil", "Unexpected error code " + paramInt1);
      return localBuilder.setTitle(d.common_google_play_services_unknown_issue).create();
    case 0: 
      return null;
    case 4: 
    case 6: 
      return localBuilder.setTitle(d.common_google_play_services_unknown_issue).create();
    case 1: 
      return localBuilder.setTitle(d.common_google_play_services_install_title).create();
    case 3: 
      return localBuilder.setTitle(d.common_google_play_services_enable_title).create();
    case 2: 
      return localBuilder.setTitle(d.common_google_play_services_update_title).create();
    case 9: 
      Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
      return localBuilder.setTitle(d.common_google_play_services_unsupported_title).create();
    case 7: 
      Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
      return localBuilder.setTitle(d.common_google_play_services_network_error_title).create();
    case 8: 
      Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
      return localBuilder.setTitle(d.common_google_play_services_unknown_issue).create();
    case 10: 
      Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
      return localBuilder.setTitle(d.common_google_play_services_unknown_issue).create();
    case 5: 
      Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
      return localBuilder.setTitle(d.common_google_play_services_invalid_account_title).create();
    }
    Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
    return localBuilder.setTitle(d.common_google_play_services_unknown_issue).create();
  }
  
  public static Intent a(Context paramContext, int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      if (a(paramInt2))
      {
        if (c(paramContext)) {
          return da.c("com.google.android.gms");
        }
        return da.b("com.google.android.apps.bazaar");
      }
      return da.b("com.google.android.gms");
    }
    return da.a("com.google.android.gms");
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return localResources.getString(17039370);
    case 1: 
      return localResources.getString(d.common_google_play_services_install_button);
    case 3: 
      return localResources.getString(d.common_google_play_services_enable_button);
    }
    return localResources.getString(d.common_google_play_services_update_button);
  }
  
  public static boolean a()
  {
    if (f) {
      return g;
    }
    return "user".equals(Build.TYPE);
  }
  
  static boolean a(int paramInt)
  {
    boolean bool = true;
    switch (b(paramInt))
    {
    default: 
      bool = false;
    case 1: 
    case 0: 
      do
      {
        return bool;
      } while (!a());
      return false;
    }
    return false;
  }
  
  public static boolean a(Resources paramResources)
  {
    if ((0xF & paramResources.getConfiguration().screenLayout) > 3) {}
    for (int m = 1;; m = 0)
    {
      boolean bool2;
      if ((!p.a()) || (m == 0))
      {
        boolean bool1 = b(paramResources);
        bool2 = false;
        if (!bool1) {}
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    }
  }
  
  private static byte[] a(PackageInfo paramPackageInfo, byte[]... paramVarArgs)
  {
    CertificateFactory localCertificateFactory;
    try
    {
      localCertificateFactory = CertificateFactory.getInstance("X509");
      if (paramPackageInfo.signatures.length != 1)
      {
        Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
        return null;
      }
    }
    catch (CertificateException localCertificateException1)
    {
      Log.w("GooglePlayServicesUtil", "Could not get certificate instance.");
      return null;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramPackageInfo.signatures[0].toByteArray());
    byte[] arrayOfByte1;
    label154:
    for (;;)
    {
      try
      {
        X509Certificate localX509Certificate = (X509Certificate)localCertificateFactory.generateCertificate(localByteArrayInputStream);
        int m;
        byte[] arrayOfByte2;
        m++;
      }
      catch (CertificateException localCertificateException2)
      {
        try
        {
          localX509Certificate.checkValidity();
          arrayOfByte1 = paramPackageInfo.signatures[0].toByteArray();
          m = 0;
          if (m >= paramVarArgs.length) {
            break;
          }
          arrayOfByte2 = paramVarArgs[m];
          if (!Arrays.equals(arrayOfByte2, arrayOfByte1)) {
            break label154;
          }
          return arrayOfByte2;
        }
        catch (CertificateExpiredException localCertificateExpiredException)
        {
          Log.w("GooglePlayServicesUtil", "Certificate has expired.");
          return null;
        }
        catch (CertificateNotYetValidException localCertificateNotYetValidException)
        {
          Log.w("GooglePlayServicesUtil", "Certificate is not yet valid.");
          return null;
        }
        localCertificateException2 = localCertificateException2;
        Log.w("GooglePlayServicesUtil", "Could not generate certificate.");
        return null;
      }
    }
    if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
      Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(arrayOfByte1, 0));
    }
    return null;
  }
  
  private static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }
  
  private static byte[][] a(byte[][]... paramVarArgs)
  {
    int m = paramVarArgs.length;
    int n = 0;
    int i1 = 0;
    while (n < m)
    {
      i1 += paramVarArgs[n].length;
      n++;
    }
    byte[][] arrayOfByte = new byte[i1][];
    int i2 = paramVarArgs.length;
    int i3 = 0;
    int i5;
    for (int i4 = 0; i3 < i2; i4 = i5)
    {
      byte[][] arrayOfByte1 = paramVarArgs[i3];
      i5 = i4;
      int i6 = 0;
      while (i6 < arrayOfByte1.length)
      {
        int i7 = i5 + 1;
        arrayOfByte[i5] = arrayOfByte1[i6];
        i6++;
        i5 = i7;
      }
      i3++;
    }
    return arrayOfByte;
  }
  
  private static int b(int paramInt)
  {
    if (paramInt == -1) {
      paramInt = 2;
    }
    return paramInt;
  }
  
  public static Context b(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public static String b(Context paramContext, int paramInt1, int paramInt2)
  {
    Resources localResources = paramContext.getResources();
    String str;
    switch (paramInt1)
    {
    case 4: 
    case 6: 
    case 8: 
    default: 
      str = localResources.getString(d.common_google_play_services_unknown_issue);
    case 1: 
    case 3: 
    case 2: 
      do
      {
        return str;
        if (a(paramContext.getResources())) {}
        for (str = localResources.getString(d.common_google_play_services_install_text_tablet); a(paramInt2); str = localResources.getString(d.common_google_play_services_install_text_phone)) {
          return str + " (via Bazaar)";
        }
        return localResources.getString(d.common_google_play_services_enable_text);
        str = localResources.getString(d.common_google_play_services_update_text);
      } while (!a(paramInt2));
      return str + " (via Bazaar)";
    case 9: 
      return localResources.getString(d.common_google_play_services_unsupported_text);
    case 7: 
      return localResources.getString(d.common_google_play_services_network_error_text);
    }
    return localResources.getString(d.common_google_play_services_invalid_account_text);
  }
  
  private static boolean b(Resources paramResources)
  {
    Configuration localConfiguration = paramResources.getConfiguration();
    boolean bool1 = p.c();
    boolean bool2 = false;
    if (bool1)
    {
      int m = 0xF & localConfiguration.screenLayout;
      bool2 = false;
      if (m <= 3)
      {
        int n = localConfiguration.smallestScreenWidthDp;
        bool2 = false;
        if (n >= 600) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  private static boolean c(Context paramContext)
  {
    boolean bool;
    if (f) {
      bool = h;
    }
    for (;;)
    {
      return bool;
      try
      {
        byte[] arrayOfByte = a(paramContext.getPackageManager().getPackageInfo("com.google.android.apps.bazaar", 64), e);
        bool = false;
        if (arrayOfByte != null) {
          return true;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    }
    return false;
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.f
 * JD-Core Version:    0.7.0.1
 */