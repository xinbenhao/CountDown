package com.xinda.countdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private  RushBuyCountDownTimerView timerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerView=(RushBuyCountDownTimerView)findViewById(R.id.timerView);
        //设置倒计时的时、分、秒
        timerView.setTime(10, 0, 10);
        // 开始倒计时
        timerView.start();
    }
}
