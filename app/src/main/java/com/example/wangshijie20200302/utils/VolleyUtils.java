package com.example.wangshijie20200302.utils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.wangshijie20200302.base.App;

/**
 * 王世杰
 * 20200302
 */
public abstract class VolleyUtils {
    private RequestQueue requestQueue;
    private static final VolleyUtils ourInstance = new VolleyUtils() {

    };

    public static VolleyUtils getInstance() {
        return ourInstance;
    }

    private VolleyUtils() {

    }
    public  void doGet(String url,ICallBack iCallBack){

    }

    private class ICallBack {
    }
}
