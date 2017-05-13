package com.dagger2.zeroscreen.dagger.component;

import dagger.Component;
import com.dagger2.zeroscreen.dagger.module.PhotoModule;
import com.dagger2.zeroscreen.mvp.photo.PhotoLayout;

/**
 * Created by hongwei on 2017/5/3.
 */

@Component(modules = {PhotoModule.class/*LayoutModule.class,*/ })
public interface PhotoComponent {

//    public void inject(MainActivity mainActivity);

    public void inject(PhotoLayout photoLayout);
}
