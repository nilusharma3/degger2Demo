package com.example.anil.diusingdagger2.di.splash;

import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiActivity;
import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiInteractor;
import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiInteractorImpl;
import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiPresenter;
import com.example.anil.diusingdagger2.activities.splashWithDi.SplashWithDiPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 4/4/18.
 */
@Module(subcomponents = SplashComponent.class)
public class SplashModule {
    @Provides
    SplashWithDiPresenter provideSplashPresenter(final SplashWithDiPresenterImpl splashWithDiPresenter) {
        return splashWithDiPresenter;
    }

    @Provides
    SplashWithDiInteractor provideSplashDiInteractor(final SplashWithDiInteractorImpl splashWithDiInteractor){
        return splashWithDiInteractor;
    }
}
