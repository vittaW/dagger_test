package com.vitta.daggertest;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/12/14 18:21
 * 描述：MainActivity
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
//        setContentView(R.layout.activity_main);
        InjectUtil.inject(this);
    }
}
