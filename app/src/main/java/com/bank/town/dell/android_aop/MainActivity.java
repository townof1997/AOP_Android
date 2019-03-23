package com.bank.town.dell.android_aop;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bank.town.dell.android_aop.annotation.BehaviorTrance;
import com.bank.town.dell.android_aop.annotation.UserInfoBehaviorTrace;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @BehaviorTrance("摇一摇")
    public void mShake(View view) {
        long begin = System.currentTimeMillis();
        SystemClock.sleep(new Random().nextInt(2000));
//        long duration = System.currentTimeMillis() - begin;
//        Log.i("jett", "摇一摇功能耗时：" + duration + "ms");
    }

    @BehaviorTrance("语音消息")
    public void mAudio(View view) {
//        long begin = System.currentTimeMillis();
        SystemClock.sleep(new Random().nextInt(2000));
//        long duration = System.currentTimeMillis() - begin;
//        Log.i("jett", "语音功能耗时：" + duration + "ms");
    }

    @BehaviorTrance("视频消息")
    public void mVideo(View view) {
//        long begin = System.currentTimeMillis();
        SystemClock.sleep(new Random().nextInt(2000));
//        long duration = System.currentTimeMillis() - begin;
//        Log.i("jett", "视频功能耗时：" + duration + "ms");
    }
    @BehaviorTrance("说说功能")
    @UserInfoBehaviorTrace("说说功能")
    public void saySomething(View view) {
//        long begin = System.currentTimeMillis();
        SystemClock.sleep(new Random().nextInt(2000));
//        long duration = System.currentTimeMillis() - begin;
//        Log.i("jett", "说说功能耗时：" + duration + "ms");
    }
}
