package com.example.wangshijie20200302.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

import com.example.wangshijie20200302.R;
import com.example.wangshijie20200302.base.BaseActivity;
import com.example.wangshijie20200302.base.BasePresenter;
import com.example.wangshijie20200302.contract.IHomePageContract;
import java.util.ArrayList;

/**
 * 王世杰
 * 20200302
 */
public class MainActivity extends BaseActivity implements IHomePageContract.Iview {

    private TableLayout tb;
    private ViewPager vp;
    ArrayList<String> str=new ArrayList<>();
    ArrayList<Fragment> list=new ArrayList<>();

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        tb=findViewById(R.id.tl);
        vp=findViewById(R.id.vp);
    }

    @Override
    protected void initData() {
        MyViewPager myViewPager = new MyViewPager(getSupportFragmentManager());
        vp.setAdapter(myViewPager);
    }

    @Override
    public void onSuccess(String url) {

    }

    @Override
    public void onError(String url) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private class MyViewPager extends FragmentPagerAdapter {
        public MyViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return list.get(i);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return str.get(position);
        }
    }
}
