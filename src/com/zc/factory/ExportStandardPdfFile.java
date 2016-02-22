package com.zc.factory;

/**
 * Created by Administrator on 2016/2/22.
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public void export() {
        /**
         * 业务逻辑
         */
        System.out.println("导出标准版pdf");
    }
}
