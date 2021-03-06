package com.dagger2.zeroscreen.mvp.model;

import android.content.Context;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import com.dagger2.zeroscreen.dagger.component.AppComponent;
import com.dagger2.zeroscreen.dagger.component.ComponentManager;
import com.dagger2.zeroscreen.api.INewsApi;
import com.dagger2.zeroscreen.mvp.base.IModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by hongwei on 2017/5/5.
 */

public class NetModel extends INetModel {

    Context mContext;

    @Inject
    @Named("news")
    Retrofit newsRetrofit;

    @Inject
    @Named("weather")
    Retrofit weatherRetrofit;

    @Inject
    public NetModel(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void inject() {
        mAppComponent.inject(this);
    }

    @Override
    public Observable<List<NewsInfo>> getNewsList(String newsId, int page) {
        String type = "list";
        return newsRetrofit.create(INewsApi.class)
                .getNewsList(type, newsId, page * 20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(flatMapNews(newsId));
    }

    @Override
    public Observable<NewsInfo> getNewsDetail() {
        return null;
    }

    private Function<Map<String, List<NewsInfo>>, Observable<List<NewsInfo>>> flatMapNews(final String newsId) {
        return new Function<Map<String, List<NewsInfo>>, Observable<List<NewsInfo>>>() {

            @Override
            public Observable<List<NewsInfo>> apply(Map<String, List<NewsInfo>> stringListMap) throws Exception {
                return Observable.fromArray(stringListMap.get(newsId));
            }
        };
    }

    @Override
    public String toString() {
        return "clientmodel";
    }
}
