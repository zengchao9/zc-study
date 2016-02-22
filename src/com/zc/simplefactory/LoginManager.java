package com.zc.simplefactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class LoginManager {

    public static Login factory(String type){
        if("password".equals(type)){
            return new PasswordLogin();
        }else if("domain".equals(type)){
            return new DomainLogin();
        }else {
            throw  new RuntimeException("非法的验证方式");
        }
    }
}
