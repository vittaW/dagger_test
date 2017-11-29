package com.vitta.daggertest;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/29 17:55
 * 描述：Pot
 */

public class Pot {

    //Flower 是抽象的，无法通过@Inject 提供实例，这个时候就用到module了，清楚lily 和 rose 的@inject
    private Flower flower;

    @Inject
    public Pot(@RoseFlower Flower flower) {
        this.flower = flower;
    }

    public String show(){
        return flower.whisper();
    }
}
