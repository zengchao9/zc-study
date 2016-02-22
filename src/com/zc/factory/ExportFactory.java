package com.zc.factory;

/**
 * Created by Administrator on 2016/2/22.
 */
public interface ExportFactory {

    ExportFile factory(String type);
}
