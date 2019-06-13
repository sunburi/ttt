package com.example.machenike.qz.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.machenike.qz.Main2Activity;
import com.example.machenike.qz.R;
import com.example.machenike.qz.adapter.ReAdapter;
import com.example.machenike.qz.adapter.ReAdapter2;
import com.example.machenike.qz.bean.DataBean;
import com.example.machenike.qz.bean.OneBean;
import com.example.machenike.qz.m.MainModel;
import com.example.machenike.qz.m.MainModelmp;
import com.example.machenike.qz.p.MainPresenter;
import com.example.machenike.qz.p.MainPresenterlmp;
import com.example.machenike.qz.v.MainView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment implements MainView{


    private View mInflate;
    private View view;
    private ImageView mImg;
    private RecyclerView mRlv;
    private RecyclerView mRlv2;
    private ReAdapter mReAdapter;
    private ReAdapter2 mReAdapter2;

    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mInflate = inflater.inflate(R.layout.fragment_a, container, false);
        initView(mInflate);
        initData();
        return mInflate;
    }

    private void initData() {
        //调用mvp
        MainPresenter mainPresenter=new MainPresenterlmp(this, new MainModelmp());
        mainPresenter.getData();
    }

    private void initView(View mInflate) {
        mImg = (ImageView) mInflate.findViewById(R.id.img);
        mRlv = (RecyclerView) mInflate.findViewById(R.id.rlv);
        mRlv2 = (RecyclerView) mInflate.findViewById(R.id.rlv2);
        //绑定布局管理器
        mRlv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        mReAdapter = new ReAdapter(getContext());
        //绑定适配器
        mRlv.setAdapter(mReAdapter);
        mRlv2.setLayoutManager(new LinearLayoutManager(getContext()));
        mReAdapter2 = new ReAdapter2(getContext());
        mRlv2.setAdapter(mReAdapter2);

        mReAdapter.setOnItemClickListener(new ReAdapter.setOnItemClickListener() {
            @Override
            public void setOnItemClicklist(int i, DataBean dataBean) {
                Intent intent = new Intent(getContext(), Main2Activity.class);
                intent.putExtra("aa",mReAdapter.mDataBeans.get(i).getUrl());
                startActivity(intent);
            }
        });
        mReAdapter2.setOnItemClickListener(new ReAdapter.setOnItemClickListener() {
            @Override
            public void setOnItemClicklist(int i, DataBean dataBean) {
                Intent intent = new Intent(getContext(), Main2Activity.class);
                intent.putExtra("aa",mReAdapter2.mDataBeans.get(i).getUrl());
                startActivity(intent);
            }
        });


    }

    @Override
    public void OnSeecson(OneBean oneBean) {
        List<DataBean> data = oneBean.getData();
        mReAdapter.addData(data);
        mReAdapter2.addData(data);
    }

    @Override
    public void OnFiled(String string) {

    }
}
