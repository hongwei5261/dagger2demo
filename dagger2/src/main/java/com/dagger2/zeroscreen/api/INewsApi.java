package com.dagger2.zeroscreen.api;

import java.util.List;
import java.util.Map;

import com.dagger2.zeroscreen.api.bean.NewsInfo;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hongwei on 2017/5/5.
 */

public interface INewsApi {

    /**
     * 获取新闻列表
     *
     * @param type      新闻类别类别，此处为"list"
     * @param id        新闻类别 ID
     * @param startPage 开始页，默认一次取20条记录
     * @return 新闻列表数据
     */
    @GET("nc/article/{type}/{id}/{startPage}-20.html")
    Observable<Map<String, List<NewsInfo>>> getNewsList(@Path("type") String type, @Path("id") String id,
                                                        @Path("startPage") int startPage);


    @GET("")
    Observable<Map<String, List<NewsInfo>>> getNewsDetail();
}
