package com.zc.abstractfactory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class ComputerEngineer {

    private CPU cpu;

    private Mainboard mainboard;

    public void makeComputer(AbstractFactory af){
        prepareHardware(af);
    }

    private void prepareHardware(AbstractFactory af){
        this.cpu = af.createCpu();
        this.mainboard = af.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCpu();
    }
}
