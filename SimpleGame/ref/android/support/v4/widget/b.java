package android.support.v4.widget;

class b
  implements Runnable
{
  b(ContentLoadingProgressBar paramContentLoadingProgressBar) {}
  
  public void run()
  {
    ContentLoadingProgressBar.b(this.a, false);
    if (!ContentLoadingProgressBar.a(this.a))
    {
      ContentLoadingProgressBar.a(this.a, System.currentTimeMillis());
      this.a.setVisibility(0);
    }
  }
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.b
 * JD-Core Version:    0.7.0.1
 */