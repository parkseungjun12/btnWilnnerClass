package com.example.btnwilnnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1, mButton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickLisenter());
        mButton2.setOnClickListener(new MyOnClickLisenter());
    }

    private class MyOnClickLisenter implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.button1: mTextView1.setText("You Clicked button 1"); break;
                case R.id.button2: mTextView1.setText("You Clicked button 2"); break;
                default: break;
            }
        }
    }
}