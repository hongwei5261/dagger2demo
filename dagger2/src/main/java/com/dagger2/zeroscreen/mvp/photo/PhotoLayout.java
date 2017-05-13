package com.dagger2.zeroscreen.mvp.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import com.dagger2.zeroscreen.R;
import com.dagger2.zeroscreen.dagger.component.DaggerPhotoComponent;
import com.dagger2.zeroscreen.dagger.module.PhotoModule;
import com.dagger2.zeroscreen.mvp.base.BaseLayout;

/**
 * Created by hongwei on 2017/5/4.
 */

public class PhotoLayout extends BaseLayout implements IPhotoView{
    @BindView(R.id.button1)
    Button button1;

    @Inject
    PhotoPresenter mPhotoPresenter;

    public PhotoLayout(Context context) {
        super(context);
    }

    public PhotoLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PhotoLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PhotoLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        button1.setText("button1");
        Log.d("tag", "inflate");
    }

    @Override
    public void init() {
        super.init();
        Log.d("tag", "init");
    }

    @Override
    public void inject() {
        DaggerPhotoComponent.builder().photoModule(new PhotoModule(this)).build().inject(this);
    }

    @OnClick(R.id.button1)
    void onClick() {
        Toast.makeText(getContext(), "111111111", Toast.LENGTH_LONG).show();
        Log.d("tag", "onclick");
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
}
