package com.vitta.daggertest.model;

import com.vitta.daggertest.model.http.ApiService;
import com.vitta.daggertest.model.db.DbHelper;
import com.vitta.daggertest.model.sp.SpHelper;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 12:00
 * 描述：DataManager
 * 数据管理类，包含网络，数据库，和sp
 */

public class DataManager implements ApiService,DbHelper,SpHelper {

    private ApiService apiService;
    private DbHelper dbHelper;
    private SpHelper spHelper;

    public DataManager(ApiService apiService, DbHelper dbHelper, SpHelper spHelper) {
        this.apiService = apiService;
        this.dbHelper = dbHelper;
        this.spHelper = spHelper;
    }

}
