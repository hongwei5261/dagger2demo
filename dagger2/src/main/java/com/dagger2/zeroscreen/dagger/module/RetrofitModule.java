package com.dagger2.zeroscreen.dagger.module;

import javax.inject.Named;
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
    String newsUrl = "http://c.3g.163.com/";//"http://v5.pc.duomi.com/";
    String weatherUrl = "http://c.3g.163.com/";

    @Singleton
    @Provides
    @Named("news")
    Retrofit provideNewsRetrofit(Retrofit.Builder builder) {
        return builder
                .baseUrl(newsUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    @Named("weather")
    Retrofit provideWeatherRetrofit(Retrofit.Builder builder) {
        return builder
                .baseUrl(weatherUrl)
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
