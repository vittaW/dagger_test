package com.vitta.daggertest.di;

import android.content.Context;

import com.vitta.daggertest.App;
import com.vitta.daggertest.di.module.AppModule;
import com.vitta.daggertest.di.module.HttpModule;
import com.vitta.daggertest.model.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 11:41
 * 描述：AppComponent
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    void inject(App app);

    //提供单例的Context
    Context getContext();

    //单例的数据中心
    DataManager getDataManager();


}
