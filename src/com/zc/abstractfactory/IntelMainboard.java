package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class IntelMainboard implements Mainboard {

    private int cpuHoles = 0;

    public IntelMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("Intel主板的cpu孔槽数：" + this.cpuHoles);
    }
}
