package com.example.ruski.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.seconActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                //pass information to another activity
                //Information is passed in by a key value pair, key is usually the package name.name
                //value is what you want to pass in as the key value
                startIntent.putExtra("com.example.ruski.quicklauncher.SOMETHING", "Hello World!");
                startActivity(startIntent);
            }
        });
    }
}
