package com.api.douyin.model;

import com.api.douyin.bean.HoTSearchBean;
import com.api.douyin.utils.OnNetListener;

/**
 * Created by lenovo on 2018/2/22.
 */

public interface Imodel {
    void OnImodel(OnNetListener<HoTSearchBean> onNetListener);
}
