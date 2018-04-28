package com.develop.windexit.luinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class about extends AppCompatActivity {
private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

      /* toolbar =  findViewById(R.id.sylBack);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setTitle("About");
       // toolbar.setTitleTextColor(Color.WHITE);

        //setTitleColor();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


}
