package com.example.machenike.qz.api;

import com.example.machenike.qz.bean.DataBean;
import com.example.machenike.qz.bean.OneBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {
    String url="https://www.wanandroid.com/banner/";
    //https://www.wanandroid.com/banner/json
    @GET("json")
    Observable<OneBean> getData();
}
