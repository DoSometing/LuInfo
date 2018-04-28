package com.develop.windexit.luinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class tourism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourism);

        getSupportActionBar().setTitle("TOURISM");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
