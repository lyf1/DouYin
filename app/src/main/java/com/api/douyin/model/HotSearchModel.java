package com.api.douyin.model;

import com.api.douyin.bean.HoTSearchBean;
import com.api.douyin.utils.OnNetListener;
import com.api.douyin.utils.RetrofitUtils;
import com.api.douyin.utils.ServiceApi;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by lenovo on 2018/2/22.
 */

public class HotSearchModel implements Imodel{
    @Override
    public void OnImodel(final OnNetListener<HoTSearchBean> onNetListener) {
        ServiceApi serviceApi= RetrofitUtils.getServiceApi();
                serviceApi.getHotSearch()
                          .subscribeOn(Schedulers.io())
                           .observeOn(AndroidSchedulers.mainThread())
                           .subscribe(new Consumer<HoTSearchBean>() {
                               @Override
                               public void accept(HoTSearchBean hoTSearchBean) throws Exception {
                                   onNetListener.OnSuccess(hoTSearchBean);
                               }
                           }, new Consumer<Throwable>() {
                               @Override
                               public void accept(Throwable throwable) throws Exception {
                                 onNetListener.OnErrour(throwable);
                               }
                           });
    }
}
