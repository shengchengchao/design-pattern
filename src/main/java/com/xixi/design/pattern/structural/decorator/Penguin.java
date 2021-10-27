package com.xixi.design.pattern.structural.decorator;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class Penguin implements Bird {

    @Override
    public void fly() {
        System.out.println("企鹅不会飞");
    }
}
