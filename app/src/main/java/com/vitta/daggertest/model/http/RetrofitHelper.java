package com.vitta.daggertest.model.http;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/30 16:43
 * 描述：RetrofitHelper
 */

@Singleton
public class RetrofitHelper implements HttpHelper {

    private ApiService apiService;

    @Inject
    public RetrofitHelper(@Singleton ApiService apiService) {
        this.apiService = apiService;
    }
}
