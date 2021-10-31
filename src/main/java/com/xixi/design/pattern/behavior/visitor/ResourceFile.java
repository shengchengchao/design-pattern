package com.xixi.design.pattern.behavior.visitor;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Extractor extractor);

    abstract public void accept(Compressor compressor);
}
