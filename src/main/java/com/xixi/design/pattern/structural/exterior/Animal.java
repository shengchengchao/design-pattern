package com.xixi.design.pattern.structural.exterior;

/**
 * 外观模式 就是将一些小方法进行了一个组装，避免调用多个方法
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class Animal {
    private Bird penguin;

    private Bird swallow;


    public Animal() {
        this.penguin = new Penguin();
        this.swallow = new Swallow();
    }

    private void penguinFly(){
        penguin.fly();
    }

    private void swallowFly(){
        swallow.fly();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.penguinFly();
        animal.swallowFly();
    }
}
