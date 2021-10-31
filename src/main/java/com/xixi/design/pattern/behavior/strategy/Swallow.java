package com.xixi.design.pattern.behavior.strategy;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class Swallow implements Bird {
    @Override
    public void fly() {
        System.out.println("燕子飞行测试");
    }
}
