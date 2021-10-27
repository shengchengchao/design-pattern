package com.xixi.design.pattern.structural.bridge;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class Birds extends Animal {

    

    public Birds(Bird bird) {
        super(bird);
    }

    @Override
    public void fly() {
        bird.fly();
    }


    public static void main(String[] args) {
        Birds birds = new Birds(new Penguin());
        birds.fly();
    }
}
