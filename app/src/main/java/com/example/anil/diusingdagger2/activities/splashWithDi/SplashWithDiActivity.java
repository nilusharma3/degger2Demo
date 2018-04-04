package com.example.anil.diusingdagger2.activities.splashWithDi;

import android.os.Bundle;

import com.example.anil.diusingdagger2.MyApplication;
import com.example.anil.diusingdagger2.R;
import com.example.anil.diusingdagger2.base.BaseActivity;
import com.example.anil.diusingdagger2.di.AppComponent;


import javax.inject.Inject;

public class SplashWithDiActivity extends BaseActivity {

    @Inject
    public SplashWithDiPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_with_di);
        presenter.getAppVersion();
    }

    @Override
    protected void injectDependencies(final MyApplication application, final AppComponent component) {
        component.inject(this);
    }
}
