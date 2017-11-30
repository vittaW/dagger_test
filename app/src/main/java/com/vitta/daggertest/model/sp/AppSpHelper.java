package com.vitta.daggertest.model.sp;

import android.content.Context;
import android.content.SharedPreferences;

import com.vitta.daggertest.di.qualifier.SpNameQualifier;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 14:27
 * 描述：AppSpHelper
 */
@Singleton
public class AppSpHelper implements SpHelper {

    private SharedPreferences sp;

    @Inject
    public AppSpHelper(@Singleton Context context,@SpNameQualifier String spName){
        sp = context.getSharedPreferences(spName,Context.MODE_PRIVATE);
    }

    public void putUserId(String user_id){
        sp.edit().putString("user_id",user_id).apply();
    }

    public String getUserId(){
        return sp.getString("user_id","-1");
    }

}
