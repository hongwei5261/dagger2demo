package com.dagger2.zeroscreen.dagger.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hongwei on 2017/5/13.
 */
@Module
public class ContextModule {
    Context mContext;

    public ContextModule(Context context) {
        mContext = context;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mContext;
    }
}
