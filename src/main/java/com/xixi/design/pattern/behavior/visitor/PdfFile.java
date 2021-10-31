package com.xixi.design.pattern.behavior.visitor;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class PdfFile extends ResourceFile {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.visit(this);
        
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.visit(this);
    }


}
