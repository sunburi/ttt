package com.example.machenike.qz.p;

import com.example.machenike.qz.bean.OneBean;
import com.example.machenike.qz.callBack.BackCallBack;
import com.example.machenike.qz.m.MainModel;
import com.example.machenike.qz.v.MainView;

public class MainPresenterlmp implements MainPresenter {

            private MainView mMainView;
            private MainModel mMainModel;

    public MainPresenterlmp(MainView mainView, MainModel mainModel) {
        mMainView = mainView;
        mMainModel = mainModel;
    }

    @Override
    public void getData() {
        if (mMainModel!=null){
            mMainModel.getData(new BackCallBack() {
                @Override
                public void OnSeecson(OneBean oneBean) {
                        if (mMainView!=null){
                            mMainView.OnSeecson(oneBean);
                        }
                }

                @Override
                public void OnFiled(String string) {

                }
            });
        }
    }
}
