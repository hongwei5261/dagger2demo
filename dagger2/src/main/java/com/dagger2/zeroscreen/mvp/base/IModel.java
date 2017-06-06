package com.dagger2.zeroscreen.mvp.base;

import android.content.Context;

import java.util.List;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import com.dagger2.zeroscreen.dagger.component.AppComponent;
import com.dagger2.zeroscreen.dagger.component.ComponentManager;

import io.reactivex.Observable;

/**
 * Created by hongwei on 2017/5/5.
 */

public abstract class IModel {

    public AppComponent mAppComponent;

    public IModel(Context context) {
        mAppComponent = ComponentManager.getsInstance(context).getAppComponent();
        inject();
    }

    public abstract void inject();
}
