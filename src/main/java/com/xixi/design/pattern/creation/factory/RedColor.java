package com.xixi.design.pattern.creation.factory;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class RedColor implements Color {
    @Override
    public void getColor(String color) {
        System.out.println("红色");
    }
}
