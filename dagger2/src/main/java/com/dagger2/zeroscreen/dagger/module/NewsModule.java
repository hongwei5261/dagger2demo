package com.dagger2.zeroscreen.dagger.module;

import dagger.Module;
import dagger.Provides;

import com.dagger2.zeroscreen.dagger.scope.LayoutScope;
import com.dagger2.zeroscreen.mvp.main.INewsView;

/**
 * Created by hongwei on 2017/5/3.
 */

@Module
public class NewsModule {

    INewsView mINewsView;

    public NewsModule(INewsView iView) {
        this.mINewsView = iView;
    }

    @LayoutScope
    @Provides
    public INewsView provideIPhiView() {
        return mINewsView;
    }
}
