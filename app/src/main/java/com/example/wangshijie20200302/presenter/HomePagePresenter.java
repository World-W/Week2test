package com.example.wangshijie20200302.presenter;

import com.example.wangshijie20200302.base.BasePresenter;
import com.example.wangshijie20200302.base.IBaseView;
import com.example.wangshijie20200302.contract.IHomePageContract;

/**
 * 王世杰
 * 20200302
 */
public class HomePagePresenter extends BasePresenter implements IHomePageContract.IPresenter {
    protected HomePagePresenter(IBaseView iBaseView) {
        super(iBaseView);
    }

    @Override
    public void getListData(String url) {

    }

    @Override
    protected void initModel() {

    }
}
