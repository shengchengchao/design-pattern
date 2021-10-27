package com.xixi.design.pattern.structural.decorator;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public abstract class BirdDecorator implements Bird {

    private Bird bird;


    public BirdDecorator(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        bird.fly();
    }
}
