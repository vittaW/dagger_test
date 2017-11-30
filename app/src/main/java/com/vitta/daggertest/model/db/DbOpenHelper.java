package com.vitta.daggertest.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.vitta.daggertest.di.qualifier.DbNameQualifier;
import com.vitta.daggertest.model.db.model.DaoMaster;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 14:30
 * 描述：DbOpenHelper
 */

@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper{

    @Inject
    public DbOpenHelper(@Singleton Context context, @DbNameQualifier String name) {
        super(context, name);
    }
}
