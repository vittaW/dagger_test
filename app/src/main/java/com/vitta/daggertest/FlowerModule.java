package com.vitta.daggertest;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/29 18:23
 * 描述：FlowerModule
 */

@Module
public class FlowerModule {

    @RoseFlower
    @Provides
    Flower provideFlower(){
        return new Rose();
    }

    @LilyFlower
    @Provides
    Flower providerFlower(){
        return new Lily();
    }

//    @Named("rose")
//    @Provides
//    Flower provideFlower(){
//        return new Rose();
//    }
//
//    @Named("lily")
//    @Provides
//    Flower providerFlower(){
//        return new Lily();
//    }

}
