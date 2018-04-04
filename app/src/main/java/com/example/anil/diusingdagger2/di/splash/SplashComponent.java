package com.example.anil.diusingdagger2.di.splash;

import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiActivity;
import com.example.anil.diusingdagger2.base.BaseActivity;

import dagger.Subcomponent;

/**
 * Created by anil on 4/4/18.
 */
@Subcomponent(modules = SplashModule.class)
public interface SplashComponent {

    @Subcomponent.Builder
    interface SplashSubComponentBuilder{
        SplashComponent build();
    }

   
}
