package com.dagger2.zeroscreen.dagger.module;

import dagger.Module;
import dagger.Provides;

import com.dagger2.zeroscreen.mvp.photo.IPhotoView;

/**
 * Created by hongwei on 2017/5/4.
 */

@Module
public class PhotoModule {
    IPhotoView mIPhotoView;

    public PhotoModule(IPhotoView iView) {
        this.mIPhotoView = iView;
    }

    @Provides
    public IPhotoView provideIPhotoView() {
        return mIPhotoView;
    }
}
