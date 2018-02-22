package com.api.douyin.presenter;

import com.api.douyin.bean.HoTSearchBean;

import java.util.List;

/**
 * Created by lenovo on 2018/2/22.
 */

public interface IMain {
    void ShowData(List<HoTSearchBean.DataBean> list);
}
