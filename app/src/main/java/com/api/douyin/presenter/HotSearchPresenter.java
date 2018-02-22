package com.api.douyin.presenter;

import com.api.douyin.bean.HoTSearchBean;
import com.api.douyin.model.HotSearchModel;
import com.api.douyin.utils.OnNetListener;

/**
 * Created by lenovo on 2018/2/22.
 */

public class HotSearchPresenter {
    public  IMain iMain;
    public HotSearchModel hotSearchModel;
    public void getPresenter(){
        hotSearchModel=new HotSearchModel();
        hotSearchModel.OnImodel(new OnNetListener<HoTSearchBean>() {
            @Override
            public void OnSuccess(HoTSearchBean hoTSearchBean) {
                iMain.ShowData(hoTSearchBean.getData());
            }

            @Override
            public void OnErrour(Throwable throwable) {

            }
        });
    }
}
