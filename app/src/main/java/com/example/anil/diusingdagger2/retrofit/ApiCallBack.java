package com.example.anil.diusingdagger2.retrofit;

/**
 * Created by anil on 3/19/18.
 */

public interface ApiCallBack {
    void onSuccess(final Object responseObject);

    void onFailure(final APIError error);

}
