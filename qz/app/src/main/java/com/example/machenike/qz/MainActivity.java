package com.example.machenike.qz;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.machenike.qz.adapter.FrAdapter;
import com.example.machenike.qz.fragment.AFragment;
import com.example.machenike.qz.fragment.BFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTab;
    private ViewPager mVip;
    private ArrayList<Fragment> mFragments;
    private ArrayList<String> mStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(new AFragment());
        mFragments.add(new BFragment());

        mStrings = new ArrayList<>();
        mStrings.add("校门");
        mStrings.add("关注");
    }

    private void initView() {
        mTab = (TabLayout) findViewById(R.id.tab);
        mVip = (ViewPager) findViewById(R.id.vip);

        FrAdapter frAdapter = new FrAdapter(getSupportFragmentManager(), mFragments, mStrings);
        mVip.setAdapter(frAdapter);
        mTab.setupWithViewPager(mVip);

    }
}
