package com.vitta.daggertest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/29 18:42
 * 描述：LilyFlower
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface LilyFlower {
}
