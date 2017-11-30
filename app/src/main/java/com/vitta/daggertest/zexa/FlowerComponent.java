package com.vitta.daggertest.zexa;

import dagger.Component;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 10:28
 * 描述：FlowerComponent
 */

@Component(modules = FlowerModule.class)
public interface FlowerComponent {

    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();

}
