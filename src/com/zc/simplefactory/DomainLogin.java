package com.zc.simplefactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class DomainLogin implements Login{
    @Override
    public boolean verify(String username, String password) {
        /**
         * 域认证业务
         *
         *
         */
        return true;
    }
}
