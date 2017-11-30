package com.vitta.daggertest.model.db;

import android.database.sqlite.SQLiteDatabase;

import com.vitta.daggertest.model.db.model.DaoMaster;
import com.vitta.daggertest.model.db.model.DaoSession;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 14:28
 * 描述：AppDbHelper
 */
@Singleton
public class AppDbHelper implements DbHelper {

    private DaoSession daoSession;

    //inject 用在构造上，用来构造实例
    @Inject
    public AppDbHelper (DbOpenHelper dbOpenHelper){
        DaoMaster daoMaster = new DaoMaster(dbOpenHelper.getWritableDb());
        daoSession = daoMaster.newSession();
    }


}
