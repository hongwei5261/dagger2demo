package com.dagger2.zeroscreen.dagger.component;

import dagger.Component;

import com.dagger2.zeroscreen.dagger.module.NewsModule;
import com.dagger2.zeroscreen.dagger.scope.LayoutScope;
import com.dagger2.zeroscreen.mvp.main.NewsLayout;

/**
 * Created by hongwei on 2017/5/3.
 */
@LayoutScope
@Component(modules = {NewsModule.class}, dependencies = {AppComponent.class})
public interface NewsComponent {

    public void inject(NewsLayout newsLayout);
}
