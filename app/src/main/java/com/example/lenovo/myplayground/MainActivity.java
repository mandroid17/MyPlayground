package com.example.lenovo.myplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // declare buttons for website homepage
    Button buttonGoogle, buttonBing;

    // declaring radio group variable
    RadioGroup radioGroup;

    // declare text variable
    TextView fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create buttons and assign using a cast
        buttonGoogle = (Button) findViewById(R.id.buttonGoogle);
        buttonBing = (Button) findViewById(R.id.buttonBing);

        // create radio group and assign using a cast
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // implement a listener for each button
        buttonGoogle.setOnClickListener(this);
        buttonBing.setOnClickListener(this);

        // implement a change listener for the radio group
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkId) {
                // checkId is the RadioButton selected
                RadioButton rb=(RadioButton)findViewById(checkId);
                // update textView
                fruit = (TextView) findViewById(R.id.textView4);
                fruit.setText("Selected: " + rb.getText());
            }
        });
    }

    @Override
    public void onClick(View view) {
        // switch statement
        switch (view.getId()) {
            case R.id.buttonGoogle:
                Intent g;
                g = new Intent(this, GoogleActivity.class);
                startActivity(g);
                break;
            case R.id.buttonBing:
                Intent b;
                b = new Intent(this, BingActivity.class);
                startActivity(b);
                break;
        }
    }
}
