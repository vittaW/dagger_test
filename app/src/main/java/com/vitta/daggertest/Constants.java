package com.vitta.daggertest;

import android.os.Environment;

import java.io.File;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 15:09
 * 描述：Constants
 */

public class Constants {

    public static final String DB_NAME = "dagger";
    public static final String SP_NAME = "setting";
    //================= PATH ====================

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "vitta" + File.separator + "dagger";

    //================= BASE_URL ================
    public static final String DEBUG_BASE_URL = "https://apipre.xiaomatv.cn";
    public static final String RELEASE_BASE_URL = "https://api.xiaomatv.cn";

}
