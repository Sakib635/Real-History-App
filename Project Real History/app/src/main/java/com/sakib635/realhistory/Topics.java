package com.sakib635.realhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        //Remove action title bar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // link 1
        TextView textView11=(TextView)findViewById(R.id.fb1);
        textView11.setMovementMethod(LinkMovementMethod.getInstance());

        // link 2
        TextView textView22=(TextView)findViewById(R.id.yt1);
        textView22.setMovementMethod(LinkMovementMethod.getInstance());

    }
    public void pList1(View view){
        //play List activity
        Intent play1 = new Intent(getApplicationContext(), PlayList.class);
        startActivity(play1);
    }

    public void pList2(View view){
        //play List activity
        Intent play2 = new Intent(getApplicationContext(), PlayList2.class);
        startActivity(play2);
    }

    public void about(View view){
        //play List activity
        Intent abt = new Intent(getApplicationContext(), about.class);
        startActivity(abt);
    }
}