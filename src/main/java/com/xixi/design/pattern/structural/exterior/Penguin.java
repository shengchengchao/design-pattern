package com.xixi.design.pattern.structural.exterior;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class Penguin implements Bird {


    @Override
    public void fly() {
        System.out.println("企鹅肯定不能飞");
    }
}
