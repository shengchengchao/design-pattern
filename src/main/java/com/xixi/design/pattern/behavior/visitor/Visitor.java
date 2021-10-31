package com.xixi.design.pattern.behavior.visitor;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public interface Visitor {

    void visit(PdfFile pdfFile);

    void visit(WordFile wordFile);
}
