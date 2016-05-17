package com.my.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2016/5/17.
 */
public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.init(this);
        JPushInterface.setDebugMode(true);
    }
}
