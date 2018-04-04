package com.example.anil.diusingdagger2;

import android.app.Application;
import android.content.Context;


import com.example.anil.diusingdagger2.di.AppComponent;
import com.example.anil.diusingdagger2.di.splash.SplashPresenterProvider;


import java.lang.ref.WeakReference;

/**
 * Created by anil on 3/19/18.
 */

public class MyApplication extends Application {

    private static WeakReference<Context> mWeakReference;

    private static AppComponent appComponent;

    /**
     * Getter to access Singleton instance
     *
     * @return instance of MyApplication
     */
    public static Context getAppContext() {
        return mWeakReference.get();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mWeakReference = new WeakReference<Context>(this);
        createComponent();
    }


    private void createComponent() {
        //appComponent = DaggerAppComponent.builder().splashPresenterProvider(new SplashPresenterProvider()).build();
    }

}
