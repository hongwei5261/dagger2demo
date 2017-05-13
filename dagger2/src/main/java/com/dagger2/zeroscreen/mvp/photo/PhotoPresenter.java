package com.dagger2.zeroscreen.mvp.photo;

import javax.inject.Inject;

import com.dagger2.zeroscreen.mvp.base.IPresenter;

/**
 * Created by hongwei on 2017/5/4.
 */

public class PhotoPresenter extends IPresenter<IPhotoView> {

    @Inject
    public PhotoPresenter(IPhotoView view) {
        super(view);
    }

    @Override
    public void getData() {

    }
}
