package com.xixi.design.pattern.structural.flyweight;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class Weight {

    private Integer size;

    private Integer weight;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Weight(Integer size, Integer weight) {
        this.size = size;
        this.weight = weight;
    }
}
