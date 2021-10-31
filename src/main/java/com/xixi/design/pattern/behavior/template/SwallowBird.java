package com.xixi.design.pattern.behavior.template;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class SwallowBird extends BaseBird {
    @Override
    protected void flyEnd() {
        System.out.println("燕子飞行结束");
    }
}
