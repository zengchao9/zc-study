package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public CPU createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
