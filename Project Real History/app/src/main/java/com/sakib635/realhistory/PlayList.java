package com.sakib635.realhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        //Remove action title bar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
    public void v1(View view){
        //video activity
        Intent in1 = new Intent(getApplicationContext(), videoPlayer.class);
        startActivity(in1);
    }

    public void v2(View view){
        //video activity
        Intent in2 = new Intent(getApplicationContext(), videoPlayer2.class);
        startActivity(in2);
    }

    public void v3(View view){
        //video activity
        Intent in3 = new Intent(getApplicationContext(), videoPlayer3.class);
        startActivity(in3);
    }

    public void v4(View view){
        //video activity
        Intent in4 = new Intent(getApplicationContext(), videoPlayer4.class);
        startActivity(in4);
    }

    public void v5(View view){
        //video activity
        Intent in5 = new Intent(getApplicationContext(), videoPlayer5.class);
        startActivity(in5);
    }




}