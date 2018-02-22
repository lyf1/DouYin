package com.api.douyin.view;

import android.app.Application;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.api.douyin.R;
import com.api.douyin.adapter.MyAdapter;
import com.api.douyin.bean.HoTSearchBean;
import com.api.douyin.presenter.HotSearchPresenter;
import com.api.douyin.presenter.IMain;
import com.jaeger.library.StatusBarUtil;
import com.zhy.autolayout.AutoLayoutActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AutoLayoutActivity implements IMain {


    @BindView(R.id.rcv)
    RecyclerView mRcv;
    @BindView(R.id.back)
    ImageView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        StatusBarUtil.setTransparent(MainActivity.this);
        StatusBarUtil.setColor(this, Color.BLACK);
        initRecyclerView();
    }

    private void initRecyclerView() {
        mRcv.setLayoutManager(new GridLayoutManager(this, 2));
        HotSearchPresenter hotSearchPresenter = new HotSearchPresenter();
        hotSearchPresenter.getPresenter();
    }

    @Override
    public void ShowData(List<HoTSearchBean.DataBean> list) {
        MyAdapter myAdapter = new MyAdapter(list, this);
        mRcv.setAdapter(myAdapter);
    }

    @OnClick(R.id.back)
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.back:
                finish();
                break;
        }
    }
}
