package com.example.wangshijie20200302.base;

import android.app.Application;
import android.content.Context;

/**
 * 王世杰
 * 20200302
 */
public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();

    }
    public static Context getAppContext(){
        return context;
    }
}
