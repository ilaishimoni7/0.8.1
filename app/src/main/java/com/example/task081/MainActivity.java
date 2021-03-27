package com.example.task081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;
    Switch sw;
    LinearLayout lo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lo = (LinearLayout) findViewById(R.id.lo);
        tb = (ToggleButton) findViewById(R.id.tb);
        sw = (Switch) findViewById(R.id.sw);


    }

    public void change_background(View v) {
        if (tb.isChecked() && sw.isChecked()) {
            lo.setBackgroundColor(R.drawable.download);
        }
        if (! tb.isChecked() && ! sw.isChecked() ) {
            lo.setBackgroundColor(R.drawable.red);
        }
        if (! tb.isChecked() && sw.isChecked() ){
            lo.setBackgroundColor(R.drawable.black);
        }
        if (tb.isChecked() && ! sw.isChecked() ){
            lo.setBackgroundColor(R.drawable.pink);

        }
    }
}