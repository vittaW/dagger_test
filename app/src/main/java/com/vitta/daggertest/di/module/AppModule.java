package com.vitta.daggertest.di.module;

import android.content.Context;

import com.vitta.daggertest.App;
import com.vitta.daggertest.Constants;
import com.vitta.daggertest.di.qualifier.DbNameQualifier;
import com.vitta.daggertest.di.qualifier.SpNameQualifier;
import com.vitta.daggertest.model.DataManager;
import com.vitta.daggertest.model.http.ApiService;
import com.vitta.daggertest.model.db.DbHelper;
import com.vitta.daggertest.model.db.AppDbHelper;
import com.vitta.daggertest.model.http.HttpHelper;
import com.vitta.daggertest.model.http.RetrofitHelper;
import com.vitta.daggertest.model.sp.AppSpHelper;
import com.vitta.daggertest.model.sp.SpHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 11:42
        * 描述：AppModule
        */

@Module
public class AppModule {

    @Singleton
    @Provides
    Context getApplication(){
        return App.getInstance();
    }

    @Provides
    @DbNameQualifier
    String provideDbName(){
        return Constants.DB_NAME;
    }

    @Provides
    @SpNameQualifier
    String provideSpFileName(){
        return Constants.SP_NAME;
    }

    @Singleton
    @Provides
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper){
        return retrofitHelper;
    }

    //已经在类的构造函数上注入好了，这里就不需要提供providers ，可以传参的！！！
    @Singleton
    @Provides
    DbHelper provideDbHelper(AppDbHelper appDbHelper){
        return appDbHelper;
    }

    @Singleton
    @Provides
    SpHelper provideSpHelper(AppSpHelper appSpHelper){
        return appSpHelper;
    }

    //三个接口，没法走构造注入，只能通过providers 的方式，提供他的子类
    @Singleton
    @Provides
    DataManager provideDataManager(ApiService apiService, DbHelper dbHelper, SpHelper spHelper){
        return new DataManager(apiService,dbHelper,spHelper);
    }

}
