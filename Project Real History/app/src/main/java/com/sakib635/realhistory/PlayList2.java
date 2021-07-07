package com.sakib635.realhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class PlayList2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list2);

        //Remove action title bar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void v6(View view){
        //video activity
        Intent in6 = new Intent(getApplicationContext(), videoPlayer6.class);
        startActivity(in6);
    }

    public void v7(View view){
        //video activity
        Intent in7 = new Intent(getApplicationContext(), videoPlayer7.class);
        startActivity(in7);
    }
}