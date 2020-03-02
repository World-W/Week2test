package com.example.wangshijie20200302.contract;

import com.example.wangshijie20200302.base.IBaseView;

/**
 * 王世杰
 * 20200302
 */
public interface IHomePageContract {
    interface Iview extends IBaseView {
        void onSuccess(String url);
        void onError(String url);
    }
    interface IPresenter{
        
        void getListData(String url);
    }
    interface IModel{
        void getList(String url,IModelListCallBack iModelListCallBack);

        interface IModelListCallBack {
            void onGetListSuccess(String url);
            void onGetListError(String url);
        }
    }
}
