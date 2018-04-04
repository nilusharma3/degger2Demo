package com.example.anil.diusingdagger2.di;

import com.example.anil.diusingdagger2.retrofit.RestClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 3/19/18.
 */
@Singleton
@Module
public class RetrofitProvider {

    private RestClient restClient = null;

    @Provides
    RestClient provideRetrofit() {
        if (restClient == null) {
            return new RestClient();
        } else {
            return restClient;
        }
    }

}
