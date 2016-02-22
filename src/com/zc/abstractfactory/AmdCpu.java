package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class AmdCpu implements CPU {

    private int poins = 0;

    public AmdCpu(int poins) {
        this.poins = poins;
    }

    @Override
    public void calculate() {
        System.out.println("Amd CPU的脚针数：" + this.poins);
    }
}
