package com.zc.simplefactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class PasswordLogin implements Login{
    @Override
    public boolean verify(String username, String password) {
        /**
         * 密码登录业务
         *
         */
        return true;
    }
}
