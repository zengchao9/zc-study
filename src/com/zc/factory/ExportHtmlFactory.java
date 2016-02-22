package com.zc.factory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("financial".equals(type)){
            return new ExportFinancialHtmlFile();
        }else if("standard".equals(type)){
            return new ExportStandardHtmlFile();
        }else {
            throw  new RuntimeException();
        }
    }
}
