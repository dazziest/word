package com.google.example.games.basegameutils;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.games.multiplayer.Invitation;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

public class a
  implements com.google.android.gms.common.c, d
{
  public static final String[] a = { "UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED" };
  int b = 0;
  boolean c = false;
  Activity d = null;
  String[] e;
  com.google.android.gms.games.c f = null;
  com.google.android.gms.plus.b g = null;
  com.google.android.gms.a.a h = null;
  int i = 0;
  int j = 0;
  int k = 0;
  boolean l = true;
  boolean m = false;
  com.google.android.gms.common.a n = null;
  c o = null;
  boolean p = false;
  String q = "GameHelper";
  String r;
  b s = null;
  
  public a(Activity paramActivity)
  {
    this.d = paramActivity;
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return String.valueOf(paramInt);
    case -1: 
      return "RESULT_OK";
    case 0: 
      return "RESULT_CANCELED";
    case 10004: 
      return "RESULT_APP_MISCONFIGURED";
    case 10005: 
      return "RESULT_LEFT_ROOM";
    case 10003: 
      return "RESULT_LICENSE_FAILED";
    case 10001: 
      return "RESULT_RECONNECT_REQUIRED";
    }
    return "SIGN_IN_FAILED";
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "Unknown error code " + paramInt;
    case 10: 
      return "DEVELOPER_ERROR(" + paramInt + ")";
    case 8: 
      return "INTERNAL_ERROR(" + paramInt + ")";
    case 5: 
      return "INVALID_ACCOUNT(" + paramInt + ")";
    case 11: 
      return "LICENSE_CHECK_FAILED(" + paramInt + ")";
    case 7: 
      return "NETWORK_ERROR(" + paramInt + ")";
    case 6: 
      return "RESOLUTION_REQUIRED(" + paramInt + ")";
    case 3: 
      return "SERVICE_DISABLED(" + paramInt + ")";
    case 9: 
      return "SERVICE_INVALID(" + paramInt + ")";
    case 1: 
      return "SERVICE_MISSING(" + paramInt + ")";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED(" + paramInt + ")";
    case 4: 
      return "SIGN_IN_REQUIRED(" + paramInt + ")";
    }
    return "SUCCESS(" + paramInt + ")";
  }
  
  public void a()
  {
    c("onDisconnected.");
    if (this.b == 1)
    {
      c("onDisconnected is expected, so no action taken.");
      return;
    }
    d("Unexpectedly disconnected. Severing remaining connections.");
    e();
    this.o = null;
    c("Making extraordinary call to onSignInFailed callback");
    a(false);
  }
  
  void a(int paramInt)
  {
    String str1 = a[this.b];
    String str2 = a[paramInt];
    this.b = paramInt;
    c("State change " + str1 + " -> " + str2);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    StringBuilder localStringBuilder = new StringBuilder("onActivityResult: req=");
    if (paramInt1 == 9001) {}
    for (String str = "RC_RESOLVE";; str = String.valueOf(paramInt1))
    {
      c(str + ", resp=" + b(paramInt2));
      if (paramInt1 == 9001) {
        break;
      }
      c("onActivityResult: request code not meant for us. Ignoring.");
      return;
    }
    this.c = false;
    if (this.b != 2)
    {
      c("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's " + a[this.b] + ")");
      return;
    }
    if (paramInt2 == -1)
    {
      c("onAR: Resolution was RESULT_OK, so connecting current client again.");
      j();
      return;
    }
    if (paramInt2 == 10001)
    {
      c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
      j();
      return;
    }
    if (paramInt2 == 0)
    {
      c("onAR: Got a cancellation result, so disconnecting.");
      this.l = false;
      this.m = false;
      this.o = null;
      e();
      a(false);
      return;
    }
    c("onAR: responseCode=" + b(paramInt2) + ", so giving up.");
    a(new c(this.n.b(), paramInt2));
  }
  
  public void a(Activity paramActivity)
  {
    this.d = paramActivity;
    c("onStart, state = " + a[this.b]);
    a("onStart");
    switch (this.b)
    {
    default: 
      String str = "onStart: BUG: unexpected state " + a[this.b];
      e(str);
      throw new IllegalStateException(str);
    case 1: 
      if (this.l)
      {
        c("onStart: Now connecting clients.");
        h();
        return;
      }
      c("onStart: Not connecting (user specifically signed out).");
      return;
    case 2: 
      c("onStart: connection process in progress, no action taken.");
      return;
    }
    c("onStart: already connected (unusual, but ok).");
  }
  
  public void a(Bundle paramBundle)
  {
    c("onConnected: connected! client=" + this.k);
    this.j |= this.k;
    c("Connected clients updated to: " + this.j);
    if ((this.k == 1) && (paramBundle != null))
    {
      c("onConnected: connection hint provided. Checking for invite.");
      Invitation localInvitation = (Invitation)paramBundle.getParcelable("invitation");
      if ((localInvitation != null) && (localInvitation.c() != null))
      {
        c("onConnected: connection hint has a room invite!");
        this.r = localInvitation.c();
        c("Invitation ID: " + this.r);
      }
      c("onConnected: connection hint provided. Checking for TBMP game.");
    }
    i();
  }
  
  public void a(com.google.android.gms.common.a parama)
  {
    c("onConnectionFailed");
    this.n = parama;
    c("Connection failure:");
    c("   - code: " + c(this.n.b()));
    c("   - resolvable: " + this.n.a());
    c("   - details: " + this.n.toString());
    if (!this.m)
    {
      c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
      this.n = parama;
      a(1);
      a(false);
      return;
    }
    c("onConnectionFailed: since user initiated sign-in, resolving problem.");
    l();
  }
  
  public void a(b paramb, int paramInt, String... paramVarArgs)
  {
    int i1 = 0;
    if (this.b != 0)
    {
      e("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
      throw new IllegalStateException("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
    }
    this.s = paramb;
    this.i = paramInt;
    c("Setup: requested clients: " + this.i);
    Vector localVector = new Vector();
    if ((paramInt & 0x1) != 0) {
      localVector.add("https://www.googleapis.com/auth/games");
    }
    if ((paramInt & 0x2) != 0) {
      localVector.add("https://www.googleapis.com/auth/plus.login");
    }
    if ((paramInt & 0x4) != 0) {
      localVector.add("https://www.googleapis.com/auth/appstate");
    }
    int i4;
    String[] arrayOfString;
    int i2;
    if (paramVarArgs != null)
    {
      int i3 = paramVarArgs.length;
      i4 = 0;
      if (i4 < i3) {}
    }
    else
    {
      this.e = new String[localVector.size()];
      localVector.copyInto(this.e);
      c("setup: scopes:");
      arrayOfString = this.e;
      i2 = arrayOfString.length;
    }
    for (;;)
    {
      if (i1 >= i2)
      {
        if ((paramInt & 0x1) != 0)
        {
          c("setup: creating GamesClient");
          this.f = new com.google.android.gms.games.f(g(), this, this).a(49).a(this.e).a();
        }
        if ((paramInt & 0x2) != 0)
        {
          c("setup: creating GamesPlusClient");
          this.g = new com.google.android.gms.plus.c(g(), this, this).a(this.e).a();
        }
        if ((paramInt & 0x4) != 0)
        {
          c("setup: creating AppStateClient");
          this.h = new com.google.android.gms.a.c(g(), this, this).a(this.e).a();
        }
        a(1);
        return;
        localVector.add(paramVarArgs[i4]);
        i4++;
        break;
      }
      String str = arrayOfString[i1];
      c("  - " + str);
      i1++;
    }
  }
  
  void a(c paramc)
  {
    a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", new int[] { 2 });
    this.l = false;
    e();
    this.o = paramc;
    m();
    a(false);
  }
  
  void a(String paramString)
  {
    if (this.b == 0)
    {
      String str = "GameHelper error: Operation attempted without setup: " + paramString + ". The setup() method must be called before attempting any other operation.";
      e(str);
      throw new IllegalStateException(str);
    }
  }
  
  void a(StringBuilder paramStringBuilder, byte paramByte)
  {
    if (paramByte < 0) {
      paramByte += 256;
    }
    int i1 = paramByte / 16;
    int i2 = paramByte % 16;
    paramStringBuilder.append("0123456789ABCDEF".substring(i1, i1 + 1));
    paramStringBuilder.append("0123456789ABCDEF".substring(i2, i2 + 1));
  }
  
  void a(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("Notifying LISTENER of sign-in ");
    String str;
    if (paramBoolean) {
      str = "SUCCESS";
    }
    for (;;)
    {
      c(str);
      if (this.s != null)
      {
        if (!paramBoolean) {
          break;
        }
        this.s.k();
      }
      return;
      if (this.o != null) {
        str = "FAILURE (error)";
      } else {
        str = "FAILURE (no error)";
      }
    }
    this.s.j();
  }
  
  public void a(boolean paramBoolean, String paramString)
  {
    this.p = paramBoolean;
    this.q = paramString;
    if (paramBoolean) {
      c("Debug log enabled, tag: " + paramString);
    }
  }
  
  boolean a(int paramInt, String paramString1, String paramString2, int... paramVarArgs)
  {
    int i1 = 1;
    int i2 = paramVarArgs.length;
    int i3 = 0;
    StringBuilder localStringBuilder;
    if (i3 >= i2)
    {
      localStringBuilder = new StringBuilder();
      if (paramInt != 1001) {
        break label172;
      }
      localStringBuilder.append("GameHelper: you attempted an operation at an invalid. ");
    }
    for (;;)
    {
      localStringBuilder.append("Explanation: ").append(paramString2);
      localStringBuilder.append("Operation: ").append(paramString1).append(". ");
      localStringBuilder.append("State: ").append(a[this.b]).append(". ");
      if (paramVarArgs.length != i1) {
        break label211;
      }
      localStringBuilder.append("Expected state: ").append(a[paramVarArgs[0]]).append(".");
      d(localStringBuilder.toString());
      i1 = 0;
      int i7;
      do
      {
        return i1;
        i7 = paramVarArgs[i3];
      } while (this.b == i7);
      i3++;
      break;
      label172:
      localStringBuilder.append("GameHelper: bug detected. Please report it at our bug tracker ");
      localStringBuilder.append("https://github.com/playgameservices/android-samples/issues. ");
      localStringBuilder.append("Please include the last couple hundred lines of logcat output ");
      localStringBuilder.append("and describe the operation that caused this. ");
    }
    label211:
    localStringBuilder.append("Expected states:");
    int i4 = paramVarArgs.length;
    for (int i5 = 0;; i5++)
    {
      if (i5 >= i4)
      {
        localStringBuilder.append(".");
        break;
      }
      int i6 = paramVarArgs[i5];
      localStringBuilder.append(" ").append(a[i6]);
    }
  }
  
  Dialog b(String paramString)
  {
    return new AlertDialog.Builder(g()).setMessage(paramString).setNeutralButton(17039370, null).create();
  }
  
  public com.google.android.gms.games.c b()
  {
    if (this.f == null) {
      throw new IllegalStateException("No GamesClient. Did you request it at setup?");
    }
    return this.f;
  }
  
  void c(String paramString)
  {
    if (this.p) {
      Log.d(this.q, "GameHelper: " + paramString);
    }
  }
  
  public boolean c()
  {
    return this.b == 3;
  }
  
  public void d()
  {
    c("onStop, state = " + a[this.b]);
    a("onStop");
    switch (this.b)
    {
    default: 
      String str = "onStop: BUG: unexpected state " + a[this.b];
      e(str);
      throw new IllegalStateException(str);
    case 2: 
    case 3: 
      c("onStop: Killing connections");
      e();
    }
    for (;;)
    {
      this.d = null;
      return;
      c("onStop: not connected, so no action taken.");
    }
  }
  
  void d(String paramString)
  {
    Log.w(this.q, "!!! GameHelper WARNING: " + paramString);
  }
  
  void e()
  {
    if (!a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", new int[] { 3, 2 })) {
      return;
    }
    c("killConnections: killing connections.");
    this.n = null;
    this.o = null;
    if ((this.f != null) && (this.f.b()))
    {
      c("Disconnecting GamesClient.");
      this.f.c();
    }
    if ((this.g != null) && (this.g.b()))
    {
      c("Disconnecting PlusClient.");
      this.g.c();
    }
    if ((this.h != null) && (this.h.b()))
    {
      c("Disconnecting AppStateClient.");
      this.h.c();
    }
    this.j = 0;
    c("killConnections: all clients disconnected.");
    a(1);
  }
  
  void e(String paramString)
  {
    Log.e(this.q, "*** GameHelper ERROR: " + paramString);
  }
  
  public void f()
  {
    if (this.b == 3)
    {
      d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
      a(true);
      return;
    }
    if (this.b == 2)
    {
      d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
      return;
    }
    c("Starting USER-INITIATED sign-in flow.");
    this.l = true;
    int i1 = com.google.android.gms.common.f.a(g());
    c("isGooglePlayServicesAvailable returned " + i1);
    if (i1 != 0)
    {
      c("Google Play services not available. Show error dialog.");
      this.o = new c(i1, 0);
      m();
      a(false);
      return;
    }
    this.m = true;
    if (this.n != null)
    {
      c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
      a(2);
      l();
      return;
    }
    c("beginUserInitiatedSignIn: starting new sign-in flow.");
    h();
  }
  
  Context g()
  {
    return this.d;
  }
  
  void h()
  {
    if (!a(1002, "startConnections", "startConnections should only get called when disconnected.", new int[] { 1 })) {
      return;
    }
    c("Starting connections.");
    a(2);
    this.r = null;
    i();
  }
  
  void i()
  {
    c("connectNextClient: requested clients: " + this.i + ", connected clients: " + this.j);
    if ((this.f != null) && (this.f.b()) && ((0x1 & this.j) == 0))
    {
      d("GamesClient was already connected. Fixing.");
      this.j = (0x1 | this.j);
    }
    if ((this.g != null) && (this.g.b()) && ((0x2 & this.j) == 0))
    {
      d("PlusClient was already connected. Fixing.");
      this.j = (0x2 | this.j);
    }
    if ((this.h != null) && (this.h.b()) && ((0x4 & this.j) == 0))
    {
      d("AppStateClient was already connected. Fixing");
      this.j = (0x4 | this.j);
    }
    int i1 = this.i & (0xFFFFFFFF ^ this.j);
    c("Pending clients: " + i1);
    if (i1 == 0)
    {
      c("All clients now connected. Sign-in successful!");
      k();
      return;
    }
    if ((this.f != null) && ((i1 & 0x1) != 0))
    {
      c("Connecting GamesClient.");
      this.k = 1;
    }
    for (;;)
    {
      j();
      return;
      if ((this.g != null) && ((i1 & 0x2) != 0))
      {
        c("Connecting PlusClient.");
        this.k = 2;
      }
      else
      {
        if ((this.h == null) || ((i1 & 0x4) == 0)) {
          break;
        }
        c("Connecting AppStateClient.");
        this.k = 4;
      }
    }
    throw new AssertionError("Not all clients connected, yet no one is next. R=" + this.i + ", C=" + this.j);
  }
  
  void j()
  {
    if (this.b == 1) {
      d("GameHelper got disconnected during connection process. Aborting.");
    }
    while (!a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", new int[] { 2 })) {
      return;
    }
    switch (this.k)
    {
    case 3: 
    default: 
      return;
    case 1: 
      this.f.a();
      return;
    case 4: 
      this.h.a();
      return;
    }
    this.g.a();
  }
  
  void k()
  {
    a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", new int[] { 2, 3 });
    c("All requested clients connected. Sign-in succeeded!");
    a(3);
    this.o = null;
    this.l = true;
    this.m = false;
    a(true);
  }
  
  void l()
  {
    a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", new int[] { 2 });
    if (this.c)
    {
      c("We're already expecting the result of a previous resolution.");
      return;
    }
    c("resolveConnectionResult: trying to resolve result: " + this.n);
    if (this.n.a())
    {
      c("Result has resolution. Starting it.");
      try
      {
        this.c = true;
        this.n.a(this.d, 9001);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        c("SendIntentException, so connecting again.");
        j();
        return;
      }
    }
    c("resolveConnectionResult: result has no resolution. Giving up.");
    a(new c(this.n.b()));
  }
  
  void m()
  {
    Context localContext = g();
    if (localContext == null)
    {
      c("*** No context. Can't show failure dialog.");
      return;
    }
    c("Making error dialog for failure: " + this.o);
    int i1 = this.o.a();
    Dialog localDialog;
    switch (this.o.b())
    {
    default: 
      localDialog = com.google.android.gms.common.f.a(i1, this.d, 9002, null);
      if (localDialog == null)
      {
        c("No standard error dialog available. Making fallback dialog.");
        localDialog = b(localContext.getString(e.gamehelper_unknown_error) + " " + c(i1));
      }
      break;
    }
    for (;;)
    {
      c("Showing error dialog.");
      localDialog.show();
      return;
      localDialog = b(localContext.getString(e.gamehelper_app_misconfigured));
      n();
      continue;
      localDialog = b(localContext.getString(e.gamehelper_sign_in_failed));
      continue;
      localDialog = b(localContext.getString(e.gamehelper_license_failed));
    }
  }
  
  void n()
  {
    c("****");
    c("****");
    c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
    c("**** This is usually caused by one of these reasons:");
    c("**** (1) Your package name and certificate fingerprint do not match");
    c("****     the client ID you registered in Developer Console.");
    c("**** (2) Your App ID was incorrectly entered.");
    c("**** (3) Your game settings have not been published and you are ");
    c("****     trying to log in with an account that is not listed as");
    c("****     a test account.");
    c("****");
    if (g() == null)
    {
      c("*** (no Context, so can't print more debug info)");
      return;
    }
    c("**** To help you debug, here is the information about this app");
    c("**** Package name         : " + g().getPackageName());
    c("**** Cert SHA1 fingerprint: " + p());
    c("**** App ID from          : " + o());
    c("****");
    c("**** Check that the above information matches your setup in ");
    c("**** Developer Console. Also, check that you're logging in with the");
    c("**** right account (it should be listed in the Testers section if");
    c("**** your project is not yet published).");
    c("****");
    c("**** For more information, refer to the troubleshooting guide:");
    c("****   http://developers.google.com/games/services/android/troubleshooting");
  }
  
  String o()
  {
    try
    {
      Resources localResources = g().getResources();
      String str = localResources.getString(localResources.getIdentifier("app_id", "string", g().getPackageName()));
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return "??? (failed to retrieve APP ID)";
  }
  
  String p()
  {
    int i1 = 0;
    try
    {
      Signature[] arrayOfSignature = g().getPackageManager().getPackageInfo(g().getPackageName(), 64).signatures;
      int i2 = arrayOfSignature.length;
      if (i2 == 0) {
        return "ERROR: NO SIGNATURE.";
      }
      int i3 = arrayOfSignature.length;
      if (i3 > 1) {
        return "ERROR: MULTIPLE SIGNATURES";
      }
      byte[] arrayOfByte = MessageDigest.getInstance("SHA1").digest(arrayOfSignature[0].toByteArray());
      StringBuilder localStringBuilder = new StringBuilder();
      for (;;)
      {
        if (i1 >= arrayOfByte.length) {
          return localStringBuilder.toString();
        }
        if (i1 > 0) {
          localStringBuilder.append(":");
        }
        a(localStringBuilder, arrayOfByte[i1]);
        i1++;
      }
      return "(ERROR: SHA1 algorithm not found)";
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.printStackTrace();
      return "(ERROR: package not found)";
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.example.games.basegameutils.a
 * JD-Core Version:    0.7.0.1
 */