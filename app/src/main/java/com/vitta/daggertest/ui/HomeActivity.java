package com.vitta.daggertest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.vitta.daggertest.R;
import com.vitta.daggertest.di.scope.ActivityScope;
import com.vitta.daggertest.model.DataManager;
import com.vitta.daggertest.model.http.ApiService;
import com.vitta.daggertest.zexa.MainActivity;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

//    @ActivityScope
//    @Inject
//    DataManager dataManager;
//
//    @ActivityScope
//    @Inject
//    ApiService apiService;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//
//        Log.e(TAG, "apiService: " + apiService );
//        Log.e(TAG, "dataManager: " + dataManager );

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
