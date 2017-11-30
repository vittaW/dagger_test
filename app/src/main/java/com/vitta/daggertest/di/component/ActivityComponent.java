package com.vitta.daggertest.di.component;

import com.vitta.daggertest.di.AppComponent;
import com.vitta.daggertest.di.scope.ActivityScope;
import com.vitta.daggertest.ui.HomeActivity;

import dagger.Component;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 17:57
 * 描述：ActivityComponent
 */

//@ActivityScope
//@Component(dependencies = AppComponent.class)
public interface ActivityComponent {

    void inject(HomeActivity homeActivity);

}
