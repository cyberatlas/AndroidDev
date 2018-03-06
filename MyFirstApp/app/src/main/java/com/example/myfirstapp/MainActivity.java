package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make the class of the XML object, good to make it the same name
        //When searching for something use R. in this case searching for the ID for addBtn, the result is being cast as a button
        Button addBtn = (Button) findViewById(R.id.addBtn);
        //As the app is running it will wait for a click, then perform the next action
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //my code goes here

                //creates the classes for the objects that we made in xml that we are going to be using

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                //Creates an int to hold the values of the numbers makes it a string because that is what the fucntion expects
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + " ");

            }
        });

    }
}
