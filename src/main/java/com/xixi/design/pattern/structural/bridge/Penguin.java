package com.xixi.design.pattern.structural.bridge;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("企鹅就不会飞");
    }
}
