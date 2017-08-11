package com.ruiqin.servicedemo.module.home;

import com.ruiqin.servicedemo.base.BaseModel;
import com.ruiqin.servicedemo.base.BasePresenter;
import com.ruiqin.servicedemo.base.BaseView;
import com.ruiqin.servicedemo.module.home.adapter.MainRecyclerAdapter;
import com.ruiqin.servicedemo.module.home.bean.MainRecyclerData;

import java.util.List;

/**
 * Created by ruiqin.shen
 * 类说明：
 */

public interface MainContract {
    interface Model extends BaseModel {
        List<MainRecyclerData> initData();
    }

    interface View extends BaseView {
        void setRecyclerAdapterSuccess(MainRecyclerAdapter mainRecyclerAdapter);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        abstract void setAdapter();
    }
}
