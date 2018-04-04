package com.example.anil.diusingdagger2.activities.splashWithDi;

import android.util.Log;

import com.example.anil.diusingdagger2.retrofit.APIError;
import com.example.anil.diusingdagger2.retrofit.ApiCallBack;

import javax.inject.Inject;

/**
 * Created by anil on 3/19/18.
 */

public class SplashWithDiPresenterImpl implements SplashWithDiPresenter {

    @Inject
    SplashWithDiInteractorImpl interactor;

    @Inject
    SplashWithDiPresenterImpl() {
    }

    ;

    @Override
    public void getAppVersion() {
        Log.e("hello di", "done");
        interactor.serverHitForAppVersionData(new ApiCallBack() {
            @Override
            public void onSuccess(final Object responseObject) {

            }

            @Override
            public void onFailure(final APIError error) {

            }
        });
    }
}
