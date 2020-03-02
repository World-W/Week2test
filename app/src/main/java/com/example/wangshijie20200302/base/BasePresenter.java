package com.example.wangshijie20200302.base;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public abstract class BasePresenter <V extends IBaseView>{
    private WeakReference<V> vWeakHashMap;

    protected BasePresenter(V v) {
        vWeakHashMap=new WeakReference<>(v);
        initModel();
    }

    protected abstract void initModel();
    public  V getView(){
        if(vWeakHashMap!=null){
            return vWeakHashMap.get();
        }
        return null;
    }

    public void dataView() {
        if(vWeakHashMap!=null){
            vWeakHashMap.clear();
            vWeakHashMap=null;
        }
    }
}
