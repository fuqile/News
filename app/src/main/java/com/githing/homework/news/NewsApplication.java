package com.githing.homework.news;

import android.app.Application;

/**
 * @author pofeng <pofeng@wacai.com>
 * @date 2018/03/07
 */
public class NewsApplication extends Application {

    private static Application mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static Application getInstance() {
        return mInstance;
    }
}
