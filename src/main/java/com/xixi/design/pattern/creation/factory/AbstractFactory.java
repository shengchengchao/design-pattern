package com.xixi.design.pattern.creation.factory;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public abstract class AbstractFactory {


    abstract public Bird getBird(String name);

    abstract public Color getColor(String color);
}
