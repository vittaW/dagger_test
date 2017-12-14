package com.vitta.daggertest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/12/14 18:12
 * 描述：ContentView
 *
 * 注解 annotation
 * 关键字 @interface
 *
 *  元注解 修饰注解的注解
      //指定注解使用在哪
      @Target(value = {ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
        @Retention 指定注解的生命周期
        @Documented 用来生成文档的注解
        @Inherited 标识注解可继承的

    注解中可以像class 一样去书写一些字段，但是只支持基本数据类型，String，Class，Enumeration，Annotation

    如果注解中只有一个字段，我们通常会使用 value 作为名字
 *
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface ContentView {

    int value();

}
