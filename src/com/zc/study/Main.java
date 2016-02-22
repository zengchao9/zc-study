package com.zc.study;

import com.zc.abstractfactory.AbstractFactory;
import com.zc.abstractfactory.ComputerEngineer;
import com.zc.abstractfactory.IntelFactory;
import com.zc.factory.ExportFactory;
import com.zc.factory.ExportFile;
import com.zc.factory.ExportHtmlFactory;
import com.zc.simplefactory.Login;
import com.zc.simplefactory.LoginManager;

public class Main {

    public static void main(String[] args) {
        //简单工厂模式
       /* Login login = LoginManager.factory("password");
        String username = "newbee";
        String password = "123456";
        boolean bool = login.verify(username, password);
        if(bool){
            System.out.print("登录成功。。。");
        }*/

        //工厂模式
        /*ExportFactory factory = new ExportHtmlFactory();
        ExportFile file = factory.factory("financial");
        file.export();*/

        AbstractFactory factory = new IntelFactory();
        ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer(factory);
    }
}
