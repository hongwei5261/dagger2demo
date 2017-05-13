package com.dagger2.zeroscreen.mvp.main;

import java.util.List;

import javax.inject.Inject;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import com.dagger2.zeroscreen.mvp.base.IPresenter;
import com.dagger2.zeroscreen.mvp.model.ClientModel;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by hongwei on 2017/5/3.
 */
public class NewsPresenter extends IPresenter<INewsView> {

    @Inject
    ClientModel mClientModel;

    @Inject
    public NewsPresenter(INewsView view) {
        super(view);
    }

    @Override
    public void getData() {
        Observable<List<NewsInfo>> observable = mClientModel.getNewsList("T1348648756099", 1);
        observable.subscribe(new Observer<List<NewsInfo>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull final List<NewsInfo> newsInfos) {
                mView.loadData(newsInfos);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
