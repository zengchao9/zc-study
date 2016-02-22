package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public CPU createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
