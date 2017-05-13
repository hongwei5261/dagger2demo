package com.dagger2.zeroscreen.mvp.main;

import java.util.List;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import com.dagger2.zeroscreen.mvp.base.IView;

/**
 * Created by hongwei on 2017/5/6.
 */

public interface INewsView extends IView {

//    public void loadData(List<NewsInfo> data);

    /**
     * 加载数据接口
     *
     * @param data
     */
    void loadData(List<NewsInfo> data);

    /**
     * 没有数据
     */
    void loadNoData();
}
