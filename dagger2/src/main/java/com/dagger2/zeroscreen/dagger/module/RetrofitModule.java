package com.dagger2.zeroscreen.dagger.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hongwei on 2017/5/5.
 */

@Module
public class RetrofitModule {
    String baseUrl = "http://c.3g.163.com/";//"http://v5.pc.duomi.com/";

    @Singleton
    @Provides
    Retrofit provideRetrofit(Retrofit.Builder builder) {
        return builder
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    Retrofit.Builder provideRetrofitBuilder() {
        return new Retrofit.Builder();
    }
}
