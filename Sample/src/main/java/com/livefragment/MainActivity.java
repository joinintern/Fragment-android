package com.livefragment;

import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fragmentlibrary.Helper;

public class MainActivity extends AppCompatActivity {
AppCompatActivity appCompatActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appCompatActivity=this;
        Helper helper = Helper.getInstance();
        helper.moveFragment(new First_Fragment(),null,R.id.container,appCompatActivity);
    }
}
