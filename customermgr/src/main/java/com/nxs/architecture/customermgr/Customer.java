package com.nxs.architecture.customermgr;

import com.nxs.architecture.common.Base;

/**
 * Created by jonenxs on 2017/3/11.
 */
public class Customer {
    public void customer(){
        new Base().base("customer invoke");
        System.out.println("now in customer");
    }
}
