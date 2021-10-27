package com.xixi.design.pattern.structural.decorator;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class Swallow implements Bird {
    @Override
    public void fly() {
        System.out.println("燕子会飞");
    }
}
