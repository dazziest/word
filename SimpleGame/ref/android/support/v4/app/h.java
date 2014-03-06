package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

class h
  extends Handler
{
  h(FragmentActivity paramFragmentActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
    case 1: 
      do
      {
        return;
      } while (!this.a.f);
      this.a.a(false);
      return;
    }
    this.a.a();
    this.a.b.e();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.h
 * JD-Core Version:    0.7.0.1
 */