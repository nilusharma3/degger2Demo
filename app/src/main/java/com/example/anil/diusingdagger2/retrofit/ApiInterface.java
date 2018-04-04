package com.example.anil.diusingdagger2.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Developer: Saurabh Verma
 * Dated: 7/3/17
 */
public interface ApiInterface {


    String APP_VERSION_CHECK = "/appVersion/getCurrentVersions";

    /**
     * to get app versions
     *
     * @param lang language
     * @return object containing version data
     */
    @GET(APP_VERSION_CHECK)
    Call<Object> getAppVersion(@Header("content-language") String lang);
}

