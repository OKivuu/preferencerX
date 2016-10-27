package com.github.preferencer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author raunysouza
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Preference {
    String name() default "";
    String defaultValue() default "";
}
