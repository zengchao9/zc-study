package com.zc.factory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("financial".equals(type)){
            return new ExportFinancialPdfFile();
        }else if("standard".equals(type)){
            return new ExportStandardPdfFile();
        }else {
            throw new RuntimeException();
        }
    }
}
