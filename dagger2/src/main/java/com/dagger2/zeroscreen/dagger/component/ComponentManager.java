package com.dagger2.zeroscreen.dagger.component;

import android.content.Context;

import com.dagger2.zeroscreen.dagger.module.ContextModule;
import com.dagger2.zeroscreen.dagger.module.RetrofitModule;
import com.dagger2.zeroscreen.dagger.module.ImageModule;

/**
 * Created by hongwei on 2017/5/5.
 */

public class ComponentManager {

    private static ComponentManager sInstance;
    static AppComponent mAppComponent;

    private ComponentManager(Context context) {
        mAppComponent = DaggerAppComponent.builder()
                .contextModule(new ContextModule(context))
                .retrofitModule(new RetrofitModule())
                .imageModule(new ImageModule())
                .build();
    }

    public static ComponentManager getsInstance(Context context) {
        if (sInstance == null) {
            sInstance = new ComponentManager(context);
        }
        return sInstance;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
