package com.vitta.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Pot pot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.create().inject(this);
//        Rose rose = new Rose();
//        Pot pot = new Pot(rose);

        Toast.makeText(MainActivity.this, pot.show(), Toast.LENGTH_SHORT).show();
    }
}
