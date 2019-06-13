package com.example.machenike.qz.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.machenike.qz.R;
import com.example.machenike.qz.bean.DataBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReAdapter extends RecyclerView.Adapter {
    private Context mContext;
   public List<DataBean> mDataBeans=new ArrayList<>();
    private setOnItemClickListener mListener;

    public ReAdapter(Context context) {
        this.mContext=context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item,null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        final DataBean dataBean = mDataBeans.get(i);
        MyViewHolder holder= (MyViewHolder) viewHolder;
               holder.mTv.setText(mDataBeans.get(i).getTitle());
               Glide.with(mContext).load(mDataBeans.get(i).getImagePath()).into(holder.mImg);
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if (mListener!=null){
                           mListener.setOnItemClicklist(i,dataBean);
                       }
                   }
               });

    }

    @Override
    public int getItemCount() {
        return mDataBeans.size();
    }

    public void addData(List<DataBean> data) {
        this.mDataBeans.addAll(data);
        notifyDataSetChanged();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView mImg;
        private final TextView mTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.itemimg);
            mTv = itemView.findViewById(R.id.tv1);


        }
    }
        public interface setOnItemClickListener{
                void setOnItemClicklist(int i , DataBean dataBean);
            }
            public void setOnItemClickListener(setOnItemClickListener listener){
               this.mListener= listener;
            }
}
