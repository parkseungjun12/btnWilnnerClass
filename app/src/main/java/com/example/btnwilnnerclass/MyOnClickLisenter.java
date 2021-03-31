package com.example.btnwilnnerclass;

import android.view.View;

public class MyOnClickLisenter implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickLisenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("You Clicked button 1");

    }
}
