package com.vitta.daggertest;

import dagger.Component;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/29 18:05
 * 描述：MainActivityComponent
 */

@Component(modules = {FlowerModule.class})
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
