package com.example.administrator.testheart;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


public class Main2Activity extends Activity {
    HeartView heartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heartView = (HeartView) findViewById(R.id.surfaceView);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        heartView.reDraw();
        return super.onTouchEvent(event);
    }

    public void reDraw(View v) {

        heartView.reDraw();

    }
}
