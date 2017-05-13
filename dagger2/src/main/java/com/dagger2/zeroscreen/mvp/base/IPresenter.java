package com.dagger2.zeroscreen.mvp.base;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by hongwei on 2017/5/3.
 */

public abstract class IPresenter<T extends IView> {
    private static Handler sHandler = new Handler(Looper.getMainLooper());

    protected T mView;

    public IPresenter(T view) {
        setView(view);
    }

    private void setView(T view) {
        if (mView != view) {
            if (mView == null || view != null) {
                mView = view;
            } else if (mView != null && view != null) {
                mView = null;
            } else {
                setView(null);
                setView(view);
            }
        }
    }

    public void postDelayed(Runnable r, long delayMillis) {
        sHandler.postDelayed(r, delayMillis);
    }

    /**
     * 获取网络数据，更新界面
     */
    public abstract void getData();
}
