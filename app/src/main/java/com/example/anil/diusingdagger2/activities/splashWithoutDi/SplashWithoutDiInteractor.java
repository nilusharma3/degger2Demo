package com.example.anil.diusingdagger2.activities.splashWithoutDi;

import com.example.anil.diusingdagger2.retrofit.ApiCallBack;
import com.example.anil.diusingdagger2.retrofit.ApiInterface;

/**
 * Created by anil on 3/19/18.
 */

public interface SplashWithoutDiInteractor {
    void serverHitForAppVersion(final ApiCallBack callBack);
}
