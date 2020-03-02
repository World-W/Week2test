package com.example.wangshijie20200302.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 王世杰
 * 20200302
 */
public abstract class BaseActivity<P extends BasePresenter>extends AppCompatActivity {
    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        initData();
        presenter=initPresenter();
    }

    protected abstract int getLayout();

    protected abstract P initPresenter();

    public P getPresenter(){return presenter;}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter!=null){
            presenter.dataView();
            presenter=null;
        }
    }

    protected abstract void initView();

    protected abstract void initData();


}
