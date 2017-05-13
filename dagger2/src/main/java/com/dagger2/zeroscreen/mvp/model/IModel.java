package com.dagger2.zeroscreen.mvp.model;

import java.util.List;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import io.reactivex.Observable;

/**
 * Created by hongwei on 2017/5/5.
 */

public interface IModel {

    interface IClientModel extends IModel {

        Observable<List<NewsInfo>> getNewsList(String newsId, int page);

        Observable<NewsInfo> getNewsDetail();
    }
}
