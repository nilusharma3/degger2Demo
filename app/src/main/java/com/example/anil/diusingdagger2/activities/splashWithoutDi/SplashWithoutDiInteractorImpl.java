package com.example.anil.diusingdagger2.activities.splashWithoutDi;

import com.example.anil.diusingdagger2.retrofit.APIError;
import com.example.anil.diusingdagger2.retrofit.ApiCallBack;
import com.example.anil.diusingdagger2.retrofit.ApiInterface;
import com.example.anil.diusingdagger2.retrofit.ResponseResolver;

/**
 * Created by anil on 3/19/18.
 */

class SplashWithoutDiInteractorImpl implements SplashWithoutDiInteractor {

    private ApiInterface apiInterface;

    public SplashWithoutDiInteractorImpl(final ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    @Override
    public void serverHitForAppVersion(final ApiCallBack callBack) {
        apiInterface.getAppVersion("en").enqueue(new ResponseResolver<Object>() {
            @Override
            public void success(final Object o) {
                callBack.onSuccess(o);
            }

            @Override
            public void failure(final APIError error) {
                callBack.onFailure(error);
            }
        });
    }
}
