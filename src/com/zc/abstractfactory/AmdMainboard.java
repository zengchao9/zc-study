package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class AmdMainboard implements Mainboard {

    private int cpuHoles = 0;

    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("Amd主板的cpu孔槽数为：" + this.cpuHoles);
    }
}
