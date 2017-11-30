package com.vitta.daggertest.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 15:21
 * 描述：SpNameQualifier
 */
@Qualifier
@Retention(RUNTIME)
public @interface DbNameQualifier {
}
