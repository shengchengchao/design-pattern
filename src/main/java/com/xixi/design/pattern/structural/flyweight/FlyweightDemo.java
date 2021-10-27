package com.xixi.design.pattern.structural.flyweight;

import java.util.Objects;

/**
 * 享元模式 就是将一部分变化少的 和变化多的分开来 减少new对象的过程，从而减少内存的消耗
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class FlyweightDemo {


    public static void main(String[] args) {
        PenguinFactory penguinFactory = new PenguinFactory();
        Penguin green = penguinFactory.getBird("green");
        Penguin green2 = penguinFactory.getBird("green");
        System.out.println(Objects.equals(green.getWeight(),green2.getWeight()));
    }
    
}
