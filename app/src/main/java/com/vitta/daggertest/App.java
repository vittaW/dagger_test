package com.vitta.daggertest;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.vitta.daggertest.di.AppComponent;
import com.vitta.daggertest.di.DaggerAppComponent;
import com.vitta.daggertest.di.module.AppModule;
import com.vitta.daggertest.di.module.HttpModule;
import com.vitta.daggertest.model.DataManager;
import com.vitta.daggertest.model.http.ApiService;

import javax.inject.Inject;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 11:39
 * 描述：App
 */

public class App extends Application {

    private static final String TAG = "App";

    //是单例的！！
    @Inject
    Context context;

    @Inject
    ApiService apiService;

    @Inject
    ApiService apiService2;

    @Inject
    DataManager dataManager;

    @Inject
    DataManager dataManager2;

    private static App app;
    private AppComponent appComponent;

    public static synchronized App getInstance(){
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        getAppComponent().inject(this);

        Log.e(TAG, "apiService: " + apiService );
        Log.e(TAG, "apiService2: " + apiService2 );
        Log.e(TAG, "dataManager: " + dataManager );
        Log.e(TAG, "dataManager2: " + dataManager2 );
    }

    public AppComponent getAppComponent(){
        if (appComponent == null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule())
                    .httpModule(new HttpModule())
                    .build();
        }
        return appComponent;
    }
}
