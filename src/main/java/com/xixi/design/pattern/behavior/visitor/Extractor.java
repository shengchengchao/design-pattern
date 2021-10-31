package com.xixi.design.pattern.behavior.visitor;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class Extractor implements Visitor {

    public Extractor() {
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("pdf");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("word");

    }
}
