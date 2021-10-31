package com.xixi.design.pattern.behavior.template;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class Penguin extends BaseBird {
    @Override
    protected void flyEnd() {
        System.out.println("企鹅飞行结束");
    }
}
