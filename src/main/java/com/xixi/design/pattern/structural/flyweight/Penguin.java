package com.xixi.design.pattern.structural.flyweight;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class Penguin implements Bird {

    private String color;

    private Weight weight;

    public Penguin(String color) {
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println(color+"企鹅,大小为"+weight.getSize()+",体重"+weight.getWeight());
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }
}
