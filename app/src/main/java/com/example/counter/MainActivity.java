package com.example.counter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Button button1;
    Switch stc;
    long current_Number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);

        textView = (TextView) findViewById(R.id.textView);
    }


    public void minusCount(View view){
        button1.setText("Count down");
        current_Number--;
        textView.setText(String.valueOf(current_Number));
    }

    public void plusCount(View view){
        button.setText("Count up");
        current_Number++;
        textView.setText(String.valueOf(current_Number));
    }





}

