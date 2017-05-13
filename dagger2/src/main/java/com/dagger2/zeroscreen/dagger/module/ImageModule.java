package com.dagger2.zeroscreen.dagger.module;

import android.widget.ImageView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hongwei on 2017/5/5.
 */
@Module
public class ImageModule {

    @Singleton
    @Provides
    ImageView getImageView() {
        return null;
    }
}
