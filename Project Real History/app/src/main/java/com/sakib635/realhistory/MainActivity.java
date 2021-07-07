package com.sakib635.realhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView logo;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remove action title bar
        getSupportActionBar().hide();

        //Logo animation
        logo= findViewById(R.id.logo);

        logo.setTranslationX(-500f);                             //animation
        logo.animate().translationXBy(500f).setDuration(500);

        //logo sound

        player= MediaPlayer.create(this, R.raw.logosound);//background music
        player.start();  //background music start





        ////Splash Activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(MainActivity.this,Topics.class);
                startActivity(intent);
                finish();

            }
        },3010);


    }
}