package com.xixi.design.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class ToolApplication {


    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        Compressor compressor =new Compressor();
        List<ResourceFile> list = new ArrayList<>();
        list.add(new PdfFile("111"));
        list.add(new WordFile("222"));

        list.forEach(each->{
            each.accept(extractor);
            each.accept(compressor);
        });
    }
}
