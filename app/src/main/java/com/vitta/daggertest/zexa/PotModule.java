package com.vitta.daggertest.zexa;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/29 18:45
 * 描述：PotModule
 */

@Module
public class PotModule {

    @Provides
    Pot providePot(@RoseFlower Flower flower){
        return new Pot(flower);
    }

}
