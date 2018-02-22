package com.api.douyin.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.api.douyin.R;
import com.api.douyin.bean.HoTSearchBean;

import java.util.List;

/**
 * Created by lenovo on 2018/2/22.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public List<HoTSearchBean.DataBean> list;
    public Context context;
    public LayoutInflater inflater;

    public MyAdapter(List<HoTSearchBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.hotsearchtextitem,parent,false);


        return new MyViewHolderText(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HoTSearchBean.DataBean dataBean = list.get(position);
        if(dataBean.getType()==3){
          MyViewHolderText holderText= (MyViewHolderText) holder;
          holderText.textView.setText(dataBean.getMusic().getTitle());
        }else{
            MyViewHolderText holderText= (MyViewHolderText) holder;
            holderText.textView.setText(dataBean.getChallenge().getCha_name());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolderText extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolderText(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.hti_text);
        }
    }
   /* class MyViewHolderMusic extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolderMusic(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.hmi_text);
        }
    }*/
}