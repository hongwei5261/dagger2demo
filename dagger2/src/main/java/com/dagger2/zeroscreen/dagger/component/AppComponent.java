package com.dagger2.zeroscreen.dagger.component;

import android.content.Context;
import android.widget.ImageView;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

import com.dagger2.zeroscreen.dagger.module.ContextModule;
import com.dagger2.zeroscreen.dagger.module.NewsModule;
import com.dagger2.zeroscreen.dagger.module.RetrofitModule;
import com.dagger2.zeroscreen.dagger.module.ImageModule;
import com.dagger2.zeroscreen.mvp.base.BaseLayout;
import com.dagger2.zeroscreen.mvp.model.NetModel;

import retrofit2.Retrofit;

/**
 * Created by hongwei on 2017/5/5.
 */

@Singleton
@Component(modules = {RetrofitModule.class, ImageModule.class, ContextModule.class})
public interface AppComponent {

    @Named("news")
    Retrofit getNewsRetrofit();

    @Named("weather")
    Retrofit getWeatherRetrofit();

    ImageView getImageView();

    Context getContext();

    public void inject(NetModel netModel);
}
