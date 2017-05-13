package com.dagger2.zeroscreen.mvp.model.db;

import android.content.Context;

import java.util.List;

/**
 * Created by hongwei on 2017/5/8.
 */

public class DBModel implements IDBModel {

    private static volatile IDBModel sInstance;
    private static CardInfoDao mCardInfoDao;

    private DBModel(Context context) {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(context.getApplicationContext(), "phi.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        mCardInfoDao = daoSession.getCardInfoDao();
    }

    public static IDBModel getsInstance(Context context) {
        if (sInstance == null) {
            synchronized (DBModel.class) {
                if (sInstance == null) {
                    sInstance = new DBModel(context);
                }
            }
        }
        return sInstance;
    }

    @Override
    public void insert(CardInfo info) {
        mCardInfoDao.insert(info);
    }

    @Override
    public List<CardInfo> query() {
        List<CardInfo> list = mCardInfoDao.queryBuilder().build().list();
        return list;
    }

    @Override
    public void delete() {

    }

    @Override
    public void deleteAll() {
        mCardInfoDao.deleteAll();
    }
}
