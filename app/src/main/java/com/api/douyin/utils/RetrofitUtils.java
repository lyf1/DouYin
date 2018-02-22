package com.api.douyin.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2018/2/22.
 */

public class RetrofitUtils {
    public static ServiceApi serviceApi;
    public static  <T> T CreateAPi(Class<T> tClass,String url){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return  retrofit.create(tClass);
    }
    public static  ServiceApi getServiceApi(){
        if(serviceApi==null){
           synchronized (ServiceApi.class){
               if(serviceApi==null){
                     serviceApi=CreateAPi(ServiceApi.class,UrlUtils.HotSearch_URL_HOST);
               }
           }
        }
        return  serviceApi;
    }
}
