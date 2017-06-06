package com.dagger2.zeroscreen.mvp.main;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

import com.dagger2.zeroscreen.R;
import com.dagger2.zeroscreen.api.bean.NewsInfo;
import com.dagger2.zeroscreen.dagger.component.ComponentManager;
import com.dagger2.zeroscreen.dagger.component.DaggerNewsComponent;
import com.dagger2.zeroscreen.dagger.module.NewsModule;
import com.dagger2.zeroscreen.mvp.base.BaseLayout;
import com.dagger2.zeroscreen.mvp.model.db.CardInfo;
import com.dagger2.zeroscreen.mvp.model.db.DBModel;
import com.dagger2.zeroscreen.mvp.model.db.IDBModel;

/**
 * Created by hongwei on 2017/5/4.
 */

public class NewsLayout extends BaseLayout implements INewsView {
    @BindView(R.id.button1)
    Button button1;

    @BindView(R.id.text1)
    TextView text1;

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    @Inject
    NewsPresenter mNewsPresenter;

    @Inject
    NewsAdapter mNewsAdapter;

    public NewsLayout(Context context) {
        super(context);
    }

    public NewsLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NewsLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public NewsLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void inject() {
        DaggerNewsComponent.builder()
                .appComponent(ComponentManager.getsInstance(getContext()).getAppComponent())
                .newsModule(new NewsModule(this)).build().inject(this);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mNewsAdapter);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showNetError(int type) {

    }

    @Override
    public void loadData(List<NewsInfo> data) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (NewsInfo info : data) {
            list.add(info.getTitle());
            stringBuilder.append(info.getTitle()).append("\n");
        }
        Log.d("tag", "names:" + stringBuilder.toString());
        text1.setText(stringBuilder.toString());

        mNewsAdapter.setData(list);
    }

    @Override
    public void loadNoData() {

    }

    @OnClick(R.id.button1)
    void onClick() {
        Toast.makeText(getContext(), "111111111", Toast.LENGTH_LONG).show();
        mNewsPresenter.getData();
        IDBModel idbModel = DBModel.getsInstance(getContext());
        idbModel.deleteAll();
        idbModel.insert(new CardInfo(11L, "11"));
        idbModel.insert(new CardInfo(12L, "12"));
        idbModel.insert(new CardInfo(13L, "13"));

        List<CardInfo> list = idbModel.query();
        for (CardInfo info : list) {
            Log.d("tag", "onclick  name:" + info.getName());
        }
        Log.d("tag", "onclick ");
    }
}
