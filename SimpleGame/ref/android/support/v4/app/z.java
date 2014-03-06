package android.support.v4.app;

import android.support.v4.b.d;
import android.support.v4.b.m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class z
  extends x
{
  static boolean a = false;
  final m b = new m();
  final m c = new m();
  final String d;
  FragmentActivity e;
  boolean f;
  boolean g;
  
  z(String paramString, FragmentActivity paramFragmentActivity, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramFragmentActivity;
    this.f = paramBoolean;
  }
  
  void a(FragmentActivity paramFragmentActivity)
  {
    this.e = paramFragmentActivity;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.b.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.b.b(); j++)
      {
        aa localaa2 = (aa)this.b.b(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.a(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localaa2.toString());
        localaa2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.c.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.c.b())
      {
        aa localaa1 = (aa)this.c.b(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.a(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localaa1.toString());
        localaa1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }
  
  public boolean a()
  {
    int i = this.b.b();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      aa localaa = (aa)this.b.b(j);
      if ((localaa.h) && (!localaa.f)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }
  
  void b()
  {
    if (a) {
      Log.v("LoaderManager", "Starting in " + this);
    }
    if (this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.f = true;
      for (int i = -1 + this.b.b(); i >= 0; i--) {
        ((aa)this.b.b(i)).a();
      }
    }
  }
  
  void c()
  {
    if (a) {
      Log.v("LoaderManager", "Stopping in " + this);
    }
    if (!this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
      return;
    }
    for (int i = -1 + this.b.b(); i >= 0; i--) {
      ((aa)this.b.b(i)).e();
    }
    this.f = false;
  }
  
  void d()
  {
    if (a) {
      Log.v("LoaderManager", "Retaining in " + this);
    }
    if (!this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, localRuntimeException);
    }
    for (;;)
    {
      return;
      this.g = true;
      this.f = false;
      for (int i = -1 + this.b.b(); i >= 0; i--) {
        ((aa)this.b.b(i)).b();
      }
    }
  }
  
  void e()
  {
    if (this.g)
    {
      if (a) {
        Log.v("LoaderManager", "Finished Retaining in " + this);
      }
      this.g = false;
      for (int i = -1 + this.b.b(); i >= 0; i--) {
        ((aa)this.b.b(i)).c();
      }
    }
  }
  
  void f()
  {
    for (int i = -1 + this.b.b(); i >= 0; i--) {
      ((aa)this.b.b(i)).k = true;
    }
  }
  
  void g()
  {
    for (int i = -1 + this.b.b(); i >= 0; i--) {
      ((aa)this.b.b(i)).d();
    }
  }
  
  void h()
  {
    if (!this.g)
    {
      if (a) {
        Log.v("LoaderManager", "Destroying Active in " + this);
      }
      for (int j = -1 + this.b.b(); j >= 0; j--) {
        ((aa)this.b.b(j)).f();
      }
      this.b.c();
    }
    if (a) {
      Log.v("LoaderManager", "Destroying Inactive in " + this);
    }
    for (int i = -1 + this.c.b(); i >= 0; i--) {
      ((aa)this.c.b(i)).f();
    }
    this.c.c();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    d.a(this.e, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.z
 * JD-Core Version:    0.7.0.1
 */