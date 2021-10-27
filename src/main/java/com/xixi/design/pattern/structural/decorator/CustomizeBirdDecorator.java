package com.xixi.design.pattern.structural.decorator;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class CustomizeBirdDecorator extends BirdDecorator {


    public CustomizeBirdDecorator(Bird bird) {
        super(bird);
    }

    @Override
    public void fly() {
        before();
        super.fly();
    }

    private void before() {
        System.out.println("前置");
    }


}
