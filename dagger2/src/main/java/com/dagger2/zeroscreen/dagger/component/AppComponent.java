package com.dagger2.zeroscreen.dagger.component;

import android.content.Context;
import android.widget.ImageView;

import javax.inject.Singleton;

import dagger.Component;

import com.dagger2.zeroscreen.dagger.module.ContextModule;
import com.dagger2.zeroscreen.dagger.module.RetrofitModule;
import com.dagger2.zeroscreen.dagger.module.ImageModule;
import com.dagger2.zeroscreen.mvp.base.BaseLayout;
import retrofit2.Retrofit;

/**
 * Created by hongwei on 2017/5/5.
 */

@Singleton
@Component(modules = {RetrofitModule.class, ImageModule.class, ContextModule.class})
public interface AppComponent {

    Retrofit getRetrofit();

    ImageView getImageView();

    Context getContext();

    public void inject(BaseLayout baseLayout);
}
