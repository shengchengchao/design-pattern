package com.xixi.design.pattern.structural.bridge;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public abstract class Animal {

    protected Bird bird;

    public Animal(Bird bird) {
        this.bird = bird;
    }

    public abstract void fly();
}
