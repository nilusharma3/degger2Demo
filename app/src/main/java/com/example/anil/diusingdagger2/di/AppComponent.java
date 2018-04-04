package com.example.anil.diusingdagger2.di;

import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiActivity;
import com.example.anil.diusingdagger2.base.BaseActivity;
import com.example.anil.diusingdagger2.di.splash.SplashModule;
import com.example.anil.diusingdagger2.di.splash.SplashPresenterProvider;

import dagger.Component;

/**
 * Created by anil on 3/19/18.
 */
@Component(modules = {ContextModule.class,
        SplashModule.class,
        RetrofitProvider.class,
        GlideProvider.class
})
public interface AppComponent {
    BaseActivity inject(BaseActivity baseActivity);
}
