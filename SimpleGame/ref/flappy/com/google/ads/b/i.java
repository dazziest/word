package com.google.ads.b;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface i
{
  String a();
  
  boolean b() default true;
}


/* Location:           P:\Side\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.i
 * JD-Core Version:    0.7.0.1
 */