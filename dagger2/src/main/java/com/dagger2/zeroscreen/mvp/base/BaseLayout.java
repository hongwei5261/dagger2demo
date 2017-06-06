package com.dagger2.zeroscreen.mvp.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.Unbinder;

import com.dagger2.zeroscreen.dagger.component.AppComponent;
import com.dagger2.zeroscreen.dagger.component.ComponentManager;

/**
 * Created by hongwei on 2017/5/4.
 */

public abstract class BaseLayout extends LinearLayout {
    Unbinder mUnbinder;

    public BaseLayout(Context context) {
        super(context);
        init();
    }

    public BaseLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BaseLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public BaseLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mUnbinder = ButterKnife.bind(this);
        ComponentManager.getsInstance(getContext()).getAppComponent();
        inject();
    }

    /**
     * 初始化注入,如：DaggerPhiComponent.builder().phiModule(new NewsModule(this)).build().inject(this);
     */
    public abstract void inject();

    public void init() {
    }

    public void destroy() {
        if (mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
        }
        mUnbinder = null;
    }
}
