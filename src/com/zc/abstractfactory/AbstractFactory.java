package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public interface AbstractFactory {

    CPU createCpu();

    Mainboard createMainboard();
}
