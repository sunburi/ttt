package com.example.machenike.qz.m;

import com.example.machenike.qz.api.Api;
import com.example.machenike.qz.bean.DataBean;
import com.example.machenike.qz.bean.OneBean;
import com.example.machenike.qz.callBack.BackCallBack;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainModelmp implements MainModel{


    @Override
    public void getData(final BackCallBack backCallBack) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Observable<OneBean> data = retrofit.create(Api.class).getData();
        data.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<OneBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(OneBean oneBean) {
                            backCallBack.OnSeecson(oneBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
}
