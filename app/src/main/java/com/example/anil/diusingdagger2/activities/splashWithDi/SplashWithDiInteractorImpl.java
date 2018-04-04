package com.example.anil.diusingdagger2.activities.splashWithDi;

import android.util.Log;

import com.example.anil.diusingdagger2.retrofit.ApiCallBack;

import javax.inject.Inject;

/**
 * Created by anil on 3/19/18.
 */

public class SplashWithDiInteractorImpl implements SplashWithDiInteractor {

    @Inject
    SplashWithDiInteractorImpl(){}

    @Override
    public void serverHitForAppVersionData(final ApiCallBack callBack) {
        Log.e("di interactor","done");
    }
}
