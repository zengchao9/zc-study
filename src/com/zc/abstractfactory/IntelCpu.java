package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class IntelCpu implements CPU{

    private int poins = 0;

    public IntelCpu(int poins) {
        this.poins = poins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的脚针数：" + this.poins);
    }
}
