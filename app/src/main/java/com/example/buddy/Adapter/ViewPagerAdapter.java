package com.example.buddy.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment>  mFragmentlist=new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentlist.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentlist.size();
    }

    public void addFragment(Fragment fragment){
      mFragmentlist.add(fragment);


    }


}
