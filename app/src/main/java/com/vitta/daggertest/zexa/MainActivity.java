package com.vitta.daggertest.zexa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.vitta.daggertest.R;
import com.vitta.daggertest.model.DataManager;
import com.vitta.daggertest.model.http.ApiService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    ApiService apiService;
//
//    @Inject
//    DataManager dataManager;

//    @Inject
//    Pot pot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerMainActivityComponent.create().inject(this);
//        Rose rose = new Rose();
//        Pot pot = new Pot(rose);
//        DaggerMainActivityComponent.builder()
//                .potComponent()

//        DaggerMainActivityComponent.builder()
//                .potComponent(DaggerPotComponent
//                        .builder()
//                        .flowerComponent(DaggerFlowerComponent.create())
//                        .potModule(new PotModule()).build())
//                .build()
//                .inject(this);
//
//        Toast.makeText(MainActivity.this, pot.show(), Toast.LENGTH_SHORT).show();
    }
}
