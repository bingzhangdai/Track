package com.track.android;



/**
 * Created by Administrator on 2015/12/19.
 */

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class WelComeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler.sendEmptyMessageAtTime(GOTO_MAIN_ACTIVITY, 3000);//3秒跳转
    }

    private static final int GOTO_MAIN_ACTIVITY = 0;
    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {

            switch (msg.what) {
                case GOTO_MAIN_ACTIVITY:
                    Intent intent = new Intent();
                    intent.setClass(WelComeActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    break;

                default:
                    break;
            }
        }
    };
}

