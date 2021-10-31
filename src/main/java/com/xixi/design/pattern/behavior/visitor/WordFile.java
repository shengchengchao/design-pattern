package com.xixi.design.pattern.behavior.visitor;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        // 用了多态
        extractor.visit(this);
    }

    @Override
    public void accept(Compressor compressor) {
        compressor.visit(this);
    }


}
