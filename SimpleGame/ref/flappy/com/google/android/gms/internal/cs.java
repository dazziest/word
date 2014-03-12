package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import java.util.ArrayList;

final class cs
  extends Handler
{
  public cs(cr paramcr, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (!this.a.i()))
    {
      ct localct2 = (ct)paramMessage.obj;
      localct2.a();
      localct2.c();
      return;
    }
    synchronized (cr.a(this.a))
    {
      this.a.d = false;
      if (paramMessage.what == 3)
      {
        this.a.a(new a(((Integer)paramMessage.obj).intValue(), null));
        return;
      }
    }
    if (paramMessage.what == 4) {
      synchronized (cr.b(this.a))
      {
        if ((this.a.c) && (this.a.h()) && (cr.b(this.a).contains(paramMessage.obj))) {
          ((c)paramMessage.obj).a(this.a.e());
        }
        return;
      }
    }
    if ((paramMessage.what == 2) && (!this.a.h()))
    {
      ct localct1 = (ct)paramMessage.obj;
      localct1.a();
      localct1.c();
      return;
    }
    if ((paramMessage.what == 2) || (paramMessage.what == 1))
    {
      ((ct)paramMessage.obj).b();
      return;
    }
    Log.wtf("GmsClient", "Don't know how to handle this message.");
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cs
 * JD-Core Version:    0.7.0.1
 */