package com.develop.windexit.luinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class law extends AppCompatActivity {
   private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.law);

        getSupportActionBar().setTitle("LAW");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
//toolbar.setTitleTextColor(Color.WHITE);