package com.dagger2.zeroscreen.dagger.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by hongwei on 2017/5/13.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface LayoutScope {
}
