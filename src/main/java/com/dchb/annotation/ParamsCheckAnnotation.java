package com.dchb.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamsCheckAnnotation {
}