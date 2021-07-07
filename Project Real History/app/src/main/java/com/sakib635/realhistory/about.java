package com.sakib635.realhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.WindowManager;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Remove action title bar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // link 1
        TextView textView1=(TextView)findViewById(R.id.fb);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        // link 2
        TextView textView2=(TextView)findViewById(R.id.yt);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());


    }
}