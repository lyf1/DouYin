package com.api.douyin.utils;

import com.api.douyin.bean.HoTSearchBean;

import io.reactivex.Observable;
import io.reactivex.Observer;
import retrofit2.http.GET;

/**
 * Created by lenovo on 2018/2/22.
 */

public interface ServiceApi {
    @GET(UrlUtils.HotSearch_URL_PATH)
    Observable<HoTSearchBean> getHotSearch();
}
