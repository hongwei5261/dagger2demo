package com.dagger2.zeroscreen.mvp.model.db;

import java.util.List;

/**
 * Created by hongwei on 2017/5/8.
 */

public interface IDBModel {

    public void insert(CardInfo info);

    public List<CardInfo> query();

    public void delete();

    public void deleteAll();
}
