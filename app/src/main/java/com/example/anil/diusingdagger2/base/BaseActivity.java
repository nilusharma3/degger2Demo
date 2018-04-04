package com.example.anil.diusingdagger2.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.anil.diusingdagger2.MyApplication;
import com.example.anil.diusingdagger2.di.AppComponent;

/**
 * Created by anil on 4/3/18.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies((MyApplication) MyApplication.getAppContext(),MyApplication.getAppComponent());
    }

    protected abstract void injectDependencies(MyApplication application, AppComponent component);
}
