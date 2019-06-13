package com.example.machenike.qz.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FrAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> mFragment;
    private final ArrayList<String> mString;

    public FrAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> strings) {
        super(fm);
        this.mFragment=fragments;
        this.mString=strings;

    }

    @Override
    public Fragment getItem(int i) {
        return mFragment.get(i);
    }

    @Override
    public int getCount() {
        return mString.size();

    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mString.get(position);
    }
}
