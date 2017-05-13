package com.dagger2.zeroscreen.mvp.base;

/**
 * Created by hongwei on 2017/5/3.
 */

public interface IView {

    /**
     * 显示加载动画
     */
    void showLoading();

    /**
     * 隐藏加载动画
     */
    void hideLoading();

    /**
     * 显示错误信息
     *
     * @param type 错误类型
     */
    void showNetError(int type);
}
