package com.dagger2.zeroscreen.mvp.model;

import android.content.Context;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import com.dagger2.zeroscreen.mvp.base.IModel;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by hongwei on 2017/6/5.
 */

public abstract class INetModel extends IModel {

    public INetModel(Context context) {
        super(context);
    }

    abstract Observable<List<NewsInfo>> getNewsList(String newsId, int page);

    abstract Observable<NewsInfo> getNewsDetail();
}
