package com.api.douyin.utils;

/**
 * Created by lenovo on 2018/2/22.
 */

public interface OnNetListener<T> {
    void OnSuccess(T t);
    void OnErrour(Throwable throwable);
}
