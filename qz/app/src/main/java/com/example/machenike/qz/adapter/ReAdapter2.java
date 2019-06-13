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
import java.util.List;

public class ReAdapter2 extends RecyclerView.Adapter {
    private Context mContext;
   public List<DataBean> mDataBeans=new ArrayList<>();
    private ReAdapter.setOnItemClickListener mListener;

    public ReAdapter2(Context context) {
        this.mContext=context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType==0) {
            return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item2, null));

        }
        else {
            return new MyViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.item3, null));

        }
        }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        final DataBean dataBean = mDataBeans.get(i);
        if (viewHolder instanceof MyViewHolder) {
            MyViewHolder holder = (MyViewHolder) viewHolder;
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
        if (viewHolder instanceof MyViewHolder2) {
            MyViewHolder2 holder2 = (MyViewHolder2) viewHolder;
            holder2.mTv3.setText(mDataBeans.get(i).getTitle());
            Glide.with(mContext).load(mDataBeans.get(i).getImagePath()).into(holder2.mImg3);
            holder2.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener!=null){
                        mListener.setOnItemClicklist(i,dataBean);
                    }
                }
            });

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position%2==0){
            return 0;
        }
        else {
            return 1;
        }

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
            mImg = itemView.findViewById(R.id.itemimg2);
            mTv = itemView.findViewById(R.id.tv2);


        }
    }   class MyViewHolder2 extends RecyclerView.ViewHolder {

        private final ImageView mImg3;
        private final TextView mTv3;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            mImg3 = itemView.findViewById(R.id.itemimg3);
            mTv3 = itemView.findViewById(R.id.tv3);


        }
    }
    public interface setOnItemClickListener{
        void setOnItemClicklist(int i , DataBean dataBean);
    }
    public void setOnItemClickListener(ReAdapter.setOnItemClickListener listener){
        this.mListener= listener;
    }
}
