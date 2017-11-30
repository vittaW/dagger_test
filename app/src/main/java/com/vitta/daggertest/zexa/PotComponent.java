package com.vitta.daggertest.zexa;

import dagger.Component;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 10:30
 * 描述：PotComponent
 */

@Component(modules = PotModule.class,dependencies = FlowerComponent.class)
public interface PotComponent {

    Pot getPot();

}
