package com.example.ruski.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("comexample.ruski.quicklauncher.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.textView);
            //gets intent gets extra information and gets the string with that key then sets textview with key
            String text  = getIntent().getExtras().getString("com.example.ruski.quicklauncher.SOMETHING");

        }
    }
}
