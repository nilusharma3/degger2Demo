package com.example.anil.diusingdagger2.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anil on 3/19/18.
 */
@Singleton
@Module
public class ContextModule {

    private final Context context;

    public ContextModule(final Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return context;
    }
}
